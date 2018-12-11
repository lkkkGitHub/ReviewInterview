package designmode.factory.FactoryMethod;

/**
 * @author lk
 * 2018/8/23 15:19
 * @description:
 */
public class Factory350 implements Factory {

    public Factory350() {
        System.out.print("Factory350 ");
    }

    @Override
    public Car createCar() {
        System.out.print("Create");
        return new Bwm350();
    }
}
