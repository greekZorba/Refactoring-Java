package IntroduceNullObject.after;

public class NullCustomer extends Customer {

    public boolean isNull(){
        return true;
    }

    public String getName() {
        return "occupant";
    }

    public void setPlan(BillingPlan arg){}

    public PaymentHistory getHistory() {
        return PaymentHistory.newNull();
    }

}