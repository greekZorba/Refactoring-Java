package IntroduceNullObject.before;

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

}
