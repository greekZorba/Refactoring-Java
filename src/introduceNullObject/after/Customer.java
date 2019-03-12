package introduceNullObject.after;

public class Customer implements Nullable{

    private BillingPlan billingPlan;

    public String getName(){
        return "";
    }

    public BillingPlan getPlan(){
        return new BillingPlan();
    }

    public PaymentHistory getHistory(){
        return new PaymentHistory();
    }

    public void setPlan(BillingPlan billingPlan){
        this.billingPlan = billingPlan;
    }

    public boolean isNull() {
        return false;
    }

    static Customer newNull() {
        return new NullCustomer();
    }

    protected Customer() {} // NullCustomer will use this constructor



}
