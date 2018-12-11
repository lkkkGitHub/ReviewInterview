package reflection;

/**
 * @author lk
 * 2018/9/25 9:48
 * @description:
 */
public class GetClass {

    private String name;
    private String sex;

    static {
        System.out.println("类被加载");
    }

    public GetClass() {
    }

    public GetClass(String name) {
        this.name = name;
    }

    public GetClass(String name, String sex) {
        this.name = name;
        this.sex = sex;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSex() {
        return sex;
    }

    public void setSex(String sex) {
        this.sex = sex;
    }

    @Override
    public String toString() {
        return "GetClass{" +
                "name='" + name + '\'' +
                ", sex='" + sex + '\'' +
                '}';
    }
}
