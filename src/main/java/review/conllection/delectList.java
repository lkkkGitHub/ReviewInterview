package review.conllection;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;

/**
 * @author lk
 * 2018/10/23 9:34
 * @description:
 */
public class delectList {
    public void delete() {
        List<Student> list = new ArrayList<>();
        list.add(new Student(1));
        list.add(new Student(3));
        list.add(new Student(2));
        System.out.println(list.toString());
        Iterator<Student> iterator = list.iterator();
        while (iterator.hasNext()) {
            Student student = iterator.next();
            if (student.getId() == 1) {
                iterator.remove();
            }
        }
        System.out.println(list.toString());
    }

    public void deleteInt() {
        List<Integer> list = new ArrayList<>();
        list.add(1);
        list.add(3);
        list.add(2);
        System.out.println(list.toString());

//        for (Iterator<Integer> it = list.iterator(); it.hasNext(); ) {
//            Integer aValue = it.next();
//            if (aValue == 1) {
//                it.remove();
//            }
//        }
        Iterator<Integer> iterator = list.iterator();

        while (iterator.hasNext()) {
            if (iterator.next() == 1) {
                iterator.remove();
            }
        }
        System.out.println(list.toString());
    }

    public static void main(String[] args) {
        delectList d = new delectList();
//        d.delete();
//        d.deleteInt();

        Integer[] a = {1, 5, 9};
        List<Integer> list = Arrays.asList(1, 2, 6);
        System.out.println(list.toString());
        Iterator<Integer> iterator = list.iterator();
        while (iterator.hasNext()) {
            int i = iterator.next();
            if (i == 1) {
                iterator.remove();
            }
        }
        System.out.println(list.toString());
    }

}

class Student {
    private int id;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public Student(int id) {
        this.id = id;
    }
}