package com.lee.mybatis_one2many.pojo;

import lombok.Data;

/**
 * 表2
 */
@Data
public class TestTwo {
    private Integer id;         //表2的id
    private String nickname;    //表2的字段
    private Integer oneId;      //表1的外键
    private TestOne testOne;    //表1与表2是1对多关系
}
