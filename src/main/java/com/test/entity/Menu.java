package com.test.entity;

import lombok.Data;

@Data
public class Menu extends BaseEntity{

    private String treeName;

    private String menuType;

    private String menuName;

    private String url;

    private String perms;

    private int orderNum;

    private String icon;

    private String visible;

}
