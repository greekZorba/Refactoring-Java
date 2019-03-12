package introduceNullObject.after;

public class Site {

    Customer getCustomer(){
        // if _customer is null, getCustomer will return NullObject of Customer through newNull method
        return (_customer == null) ? Customer.newNull() : _customer;
    }

    Customer _customer;

}
