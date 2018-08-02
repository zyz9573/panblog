package com.panblog.enums;

/**
 * 
 */
public enum ResultEnum {
    UNKONW_ERROR(-1, "unknown_error"),
    SUCCESS(0, "success"),
    DATA_VALIADATION_ERROR(1,"data validation error"),
    ;

    private Integer code;

    private String msg;

    ResultEnum(Integer code, String msg) {
        this.code = code;
        this.msg = msg;
    }

    public Integer getCode() {
        return code;
    }

    public String getMsg() {
        return msg;
    }
}