package vo;

import java.io.Serializable;

/**
 * Created by H77 on 2017/5/28.
 *
 */
public class User implements Serializable{
    private static final long serialVersionUID = 7247714666080613254L;
    private String name;
    private String password;
    private String type;

    public User(String name, String password, String type) {
        this.name = name;
        this.password = password;
        this.type = type;
    }
    private User(){

    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }


    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }
}
