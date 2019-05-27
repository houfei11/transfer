package com.auke.spring.dome;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import javax.annotation.Resource;

/**
 * Spring声明式事物管理第二种方法：基于aspectj的xml方式的配置
 * @author Administrator
 */
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration("classpath:spring-config3.xml")
public class DemoTest1 {

    @Resource(name = "accountService")
    private AccountService accountService;
    /**
     * 转账案例
     */
    @Test
    public void demo(){
        accountService.transfer("李四","小明",500d);
    }
}
