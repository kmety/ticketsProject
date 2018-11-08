package tickets.service;

import tickets.model.Employee;

import java.util.List;

public interface EmployeeService {
	
	Employee findById(int id);
    
    void saveEmployee(Employee employee);
     
    void updateEmployee(Employee employee);
 
    List<Employee> findAllEmployees();
    void deleteById(int id);
}

