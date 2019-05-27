package com.auke.spring.dome1;

/**
 * @author Administrator
 */
public interface AccountService {
    /**
     *  转账方法
     * @param out
     * @param in
     * @param money
     */
    public void transfer(String out, String in, Double money);
}
