package designmode.decorator;

/**
 * @author lk
 * 2018/8/24 14:56
 * @description:
 */
public class Lajiao extends Tiaoliao {

    private Hamburger hamburger;

    public Lajiao(Hamburger hamburger) {
        name = "辣椒";
        price = 4.0;
        this.hamburger = hamburger;
    }

    @Override
    public String getName() {
        return hamburger.getName() + " " + name;
    }

    @Override
    public Double getPrice() {
        return hamburger.getPrice() + price;
    }
}
