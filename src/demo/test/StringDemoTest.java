package demo.test;
import demo.StringDemo;
import junit.framework.TestCase;
public class StringDemoTest extends TestCase {
	private StringDemo str;
	protected void setUp(){
		str = new StringDemo();
	}
		public void testSmallString() {
		assertEquals("һ����ĸ��Сд",str.smallString("A"),"a");
		
	}
		public void testSmallString1() {
			assertEquals("һ����ĸ��Сд",str.smallString("ABC"),"abc");
			
		}
		public void testSmallString2() {
			assertEquals("һ����ĸ��Сд",str.smallString("ABC"),"ABC");
			
		}
		public void testSmallString3() {
			assertEquals("һ����ĸ��Сд",str.smallString("A"),"A");
			
		}
		public void testSmallString4() {
			assertEquals("һ����ĸ��Сд",str.smallString("a"),"a");
			
		}
		public void testSmallString5() {
			assertEquals("һ����ĸ��Сд",str.smallString("ABCDE"),"ABCde");
			
		}
		public void testSmallString6() {
			assertEquals("һ����ĸ��Сд",str.smallString("ABCDEF"),"ABCdeF");
			
		}
		public void testSmallString7() {
			assertEquals("һ����ĸ��Сд",str.smallString("a"),"A");
			
		}
		public void testSmallString8() {
			assertEquals("һ����ĸ��Сд",str.smallString("abcde"),"ABCDE");
			
		}
		public void testSmallString9() {
			assertEquals("һ����ĸ��Сд",str.smallString("ABC123"),"abc123");
			
		}
	
}