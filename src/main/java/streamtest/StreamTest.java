package streamtest;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Stream;

/**
 * @author lk
 * 2018/8/10 16:26
 * @description:
 */
public class StreamTest {
    private String[] strs = {"lk", "wo", "bu", "shi", "ai", "wo"};
    private Stream<String> stringStream = Stream.of(strs);
    private Integer[] integers = {9, 78, 5, 2, 4, 6};
    private Stream<Integer> integerStream = Stream.of(integers);
    /**
     * 打印strs
     */
    public void forEach() {
        stringStream.forEach(str -> System.out.println(str));
    }

    /**
     * 输出满足条件的string，  .filter 方法返回一个Stream对象，中间操作
     * 没有实际计算，如果不进行计算即没有任何输出
     */
    public void filter() {
        stringStream.filter(str -> str.length() >= 3)
                .forEach(str -> System.out.println(str));
    }

    /**
     * 去重，中间操作
     */
    public void distinct() {
        stringStream.distinct()
                .forEach(str -> System.out.println(str));
    }

    /**
     * 排序
     */
    public void sorted() {
        integerStream.sorted(Comparator.comparingInt(Integer::intValue))
                .forEach(i -> System.out.println(i));
    }

    /**
     * 将多个集合转换为一个 ”数组“ 一次全部打印输出
     */
    public void flatMap() {
        Stream<List<Integer>> stream = Stream.of(Arrays.asList(1, 2), Arrays.asList(3, 4, 5));
        stream.flatMap(list -> list.stream())
                .forEach(i -> System.out.println(i));
    }
}
