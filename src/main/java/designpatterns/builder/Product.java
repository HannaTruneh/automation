package designpatterns.builder;

import java.util.ArrayList;
import java.util.List;

public class Product {
    private List<String> parts;

    public Product() {
        this.parts = new ArrayList<>();
    }

    public void addPart(String part) {
        parts.add(part);
    }

    public void show() {
        System.out.println("Custom Sandwich Ingredients:");
        for (String part : parts) {
            System.out.println("- " + part);
        }
    }
}