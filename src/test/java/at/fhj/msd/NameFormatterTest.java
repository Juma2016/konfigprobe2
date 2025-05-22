package at.fhj.msd;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class NameFormatterTest {

    @Test
    void testNormalName() {
        assertEquals("Mario", NameFormatter.formatName("mario"));
    }

    @Test
    void testUppercaseName() {
        assertEquals("Mario", NameFormatter.formatName("MARIO"));
    }

    @Test
    void testMixedCaseName() {
        assertEquals("Mario", NameFormatter.formatName("mArIo"));
    }

    @Test
    void testEmptyString() {
        assertEquals("", NameFormatter.formatName(""));
    }

    @Test
    void testNullInput() {
        assertNull(NameFormatter.formatName(null));
    }
}
