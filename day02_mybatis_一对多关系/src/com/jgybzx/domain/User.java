package com.jgybzx.domain;

/**
 * @author: guojy
 * @date: 2019/12/8 20:36
 * @Description:
 * @version:
 */

import java.util.List;

/**
 * id           int(11)
 * username     varchar(50)
 * password      varchar(50)
 * gender        varchar(11)
 * email         varchar(50)
 * telephone    varchar(15)
 */
public class User {
    public User() {
    }

    private Integer id;
    private String username;
    private String password;
    private String gender;
    private String email;
    private String telephone;
    //一个用户可以对象多个账户，所以在User中 account应该是个集合
    private List<Account> accounts;

    @Override
    public String toString() {
        return "User{" +
                "id=" + id +
                ", username='" + username + '\'' +
                ", password='" + password + '\'' +
                ", gender='" + gender + '\'' +
                ", email='" + email + '\'' +
                ", telephone='" + telephone + '\'' +
                ", accounts=" + accounts +
                '}';
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

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getTelephone() {
        return telephone;
    }

    public void setTelephone(String telephone) {
        this.telephone = telephone;
    }

    public List<Account> getAccounts() {
        return accounts;
    }

    public void setAccounts(List<Account> accounts) {
        this.accounts = accounts;
    }

    public User(Integer id, String username, String password, String gender, String email, String telephone, List<Account> accounts) {
        this.id = id;
        this.username = username;
        this.password = password;
        this.gender = gender;
        this.email = email;
        this.telephone = telephone;
        this.accounts = accounts;
    }
}
