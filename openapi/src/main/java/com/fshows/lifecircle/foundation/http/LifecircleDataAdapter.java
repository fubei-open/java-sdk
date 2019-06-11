package com.fshows.lifecircle.foundation.http;

import com.fshows.lifecircle.foundation.model.CommonResultModel;
import retrofit2.Call;
import retrofit2.CallAdapter;

import java.io.IOException;
import java.lang.reflect.Type;

/**
 * 生活圈返回数据转换对象
 * 将Call<R>对象转换成数据实体
 *
 * @author John (linwei@fshows.com)
 * @version $Id LifecircleDataAdapter.java, v1.0 2019-06-07 11:25 John Exp$
 */
public class LifecircleDataAdapter<T> implements CallAdapter<CommonResultModel<T>, CommonResultModel<T>> {
    /**
     * 网络请求是否在异步线程中执行
     */
    private boolean async = false;

    LifecircleDataAdapter(boolean async) {
        this.async = async;
    }

    @Override
    public Type responseType() {
        return null;
    }

    @Override
    public CommonResultModel<T> adapt(Call<CommonResultModel<T>> call) {
        // 同步执行，将在当前线程中执行请求
        try {
            return call.execute().body();
        } catch (IOException e) {
            e.printStackTrace();
        }
        return null;
    }
}
