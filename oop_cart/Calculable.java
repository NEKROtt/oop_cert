package oop_cart;

import oop_cart.Complex;

@SuppressWarnings("unused")
public interface Calculable {
    Calculable sum(Complex arg);
    Calculable multi(Complex arg);
    Calculable div(Complex arg);
    Calculable minus(Complex arg);
    Complex getResult();
}
