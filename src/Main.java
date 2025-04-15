public class Main {

    public static void main(String[] args) {

//        Aggregation = represents a "has-a" relationship between objects.
//                      One object contains another object as part of its structure,
//                      but the contained object/s can exist independently.

        Book book1 = new Book("Atomic Habits", 320);
        Book book2 = new Book("Surrounded by Idiots", 280);
        Book book3 = new Book("The Law of Human Nature", 420);

        Book[] books = {book1, book2, book3};

        Library library = new Library("PK", 2023, books);

        library.displayInfo();
    }
}
