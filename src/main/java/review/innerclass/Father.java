package review.innerclass;

/**
 * @author lk
 * 2018/8/15 11:24
 * @description:
 */
public class Father {
    private String name;

    public Father(String name) {
        this.name = name;
    }

    public void printName() {
        System.out.println("father: " + name);
    }

}
