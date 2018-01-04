package com.myq.annotation.pojo;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

/**
 * created on 17/12/28
 *
 * @author romens
 * @version 1.0
 */
@Component(value = "role1")
public class Role {
    @Value("2")
    private long id;
    @Value("role_name_2")
    private String roleName;
    @Value("role_note_2")
    private String note;

    public Role(String roleName, String note) {
        this.roleName = roleName;
        this.note = note;
    }

    public Role() {
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getRoleName() {
        return roleName;
    }

    public void setRoleName(String roleName) {
        this.roleName = roleName;
    }

    public String getNote() {
        return note;
    }

    public void setNote(String note) {
        this.note = note;
    }
}
