package com.auke.spring.dome1;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import javax.annotation.Resource;

/**
 * Spring声明式事物管理第三种方法：基于注解的方式配置
 * @author Administrator
 */
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration("classpath:spring-config4.xml")
public class DemoTest2 {

    @Resource(name = "accountService")
    private AccountService accountService;
    /**
     * 转账案例
     */
    @Test
    public void demo()
    {
        accountService.transfer("李四","小明",500d);
    }
}
