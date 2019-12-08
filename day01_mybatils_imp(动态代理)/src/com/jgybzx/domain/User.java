package com.jgybzx.domain;

/**
 * @author: guojy
 * @date: 2019/12/6 17:47
 * @Description:
 * @version:
 */

import java.util.Date;

/**
 * id           int(11)
 * username     varchar(32)     用户名称
 * birthday     datetime        生日
 * sex          varchar(10)     性别
 * address      varchar(256)    地址
 */
public class User {
    public User() {
    }

    private Integer id; //
    private String username; //用户名称
    private Date birthday; //生日
    private String sex; //性别
    private String address; //地址

    public User(Integer id, String username, Date birthday, String sex, String address) {
        this.id = id;
        this.username = username;
        this.birthday = birthday;
        this.sex = sex;
        this.address = address;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public Date getBirthday() {
        return birthday;
    }

    public void setBirthday(Date birthday) {
        this.birthday = birthday;
    }

    public String getSex() {
        return sex;
    }

    public void setSex(String sex) {
        this.sex = sex;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    @Override
    public String toString() {
        return "User{" +
                "id=" + id +
                ", username='" + username + '\'' +
                ", birthday=" + birthday +
                ", sex='" + sex + '\'' +
                ", address='" + address + '\'' +
                '}';
    }
}
