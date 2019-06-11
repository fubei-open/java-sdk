package com.fshows.fubei.foundation.support;

import com.alibaba.fastjson.PropertyNamingStrategy;
import com.alibaba.fastjson.parser.ParserConfig;
import com.alibaba.fastjson.serializer.SerializeConfig;

/**
 * Json属性名称策略
 *
 * @author John (linwei@fshows.com)
 * @version $Id FastJsonConfig.java, v1.0 2019-06-08 00:38 John Exp$
 */
public class FastJsonConfig {

    static {
        // 设置全局的序列化
        SerializeConfig config = new SerializeConfig();
        // 开放平台接口使用下划线方式（SnakeCase）序列化
        // 因此需要将Bean中的小驼峰（CamelCase）进行转换
        config.propertyNamingStrategy = PropertyNamingStrategy.SnakeCase;
        DEFAULT_SERIALIZE_CONFIG = config;

        // 设置全局反序列化规则，默认即可
        // FastJson中的JavaBeanDeserializer.java中使用的smartMatch会自动适配下划线和大驼峰的方式，转为小驼峰
        // 最稳妥的做法是使用SDK项目中tools工程根据文档的字段定义自动生成Bean中的Field字段
        DEFAULT_PARSER_CONFIG = ParserConfig.getGlobalInstance();
    }

    /**
     * SDK使用的全局JSON序列化配置
     */
    public static final SerializeConfig DEFAULT_SERIALIZE_CONFIG;

    /**
     * SDK使用的全局JSON反序列化配置
     */
    public static final ParserConfig DEFAULT_PARSER_CONFIG;
}
