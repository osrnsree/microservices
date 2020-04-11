package com.example.microservices.limitsservice.beans;

public class LimitsConfiguration {
    private int maximum;
    private int minimum;

    protected LimitsConfiguration() {

    }

    public LimitsConfiguration(final int maximum, final int minimum) {
        super();
        this.maximum = maximum;
        this.minimum = minimum;
    }

    public int getMaximum() {
        return maximum;
    }

    public int getMinimum() {
        return minimum;
    }
}
