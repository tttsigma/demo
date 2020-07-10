package com.ttt.demo.pojo;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import javax.persistence.*;
import java.util.Objects;

@Entity
@Table(name = "permission")
@JsonIgnoreProperties({"handler","hibernateLazyInitializer"})
public class Permission {
    private int id;
    private String name;
    private String prmDesc;
    private String url;

    @Id
    @Column(name = "id")
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    @Basic
    @Column(name = "name")
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Basic
    @Column(name = "prm_desc")
    public String getPrmDesc() {
        return prmDesc;
    }

    public void setPrmDesc(String prmDesc) {
        this.prmDesc = prmDesc;
    }

    @Basic
    @Column(name = "url")
    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Permission that = (Permission) o;
        return id == that.id &&
                Objects.equals(name, that.name) &&
                Objects.equals(prmDesc, that.prmDesc) &&
                Objects.equals(url, that.url);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, name, prmDesc, url);
    }
}
