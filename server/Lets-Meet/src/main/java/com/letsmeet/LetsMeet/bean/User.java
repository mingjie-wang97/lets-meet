package com.letsmeet.LetsMeet.bean;

import org.springframework.beans.factory.annotation.Value;

import javax.persistence.*;

@Entity
@Table(name="users")
public class User {
    @Id
    private String username;
    @Column
    private String type;
    @Column
    private String password;
    @Column
    private String email;
    @Column
    private String phone_number;
    @Column
    private String wechat_number;
    @Column
    private String first_name;
    @Column
    private String last_name;
    @Column
    private String birthday;
    @Column
    private String display_name;
    @Column
    private String home_address;
    @Column
    private Double home_latitude;
    @Column
    private Double home_longitude;
    @Column
    private String external_login_type;
    @Column
    private String external_login_id;

    public User() {
        super();
    }

    public User(String username, String type, String password, String email, String phone_number, String wechat_number, String first_name, String last_name, String birthday, String display_name, String home_address, Double home_latitude, Double home_longitude, String external_login_type, String external_login_id) {
        this.username = username;
        this.type = type;
        this.password = password;
        this.email = email;
        this.phone_number = phone_number;
        this.wechat_number = wechat_number;
        this.first_name = first_name;
        this.last_name = last_name;
        this.birthday = birthday;
        this.display_name = display_name;
        this.home_address = home_address;
        this.home_latitude = home_latitude;
        this.home_longitude = home_longitude;
        this.external_login_type = external_login_type;
        this.external_login_id = external_login_id;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPhone_number() {
        return phone_number;
    }

    public void setPhone_number(String phone_number) {
        this.phone_number = phone_number;
    }

    public String getWechat_number() {
        return wechat_number;
    }

    public void setWechat_number(String wechat_number) {
        this.wechat_number = wechat_number;
    }

    public String getFirst_name() {
        return first_name;
    }

    public void setFirst_name(String first_name) {
        this.first_name = first_name;
    }

    public String getLast_name() {
        return last_name;
    }

    public void setLast_name(String last_name) {
        this.last_name = last_name;
    }

    public String getBirthday() {
        return birthday;
    }

    public void setBirthday(String birthday) {
        this.birthday = birthday;
    }

    public String getDisplay_name() {
        return display_name;
    }

    public void setDisplay_name(String display_name) {
        this.display_name = display_name;
    }

    public String getHome_address() {
        return home_address;
    }

    public void setHome_address(String home_address) {
        this.home_address = home_address;
    }

    public Double getHome_latitude() {
        return home_latitude;
    }

    public void setHome_latitude(Double home_latitude) {
        this.home_latitude = home_latitude;
    }

    public Double getHome_longitude() {
        return home_longitude;
    }

    public void setHome_longitude(Double home_longitude) {
        this.home_longitude = home_longitude;
    }

    public String getExternal_login_type() {
        return external_login_type;
    }

    public void setExternal_login_type(String external_login_type) {
        this.external_login_type = external_login_type;
    }

    public String getExternal_login_id() {
        return external_login_id;
    }

    public void setExternal_login_id(String external_login_id) {
        this.external_login_id = external_login_id;
    }

    @Override
    public String toString() {
        return "User{" +
                "username='" + username + '\'' +
                ", type='" + type + '\'' +
                ", password='" + password + '\'' +
                ", email='" + email + '\'' +
                ", phone_number='" + phone_number + '\'' +
                ", wechat_number='" + wechat_number + '\'' +
                ", first_name='" + first_name + '\'' +
                ", last_name='" + last_name + '\'' +
                ", birthday='" + birthday + '\'' +
                ", display_name='" + display_name + '\'' +
                ", home_address='" + home_address + '\'' +
                ", home_latitude=" + home_latitude +
                ", home_longitude=" + home_longitude +
                ", external_login_type='" + external_login_type + '\'' +
                ", external_login_id='" + external_login_id + '\'' +
                '}';
    }
}
