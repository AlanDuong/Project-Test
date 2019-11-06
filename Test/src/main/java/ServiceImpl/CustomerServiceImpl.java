package ServiceImpl;

import java.util.ArrayList;

import java.util.List;

import org.springframework.stereotype.Component;

import Model.Customer;
import Service.CustomerService;

@Component
public class CustomerServiceImpl implements CustomerService {

	private static List<Customer> customers = new ArrayList<>();

	static {
		Customer jack1 = new Customer(1, "Jack Rutorial 1", "admin@jackrutorial.com", "This is a Jack 1");
		Customer jack2 = new Customer(2, "Jack Rutorial 2", "support@jackrutorial.com", "This is a Jack 2");
		Customer jack3 = new Customer(3, "Jack Rutorial 3", "test@jackrutorial.com", "This is a Jack 3");

		customers.add(jack1);
		customers.add(jack2);
		customers.add(jack3);
	}

	@Override
	public List<Customer> getAllCustomer() {
		return customers;
	}

}
