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
@ContextConfiguration(classes=TestContext.class)
public class dependencyInjectionDemo4 
{
	DBService studentService;

	DBService empService;

	@Autowired
	@Qualifier(value="student")
	public void setStudentService(DBService studentService) 
	{
		this.studentService = studentService;
	}

	@Autowired
	@Qualifier(value="employee")
	public void setEmpService(DBService empService) 
	{
		this.empService = empService;
	}

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
