package codeSamples;

import org.springframework.stereotype.Component;
/**
 * 
 * @author saurav
 *
 */
@Component
public class Employee implements DBService
{
	@Override
	public String getData()
	{
		return "Employee Data";
	}
}
