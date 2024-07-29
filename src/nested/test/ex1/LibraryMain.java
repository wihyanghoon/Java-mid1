package nested.test.ex1;

public class LibraryMain {
    public static void main(String[] args) {
        Library library = new Library(4);
        library.addBook("책1", "저자1");
        library.addBook("책2", "저자3");
        library.addBook("책3", "저자3");
        library.addBook("ORM 표준 JPA", "김영한");
        library.addBook("one more things", "스티브 잡스");
        library.showBook();
    }
}
