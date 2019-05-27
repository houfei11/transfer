package com.auke.spring.dome1;

public interface AccountDao {
    /**
     *  转出
     * @param out ：转出账号
     * @param money ：转出金额
     */
    public void outMoney(String out, Double money);

    /**
     * 转入
     * @param in ：转入账号
     * @param money ：转出金额
     */
    public void inMoney(String in, Double money);

}
