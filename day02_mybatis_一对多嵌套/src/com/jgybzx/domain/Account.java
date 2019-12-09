package com.jgybzx.domain;

/**
 * @author: guojy
 * @date: 2019/12/8 20:34
 * @Description: 账户对应的实体类
 * @version:
 */

/**
 * id        int(11)
 * money    int(11)
 * address  varchar(32)
 * aname    varchar(32)
 * uid      int(11)
 */
public class Account {
    public Account() {
    }

    private Integer id;
    private Integer money;
    private String address;
    private String aname;

    @Override
    public String toString() {
        return "Account{" +
                "id=" + id +
                ", money=" + money +
                ", address='" + address + '\'' +
                ", aname='" + aname + '\'' +
                '}';
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getMoney() {
        return money;
    }

    public void setMoney(Integer money) {
        this.money = money;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getAname() {
        return aname;
    }

    public void setAname(String aname) {
        this.aname = aname;
    }

    public Account(Integer id, Integer money, String address, String aname) {
        this.id = id;
        this.money = money;
        this.address = address;
        this.aname = aname;
    }
}
