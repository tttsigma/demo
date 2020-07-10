package com.ttt.demo.pojo;

import javax.persistence.*;
import java.util.Objects;

@Entity
@Table(name = "user_role", schema = "vue_demo", catalog = "")
public class UserRole {
    private int id;
    private int uid;
    private int rid;

    @Id
    @Column(name = "id")
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    @Basic
    @Column(name = "uid")
    public int getUid() {
        return uid;
    }

    public void setUid(int uid) {
        this.uid = uid;
    }

    @Basic
    @Column(name = "rid")
    public int getRid() {
        return rid;
    }

    public void setRid(int rid) {
        this.rid = rid;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        UserRole userRole = (UserRole) o;
        return id == userRole.id &&
                uid == userRole.uid &&
                rid == userRole.rid;
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, uid, rid);
    }
}
