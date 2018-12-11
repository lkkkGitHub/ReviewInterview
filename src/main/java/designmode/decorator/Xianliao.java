package designmode.decorator;

/**
 * @author lk
 * 2018/8/24 15:01
 * @description:
 */
public class Xianliao extends Tiaoliao {
    private Hamburger hamburger;

    public Xianliao(Hamburger hamburger) {
        name = "香料";
        price = 1.5;
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
