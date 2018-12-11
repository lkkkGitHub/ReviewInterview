package review.duotai;

/**
 * @author lk
 * 2018/8/16 17:15
 * @description:
 */
public class Main {

    public static void main(String[] args) {
        Father father = new Son("xianshangfather", "xianshangson"); // 自动向上转型
//        father.printName(); //父类中自己的方法
//        //向上转型，对象实列不能直接调用子类的方法，需要强制转换
//        father.printName(); //子类中的方法，要强制转化为子类对象  向下转型

        //向上转型，子类覆写了父类的方法，
        // 用父类向上转型的的对象，
        // 将会自动调用子类覆写的方法
        father.print();
        father.printName();
        father.father();
        ((Son) father).son();
        //向下转型能够自由调用子父类的方法
//        Son son = (Son) father; //向下转型
//        son.printName();
//        son.printName();
//
//        Son son1 = new Son("noFather", "noSon");
//        son1.printName();
//        son1.printName();
    }
}
