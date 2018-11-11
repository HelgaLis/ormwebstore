package webstore.repository;

import java.util.List;

import javax.persistence.EntityManagerFactory;

import org.springframework.beans.factory.annotation.Autowired;

import webstore.domain.Product;

public class HibernateProductRepository implements ProductRepository {
	@Autowired
	private EntityManagerFactory emf;
	@Override
	public List<Product> getllProducts() {
		
		return null;
	}

	@Override
	public void updateStock(String productId, long nonOfUnits) {
		// TODO Auto-generated method stub

	}

}
