package org.example;

public class Calculator {

    public double calculate(double firstNumber, double secondNumber, char operator) {
        switch (operator) {
            case '+': {
                return suma(firstNumber, secondNumber);
            }
            case '-': {
                return resta(firstNumber, secondNumber);
            }
            case '*': {
                return multiplicar(firstNumber, secondNumber);
            }
            case '/': {
                return dividir(firstNumber, secondNumber);
            }
            default:
                throw new IllegalArgumentException("No se puede realizar la operación :" + operator);
        }
    }

    private double dividir(double firstNumber, double secondNumber) {
        if (secondNumber == 0)
            throw new IllegalArgumentException("El segundo número no puede ser 0!");
        return firstNumber / secondNumber;
    }

    private double multiplicar(double firstNumber, double secondNumber) {
        return firstNumber * secondNumber;
    }

    private double resta(double firstNumber, double secondNumber) {
        return firstNumber - secondNumber;
    }

    private double suma(double firstOperand, double secondNumber) {
        return firstOperand + secondNumber;
    }
}
