package org.example.lsp;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

class EagleShould {
    @Test
    void respects_liskov_by_follow_bird_laws() {
        final String eagleName = "Eaggy";
        final String eagleTweet = "I'm a sparrow!";
        final Eagle eagle = new Eagle(eagleName, eagleTweet);

        assertEquals(eagleTweet, eagle.tweet());
    }
}