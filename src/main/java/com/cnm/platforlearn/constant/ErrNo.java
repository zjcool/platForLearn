package com.cnm.platforlearn.constant;



public enum ErrNo {
    SUCCESS("0"),
    UNKNOWN("999");
    private String error;

    ErrNo(String error) {
        this.error = error;
    }

    public String getError() {
        return error;
    }

}
