package fun.happyhacker.java.stream;

import lombok.SneakyThrows;
import lombok.val;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

import static java.util.concurrent.TimeUnit.SECONDS;

public class ParallelTask {

    @SneakyThrows
    public List<Integer> gen()  {
        int i = 3;
        List<Integer> list = new ArrayList<>();
        while (i-- > 0) {
            SECONDS.sleep(1);
           list.add(i);
        }

        return list;
    }

    public static void main(String[] args) {
        List<ParallelTask> a = new ArrayList<>();
        int i = 3;
        while (i-- > 0) {
            a.add(new ParallelTask());
        }

        long start = System.currentTimeMillis();
        System.out.println("start");
        a.parallelStream().mapToLong(e -> e.gen().size()).sum();
        System.out.println("end: " + (System.currentTimeMillis() - start));

        start = System.currentTimeMillis();
        System.out.println("start for each");
        for (ParallelTask task : a) {
            task.gen();
        }
        System.out.println("end for each: " + (System.currentTimeMillis() - start));
    }
}
