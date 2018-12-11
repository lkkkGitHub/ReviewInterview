package java8New.newInterface;

import java8New.methodUse.Method;

/**
 * @author lk
 * 2018/9/5 20:34
 * @description:
 */
public class Main {
    public static void main(String[] args) {
        Student student = new Student();
        student.initB();
        student.printAB();
//        String method = Method::Test;
        People.printA();
    }
}
