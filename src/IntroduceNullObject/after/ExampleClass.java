package IntroduceNullObject.after;

public class ExampleClass {

    public void fooMethod(){
        Site site = new Site();
        Customer customer = site.getCustomer();

        BillingPlan plan;
        if(customer.isNull()) plan = BillingPlan.basic();
        else plan = customer.getPlan();

        String customerName;
        if(customer.isNull()) customerName = "occupant";
        else customerName = customer.getName();

        int weeksDelinquent;
        if(customer.isNull()) weeksDelinquent = 0;
        else weeksDelinquent = customer.getHistory().getWeeksDelinquentInLastYear();

    }



}
