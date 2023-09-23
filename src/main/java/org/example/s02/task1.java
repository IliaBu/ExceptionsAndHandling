package org.example.s02;

import java.util.InputMismatchException;
import java.util.Scanner;

public class task1 {

    /* 1. Реализуйте метод, который запрашивает у пользователя ввод дробного числа (типа float),
       и возвращает введенное значение.
       Ввод текста вместо числа не должно приводить к падению приложения,
       вместо этого, необходимо повторно запросить у пользователя ввод данных. */

    public static void main(String[] args) {
        input("\nВведите дробное число или .ex для выхода: ");
    }

    public static void input(String str) {
        Scanner scan = new Scanner(System.in);
        String input = null;
        while (true) {
            System.out.println(str);
            input = scan.nextLine();
            if (!input.equals(".ex")) {
                checkFloat(input);
            } else {
                System.out.println();
                System.exit(0);
                scan.close();
            }
        }
    }

    static void checkFloat(String str) {
       try {
        float num;
            if (str.isEmpty()) {
                throw new MyException("Введите число!");
            } else {
                num = Float.parseFloat(str);
            }
            if (num == (int) num) {
                throw new InputMismatchException();
            }
            else {
                    System.out.printf("Вы ввели дробное число: %.2f", num);
                }
            } catch (InputMismatchException e) {
                System.out.println("Введённое число не является дробным.\nПопробуйте ещё раз!");
        } catch (NumberFormatException e) {
            System.out.println("Введён не правильный формат!\nПопробуйте ещё раз!");
        } catch (MyException e) {
           System.out.println(e.getMessage());
       }
    }
}