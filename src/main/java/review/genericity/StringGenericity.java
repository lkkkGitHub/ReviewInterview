package review.genericity;

/**
 * @author lk
 * 2018/10/22 8:41
 * @description:
 */
public class StringGenericity <T> {

    private T t;

    public T getT() {
        return t;
    }

    public void setT(T t) {
        this.t = t;
    }

    public void print() {
        System.out.println(t);
    }

    public static void main(String[] args) {
        StringGenericity<String> stringStringGenericity = new StringGenericity<>();
        stringStringGenericity.setT("sss");
        stringStringGenericity.print();
        System.out.println(stringStringGenericity.getT());
    }
}
