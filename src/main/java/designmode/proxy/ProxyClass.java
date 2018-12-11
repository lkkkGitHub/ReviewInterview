package designmode.proxy;

/**
 * @author lk
 * 2018/8/27 9:35
 * @description:
 */
public class ProxyClass implements BuyCar {

    private People people;

    public ProxyClass(People people) {
        this.people = people;
    }

    @Override
    public void buyCar() {
        people.buyCar();
        if (people.getCount() < 100) {
            System.out.println("钱不够");
        } else {
            System.out.println("买到车了");
        }
    }

    public static void main(String[] args) {
        People people = new People("lk", 155);
        ProxyClass proxyClass = new ProxyClass(people);
        proxyClass.buyCar();
    }
}
