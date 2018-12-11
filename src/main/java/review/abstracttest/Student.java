package review.abstracttest;

/**
 * @author lk
 * 2018/8/10 19:48
 * @description:
 */
public abstract class Student extends People implements User {

    public Student(String name, String password) {
        super(name, password);
    }

    @Override
    public abstract void printInfo();

}
