package com.lee.mybatis_one2many;

import com.lee.mybatis_one2many.mapper.TestOneMapper;
import com.lee.mybatis_one2many.mapper.TestTwoMapper;
import com.lee.mybatis_one2many.pojo.TestOne;
import com.lee.mybatis_one2many.pojo.TestTwo;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.List;

@RunWith(SpringRunner.class)
@SpringBootTest
public class MybatisOne2manyApplicationTests {

    @Autowired
    TestOneMapper testOneMapper;
    @Autowired
    TestTwoMapper testTwoMapper;

    @Test
    public void test() {
        List<TestOne> testOnes = testOneMapper.findAllTestOne();
        System.out.println(testOnes);
        List<TestTwo> testTwos = testTwoMapper.findAllTestTwo();
        System.out.println(testTwos);
    }

}
