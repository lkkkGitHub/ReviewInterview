package designmode.decorator;

/**
 * @author lk
 * 2018/8/24 14:59
 * @description:
 */
public class Main {
    public static void main(String[] args) {
        Hamburger hamburger = new ChickenHamburger();
        hamburger = new Lajiao(hamburger);
        hamburger = new Xianliao(hamburger);
        System.out.println(hamburger.getName()+ " " + hamburger.getPrice());
    }
}
