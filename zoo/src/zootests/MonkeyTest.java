// Source code is decompiled from a .class file using FernFlower decompiler (from Intellij IDEA).
package zootests;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import zoo.Animal;
import zoo.Monkey;

class MonkeyTest {
    MonkeyTest() {
    }

    @Test
    void makeSound_should_printSound() {
        Animal monkey = new Monkey("Monk");
        ByteArrayOutputStream outContent = new ByteArrayOutputStream();
        PrintStream originalOut = System.out;
        System.setOut(new PrintStream(outContent));

        try {
            monkey.makeSound();
            String output = outContent.toString().trim();
            Assertions.assertEquals("Ook eek", output);
        } finally {
            System.setOut(originalOut);
        }

    }

    @Test
    void makeSoundWith3_should_printSound3Times() {
        Animal monkey = new Monkey("Monk");
        ByteArrayOutputStream outContent = new ByteArrayOutputStream();
        PrintStream originalOut = System.out;
        System.setOut(new PrintStream(outContent));

        try {
            monkey.makeSound(3);
            String output = outContent.toString().trim();
            Assertions.assertEquals("Ook eek Ook eek Ook eek", output);
        } finally {
            System.setOut(originalOut);
        }

    }

    @Test
    void makeSoundWith0_should_printSound0Times() {
        Animal monkey = new Monkey("Monk");
        ByteArrayOutputStream outContent = new ByteArrayOutputStream();
        PrintStream originalOut = System.out;
        System.setOut(new PrintStream(outContent));

        try {
            monkey.makeSound(0);
            String output = outContent.toString().trim();
            Assertions.assertEquals("", output);
        } finally {
            System.setOut(originalOut);
        }

    }
}
