package org.example.s02;

import java.util.Scanner;

public class task4 {

    /* Разработайте программу, которая выбросит Exception,
    когда пользователь вводит пустую строку.
    Пользователю должно показаться сообщение, что пустые строки вводить нельзя.
    */

    public static void main(String[] args) {
        input("\nНажмите Enter для вывода исключения на пустую строку или .ex для выхода: ");
    }

    public static void input(String str) {
        Scanner scan = new Scanner(System.in);
        String input = null;
        while (true) {
            System.out.println(str);
            input = scan.nextLine();
            if (!input.equals(".ex")) {
                checkEmptyString(input);
            } else {
                System.out.println();
                System.exit(0);
                scan.close();
            }
        }
    }

    static void checkEmptyString(String str) {
        try {
            if (str.isEmpty()) {
                throw new MyException("Пустые строки вводить нельзя!");
            } else {
                System.out.println("Вы ввели: " + str);
            }
        } catch(MyException e){
                System.out.println(e.getMessage());
            }
        }
    }
