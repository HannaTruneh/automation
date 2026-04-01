package designpatterns.singleton;


class Client {
    public static void main(String[] args) {
        Library library = Library.getInstance();

        //  שימוש במופע של library
        library.browABook();
    }
}
