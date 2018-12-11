package review.innerclass;

/**
 * @author lk
 * 2018/8/15 11:22
 * @description:
 */
public class OutClass {
    private String name;

    public OutClass(String name) {
        this.name = name;
    }

    /**
     * 非静态内部类
     */
    class InnerClass extends Father implements Runnable{

        @Override
        public void run() {

        }

        private String name;

        public InnerClass(String name, String name1) {
            //父类的构造函数必须实现
            super(name);
            this.name = name1;
        }
        //可以直接实现父类的方法
        @Override
        public void printName() {
            System.out.println("innerClass " + name + " outClass " + OutClass.this.name);
            super.printName();
            OutClass.this.printName(7, 9);
        }
    }

    static class InnerClassStatic {
        public void sout() {
            System.out.println("InnerClassStatic");
        }
    }

    public InnerClass getInnerClass(String name, String name1) {
        return new InnerClass(name, name1);
    }

    public void printName(int num, final int obj) {
        System.out.println("outClass " + name);
        new Father("father") {
            public void print() {
                System.out.println(num + " " + obj);
            }
        }.print();
    }

    public static void main(String[] args) {
        OutClass outClass = new OutClass("lk");
        //推荐使用get的方法来获取内部类对象，尤其再内部类构造函数没有参数的时候
//        OutClass.InnerClass innerClass = outClass.new InnerClass("jj", "AAA");
        InnerClass innerClass = outClass.getInnerClass("jj", "AA");
//        InnerClass innerClass1 = new InnerClass(" ", " ");
        InnerClassStatic innerClassStatic = new InnerClassStatic();
        innerClassStatic.sout();
        outClass.printName(6, 8);
        innerClass.printName();
    }
}
