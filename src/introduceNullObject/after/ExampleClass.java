package introduceNullObject.after;

public class ExampleClass {

    public void fooMethod(){
        Site site = new Site();
        Customer customer = site.getCustomer();

        BillingPlan plan;
        if(customer.isNull()) plan = BillingPlan.basic();
        else plan = customer.getPlan();

        String customerName = customer.getName();

        int weeksDelinquent;
        if(customer.isNull()) weeksDelinquent = 0;
        else weeksDelinquent = customer.getHistory().getWeeksDelinquentInLastYear();

        //upper method can be changed like this method
        weeksDelinquent = customer.getHistory().getWeeksDelinquentInLastYear();
        System.out.println("if customer is null, weeksDelinquent should be 0 : " + weeksDelinquent);


        if(!customer.isNull()){
            customer.setPlan(BillingPlan.special());
        }

        // upper method can be changed like this method
        // NullCustomer has setPlan method but doesn't have any logic
        customer.setPlan(BillingPlan.special());

    }

    public static void main(String[] args) {
        ExampleClass exampleClass = new ExampleClass();
        exampleClass.fooMethod();
    }



}
