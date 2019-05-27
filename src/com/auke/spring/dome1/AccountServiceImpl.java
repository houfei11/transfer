package com.auke.spring.dome1;

import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

/**
 * @Transactional 注解中的属性：
 *      propagation : 事物的传播行为
 *      isolation   : 事物的隔离级别
 *      readOnly    : 只读
 *      rollbackFor : 发生哪些异常回滚
 *      noRollbackFor:发生哪些异常不回滚
 */
@Transactional(propagation = Propagation.REQUIRED)
public class AccountServiceImpl implements AccountService {
    /**
     *  注入Dao层类
     */
    private AccountDao accountDao;

    public void setAccountDao(AccountDao accountDao) {
        this.accountDao = accountDao;
    }

    /**
     *  转账方法
     * @param out
     * @param in
     * @param money
     */
    @Override
    public void transfer(String out, String in, Double money) {
        accountDao.outMoney(out, money);
        int i = 1/0;
        accountDao.inMoney(in, money);
    }
}
