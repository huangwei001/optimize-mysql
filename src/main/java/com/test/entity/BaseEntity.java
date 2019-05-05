package com.test.entity;

import lombok.Data;

import java.util.Date;

@Data
public class BaseEntity {

    private String id;

    private Date creatTime;

    private Date updateTime;

    private int deleteFlag;

}
