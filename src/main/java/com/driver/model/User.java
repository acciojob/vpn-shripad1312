package com.driver.model;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;

@Entity
@Table(name = "USER")
public class User {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    private String username;
    private  String password;
    private String original_Ip;
    private  String masked_ip;
    private boolean connected;


    @OneToOne
    @JoinColumn
    private Country country;

    @ManyToMany
    @JoinColumn
    private List<ServiceProvider>serviceProviderList=new ArrayList<>();


    @OneToMany(mappedBy = "user",cascade = CascadeType.ALL)
    private List<Connection> connectionList=new ArrayList<>();




    //all args no args constructor

    public User() {
    }

    public User(Integer id, String username, String password, String original_Ip, String maked_Ip, boolean connected, Country country, List<ServiceProvider> serviceProviderList, List<Connection> connectionList) {
        this.id = id;
        this.username = username;
        this.password = password;
        this.original_Ip = original_Ip;
        this.masked_ip = maked_Ip;
        this.connected = connected;
        this.country = country;
        this.serviceProviderList = serviceProviderList;
        this.connectionList = connectionList;
    }

    //setter getter

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

    public String getOriginal_Ip() {
        return original_Ip;
    }

    public void setOriginal_Ip(String original_Ip) {
        this.original_Ip = original_Ip;
    }

    public String getMasked_ip() {
        return masked_ip;
    }

    public void setMasked_ip(String masked_ip) {
        this.masked_ip = masked_ip;
    }

    public boolean isConnected() {
        return connected;
    }

    public void setConnected(boolean connected) {
        this.connected = connected;
    }

    public Country getCountry() {
        return country;
    }

    public void setCountry(Country country) {
        this.country = country;
    }

    public List<ServiceProvider> getServiceProviderList() {
        return serviceProviderList;
    }

    public void setServiceProviderList(List<ServiceProvider> serviceProviderList) {
        this.serviceProviderList = serviceProviderList;
    }

    public List<Connection> getConnectionList() {
        return connectionList;
    }

    public void setConnectionList(List<Connection> connectionList) {
        this.connectionList = connectionList;
    }
}
