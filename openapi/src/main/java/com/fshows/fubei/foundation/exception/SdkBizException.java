package com.fshows.fubei.foundation.exception;

import java.text.MessageFormat;

/**
 * 业务异常
 *
 * @author John (linwei@fshows.com)
 * @version $Id SdkBizException.java, v1.0 2019-06-07 11:57 John Exp$
 */
public class SdkBizException extends AbstractNetException {

    public SdkBizException(String code, String message) {
        this.code = code;
        this.message = message;
    }

    /**
     * 返回结果码
     */
    private String code;

    /**
     * 错误信息
     */
    private String message;

    @Override
    public String toString() {
        return MessageFormat.format("resultCode:{0} resultMessage:{1}", code, message);
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    @Override
    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }
}
