package org.example;

class Library {

    private static Library uniqueInstance;

    private Library() {
    }

    public static synchronized Library getInstance() {
        if (uniqueInstance == null) {
            uniqueInstance = new Library();

        }
        System.out.println("Granting access to the central library");
        return uniqueInstance;

    }

    public void browABook() {
        System.out.println("Borrowing a book from the library");
    }
}


class Singleton {
    public static void main(String[] args) {
        Library library = Library.getInstance();

        //  שימוש במופע של library
        library.browABook();
    }
}
