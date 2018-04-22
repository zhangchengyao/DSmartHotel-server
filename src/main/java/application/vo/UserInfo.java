package application.vo;

/**
 * Created by zcy on 2017/6/4.
 *
 */
public class UserInfo {
    protected Integer id;

    protected String name;

    protected String password;


    public UserInfo(Integer userid, String username, String password) {
        this.id = userid;
        this.name = username;
        this.password = password;
    }

    public UserInfo() {
        super();
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name == null ? null : name.trim();
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password == null ? null : password.trim();
    }

}
