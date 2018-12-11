package designmode.strategy.state;

/**
 * @author lk
 * 2018/8/24 16:31
 * @description:
 */
public class Main {
    public static void main(String[] args) {

        Context context = new Context();

        StartState startState = new StartState();
        startState.doAction(context);

        System.out.println(context.getState().toString());

        StopState stopState = new StopState();
        stopState.doAction(context);

        System.out.println(context.getState().toString());
    }
}
