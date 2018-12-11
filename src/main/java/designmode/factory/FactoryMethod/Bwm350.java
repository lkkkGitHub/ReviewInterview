package designmode.factory.FactoryMethod;

/**
 * @author lk
 * 2018/8/23 14:40
 * @description:
 */
public class Bwm350 extends Car {

    public Bwm350() {
        super("Bwm350");
        print();
    }

    @Override
    public void print() {
        System.out.println(super.getName());
    }
}
