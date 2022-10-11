import java.util.*;
public class Main {
    public static void main(String[] args) {
        //Words
        String text = "V's background and identity are never revealed. He is at one point an inmate at \"Larkhill Resettlement Camp\"—one " +
                "of many concentration camps where black people, Jews, leftists, beatniks, homosexuals " +
                "and Ethnic Irish are exterminated " +
                "by Norsefire, a fascist dictatorship that rules Britain. While there, he is part of a group" +
                " of prisoners who are subjected " +
                "to horrific medical experimentation, conducted by Dr. Delia Surridge. " +
                "Lewis Prothero is the camp's commandant, while Father " +
                "Anthony Lilliman, a paedophile vicar, is at the camp to lend \"spiritual support\". " +
                "All prisoners who are part of the experiment die, with" +
                " the sole exception of \"the man in room five\" (\"V\" in Roman numerals). " +
                "As a result of the experiments, the man develops Olympic-level" +
                " physical abilities and an incredibly expanded intellect. During that time, the man had some level " +
                "of communication with Valerie Page, a former " +
                "actress imprisoned for being a lesbian, kept in \"room four\", who wrote her " +
                "autobiography on toilet paper and then pushed " +
                "it through a hole in the wall.";
        Words wordCollector = new Words();

        System.out.println("Task 1: " + wordCollector.collectWordsStartingWith(text, "O"));

        //Book
        Book book = new Book();
        List<Book> books = new ArrayList<>();
        book.createListOfBooks(books,10);
        System.out.println("Task 2:");

        System.out.println("All books: " + books);
        System.out.println("");

        System.out.println("Books names: " + book.namesOfBooks(books));
        System.out.println("");

        System.out.println("Total price of books: " + book.totalPriceOfBooks(books));
        System.out.println("");

        System.out.println("Books starts with character 'a' : " + book.booksWithNameStartingWith(books,"a"));
        System.out.println("");
        
        System.out.println("Books starts with character 'A' : " + book.booksWithNameStartingWith(books,"A"));
        System.out.println("");

        System.out.println("Books with the highest price: " + book.mostExpensiveBook(books));
        System.out.println("");

        System.out.println("Books where name consist of 5 letters: " + book.booksWithNameLengthOf(books,5));
        System.out.println("");

        System.out.println("Books with the price higher then 30: " + book.booksWithPriceUpTo(books,30));
        System.out.println("");

        System.out.println("Sorting books: " + book.sortBooks(books));
        System.out.println("");


        //Persons
        List<Person> personList = new ArrayList<>();

       personList.add(new Person("Peter", "Patterson", 21));
       personList.add(new Person("Paul", "Walker", 31));
       personList.add(new Person("Steve", "Runner", 17));
       personList.add(new Person("Arnold", "", -1));
       personList.add(new Person(" ", "Stevenson", 19));
       personList.add(new Person(" ", "Stevenson", 19));
       personList.add(new Person(" ", "Stevenson", 19));
       personList.add(new Person("Arnold", "Stevenson", 19));
       personList.add(null);
       personList.add(new Person("Aaron", "Bortnicker", 18));

      System.out.println("Task 3: " + Person.uniqueNames(personList));

    }
}
