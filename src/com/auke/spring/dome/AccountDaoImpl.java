package com.auke.spring.dome;


import org.springframework.jdbc.core.support.JdbcDaoSupport;

/**
 * @author Administrator
 */
public class AccountDaoImpl extends JdbcDaoSupport implements AccountDao {
    /**
     *  转出
      * @param out ：转出账号
     * @param money ：转出金额
     */
    @Override
    public void outMoney(String out, Double money) {
        String sql = "update account set money = money - ? where name = ?";
        this.getJdbcTemplate().update(sql, money, out);
    }

    /**
     *  转入
     * @param in ：转入账号
     * @param money ：转出金额
     */
    @Override
    public void inMoney(String in, Double money) {
        String sql = "update account set money = money + ? where name = ?";
        this.getJdbcTemplate().update(sql, money, in);
    }
}
