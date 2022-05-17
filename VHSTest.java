import static org.junit.jupiter.api.Assertions.*;

import java.util.ArrayList;
import java.util.Arrays;

import org.junit.jupiter.api.Test;

class VHSTest {

	@Test
	void test() {
		VHS testVHS = new VHS();
		VHS v = (VHS) testVHS;
		v.setTitle("testTitle");
		v.setRunTime(123);
		v.setCurrentTime(0);
		assertEquals("testTitle", testVHS.getTitle());
		assertEquals(123, testVHS.getRunTime());
		assertEquals(0, testVHS.getCurrentTime());
	}
	
	@Test
	void testPlay() {
		VHS testVHS = new VHS();
		VHS v = (VHS) testVHS;
		v.setCurrentTime(0);
		ArrayList<String> scenes = new ArrayList<>();
		scenes.add("Scene1");
		v.play();
		assertEquals(1, testVHS.getCurrentTime());
		
	}
	
	@Test
	void testRewind() {
		VHS testVHS = new VHS();
		VHS v = (VHS) testVHS;
		v.setCurrentTime(5);
		ArrayList<String> scenes = new ArrayList<String>(Arrays.asList("Scene1", "Scene2", "Scene3"));
		v.rewind();
		assertEquals(0, testVHS.getCurrentTime());
		
	}


}
