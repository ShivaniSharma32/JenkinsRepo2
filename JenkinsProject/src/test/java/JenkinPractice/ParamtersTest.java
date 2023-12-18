package JenkinPractice;

import org.testng.annotations.Test;

public class ParamtersTest {
		@Test
		public void bTest()
		{
		    System.out.println("Welcome");
			String BROWSER = System.getProperty("browser");
			String URL = System.getProperty("url");
			System.out.println(BROWSER);
			System.out.println(URL);
			
	}
	}

