package designmode.factory.FactoryMethod;

/**
 * @author lk
 * 2018/8/23 14:36
 * @description:
 */
public abstract class Car {
    private String name;

    public Car(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public abstract void print();
}
