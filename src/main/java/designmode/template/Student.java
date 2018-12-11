package designmode.template;

/**
 * @author lk
 * 2018/8/27 9:50
 * @description:
 */
public class Student extends People {
    @Override
    public void wear() {
        System.out.println("穿上自己的衣服");
    }

    @Override
    public void eatBreakfast() {
        System.out.println("去外边买准备好的早餐");
    }

    @Override
    public void takeSomething() {
        System.out.println("带上自己手机，充电器");
    }
}
