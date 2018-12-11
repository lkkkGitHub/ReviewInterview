package designmode.factory.FactoryMethod;

/**
 * @author lk
 * 2018/8/23 15:21
 * @description:
 */
public class Factory520 implements Factory {

    public Factory520() {
        System.out.print("Factory520 ");
    }

    @Override
    public Car createCar() {
        System.out.print("Create");
        return new Bwm520();
    }
}
