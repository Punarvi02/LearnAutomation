package week2.day1;


public class LibraryManagement {

    public static void main(String[] args) {
        Library lib = new Library();
        String bookname = lib.addBook("HARRYPOTTER2");
        System.out.println(bookname);
        lib.issueBook();
    }
}

