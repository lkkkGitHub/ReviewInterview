package designmode.decorator;

/**
 * @author lk
 * 2018/8/24 14:54
 * @description:
 */
public class ChickenHamburger extends Hamburger {

    public ChickenHamburger() {
        name = "鸡腿堡";
        price = 10.0;
    }

    @Override
    public String getName() {
        return name;
    }

    @Override
    public Double getPrice() {
        return price;
    }
}
