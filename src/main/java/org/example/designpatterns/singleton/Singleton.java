package org.example.designpatterns.singleton;


import org.example.Library;

class Singleton {
    public static void main(String[] args) {
        Library library = Library.getInstance();

        //  שימוש במופע של library
        library.browABook();
    }
}
