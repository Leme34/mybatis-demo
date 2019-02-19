package com.lee.mybatis_one2many.mapper;

import com.lee.mybatis_one2many.pojo.TestTwo;
import com.lee.mybatis_one2many.pojo.TestTwoExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface TestTwoMapper {

    List<TestTwo> findAllTestTwo();

    int countByExample(TestTwoExample example);

    int deleteByExample(TestTwoExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(TestTwo record);

    int insertSelective(TestTwo record);

    List<TestTwo> selectByExample(TestTwoExample example);

    TestTwo selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") TestTwo record, @Param("example") TestTwoExample example);

    int updateByExample(@Param("record") TestTwo record, @Param("example") TestTwoExample example);

    int updateByPrimaryKeySelective(TestTwo record);

    int updateByPrimaryKey(TestTwo record);
}