package review.abstracttest;

/**
 * @author lk
 * 2018/8/10 19:41
 * @description:
 */
public abstract class People {
    private String name;
    private String password;


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

    public People(String name, String password) {
        this.name = name;
        this.password = password;
    }

    public abstract void printInfo();

    static {
        System.out.println("People init");
    }

    public static void lk() {
        System.out.println("lk");
    }
}
