package tickets.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.stereotype.Component;

@Component
public class EmployeeServiceTest {

	@Autowired
	private EmployeeService employeeService;

	public void run() {
		System.out.println("Started");
		System.out.println("EmployeeService: " + employeeService);
		System.out.println("Employees: " + employeeService.findAllEmployees());
	}

	public static void main(String[] args) {
		ApplicationContext applicationContext = new AnnotationConfigApplicationContext("tickets");
		EmployeeServiceTest test = applicationContext.getBean(EmployeeServiceTest.class);
		test.run();
	}
}
