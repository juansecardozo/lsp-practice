package org.example.lsp;

import static org.junit.jupiter.api.Assertions.assertNotEquals;

import org.junit.jupiter.api.Test;

class SparrowShould {
    @Test
    void not_respect_liskov_breaking_bird_laws() {
        final String sparrowName = "Spy";
        final String sparrowTweet = "I'm a sparrow!";
        Sparrow sparrow = new Sparrow(sparrowName, sparrowTweet);

        assertNotEquals(sparrowTweet, sparrow.tweet());
    }
}