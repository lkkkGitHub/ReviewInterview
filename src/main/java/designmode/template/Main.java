package designmode.template;

/**
 * @author lk
 * 2018/8/27 9:52
 * @description:
 */
public class Main {
    public static void main(String[] args) {
        People student = new Student();
        student.GotoSchool();

        People teacher = new Teacher();
        teacher.GotoSchool();
    }
}
