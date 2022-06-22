//import static org.junit.jupiter.api.Assertions.*;
//import java.util.ArrayList;
//
//import org.junit.jupiter.api.Test;
//
//class VHSTest {
//
//	@Test
//	void test() {
//		VHS testVHS = new VHS();
//		VHS v = (VHS) testVHS;
//		v.setTitle("testTitle");
//		v.setRunTime(123);
//		v.setCurrentTime(0);
//		assertEquals("testTitle", testVHS.getTitle());
//		assertEquals(123, testVHS.getRunTime());
//		assertEquals(0, testVHS.getCurrentTime());
//	}
//	
//	@Test
//	void testPlay() {
//		Movie testVHS = new VHS();
//		VHS v = (VHS) testVHS;
//		v.setCurrentTime(0);
//		ArrayList<String> scenes = new ArrayList<>();
//		scenes.add("Scene1");
//		scenes.add("Scene2");
//		scenes.add("Scene3");
//		v.setScenes(scenes);
//		v.play();
//		assertEquals(1, v.getCurrentTime());
//		
//	}
//	
//	@Test
//	void testRewind() {
//		Movie testVHS = new VHS();
//		VHS v = (VHS) testVHS;
//		v.setCurrentTime(5);
//		v.rewind();
//		assertEquals(0, v.getCurrentTime());
//		
//	}
//
//
//}
