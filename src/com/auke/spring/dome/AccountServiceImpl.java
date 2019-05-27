package com.auke.spring.dome;

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
