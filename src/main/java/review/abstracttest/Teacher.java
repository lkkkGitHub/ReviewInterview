package review.abstracttest;

/**
 * @author lk
 * 2018/8/10 19:45
 * @description:
 */
public class Teacher extends People {

    public Teacher(String name, String password) {
        super(name, password);
    }

    @Override
    public void printInfo() {
        System.out.println(getName() + " " + getPassword());
    }

    static {
        System.out.println("teacher init");
    }

    public static void teacher() {
        System.out.println("tea");
    }
}
