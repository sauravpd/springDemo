package codeSamples;

import org.springframework.stereotype.Component;

/**
 * 
 * @author saurav
 *
 */
@Component
public class Student implements DBService
{
	@Override
	public String getData() 
	{	
		return "Student Data";
	}
}
