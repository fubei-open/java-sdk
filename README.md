# 付呗开放平台 OpenApi Java SDK (Alpha)
## 项目说明
付呗商户开放平台，旨在提供一站式移动支付解决方案。
开放平台SDK的目的在于为商户提供更为方便快捷的方式接入付呗开放平台。

注意：目前SDK属于alpha阶段，部分功能和实现可能仍不稳定或仍需调整。

## 接入前置条件
- 成为付呗商户或付呗代理商
- 开通付呗开放平台接口的权限，获得AppID和AppSecret
- 使用Java或者基于JVM的兼容语言（如Groovy、Kotlin、Scala）进行接入

## OpenAPI接口文档
点击[付呗商户开放平台文档](http://docs.51fubei.com/open-api/)访问

## SDK说明
- JDK版本：1.6或以上版本
- 使用Retrofit作为网络框架，可在Android 4.0以上版本使用
- 使用Gradle进行构建，无需进行额外的配置
- 项目导出支持jar包导出，可导出至Maven本地仓库或者自定Nexus OSS

## 导入SDK包到项目中
SDK Beta版本之后，可以根据项目结构和打包方式，选择合适的引入方式。
alpha阶段Maven和Gradle方式需要自行使用命令编译源码，并通过本地Maven仓库的形式导入。
后续Beta和Release阶段，会上传至付呗私有NexusOSS中。

### Maven方式引入
1、配置settings.xml文件
在maven目录conf/settings.xml中，加入付呗SDK私有仓库地址

- mirror增加配置
``` xml 
<mirrors> 
    <mirror>
        <id>51fubei</id>
        <mirrorOf>*</mirrorOf>
        <url>https://nexus-server.51fubei.com/nexus/content/groups/open-public/</url>
     </mirror>

    <!-- 以下为国内Repo镜像源，可按需进行配置 -->
    <mirror>
      <id>huaweicloud</id>
      <mirrorOf>*</mirrorOf>
      <url>https://mirrors.huaweicloud.com/repository/maven/</url>
    </mirror>
	<mirror> 
      <id>aliyun</id> 
      <mirrorOf>*</mirrorOf> 
      <url>http://maven.aliyun.com/nexus/content/repositories/central/</url> 
    </mirror> 
  </mirrors> 
```
- repositories中启用Release和Snapshot
``` xml
<repository>
    <id>51fubei</id>
    <url>https://nexus-server.51fubei.com/nexus/content/groups/public/</url>
    <releases><enabled>true</enabled></releases>
    <snapshots><enabled>true</enabled></snapshots>
</repository>
```

2、 在项目pom.xml中引入
```xml
<dependency>
    <groupId>com.fshows.fubei</groupId>
    <artifactId>openapi-java-sdk</artifactId>
    <version>1.0-SNAPSHOT</version>
</dependency>
```

### Gradle引入
1、在项目build.gradle中增加maven仓库配置
```groovy
repositories {
    maven { url "https://nexus-server.51fubei.com/nexus/content/groups/open-public" }

    // 可选配置，增加国内源用于下载依赖
    maven { url "https://mirrors.huaweicloud.com/repository/maven/" }
}
```

2、在项目dependencies中引入依赖
```groovy
dependencies {
    implementation 'com.fshows.fubei:openapi-java-sdk:1.0-SNAPSHOT'
}
```

### 源码方式引入
1、下载项目
```bash
git clone https://gitee.com/fubei-open/java-sdk.git
```

2、切换指定版本的分支
```bash
cd java-sdk
git checkout v${版本号}
```

3、编译项目并导出到本地Maven仓库中(推荐)
```bash
./gradlew clean publishToMavenLocal
或者使用Gradle缩写方式导出
./gradlew clean pTML
```
生成完毕后，可按照Maven引入或者Gradle引入的方式导入到项目中

4、jar包形式导入(不推荐)

推荐使用Maven或者Gradle的方式进行引入
```bash
./gradlew clean assemble
```
编译完成后，openapi/build/libs中会生成指定的jar包和源码包，将其复制到对应项目的libs包中，并需保证以下jar包存在

> * google-guava | 26.0-jre
> * alibaba-fastjson | 1.2.31
> * annimon-stream | 1.2.1
> * squareup okhttp | 3.14.2
> * squareup retrofit | 2.6.0

如果需要跑UnitTest，必须引入以下类库
> * commons-codec | 1.10

## 接入说明
### 1、设置AppConfig
在调用SDK之前，使用AppConfig设置appID，AppSecret。

AppConfig::setAppId和AppConfig::setAppSecret

调用Api接口之前，需要全局设置开放平台的AppID、AppSecret，Spring项目可在@Configuration或者@PostConstruct中设置，Android项目可在Application.onCreate中设置。
#### AppID和AppSecret设置
```java
AppConfig appConfig = AppConfig.getInstance();
appConfig.setAppId("20180916120218114790");
appConfig.setAppSecret("e4927152b7c18b0ddcc2648bdeabb452");
```

#### 环境配置
使用AppConfig::setEnv方法设置环境
- OpenApiConstants.ENV_RELEASE：生产环境
- OpenApiConstants.ENV_STABLE：开发环境
```java
AppConfig appConfig = AppConfig.getInstance();
appConfig.setEnv(OpenApiConstants.ENV_RELEASE);
```

#### 接口连接、读取、写超时设置
- AppConfig::setHttpConnectTimeout 连接超时，单位秒
- AppConfig::setHttpReadTimeout 连接超时，单位秒
- AppConfig::setHttpWriteTimeout 连接超时，单位秒

### 2、生成OpenApi的动态代理
#### 接口调用说明
接口的定义按照功能进行分配，接口定义在biz.merchant.api中，
legacy下定义的是传统方式调用的接口，接口返回统一为Call<?>，可通过Call<?>对象使用同步或者异步的方式进行调用。

同步方式调用：
具体可见Retrofit文档
```java
call.execute()
```
异步方式调用：
可在enqueue指定Excutor线程池
```java
call.enqueue()
```

#### 接口定义规则
以”订单查询“接口为例，文档地址如下：

[付呗开放平台接口文档-请求地址&参数说明](http://docs.51fubei.com/open-api/business/parameter.html)

[付呗开放平台接口文档-订单查询接口](http://docs.51fubei.com/open-api/business/methods/query.html)

接口定义的格式如下：
```java
/**
 * 1、接口类型以interface方式进行定义
 */
public interface MyApi {
    @POST(OpenApiConstants.GATEWAY)
    @FubeiOpenApi(method = "openapi.payment.order.query", verison="1.0", format="json", signMethod="md5")
    Call<PaymentQueryOrderModel> orderQuery(@Body ParamPaymentOrderQuery param);
}
```
说明：
- 标注：@POST | 该标注为Retrofit标注，参数为文档中标注的”gateway“
- 标注：@FubeiOpenApi | 付呗开放平台标注
    - method：对应*具体Api文档*中的`接口名称`，必填
    - version：对应*公共参数*中`接口版本`，默认"1.0"，选填
    - format：对应*公共参数*中`接口格式`，默认"json"，选填
    - signMethod：对应*公共参数*中`签名算法`，默认"md5"，选填
- 接口方法：

    Call<返回实体对象> 自定义函数名(@Body 参数实体 对象);
     
     - 返回实体对象：继承自空接口BaseModel，位于biz.merchant.model.entity中
     - 自定义函数名：可自行定义
     - 参数实体：继承自公共类BaseBizContentModel，用于生成接口文档中"biz_content"报文
     - 返回值：Retrofit Call对象，可通过Call<>.execute().body()或Call<>.enqueue(callback)的方式同步或者异步获得对象，也可根据业务需要使用RxJava或RxJava2进行包装，转为需要的Observable或者Flowable对象

#### 接口动态代理生成
接口动态代理类的定义与实现在SDK foundation.apiproxy包中，由于使用了Retrofit作为网络框架，AbsApiProxy主要负责的工作是Retrofit对象的生成，可以理解是一个Api抽象动态代理工厂。该类提供了一个initRetrofit的抽象方法，通过这个方法，子类可以进行一些网络方便参数（如连接超时、接收超时、上传超时）的设置。

商户的OpenApi的动态代理：MerchantApiProxy

该类的作为付呗开放平台的接口的动态工厂，主要工作为：okHttp配置、baseUrl配置等，调用方法为：
```java
// 生成API动态代理
MyApi api = MerchantApiProxy.getInstance().create(MyApi.class);

ParamPaymentOrderQuery param = new ParamPaymentOrderQuery();
// param参数设置
// param.merchant_order_sn = "xxxxxx"
PaymentQueryOrderModel resultModel = api.orderQuery(param).execute().body();
```

#### 自定义OkHttp配置
自定义OkHttp配置可参考MerchantApiProxy的代码并重写initRetrofit方法或重写getOkHttpClient()方法。
参考代码如下：
```java
@Override
protected void initRetrofit(Retrofit.Builder builder) {
    // 设置BaseUrl和转换工厂
    builder.baseUrl(getBaseUrl()).addConverterFactory(new LifecircleConverterFactory());
    // 设置http client
    builder.client(getOkHttpClient());
}

/**
 * 初始化okHttp
 * @return okHttpClient
 */
@SuppressWarnings("WeakerAccess")
protected OkHttpClient getOkHttpClient() {
    OkHttpClient.Builder builder = new OkHttpClient.Builder();
    builder.connectTimeout(15, TimeUnit.SECONDS);
    builder.readTimeout(30, TimeUnit.SECONDS);
    builder.writeTimeout(30, TimeUnit.SECONDS);

    // 设置日志打印的拦截器
    HttpLoggingInterceptor loggingInterceptor = new HttpLoggingInterceptor(new HttpLoggingInterceptor.Logger() {
        @Override
        public void log(String resultMessage) {
            System.out.println("\t\t" + resultMessage);
        }
    });
    loggingInterceptor.setLevel(HttpLoggingInterceptor.Level.BODY);
    builder.addInterceptor(loggingInterceptor);
    return builder.build();
}
```

#### 业务异常获取
业务异常统一定义为SdkBizException，按照Retrofit的逻辑继承自IOException，当业务代码返回不为200（即成功状态）时，会抛出此异常，此时业务逻辑中需要截取此异常，获得对应的错误信息。部分400异常会包含三方错误代码subCode和特殊返回，此时需要通过获得Map的方式进行获取


#### 调用示例
调用示例位于项目openapi/src/test/java/com/fshows/fubei/OpenApiUnitTest.java中，其中列举了几个接口的调用方式，可使用JUnit方式直接执行查看结果

#### 问题与反馈
目前SDK处于Alpha版本开发中，难免会出现设计不完善，出入参错误的情况。如发现任何错误，可联系相关技术人员进行反馈