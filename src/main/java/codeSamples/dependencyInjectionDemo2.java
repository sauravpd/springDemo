package codeSamples;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
/**
 * 
 * @author saurav
 *
 */
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations={"/testContext.xml"})
public class dependencyInjectionDemo2 
{
	@Autowired
	@Qualifier(value="student")
	DBService studentService;

	@Autowired
	@Qualifier(value="employee")
	DBService empService;


	@Test
	public void test1()
	{
		System.out.println("test "+studentService.getData());
	}

	@Test
	public void test2()
	{
		System.out.println("test "+empService.getData());
	}
}
