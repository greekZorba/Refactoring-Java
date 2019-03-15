package ParameterizeMethod.before;

public class Dollars {

    protected Dollars baseCharge() {
        double result = Math.min(lastUsage(), 100) * 0.03;

        if(lastUsage() > 100) {
            result += (Math.min(lastUsage(), 200) - 100) * 0.05;
        }
        if(lastUsage() > 200) {
            result += (lastUsage() - 200) * 0.07;
        }

        return new Dollars(result);
    }

    protected int lastUsage() {
        return 300;
    }

    public Dollars(double factor) {
        // logic...
    }
}
