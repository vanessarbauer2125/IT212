package gpaconvertertests;

import org.junit.Test;
import static org.junit.jupiter.api.Assertions.*;
import gpaconverter.*;

public class gpaconvertertests {

    @Test

    public void convertGpaToPercent_withHighGPA_calculatesCorrectPercentage() {
        GPAConverter converter = new GPAConverter();
        assertEquals("100% to 95.0%", converter.convertGpaToPercent(4.0));
    }

    @Test
    public void convertGpaToPercent_withTypicalGPA_calculatesCorrectPercentage() {
        GPAConverter converter = new GPAConverter();
        assertEquals("< 93.0% to 92.0%", converter.convertGpaToPercent(3.7));
    }

    @Test
    public void convertGpaToPercent_withLowGPA_calculatesCorrectPercentage() {
        GPAConverter converter = new GPAConverter();
        assertEquals("< 65.0% to 0.0%", converter.convertGpaToPercent(0.0));
    }

    @Test
    public void convertGpaToPercent_withHighInvalidGPA_calculatesCorrectPercentage() {
        GPAConverter converter = new GPAConverter();
        assertEquals("Invalid GPA entered.", converter.convertGpaToPercent(4.5));
    }

    @Test
    public void convertGpaToPercent_withNegativeInvalidGPA_calculatesCorrectPercentage() {
        GPAConverter converter = new GPAConverter();
        assertEquals("Invalid GPA entered.", converter.convertGpaToPercent(-4.5));
    }
}
