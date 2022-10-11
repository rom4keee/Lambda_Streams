import org.apache.commons.lang3.RandomStringUtils;
import java.util.Comparator;
import java.util.List;
import java.util.Random;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class Book {
    private String name;
    private int price;
    public Book() {    }
    public Book(String name, int price) {
        this.name = name;
        this.price = price;
    }
    public String getName() {
        return name;
    }
    public int getPrice() {
        return price;
    }
    public void createListOfBooks(List<Book> books, int numberOfBooks) {
        IntStream.range(0, numberOfBooks)
                .forEachOrdered(i -> books
                        .add(new Book(RandomStringUtils.randomAlphabetic(3, 10), new Random().nextInt(99))));
    }
    public List<String> namesOfBooks(List<Book> books) {
        return books
                .stream()
                .map(Book::getName)
                .collect(Collectors.toList());
    }
    public int totalPriceOfBooks(List<Book> books) {
        return books
                .stream()
                .map(Book::getPrice)
                .reduce(0, Integer::sum);
    }
    public List<Book> booksWithNameStartingWith(List<Book> books, String character) {
        return books
                .stream()
                .filter(book -> book.name.matches("(?i)" + character + ".*"))
                .collect(Collectors.toList());
    }
    public Book mostExpensiveBook(List<Book> books) {
        return books
                .stream()
                .max(Comparator.comparing(Book::getPrice))
                .orElse(null);
    }
    public long booksWithNameLengthOf(List<Book> books, int nameLength) {
        return books
                .stream()
                .filter(book -> book.name.length() > nameLength)
                .count();
    }
    public List<Book> booksWithPriceUpTo(List<Book> books, int priceUpTo) {
        return books
                .stream()
                .filter(book -> book.price < priceUpTo)
                .collect(Collectors.toList());
    }
    public List<Book> sortBooks (List<Book> books) {
        return books
                .stream()
                .sorted(Comparator.comparing(Book::getName)
                        .thenComparing(Book::getPrice))
                .collect(Collectors.toList());
    }
}