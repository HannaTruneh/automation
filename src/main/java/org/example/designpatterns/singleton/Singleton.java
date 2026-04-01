package org.example.designpatterns.singleton;


class Singleton {
    public static void main(String[] args) {
        Library library = Library.getInstance();

        //  שימוש במופע של library
        library.browABook();
    }
}
