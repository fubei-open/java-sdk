package com.fshows.lifecircle.foundation.model;

import com.alibaba.fastjson.annotation.JSONField;

/**
 * 返回实体
 *
 * @author John (linwei@fshows.com)
 * @version $Id CommonResultModel.java, v1.0 2019-06-06 23:16 John Exp$
 */
@SuppressWarnings("unused")
public class CommonResultModel<T> implements BaseModel {
    /**
     * 返回码
     */
    @JSONField(name = "result_code")
    private int resultCode;

    /**
     * 部分支付请求，平台方的错误码
     */
    @JSONField(name = "sub_code")
    private String subCode;

    /**
     * 返回错误信息
     */
    @JSONField(name = "result_message")
    private String resultMessage;

    /**
     * 返回数据实体
     */
    @JSONField(name = "data")
    private T data;

    public int getResultCode() {
        return resultCode;
    }

    public void setResultCode(int resultCode) {
        this.resultCode = resultCode;
    }

    public String getResultMessage() {
        return resultMessage;
    }

    public void setResultMessage(String resultMessage) {
        this.resultMessage = resultMessage;
    }

    public T getData() {
        return data;
    }

    public void setData(T data) {
        this.data = data;
    }
}
