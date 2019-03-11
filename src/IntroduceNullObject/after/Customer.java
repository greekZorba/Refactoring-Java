package IntroduceNullObject.after;

public class Customer {

    public String getName(){
        return "";
    }

    public BillingPlan getPlan(){
        return new BillingPlan();
    }

    public PaymentHistory getHistory(){
        return new PaymentHistory();
    }

    class NullCustomer extends Customer{

        public boolean isNull(){
            return true;
        }

    }

}
