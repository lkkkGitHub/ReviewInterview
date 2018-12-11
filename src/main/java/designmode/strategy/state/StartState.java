package designmode.strategy.state;

/**
 * @author lk
 * 2018/8/24 16:29
 * @description:
 */
public class StartState implements State {
    @Override
    public void doAction(Context context) {
        System.out.println("Player is in start state");
        context.setState(this);
    }

    public String toString() {
        return "Start State";
    }
}

class Test {

    public static Test test = new Test();

    {
        System.out.println("noStatic");
    }

    static {
        System.out.println("static");
    }

    public static void main(String[] args) {
        Test test1 = new Test();
    }
}