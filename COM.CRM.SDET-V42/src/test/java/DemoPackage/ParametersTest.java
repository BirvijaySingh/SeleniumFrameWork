package DemoPackage;

import org.testng.annotations.Test;

public class ParametersTest {
	@Test
	public void method()
	{
		String var = System.getProperty("browser");
		System.out.println(var);
	}
}
