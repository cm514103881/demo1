package cn.itcast.domain;

/**
 * @program: exam_project
 * @description: 用户bean类
 * @author: Ruoquan
 * @create: 2019-07-24 16:42
 **/
public class User {

    private int id;

    private String username;

    private String password;

    public int getId() {
        return id;
    }

    public void setId(int id) {
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
}
