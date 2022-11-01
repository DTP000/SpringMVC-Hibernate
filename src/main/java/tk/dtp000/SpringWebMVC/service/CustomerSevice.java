package tk.dtp000.SpringWebMVC.service;

import java.util.List;
import tk.dtp000.SpringWebMVC.entity.Customer;

public interface CustomerSevice {
	public List<Customer> getCustomers();

	public void saveCustomer(Customer theCustomer);

	public Customer getCustomer(int theId);

	public void deleteCustomer(int theId);
}
