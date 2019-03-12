package introduceNullObject.before;

public class ExampleClass {

    public void fooMethod(){
        Customer customer = new Customer();

        BillingPlan plan;
        if(customer == null){
            plan = BillingPlan.basic();
        }else{
            plan = customer.getPlan();
        }

        String customerName;
        if(customer == null){
            customerName = "occupant";
        }else{
            customerName = customer.getName();
        }

        int weeksDelinquent;
        if(customer == null){
            weeksDelinquent = 0;
        }else{
            weeksDelinquent = customer.getHistory().getWeeksDelinquentInLastYear();
        }

    }



}
