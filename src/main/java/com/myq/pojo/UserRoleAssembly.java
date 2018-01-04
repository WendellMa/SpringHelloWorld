package com.myq.pojo;

import java.util.List;
import java.util.Map;
import java.util.Set;

/**
 * created on 18/1/3
 *
 * @author romens
 * @version 1.0
 */
public class UserRoleAssembly {
    private long id;
    private List<Role> list;
    private Map<Role, User> map;
    private Set<User> set;

    public Set<User> getSet() {
        return set;
    }

    public void setSet(Set<User> set) {
        this.set = set;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public List<Role> getList() {
        return list;
    }

    public void setList(List<Role> list) {
        this.list = list;
    }

    public Map<Role, User> getMap() {
        return map;
    }

    public void setMap(Map<Role, User> map) {
        this.map = map;
    }
}
