package ruanko.newspublish.entity;

public class User {

    private int id;

    private String username;
    private String password;
    private String sex;
    private String arrive;
    private String beizhu;

    public int getId() { return id; }
    public void setId(int id) {
        this.id = id;
    }


    public String getUsername() { return username; }
    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() { return password; }
    public void setPassword(String password) {
        this.password = password;
    }

    public String getSex() { return sex; }
    public void setSex(String sex) {
        this.sex = sex;
    }

    public String getArrive() { return arrive; }
    public void setArrive(String arrive) {
        this.arrive = arrive;
    }

    public String getBeizhu() { return beizhu; }
    public void setBeizhu(String beizhu) {
        this.beizhu = beizhu;
    }
}
