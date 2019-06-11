package com.fshows.fubei.foundation.exception;

import java.io.IOException;

/**
 * 通用的网络异常
 * 因为Retrofit只接受IOException，所以从IOException中集成
 *
 * @author John (linwei@fshows.com)
 * @version $Id SdkException.java, v1.0 2019-06-07 12:07 John Exp$
 */
@SuppressWarnings({"unused", "WeakerAccess"})
public abstract class AbstractNetException extends IOException {
    public AbstractNetException() {
        super();
    }

    public AbstractNetException(String message) {
        super(message);
    }

    public AbstractNetException(String message, Throwable cause) {
        super(message, cause);
    }

    public AbstractNetException(Throwable cause) {
        super(cause);
    }

    @Override
    public String toString() {
        return super.toString();
    }
}
