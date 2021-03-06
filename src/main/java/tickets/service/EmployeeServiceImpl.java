package tickets.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import tickets.dao.EmployeeDAO;
import tickets.model.Employee;

import java.util.List;

@Service("employeeService")
@Transactional
public class EmployeeServiceImpl implements EmployeeService {
	
	@Autowired
    private EmployeeDAO dao;

	@Override
	public Employee findById(int id) {
		return dao.findById(id);
	}

	@Override
	public void saveEmployee(Employee employee) {
		 dao.saveEmployee(employee);
	}

	@Override
	public void updateEmployee(Employee employee) {
		Employee entity = dao.findById(employee.getId());
        if(entity!=null){
            entity.setName(employee.getName());
        }
	}

	@Override
	public List<Employee> findAllEmployees() {
		return dao.findAllEmployees();
	}

	@Override
	public void deleteById(int id) {
		dao.deleteById(id);
	}
}
