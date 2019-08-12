package com.crm.dao;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.query.Query;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.crm.entity.Customer;

@Repository
public class CustomerDAOImpl implements CustomerDAO{

	@Autowired
	private SessionFactory sessionFactory;
	
	@Override
	@Transactional
	public List<Customer> getcustomer()
	{
		System.out.println("inside in dao");
	//get current hibernate session
	Session currentSession=sessionFactory.getCurrentSession();
	
	//create a query
	Query<Customer> thequery=currentSession.createQuery("from Customer",Customer.class);
	
	
	//execute query and get result list
	List<Customer>customer=thequery.getResultList();
	
	System.out.println("inside dao result customer");
	//return result	
	return customer;
	
		
	}

}
