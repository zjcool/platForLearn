package com.cnm.platforlearn.constant;


public enum ErrNoEnum {
    SUCCESS("0", "SUCCESS"),
    UNKNOWN("999", "UNKNOWN");




    private String error;

    private String msg;


    ErrNoEnum(String error, String msg) {
        this.error = error;
        this.msg = msg;
    }

    public String getError() {
        return error;
    }


    public String getMsg() {
        return msg;
    }


}
