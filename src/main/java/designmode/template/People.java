package designmode.template;

/**
 * @author lk
 * 2018/8/27 9:44
 * @description:
 */
public abstract class People {
    public void GotoSchool() {
        wear();
        takeSomething();
        eatBreakfast();
    }
    public abstract void wear();
    public abstract void eatBreakfast();
    public abstract void takeSomething();
}
