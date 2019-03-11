package IntroduceNullObject.after;

public class Customer implements Nullable{

    public String getName(){
        return "";
    }

    public BillingPlan getPlan(){
        return new BillingPlan();
    }

    public PaymentHistory getHistory(){
        return new PaymentHistory();
    }

    public boolean isNull() {
        return false;
    }

    static Customer newNull() {
        return new NullCustomer();
    }

    protected Customer() {} // NullCustomer가 사용



}
