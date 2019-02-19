package com.lee.mybatis_one2many.pojo;

import lombok.Data;

import java.util.List;

/**
 * 表1
 */
@Data
public class TestOne {
    private Integer id;              //表1的id
    private String nickname;         //表1的字段
    private List<TestTwo> testTwos;  //表1与表2是1对多关系
}