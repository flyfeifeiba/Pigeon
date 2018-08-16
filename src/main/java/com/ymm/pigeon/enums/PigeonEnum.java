package com.ymm.pigeon.enums;



public enum PigeonEnum {

    PIGEON(1, "鸽"),
    NOT_PIGEON(2, "不鸽");

    private int code;
    private String name;
    PigeonEnum(int code, String name){
        this.code = code;
        this.name = name;
    }

    public int getCode() {
        return code;
    }

    public String getName() {
        return name;
    }
}
