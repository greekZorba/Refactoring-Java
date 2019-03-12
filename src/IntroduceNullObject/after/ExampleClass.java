package IntroduceNullObject.after;

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

        //바로 위의 메서드를 아래와 같이 변경할 수 있음
        weeksDelinquent = customer.getHistory().getWeeksDelinquentInLastYear();
        System.out.println("null 일 때 weeksDelinquent 값은 0이어야 함 :" + weeksDelinquent);


        if(!customer.isNull()){
            customer.setPlan(BillingPlan.special());
        }

        // 바로 위의 메서드를 아래와 같이 변경할 수 있음
        customer.setPlan(BillingPlan.special());

    }

    public static void main(String[] args) {
        ExampleClass exampleClass = new ExampleClass();
        exampleClass.fooMethod();
    }



}
