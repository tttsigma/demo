package com.ttt.demo.pojo;

import javax.persistence.*;
import java.util.Objects;

@Entity
@Table(name = "role_permission", schema = "vue_demo", catalog = "")
public class RolePermission {
    private int id;
    private int rid;
    private int pid;

    @Id
    @Column(name = "id")
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    @Basic
    @Column(name = "rid")
    public int getRid() {
        return rid;
    }

    public void setRid(int rid) {
        this.rid = rid;
    }

    @Basic
    @Column(name = "pid")
    public int getPid() {
        return pid;
    }

    public void setPid(int pid) {
        this.pid = pid;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        RolePermission that = (RolePermission) o;
        return id == that.id &&
                rid == that.rid &&
                pid == that.pid;
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, rid, pid);
    }
}
