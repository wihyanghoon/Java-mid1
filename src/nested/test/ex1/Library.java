package nested.test.ex1;

public class Library {
    // 코드 작성
    private Book[] books;
    private int bookCount;

    public Library(int size) {
        books = new Book[size];
        this.bookCount = 0;
    }

    public void addBook(String title, String author) {
        // 검증로직을 다 처리하고 정상 로직을 처리
        if (bookCount >= books.length) {
            System.out.println("저장 공간이 부족합니다.");
            return;
        }
        books[this.bookCount] = new Book(title, author);
        this.bookCount++;
    }

    public void showBook() {
        System.out.println("== 책 목록 출력 ==");
        for (int i = 0; i < this.bookCount; i++) {
            Book book = books[i];
            System.out.println("제목: " + book.title + ", 저자: " + book.author);
        }
    }

    private static class Book {
        private String title;
        private String author;

        public Book(String title, String author) {
            this.title = title;
            this.author = author;
        }
    }
}
