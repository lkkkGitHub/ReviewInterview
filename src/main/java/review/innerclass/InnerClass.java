package review.innerclass;

import review.abstracttest.People;
import review.abstracttest.User;
import review.finaltest.Lk;

/**
 * @author lk
 * 2018/8/13 20:12
 * @description:
 */
public class InnerClass {

    private String name;

    private class TestInnerClass extends Lk {
        private String name;

        public void print() {
            name = "lk";
            InnerClass.this.name = "outClassName";
            System.out.println("TestInnerClass name :" + name
                    + " InnerClass name:" + InnerClass.this.name);
        }
    }

    private class TestInnerClass2 extends People {
        TestInnerClass2(String name, String password) {
            super(name, password);
        }

        @Override
        public void printInfo() {
            System.out.println(getName() + "  " + getPassword());
        }
    }

    private static class TestInnerClass3 {
        public void test() {
            System.out.println("static");
        }
    }

    TestInnerClass3 testInnerClass3 = new TestInnerClass3();

    final String lk = "lk";
    String lk1;

    People p = new People(lk, lk1) {
        @Override
        public void printInfo() {
            System.out.println(p.getName() + p.getPassword());
        }
    };

    User user = new User() {
        @Override
        public void print() {

        }
    };

    public void printInfo() {
        testInnerClass3.test();
        new People(lk, lk1) {
            @Override
            public void printInfo() {

            }

            public void stu() {

            }
        }.stu();
        p.printInfo();
        TestInnerClass testInnerClass = new TestInnerClass();
        TestInnerClass2 testInnerClass2 = new TestInnerClass2("", "");
    }

    public static void main(String[] args) {
        InnerClass innerClass = new InnerClass();
        innerClass.printInfo();
    }
}
