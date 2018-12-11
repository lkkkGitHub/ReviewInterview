package designmode.template;

/**
 * @author lk
 * 2018/8/27 9:51
 * @description:
 */
public class Teacher extends People {
    @Override
    public void wear() {
        System.out.println("穿上衣服，带好工作证");
    }

    @Override
    public void eatBreakfast() {
        System.out.println("自己准备早餐");
    }

    @Override
    public void takeSomething() {
        System.out.println("带上自己的电脑");
    }
}
