package Homeworks.Homework_3.Task_3;

import java.util.ArrayList;
import java.util.List;

import static java.lang.Math.sqrt;

public class Task_3 {
    /**
     * 3. Сведения о книге состоят из названия, фамилии автора, цены, года издания и количества страниц.
     * Найти названия книг, в которых простое количество страниц,
     * фамилия автора содержит «А» и год издания после 2010 г, включительно.
     */
    public static void main(String[] args) {
        List<Book> bookList = create();
        for (int i = 0; i < bookList.size(); i++) {
            if (checkYear(bookList.get(i).getYear()) && checkAuthor(bookList.get(i).getAuthor()) && isSimple(bookList.get(i).getPage())) {
                System.out.println("Book = " + bookList.get(i).getName());
            }
        }
    }
    public static List<Book> create() {
        Book book1 = new Book("Война и мир", "Толстой", 3000.00, 1999, 855);
        Book book2 = new Book("Ревизор", "Гоголь", 8513.00, 2004, 152);
        Book book3 = new Book("Властелин колец", "Толкин", 4231.00, 2013, 814);
        Book book4 = new Book("Богатый папа, бедный папа", "Киосаки", 860.00, 2023, 199);
        Book book5 = new Book("Джава для чайников", "Дуглас", 4210.00, 2004, 549);
        Book book6 = new Book("Энциклопедия", "Барышкин", 1070.00, 2018, 173);

        List<Book> bookList = new ArrayList<>();
        bookList.add(book1);
        bookList.add(book2);
        bookList.add(book3);
        bookList.add(book4);
        bookList.add(book5);
        bookList.add(book6);

        return bookList;
    }

    public static boolean isSimple(int page) {
        if (page % 2 == 0) return false;
        for (int j = 2; j < sqrt(page); j++) {
            if (page % j == 0) {
                return false;
            }
        }
        return true;
    }

    public static boolean checkYear(int year) {
        if (year < 2010) {
            return false;
        }
        return true;
    }

    public static boolean checkAuthor(String author) {
        if (author.contains("а")) {
            return true;
        }
        return false;
    }
}


//public class Task_3 {
//    /**
//     * 3. Сведения о книге состоят из названия, фамилии автора, цены, года издания и количества страниц.
//     * Найти названия книг, в которых простое количество страниц,
//     * фамилия автора содержит «А» и год издания после 2010 г, включительно.
//     */
//    public static void main(String[] args) {
//        List<Book> bookList = create();
//
//        for (int i = 0; i < bookList.size(); i++) {
//            if (bookList.get(i).getYear() > 2010 && bookList.get(i).getAuthor().contains("а") && isSimple(bookList.get(i).getPage())) {
//                System.out.println("Book = " + bookList.get(i).getName());
//            }
//        }
//    }
//
//    public static List<Book> create() {
//        Book book1 = new Book("Война и мир", "Толстой", 3000.00, 1999, 11);
//        Book book2 = new Book("Ревизор", "Гоголь", 8513.00, 2004, 3);
//        Book book3 = new Book("Властелин колец", "Толкин", 4231.00, 2013, 814);
//        Book book4 = new Book("Богатый папа, бедный папа", "Киосаки", 860.00, 2023, 199);
//        Book book5 = new Book("Джава для чайников", "Дуглас", 4210.00, 2004, 549);
//        Book book6 = new Book("Энциклопедия", "Барышкин", 1070.00, 2018, 173);
//
//        List<Book> bookList = new ArrayList<>();
//        bookList.add(book1);
//        bookList.add(book2);
//        bookList.add(book3);
//        bookList.add(book4);
//        bookList.add(book5);
//        bookList.add(book6);
//
//        return bookList;
//    }
//    public static boolean isSimple(int n) {
//        if (n % 2 == 0) return false;
//        for (int j = 2; j < sqrt(n); j++) {
//            if (n % j == 0) {
//                return false;
//            }
//        }
//        return true;
//    }
//}