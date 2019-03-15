package ParameterizeMethod.after;

public class Dollars {

    protected Dollars baseCharge() {
        double result = usageInRange(0, 100) * 0.03;

        result += usageInRange(100, 200) * 0.05;
        result += usageInRange(200, Integer.MAX_VALUE) * 0.07;

        return new Dollars(result);
    }

    protected int usageInRange(int start, int end) {
        if (lastUsage() > start) return Math.min(lastUsage(), end) - start;
        else return 0;
    }

    protected int lastUsage() {
        return 300;
    }

    public Dollars(double factor) {
        // logic...
    }
}
