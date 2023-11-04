package com.driver.model;

import org.hibernate.annotations.GeneratorType;

import javax.persistence.*;

@Entity
@Table(name="Connection")
public class Connection {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    @ManyToOne
    @JoinColumn
    private User user;

    @ManyToOne
    @JoinColumn
    private ServiceProvider serviceProviders;

    public Connection() {
    }

    public Connection(int id, User user, ServiceProvider serviceProviders) {
        this.id = id;
        this.user = user;
        this.serviceProviders = serviceProviders;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }

    public ServiceProvider getServiceProviders() {
        return serviceProviders;
    }

    public void setServiceProviders(ServiceProvider serviceProviders) {
        this.serviceProviders = serviceProviders;
    }
}
