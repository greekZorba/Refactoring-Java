package introduceAssertion.after;

public class Employee {

    private static final double NULL_EXPENSE = -1.0;
    private double _expenseLimit = NULL_EXPENSE;
    private Project _primaryProject;

    double getExpenseLimit() {
        assert (_expenseLimit != NULL_EXPENSE || _primaryProject != null);
        return (_expenseLimit != NULL_EXPENSE) ? _expenseLimit : _primaryProject.getMemberExpenseLimit();

    }

    boolean withinLimit(double expenseAmount) {
        return (expenseAmount <= getExpenseLimit());
    }

}
