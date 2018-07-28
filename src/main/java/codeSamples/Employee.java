package codeSamples;

import org.springframework.stereotype.Component;

@Component
public class Employee implements DBService
{
	@Override
	public String getData()
	{
		return "Employee Data";
	}
}
