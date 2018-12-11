package designmode.strategy.state;

/**
 * @author lk
 * 2018/8/24 16:30
 * @description:
 */
public class StopState implements State {
    public void doAction(Context context) {
        System.out.println("Player is in stop state");
        context.setState(this);
    }

    public String toString() {
        return "Stop State";
    }
}
