package oop_cart;

import oop_cart.Complex;

@SuppressWarnings("unused")
public class CalculableFactory implements ICalculableFactory{
    @Override
    public Calculable create(Complex firstArg) {
        return new Calculator(firstArg);
    }
}
