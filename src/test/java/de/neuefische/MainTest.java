package de.neuefische;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class MainTest {
    @Test
    public void add_when2And5_Then7() {
        // given
        int a = 2;
        int b = 5;

        // when
        int actual = Main.add(a, b);

        // then
        assertEquals(9, actual);
    }
}