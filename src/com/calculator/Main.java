package com.calculator;

import java.util.InputMismatchException;

public class Main {

    public static void main(String[] args) {
	    Calculator calculator = new Calculator();
	    calculator.printMenu();
        try {
            double result = calculator.calculate(calculator.readUserChoice());
            calculator.printResult(result);
        } catch (InvalidOperationException e) {
            System.out.println("Некорректная операция");
        } catch (InputMismatchException e) {
            System.out.println("Некорректный операнд - ожидается ввод числа");
        }
    }
}
