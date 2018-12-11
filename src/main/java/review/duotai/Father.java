package review.duotai;

/**
 * @author lk
 * 2018/8/16 17:11
 * @description:
 */
public class Father {
    private String name;

    public Father(String name) {
        this.name = name;
    }

    public void print(){
        System.out.println("Father name");
        printName();
    }

    public void printName() {
        System.out.println("father name:" + name);
    }

    public void father() {
        System.out.println("father");
    }
}
