package week2.day1;


public class Library {

    public String addBook(String bookTitle) {
        System.out.println("Book added successfully");
        return bookTitle;

    }
    public void issueBook() {
        System.out.println("Book issued successfully");
    }

    public static void main(String[] args) {
        Library admin = new Library();
        String bookname = admin.addBook("HARRYPOTTER1");
        System.out.println(bookname);
        admin.issueBook();
    }


}
