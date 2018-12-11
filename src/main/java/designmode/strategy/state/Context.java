package designmode.strategy.state;

/**
 * @author lk
 * 2018/8/24 16:28
 * @description:
 */
public class Context {
    private State state;

    public Context() {
        state = null;
    }

    public void setState(State state) {
        this.state = state;
    }

    public State getState() {
        return state;
    }
}
