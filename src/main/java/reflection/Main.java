package reflection;

import java.lang.reflect.Constructor;

/**
 * @author lk
 * 2018/9/25 9:50
 * @description:
 */
public class Main {
    public static void main(String[] args) throws Exception {
        Class classGetClass = GetClass.class;

        GetClass getClass = (GetClass) classGetClass.newInstance();
        getClass.setName("lk");
        getClass.setSex("1");
        System.out.println(getClass);

        Constructor constructor = classGetClass.getConstructor(String.class, String.class);
        GetClass getClass1 = (GetClass) constructor.newInstance("asd", "a");
        System.out.println(getClass1);

    }
}
