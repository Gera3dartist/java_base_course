package com.gera.javacore.exercises.Chapter8;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.stream.IntStream;
import java.util.stream.Stream;

/**
 * Created with IntelliJ IDEA.
 * User: Gera
 * Date: 03.06.18
 * Time: 18:34
 Определите разность во времени подсчета
 длинных слов с помощью методов parallelStream() и stream().
 Вызовите метод System.currentTimeMillis ()
 до и после этих методов и выведите разность.
 Если у вас быстродействующий компьютер, выберите для
 подсчета длинных слов более длинный документ (например, роман "Война и мир").
 */
public class Ex2 {
    public static Path path = Paths.get("X:\\IT_stuff\\Java\\Projects\\java_couse\\java_base_course\\file-data\\Vojna i mir. Tom 1.txt");
    public static void main(String[] args) throws IOException{
        //count in parallel
        countWords(false);
        countWords(true);
        countWords(false);
        countWords(true);
        countWords(false);


    }

    public static void countWords(boolean parallel) throws IOException {
        long t1 = System.currentTimeMillis();
        try (Stream<String> lines = Files.lines(path)) {
//            lines.flatMap(w -> Stream.of(w.split("\\s+"))).forEach(System.out::println);
            Stream<String> st = parallel ? lines.parallel() : lines;

            long result = st.flatMap(w -> Stream.of(w.split("\\s+"))).filter(c -> c.length() > 1).count();
//            System.out.println("Result: " + result);
        }
        float t2 = (System.currentTimeMillis() - t1)/1000F;
        System.out.println("is parallel: " + parallel + " time took: " + t2);
    }

}
