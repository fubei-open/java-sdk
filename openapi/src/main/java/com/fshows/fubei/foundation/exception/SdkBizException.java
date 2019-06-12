package com.fshows.fubei.foundation.exception;

import com.alibaba.fastjson.JSON;
import com.annimon.stream.function.Consumer;
import com.annimon.stream.function.Supplier;
import com.annimon.stream.function.ThrowableConsumer;
import com.annimon.stream.function.ThrowableSupplier;
import com.fshows.fubei.foundation.model.CommonResultModel;
import com.google.common.base.Strings;
import com.google.common.collect.Maps;

import javax.annotation.Nonnull;
import java.text.MessageFormat;
import java.util.Map;

/**
 * 业务异常
 *
 * @author John (linwei@fshows.com)
 * @version $Id SdkBizException.java, v1.0 2019-06-07 11:57 John Exp$
 */
@SuppressWarnings("unused")
public class SdkBizException extends AbstractNetException {

    public SdkBizException(int resultCode, String resultMessage) {
        this.resultCode = resultCode;
        this.resultMessage = Strings.nullToEmpty(resultMessage);
    }

    public SdkBizException(@Nonnull final CommonResultModel commonResultModel) {
        this.resultCode = commonResultModel.getResultCode();
        this.resultMessage = commonResultModel.getResultMessage();
        if (commonResultModel.getSubCode() != null) {
            this.subCode = commonResultModel.getSubCode();
        }
        if (commonResultModel.getData() != null) {
            this.payload = getPayload(commonResultModel.getData());
        }
    }

    public SdkBizException(int resultCode, String subCode, String resultMessage) {
        this.resultCode = resultCode;
        this.resultMessage = resultMessage;
        this.payload = null;
        this.subCode = subCode;
    }

    public SdkBizException(int resultCode, String subCode, String resultMessage, String payload) {
        this.resultCode = resultCode;
        this.resultMessage = resultMessage;
        this.subCode = subCode;
        this.payload = getPayload(payload);
    }

    private Map getPayload(final Object payload) {
        return Supplier.Util.safe(new ThrowableSupplier<Map, Throwable>() {
            @Override
            public Map get() {
                return JSON.parseObject(payload.toString(), Map.class);
            }
        }, Maps.newHashMap()).get();
    }

    /**
     * 返回结果码
     */
    private Integer resultCode;

    /**
     * 平台方错误码
     */
    private String subCode;

    /**
     * 错误信息
     */
    private String resultMessage;

    /**
     * 获得额外的Data数据
     */
    private Map payload;

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("SdkBizException: ")
                .append("resultCode:").append(resultCode)
                .append(", resultMessage:").append(resultMessage);
        if (!Strings.isNullOrEmpty(subCode)) {
            sb.append(", subCode:").append(subCode);
        }
        if (payload != null) {
            sb.append(", payload:").append(payload.toString());
        }
        return sb.toString();
    }

    public Integer getResultCode() {
        return resultCode;
    }

    public void setResultCode(Integer resultCode) {
        this.resultCode = resultCode;
    }

    @Override
    public String getMessage() {
        return resultMessage;
    }

    public void setResultMessage(String resultMessage) {
        this.resultMessage = resultMessage;
    }

    public String getResultMessage() {
        return resultMessage;
    }

    public String getSubCode() {
        return subCode;
    }

    public void setSubCode(String subCode) {
        this.subCode = subCode;
    }

    public Map getPayload() {
        return payload;
    }

    public void setPayload(Map payload) {
        this.payload = payload;
    }
}
