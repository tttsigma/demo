package com.ttt.demo.pojo;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import javax.persistence.*;
import javax.websocket.ClientEndpoint;

@Entity
@Table(name = "user")
@JsonIgnoreProperties({"handler","hibernateLazyInitializer"})
public class User {
    private int id;
    private String name;
    private String password;
    private Role role;

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String username) {
        this.name = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }


    @ManyToOne
    @JoinColumn(name="rid")
    public Role getRole() {
        return role;
    }

    public void setRole(Role role) {
        this.role = role;
    }
}
