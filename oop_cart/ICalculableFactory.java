package oop_cart;

import oop_cart.Complex;

@SuppressWarnings("unused")
public interface ICalculableFactory {
    Calculable create(Complex firstArg);
}
