package com.didispace;

import com.didispace.task.Task2;
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
public class TaskTests2 {
    @Autowired
    private Task2 task;

    @Test
    public void test() throws Exception {
        task.doTaskOne();
        task.doTaskTwo();
        task.doTaskThree();
    }

}
