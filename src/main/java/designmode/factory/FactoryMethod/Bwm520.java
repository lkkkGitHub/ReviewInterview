package designmode.factory.FactoryMethod;

/**
 * @author lk
 * 2018/8/23 14:42
 * @description:
 */
public class Bwm520 extends Car {

    public Bwm520() {
        super("Bwm520");
        print();
    }

    @Override
    public void print() {
        System.out.println(super.getName());
    }
}
