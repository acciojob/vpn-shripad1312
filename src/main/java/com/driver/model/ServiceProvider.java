package com.driver.model;


import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;

@Entity
@Table(name = "serviceprovider")
public class ServiceProvider {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer s_id;

    private String Name;

    @ManyToOne
    @JoinColumn
    private Admin admin;



    @OneToMany(mappedBy = "serviceProviders",cascade = CascadeType.ALL)
    private List<Connection>connectionList=new ArrayList<>();

    @ManyToMany(mappedBy = "serviceProviderList",cascade = CascadeType.ALL)
    private List<User>userList=new ArrayList<>();



    @OneToMany(mappedBy = "serviceProvider",cascade = CascadeType.ALL)
    private List<Country>countryList=new ArrayList<>();



    //crete all args no args constructior

    public ServiceProvider() {
    }

    public ServiceProvider(Integer s_id, String name, Admin admin, List<Connection> connectionList, List<User> userList, List<Country> countryList) {
        this.s_id = s_id;
        Name = name;
        this.admin = admin;
        this.connectionList = connectionList;
        this.userList = userList;
        this.countryList = countryList;
    }

    //create getter and setter after last

    public Integer getS_id() {
        return s_id;
    }

    public void setS_id(Integer s_id) {
        this.s_id = s_id;
    }

    public String getName() {
        return Name;
    }

    public void setName(String name) {
        Name = name;
    }

    public Admin getAdmin() {
        return admin;
    }

    public void setAdmin(Admin admin) {
        this.admin = admin;
    }

    public List<Connection> getConnectionList() {
        return connectionList;
    }

    public void setConnectionList(List<Connection> connectionList) {
        this.connectionList = connectionList;
    }

    public List<User> getUserList() {
        return userList;
    }

    public void setUserList(List<User> userList) {
        this.userList = userList;
    }

    public List<Country> getCountryList() {
        return countryList;
    }

    public void setCountryList(List<Country> countryList) {
        this.countryList = countryList;
    }
}
