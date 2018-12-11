package review.duotai;

/**
 * @author lk
 * 2018/8/16 17:12
 * @description:
 */
public class Son extends Father {
    private String name;

    public Son(String name, String name1) {
        super(name);
        this.name = name1;
    }

    public void print() {
        System.out.println("Son print");
        printName();
    }

    public void printName() {
        System.out.println("Son name:" + name);
    }

    public void son() {
        System.out.println("Son");
    }
}
