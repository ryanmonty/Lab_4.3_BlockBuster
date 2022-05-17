import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class DVDTest {

	@Test
	void test() {
		Movie testDVD = new DVD();
		DVD d = (DVD)testDVD;
		d.setTitle("testTitle");
		d.setRunTime(123);
		assertEquals("testTitle", testDVD.getTitle());
		assertEquals(123, testDVD.getRunTime());
	}

}
