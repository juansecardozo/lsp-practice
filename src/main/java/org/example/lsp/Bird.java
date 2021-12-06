package org.example.lsp;

public class Bird {

    protected final String tweet;
    protected final String name;

    public Bird(final String name, final String tweet) {
        this.name = name;
        this.tweet = tweet;
    }

    String tweet() {
        return tweet;
    }
}
