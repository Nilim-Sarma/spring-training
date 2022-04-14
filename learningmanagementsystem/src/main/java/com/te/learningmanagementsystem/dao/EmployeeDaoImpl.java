package com.te.learningmanagementsystem.dao;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;
import javax.persistence.PersistenceUnit;
import javax.persistence.Query;

import org.springframework.stereotype.Repository;
import com.te.learningmanagementsystem.dto.Employee;
import com.te.learningmanagementsystem.exception.EmployeeException;

@Repository
public class EmployeeDaoImpl implements EmployeeDao {

	@PersistenceUnit
	private EntityManagerFactory factory;

	@Override
	public Employee authenticate(Integer id, String pwd) {
//		EntityManagerFactory factory = Persistence.createEntityManagerFactory("lms");
		EntityManager manager = factory.createEntityManager();
		Employee employee = manager.find(Employee.class, id);
		if (employee != null) {
			if (employee.getEmpPassword().equals(pwd)) {
				return employee;
			} else {
				throw new EmployeeException("Please enter a valid password!!");
			}
		}
		throw new EmployeeException("Please enter a valid ID!!");
	}

	@Override
	public boolean addEmployee(Employee employee) {
		boolean isAdded = false;
		EntityTransaction transaction = null;
		try {
//			EntityManagerFactory factory = Persistence.createEntityManagerFactory("lms");
			EntityManager manager = factory.createEntityManager();
			transaction = manager.getTransaction();
			transaction.begin();
			manager.persist(employee);
			transaction.commit();
			isAdded = true;
		} catch (Exception e) {
			if (transaction != null) {
				transaction.rollback();
			}
			e.printStackTrace();
		}
		return isAdded;
	}

	@Override
	public boolean deleteData(Integer id) {
		boolean isDeleted = false;
		EntityTransaction transaction = null;
		try {
//			EntityManagerFactory factory = Persistence.createEntityManagerFactory("lms");
			EntityManager manager = factory.createEntityManager();
			transaction = manager.getTransaction();
			transaction.begin();
			Employee employee = manager.find(Employee.class, id);
			if (employee != null) {
				manager.remove(employee);
				transaction.commit();
				isDeleted = true;
			}
		} catch (Exception e) {
			if (transaction != null) {
				transaction.rollback();
			}
			e.printStackTrace();
		}
		return isDeleted;
	}

	@Override
	public boolean updateData(Employee employee, Integer empId) {
		boolean isUpdated = false;
		EntityTransaction transaction = null;
		try {
//			EntityManagerFactory factory = Persistence.createEntityManagerFactory("lms");
			EntityManager manager = factory.createEntityManager();
			transaction = manager.getTransaction();
			transaction.begin();
			Employee employee2 = manager.find(Employee.class, empId);
			employee2.setEmpName(employee.getEmpName());
			employee2.setEmpAddress(employee.getEmpAddress());
			employee2.setEmpPassword(employee.getEmpPassword());
			transaction.commit();
			isUpdated = true;
		} catch (Exception e) {
			if (transaction != null) {
				transaction.rollback();
			}
			e.printStackTrace();
		}
		return isUpdated;
	}

	@Override
	public List<Employee> seeAllEmployees() {
//		EntityManagerFactory factory = Persistence.createEntityManagerFactory("lms");
		EntityManager manager = factory.createEntityManager();
		String query = "from Employee";
		Query query2 = manager.createQuery(query);
		List<Employee> employees = query2.getResultList();
		return employees;
	}
}
