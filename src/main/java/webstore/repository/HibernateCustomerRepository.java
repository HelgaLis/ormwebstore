package webstore.repository;

import java.util.List;

import javax.persistence.EntityManagerFactory;

import org.springframework.beans.factory.annotation.Autowired;

import webstore.domain.Customer;

public class HibernateCustomerRepository implements CustomerRepository {
	@Autowired
	private EntityManagerFactory emf;
	@Override
	public List<Customer> getAllCustomers() {
		// TODO Auto-generated method stub
		return null;
	}

}
