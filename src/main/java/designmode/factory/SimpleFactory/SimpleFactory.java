package designmode.factory.SimpleFactory;

/**
 * @author lk
 * 2018/8/23 14:34
 * @description:
 */
public class SimpleFactory {

    private Car car;

    public Car getCar(String name) {
        switch (name) {
            case "Bwm350":
                car = new Bwm350();
                break;
            case "Bwm520":
                car = new Bwm520();
                break;
            default:
                car = null;
                break;
        }
        return car;
    }

    public static void main(String[] args) {
        SimpleFactory simpleFactory = new SimpleFactory();
        Car bwm350 = simpleFactory.getCar("Bwm350");
        Car bwm520 = simpleFactory.getCar("Bwm520");
        bwm350.print();
        bwm520.print();
    }
}
