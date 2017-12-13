package com.didispace;

import com.didispace.domain.Users;
import com.didispace.domain.UsersRepository;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

/**
 * Created by zhudonghong123 on 2017/12/13.
 */
@RunWith(SpringRunner.class)
@SpringBootTest
public class UsersjpaTests {
    @Autowired
    private UsersRepository UsersRepository;

    @Test
    public void test() throws Exception {

        // 创建10条记录
        UsersRepository.save(new Users("AAA", 10));
        UsersRepository.save(new Users("BBB", 20));
        UsersRepository.save(new Users("CCC", 30));
        UsersRepository.save(new Users("DDD", 40));
        UsersRepository.save(new Users("EEE", 50));
        UsersRepository.save(new Users("FFF", 60));
        UsersRepository.save(new Users("GGG", 70));
        UsersRepository.save(new Users("HHH", 80));
        UsersRepository.save(new Users("III", 90));
        UsersRepository.save(new Users("JJJ", 100));


    }

    @Test
    public void test1() throws Exception {

        // 测试findAll, 查询所有记录
        Assert.assertEquals(10, UsersRepository.findAll().size());


    }

    @Test
    public void test2() throws Exception {

        // 测试findByName, 查询姓名为FFF的User
        Assert.assertEquals(60, UsersRepository.findByName("FFF").getAge().longValue());


    }

    @Test
    public void test3() throws Exception {

        // 测试findUser, 查询姓名为FFF的User
        Assert.assertEquals(60, UsersRepository.findUsers("FFF").getAge().longValue());


    }

    @Test
    public void test4() throws Exception {

        // 测试findByNameAndAge, 查询姓名为FFF并且年龄为60的User
        Assert.assertEquals("FFF", UsersRepository.findByNameAndAge("FFF", 60).getName());


    }

    @Test
    public void test5() throws Exception {

        // 测试删除姓名为AAA的User
        UsersRepository.delete(UsersRepository.findByName("AAA"));
    }
    @Test
    public void test6() throws Exception {

        // 测试findAll, 查询所有记录, 验证上面的删除是否成功
        Assert.assertEquals(9, UsersRepository.findAll().size());

    }


}
