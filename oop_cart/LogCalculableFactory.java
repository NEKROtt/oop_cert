package oop_cart;

import oop_cart.Complex;

@SuppressWarnings("unused")
public class LogCalculableFactory implements ICalculableFactory{
    private final Loggable logger;

    public LogCalculableFactory(Loggable logger) {
        this.logger = logger;
    }

    @Override
    public Calculable create(Complex firstArg) {
        return new LogCalculator(new Calculator(firstArg), this.logger);
    }
}