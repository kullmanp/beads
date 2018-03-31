package net.beadsproject.beads.data;

import org.junit.jupiter.api.Test;

import java.io.IOException;

import static org.junit.jupiter.api.Assertions.assertThrows;

class SampleTest {

    @Test
    void testCtor() throws Exception {
        assertThrows(IOException.class, () ->
                new Sample("does not exist"));
        Sample sample = new Sample(getClass().getResource("/wirbel.mp3").getFile());
        System.out.println(sample.getLength());
    }
}