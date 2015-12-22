//
// Source code recreated from a .class file by IntelliJ IDEA
// (powered by Fernflower decompiler)
//

package vdehorta.beantarget;

import java.io.Serializable;
import java.util.List;

public class User implements Serializable {

    private String m6Id;
    private String login;
    private String password;
    private String firstName;
    private String lastName;
    private List<String> groups;

    public String getM6Id() {
        return m6Id;
    }

    public void setM6Id(String m6Id) {
        this.m6Id = m6Id;
    }

    public String getLogin() {
        return login;
    }

    public void setLogin(String login) {
        this.login = login;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public List<String> getGroups() {
        return groups;
    }

    public void setGroups(List<String> groups) {
        this.groups = groups;
    }
}
