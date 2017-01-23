/**
 * 
 */
package com.cs.ps.dao;

import java.util.List;

import com.cs.ps.model.Employee;
import com.cs.ps.model.PasrkingStatus;

/**
 * @author Sudhakar
 *
 */
public interface ParkingStatusDAO {
	
	void saveEmployee(Employee employee);
    
    List<Employee> findAllEmployees();
     
    void deleteEmployeeBySsn(String ssn);
     
    Employee findBySsn(String ssn);
     
    void updateEmployee(Employee employee);
    
    List<PasrkingStatus> getStatus();

}
