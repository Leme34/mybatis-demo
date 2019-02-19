package com.lee.mybatis_one2many.mapper;

import com.lee.mybatis_one2many.pojo.TestOne;
import com.lee.mybatis_one2many.pojo.TestOneExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface TestOneMapper {

    /**
     * <collection>关联查询所有TestTwo
     */
    List<TestOne> findAllTestOne();

    int countByExample(TestOneExample example);

    int deleteByExample(TestOneExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(TestOne record);

    int insertSelective(TestOne record);

    List<TestOne> selectByExample(TestOneExample example);

    TestOne selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") TestOne record, @Param("example") TestOneExample example);

    int updateByExample(@Param("record") TestOne record, @Param("example") TestOneExample example);

    int updateByPrimaryKeySelective(TestOne record);

    int updateByPrimaryKey(TestOne record);
}