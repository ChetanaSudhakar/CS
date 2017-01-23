/**
 * 
 */
package com.cs.ps.dao;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

import org.hibernate.Criteria;
import org.hibernate.Query;
import org.hibernate.SQLQuery;
import org.hibernate.criterion.Restrictions;
import org.springframework.stereotype.Repository;

import com.cs.ps.model.Employee;
import com.cs.ps.model.PasrkingStatus;

/**
 * @author Sudhakar
 *
 */
@Repository("parkingStatusDAO")
public class ParkingStatusDAOImpl extends AbstractDAO  implements ParkingStatusDAO{
	
	public void saveEmployee(Employee employee) {
        persist(employee);
    }
 
    @SuppressWarnings("unchecked")
    public List<Employee> findAllEmployees() {
        Criteria criteria = getSession().createCriteria(Employee.class);
        return (List<Employee>) criteria.list();
    }
 
    public void deleteEmployeeBySsn(String ssn) {
        Query query = getSession().createSQLQuery("delete from Employee1 where ssn = :ssn");
        query.setString("ssn", ssn);
        query.executeUpdate();
    }
 
     
    public Employee findBySsn(String ssn){
        Criteria criteria = getSession().createCriteria(Employee.class);
        criteria.add(Restrictions.eq("ssn",ssn));
        return (Employee) criteria.uniqueResult();
    }
     
    public void updateEmployee(Employee employee){
        getSession().update(employee);
    }

	@Override
	public List<PasrkingStatus> getStatus() {
		List<PasrkingStatus> parkingStatusData=new ArrayList<PasrkingStatus>();
		String sql = "Select Status, (Count(Status)* 100 / (Select Count(*) From TAB_PARKING_LOC)) as sum From TAB_PARKING_LOC Group By Status";
        SQLQuery query = getSession().createSQLQuery(sql);
        query.setResultTransformer(Criteria.ALIAS_TO_ENTITY_MAP);
        List data = query.list();

        for(Object object : data)
        {
           Map row = (Map)object;
           
           PasrkingStatus ps=new PasrkingStatus();
           ps.setStatus((String) row.get("STATUS"));
           ps.setSum((BigDecimal) row.get("SUM"));
           parkingStatusData.add(ps);
        }
	   return parkingStatusData;
	
	}
}
