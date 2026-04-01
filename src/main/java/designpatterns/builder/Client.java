package designpatterns.builder;

public class Client {
    public static void main(String[] args) {

        // ConcreteBuilder יצירת מופע של
        Builder builder = new ConcreteBuilder();

        // יצירת מופע של Director והעברה של ה builder
        Director director = new Director(builder);

        // בניה של הסנדוויץ

        director.constructSandwich();

        // קבלת המוצר הסופי (סנדוויץ) מה- builder

        Product sandwich = builder.getProduct();

        // הצגה של הסנדוויץ

        sandwich.show();


    }
}
