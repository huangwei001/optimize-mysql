package com.test.entity;

import lombok.Data;


@Data
public class User extends BaseEntity{

    private String id;

    private String name;

    private int old;

    private String sex;

    private String tel;

    private String address;

    private String idCard;

    private String loginName;

    private String passWord;

    private String departMent;

    private int status;

    private String remark;
}
