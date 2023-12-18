package JenkinPractice;

import org.testng.annotations.Test;

public class ParamtersTest {

	public class Demo2Test {
		@Test
		public void aTest()
		{
		
			String BROWSER = System.getProperty("browser");
			String URL = System.getProperty("URl");
			System.out.println(BROWSER);
			System.out.println(URL);
			
	}
	}
}
