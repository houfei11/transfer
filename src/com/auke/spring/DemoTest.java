package com.auke.spring;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import javax.annotation.Resource;

/**
 *  转账测试类
 * @author Administrator
 */
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration("classpath:spring-config2.xml")
public class DemoTest {

//    // 测试业务类
//    @Resource(name = "accountService")
//    private AccountService accountService;

    /**
     * 注入代理类：因为代理类有增强的操作
     */
    @Resource(name = "accountServiceProxy")
    private AccountService accountService;

    @Test
    public void text(){
        accountService.transfer("张三", "李四", 200d);
    }
}
