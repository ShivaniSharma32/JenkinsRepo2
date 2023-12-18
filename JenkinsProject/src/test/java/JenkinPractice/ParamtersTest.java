package JenkinPractice;

import org.testng.annotations.Test;

public class ParamtersTest {
		@Test
		public void bTest()
		{
		
			String BROWSER = System.getProperty("browser");
			String URL = System.getProperty("URl");
			System.out.println(BROWSER);
			System.out.println(URL);
			
	}
	}

