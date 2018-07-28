package codeSamples;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(classes=TestContextAOP.class)
public class dependencyInjectionDemo5 
{
	@Autowired
	Company company;

	@Test
	public void test2()
	{
		System.out.println("test "+company.getName());
	}
}