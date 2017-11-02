package com.blog.model.apibase;

import java.io.Serializable;

import com.fasterxml.jackson.annotation.JsonInclude;

@JsonInclude(JsonInclude.Include.NON_NULL)
public class Result<T> implements Serializable, JsonSupport {

    /**
     * 
     */
    private static final long serialVersionUID = 4298776050691965743L;

    private String code;
    private String error;
    private T data;

    public Result(ErrorCode error, String code, T data) {
        this.data = data;
        this.code = code;
        this.error = error.name();
    }

    public static <T> Result<T> adHocError(ErrorCode errorCode) {
        return new Result<T>(errorCode, null, null);
    }

    public static <T> Result<T> adHocError(ErrorCode errorCode, String errorMsg) {
        return new Result<T>(errorCode, errorMsg, null);
    }

    public static <T> Result<T> showOnlyError(String errorMsg) {
        return adHocError(ErrorCode.COMMON_ERROR, errorMsg);
    }

    public static <T> Result<T> showOnlyError(String errorMsg, Object... obj) {
        return adHocError(ErrorCode.COMMON_ERROR, String.format(errorMsg, obj));
    }

    public static <T> Result<T> success() {
        return new Result<T>(ErrorCode.OK, null, null);
    }

    public static <T> Result<T> success(T data) {
        return new Result<T>(ErrorCode.OK, null, data);
    }

    public String getCode() {
        return code;
    }

    public T getData() {
        return data;
    }

    public String getError() {
        return error;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public void setError(String error) {
        this.error = error;
    }

    public void setData(T data) {
        this.data = data;
    }

    public boolean amOk() {
        return ErrorCode.OK.name().equals(code);
    }

    public boolean expectedError(ErrorCode errorCode) {
        return code.equals(errorCode.name());
    }

    @Override
    public String toString() {
        return "Result [code=" + code + ", error=" + error + ", data=" + data + "]";
    }

}
