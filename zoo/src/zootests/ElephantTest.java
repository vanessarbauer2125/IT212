// Source code is decompiled from a .class file using FernFlower decompiler (from Intellij IDEA).
package zootests;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import zoo.Animal;
import zoo.Elephant;

class ElephantTest {
    ElephantTest() {
    }

    @Test
    void makeSound_should_printSound() {
        Animal elephant = new Elephant("Elly");
        ByteArrayOutputStream outContent = new ByteArrayOutputStream();
        PrintStream originalOut = System.out;
        System.setOut(new PrintStream(outContent));

        try {
            elephant.makeSound();
            String output = outContent.toString().trim();
            Assertions.assertEquals("Hjooonk", output);
        } finally {
            System.setOut(originalOut);
        }

    }

    @Test
    void makeSoundWith3_should_printSound3Times() {
        Animal elephant = new Elephant("Elly");
        ByteArrayOutputStream outContent = new ByteArrayOutputStream();
        PrintStream originalOut = System.out;
        System.setOut(new PrintStream(outContent));

        try {
            elephant.makeSound(3);
            String output = outContent.toString().trim();
            Assertions.assertEquals("Hjooonk Hjooonk Hjooonk", output);
        } finally {
            System.setOut(originalOut);
        }

    }

    @Test
    void makeSoundWith0_should_printSound0Times() {
        Animal elephant = new Elephant("Elly");
        ByteArrayOutputStream outContent = new ByteArrayOutputStream();
        PrintStream originalOut = System.out;
        System.setOut(new PrintStream(outContent));

        try {
            elephant.makeSound(0);
            String output = outContent.toString().trim();
            Assertions.assertEquals("", output);
        } finally {
            System.setOut(originalOut);
        }

    }
}
