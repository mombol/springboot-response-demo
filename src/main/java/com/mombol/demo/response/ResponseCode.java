package com.mombol.demo.response;

public enum ResponseCode {

    SUCESS("200", "成功"),
    INTERNAL_SERVER_ERROR("500", "服务器内部错误");


    private String code;
    private String message;

    ResponseCode(String code, String message) {
        this.code = code;
        this.message = message;
    }

    public String getCode() {
        return code;
    }

    public String getMessage() {
        return message;
    }

}
