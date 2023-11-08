package com.wzxxl.gamelogic.enums;

/**
 * @Author libaowen
 * @Date 2023/11/7 14:00
 * @Version 1.0
 */
public enum JobEnum {

    WARRIOR("warrior", "战士"),

    MAGE("mage", "法师");

    private String code;

    private String name;

    JobEnum(String code, String name) {
        this.code = code;
        this.name = name;
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
