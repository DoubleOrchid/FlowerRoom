package demo.test;
import demo.StringDemo;
import junit.framework.TestCase;
public class StringDemoTest extends TestCase {
	private StringDemo str;
	protected void setUp(){
		str = new StringDemo();
	}
		public void testSmallString() {
		assertEquals("一个字母变小写",str.smallString("A"),"a");
		
	}
		public void testSmallString1() {
			assertEquals("一串字母变小写",str.smallString("ABC"),"abc");
			
		}
		public void testSmallString2() {
			assertEquals("一串字母变小写",str.smallString("ABC"),"ABC");
			
		}
		public void testSmallString3() {
			assertEquals("一个字母变小写",str.smallString("A"),"A");
			
		}
		public void testSmallString4() {
			assertEquals("一个字母变小写",str.smallString("a"),"a");
			
		}
		public void testSmallString5() {
			assertEquals("一串字母变小写",str.smallString("ABCDE"),"ABCde");
			
		}
		public void testSmallString6() {
			assertEquals("一串字母变小写",str.smallString("ABCDEF"),"ABCdeF");
			
		}
		public void testSmallString7() {
			assertEquals("一个字母变小写",str.smallString("a"),"A");
			
		}
		public void testSmallString8() {
			assertEquals("一串字母变小写",str.smallString("abcde"),"ABCDE");
			
		}
		public void testSmallString9() {
			assertEquals("一串字母变小写",str.smallString("ABC123"),"abc123");
			
		}
	
}