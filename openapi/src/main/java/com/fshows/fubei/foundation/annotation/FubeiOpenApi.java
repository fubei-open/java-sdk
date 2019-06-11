package com.fshows.fubei.foundation.annotation;

import com.fshows.fubei.foundation.constants.OpenApiConstants;

import java.lang.annotation.*;

/**
 * 生活圈Api
 *
 * @author John (linwei@fshows.com)
 * @version $Id FubeiOpenApi.java, v1.0 2019-06-05 23:56 John Exp$
 */
@SuppressWarnings("unused")
@Documented
@Target({ElementType.METHOD, ElementType.ANNOTATION_TYPE})
@Retention(RetentionPolicy.RUNTIME)
public @interface FubeiOpenApi {
    String method();

    String version() default OpenApiConstants.API_VERSION_1_0;

    String format() default OpenApiConstants.DATA_FORMAT_JSON;

    String signMethod() default OpenApiConstants.HASH_METHOD_MD5;
}
