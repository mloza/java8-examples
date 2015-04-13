package pl.mloza;

import org.junit.Test;
import pl.mloza.streams.Category;
import pl.mloza.streams.Expense;

import java.io.BufferedWriter;
import java.io.File;
import java.io.IOException;
import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Stream;

import static java.util.stream.Collectors.groupingBy;
import static pl.mloza.streams.Category.CLOTHES;
import static pl.mloza.streams.Category.ALCOHOL;
import static pl.mloza.streams.Category.UNCATEGORIZED;

public class Streams {
    @Test
    public void testSimpleStream() throws Exception {
        List<Expense> expenses = getExpenses();

        int sum = expenses.stream()
                .filter(expense -> expense.getCategory() == ALCOHOL)
                .mapToInt(Expense::getCost)
                .sum();

        System.out.println("You have spent $" + sum + " on alcohol");
    }

    @Test
    public void testParallelStream() throws Exception {
        List<Expense> expenses = getExpenses();

        int sum = expenses.stream()
                .parallel()
                .map(Expense::getCost)
                .reduce(0, Integer::sum);

        System.out.println("You have spent $" + sum + " total");
    }

    @Test
    public void testGroupStream() throws Exception {
        List<Expense> expenses = getExpenses();

        Map<Category, List<Expense>> collect = expenses.stream()
                .parallel()
                .collect(groupingBy(Expense::getCategory));

        System.out.println(collect);
    }

    private List<Expense> getExpenses() {
        return Arrays.asList(
                new Expense(100, UNCATEGORIZED),
                new Expense(200, CLOTHES),
                new Expense(300, ALCOHOL),
                new Expense(100, CLOTHES),
                new Expense(150, ALCOHOL));
    }

    @Test
    public void testFileStream() throws Exception {
        try (Stream<String> lines = Files.lines(Paths.get(ClassLoader.getSystemResource("fileForStreams.txt").toURI()), StandardCharsets.UTF_8)) {
            lines.onClose(() -> System.out.println("Done!"))
                    .forEach(System.out::println);
        }
    }
}
