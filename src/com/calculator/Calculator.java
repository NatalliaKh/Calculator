package com.calculator;

import java.util.Scanner;

public class Calculator {

    public Calculator() {
    }

    public void printMenu() {
        System.out.println("Выберите одну из следующих опереаций:");
        System.out.println("Введите '+' для сложения");
        System.out.println("Введите '-' для вычитания");
        System.out.println("Введите '*' для умножения");
        System.out.println("Введите '/' для деления");
        System.out.println("Ваш выбор:");
    }

    public String readUserChoice() {
        Scanner scanner = new Scanner(System.in);
        String userChoice = scanner.nextLine();
        return userChoice;
    }

    public double calculate(String userChoice) throws InvalidOperationException {
        if (!("+".equals(userChoice) || "-".equals(userChoice) || "*".equals(userChoice) || "/".equals(userChoice))) {
            throw new InvalidOperationException();
        }
        double firstOperand = readOperand("первый операнд");
        double seconfOperand = readOperand("второй оперенд");
        switch (userChoice) {
            case "+":
                return firstOperand + seconfOperand;
            case "-":
                return firstOperand - seconfOperand;
            case "*":
                return firstOperand * seconfOperand;
            case "/":
                if (Double.compare(seconfOperand, 0) == 0) {
                    throw new InvalidOperationException();
                } else {
                    return firstOperand / seconfOperand;
                }
            default:
                throw new InvalidOperationException();
        }
    }

    private double readOperand(String operandNumber) {
        System.out.println("Введите " + operandNumber + ":");
        Scanner scanner = new Scanner(System.in);
        return scanner.nextDouble();
    }

    public void printResult(double result) {
        System.out.printf("Результат операции: %f\n", result);
    }
}
