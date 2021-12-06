package org.example.lsp;

public class Sparrow extends Bird {

    public Sparrow(String name, String tweet) {
        super(name, tweet);
    }

    @Override
    String tweet() {
        return super.name;
    }
}
