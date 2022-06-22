import static org.junit.jupiter.api.Assertions.*;

import java.util.ArrayList;

import org.junit.jupiter.api.Test;

class DVDTest {

@Test
	void testDVD() {
		DVD test = new DVD("Title", 123);
		String expected = "Title";
		String actual = test.getTitle();
		assertEquals(expected, actual);
	}
}