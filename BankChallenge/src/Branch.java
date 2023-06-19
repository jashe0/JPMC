import java.util.ArrayList;

public class Branch {
    private String name;
    private ArrayList<Customer> customers;

    public Branch(String name) {
        this.name = name;
        this.customers = new ArrayList<Customer>();
    }

    public String getName() {
        return name;
    }

    public ArrayList<Customer> getCustomers() {
        return customers;
    }

    private Customer findCustomer(String customerName){
        for(Customer c: customers){
            if(c.getName().equalsIgnoreCase(customerName)){
                return c;
            }
        }
        return null;
    }

    public boolean newCustomer(String customerName, double initialTransaction){
        Customer customer = findCustomer(customerName);
        if(customer == null){
            customer = new Customer(customerName,initialTransaction);
            this.customers.add(customer);
            return true;
        } else {
            return false;
        }
    }

    public boolean addCustomerTransaction(String customerName, double transaction){
        Customer customer = findCustomer(customerName);
        if(customer != null){
            customer.addTransaction(transaction);
            return true;
        } else {
            return false;
        }
    }

}
