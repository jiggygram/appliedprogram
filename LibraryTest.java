public class LibraryTest {
    public static void main(String[] args) {
        Library mylibrary = new Library();
        Book book1 = new Book("The Egypt Empire", "Mohamed Salah", "1928", 8);
        Member member1 = new Member("B1857", "Jiggy");
        Member member2 = new Member("B1212" , "Tshimpanga");


        mylibrary.addBook(book1);
        mylibrary.registerMember(member1);
        mylibrary.lendBook("1928", "B1857");
        member2.borrowBook(new Book("The Egypt Empire", "Mohamed Salah", "1928", 2));

        System.out.println("The book The Egypt Empire has been successfully lent to " + "Jiggy");
        System.out.println("the book The Wall  has been successfully lent to " + "Tshimpanga");
    }
}