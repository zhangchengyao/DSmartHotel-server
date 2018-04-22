package application.vo;

/**
 * Created by zcy on 2017/6/4.
 *
 */
public class TenantInfo extends UserInfo {

    private String gender;

    private String phonenum;

    private String preference;

    private String education;

    private String vocation;

    private String economic;

    public TenantInfo(Integer id, String name, String password, String gender, String phonenum, String preference, String education, String vocation, String economic) {
        this.id = id;
        this.name = name;
        this.password = password;
        this.gender = gender;
        this.phonenum = phonenum;
        this.preference = preference;
        this.education = education;
        this.vocation = vocation;
        this.economic = economic;
    }

    public TenantInfo(String name, String password){
        this.name = name;
        this.password = password;
    }

    public TenantInfo() {
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

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender == null ? null : gender.trim();
    }

    public String getPhonenum() {
        return phonenum;
    }

    public void setPhonenum(String phonenum) {
        this.phonenum = phonenum == null ? null : phonenum.trim();
    }

    public String getPreference() {
        return preference;
    }

    public void setPreference(String preference) {
        this.preference = preference == null ? null : preference.trim();
    }

    public String getEducation() {
        return education;
    }

    public void setEducation(String education) {
        this.education = education == null ? null : education.trim();
    }

    public String getVocation() {
        return vocation;
    }

    public void setVocation(String vocation) {
        this.vocation = vocation == null ? null : vocation.trim();
    }

    public String getEconomic() {
        return economic;
    }

    public void setEconomic(String economic) {
        this.economic = economic == null ? null : economic.trim();
    }
}
