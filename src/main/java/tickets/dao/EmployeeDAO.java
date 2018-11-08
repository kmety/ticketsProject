package tickets.dao;

import tickets.model.Employee;

import java.util.List;

public interface EmployeeDAO {

	Employee findById(int id);
	 
    void saveEmployee(Employee employee);
     
    List<Employee> findAllEmployees();

    void deleteById(int id);

}

