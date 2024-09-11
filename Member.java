import java.util.ArrayList;
import java.util.List;

public class Member {
    public String name;
    private String memberId;
    private List<Book> borrowedBooks;

    public Member(String memberId, String name) {
        this.memberId = memberId;
        this.name = name;
        this.borrowedBooks = new ArrayList<Book>();
    }

    public String getMemberId() {
        return memberId;
    }
    public void borrowBook(Book book) {
        addBookToBorrowedBooks(book);
    }
    private void
    addBookToBorrowedBooks(Book book) {
        borrowedBooks.add(book);
    }

}
