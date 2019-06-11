package com.fshows.fubei.foundation.exception;

import com.google.common.base.Strings;

/**
 * 运行时异常
 *
 * @author John (linwei@fshows.com)
 * @version $Id NetRuntimeException.java, v1.0 2019-06-07 12:04 John Exp$
 */
public class NetRuntimeException extends AbstractNetException {
    /**
     * 设置备注信息
     */
    private String remark;

    /**
     * 内部错误
     */
    private Exception innerException;

    public NetRuntimeException(Throwable e) {
        super(e);
    }

    public NetRuntimeException(Throwable e, String remark) {
        super(e);
        this.remark = remark;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder(NetRuntimeException.class.getName()).append(": ");
        if (!Strings.isNullOrEmpty(remark)) {
            sb.append(remark).append(", InnerException: ");
        }
        sb.append(innerException.toString());
        return sb.toString();
    }

    public Exception getInnerException() {
        return innerException;
    }

    public void setInnerException(Exception innerException) {
        this.innerException = innerException;
    }
}
