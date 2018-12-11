package designmode.factory.FactoryMethod;

/**
 * @author lk
 * 2018/8/23 15:22
 * @description:
 */
public class Custom {
    public static void main(String[] args) {
        Factory factory350 = new Factory350();
        factory350.createCar();

        Factory factory520 = new Factory520();
        factory520.createCar();
    }
}
