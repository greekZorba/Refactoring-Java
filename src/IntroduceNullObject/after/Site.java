package IntroduceNullObject.after;

public class Site {

    Customer getCustomer(){

        return (_customer == null) ? Customer.newNull() : _customer;
    }

    Customer _customer;

}
