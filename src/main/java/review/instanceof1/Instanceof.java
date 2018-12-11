package review.instanceof1;

/**
 * @author lk
 * 2018/8/4 10:27
 * @description:
 */
public class Instanceof {
    public class People {

    }

    public class Student {

    }

    public class Teacher extends People {

    }

    People people = new People();
    Student student = new Student();
    Teacher teacher = new Teacher();

    public void instanceOf () {
        System.out.println(people instanceof People);
        System.out.println(teacher instanceof People);
    }
}
