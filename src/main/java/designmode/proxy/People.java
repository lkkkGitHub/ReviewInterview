package designmode.proxy;

/**
 * @author lk
 * 2018/8/27 9:35
 * @description:
 */
public class People implements BuyCar {

    private String name;
    private int count;

    public People(String name, int count) {
        this.name = name;
        this.count = count;
    }

    public int getCount() {
        return count;
    }

    @Override
    public void buyCar() {
        System.out.println(name + "想买车");
    }
}
