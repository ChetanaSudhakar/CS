/**
 * 
 */
package com.cs.ps.service;

import java.util.List;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.cs.ps.dao.ParkingStatusDAO;
import com.cs.ps.model.Employee;
import com.cs.ps.model.PasrkingStatus;

/**
 * @author Sudhakar
 *
 */
@Service("parkingservice")
@Transactional
public class ParkingStatusServiceImpl implements ParkingStatusService {
	
	 @Autowired
	    private ParkingStatusDAO dao;
	     
	    public void saveEmployee(Employee employee) {
	        dao.saveEmployee(employee);
	    }
	 
	    public List<Employee> findAllEmployees() {
	        return dao.findAllEmployees();
	    }
	 
	    public void deleteEmployeeBySsn(String ssn) {
	        dao.deleteEmployeeBySsn(ssn);
	    }
	 
	    public Employee findBySsn(String ssn) {
	        return dao.findBySsn(ssn);
	    }
	 
	    public void updateEmployee(Employee employee){
	        dao.updateEmployee(employee);
	    }

		@Override
		public List<PasrkingStatus> getPaarkingStatus() {
return dao.getStatus();
		}

}
