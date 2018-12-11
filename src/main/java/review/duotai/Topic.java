package review.duotai;

/**
 * @author lk
 * 2018/10/20 9:27
 * @description:
 */
public class Topic {
    static class A {
        protected int value;
        public A(int v) {
            setValue(v);
        }
        public void setValue(int value) {
            this.value = value;
        }
        public int getValue() {
            try {
                value++;
                return value;
            } finally {
                this.setValue(value);
                System.out.println(value);
            }
        }
    }
    static class B extends A {
        public B() {
            super(5);
            setValue(getValue() - 3);
        }
        public void setValue(int value) {
            super.setValue(2 * value);
        }
    }
    public static void main(String[] args) {
        System.out.println(new B().getValue());
    }
}
