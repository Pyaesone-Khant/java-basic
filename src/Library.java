public class Library {

    String name;
    int year;
    Book[] books;

    Library(String name, int year, Book[] books) {
        this.name = name;
        this.year = year;
        this.books = books;
    }

    void displayInfo() {
        System.out.printf("The library %s was founded in %d!\n", this.name, this.year);
        System.out.printf("Available Books in %s : \n", this.name);
        for (Book book : books) {
            System.out.println(book.displayInfo());
        }
    }

}
