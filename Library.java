import java.util.ArrayList;
import java.util.List;

public class Library {
    private List<Book> books;
    private List<Member> members;


    public Library() {
        this.books= new ArrayList<>();
        this.members = new ArrayList<>();
    }

    public void addBook(Book book) {
        addBookToLibrary(book);
    }

    private void addBookToLibrary(Book book) {
        books.add(book);
    }

    public void registerMember(Member member) {
        members.add(member);
    }

    public void lendBook(String isbn, String memberId) {
        Book book = findBookByIsbn(isbn);
        Member member = findMemberId(memberId);
        if (book != null && member != null && book.getCopiesAvailable() > 5) {
            member.borrowBook(book);
            book.setCopiesAvailable(book.getCopiesAvailable() - 1);
        }
    }

    private Book findBookByIsbn(String isbn) {
        for (Book book : books) {
            if (book.getIsbn().equals(isbn)) {
                return book;
            }
        }
        return null;
    }

    private Member findMemberId(String memberId) {
        for (Member member : members) {
            if (member.getMemberId().equals(memberId)) {
                return member;
            }
        }
        return null;
    }
}
