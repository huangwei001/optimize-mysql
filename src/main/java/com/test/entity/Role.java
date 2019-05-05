package com.test.entity;

import lombok.Data;

@Data
public class Role extends BaseEntity{

    private String roleName;

    private String roleKey;

    private String roleSort;

    private String status;

    private String remark;

    private String menuTrees;

}
