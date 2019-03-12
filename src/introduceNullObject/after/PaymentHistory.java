package introduceNullObject.after;

public class PaymentHistory {

    int getWeeksDelinquentInLastYear(){
        return 1;
    }

    static PaymentHistory newNull() {
        return new NullPaymentHistory();
    }
}
