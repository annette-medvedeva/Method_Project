package com.company;

import com.company.Task2.Author;
import com.company.Task2.Book;
import com.company.Task2.Content;
import com.company.Task2.Title;

import java.io.IOException;
import java.time.LocalDate;
import java.util.Scanner;

public class Main {
    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        Book book =new Book(new Title("Java8"), new Author("Shildt Gerbert"),new Content("Java"));
        System.out.println(book);
        book.show();

        Car_ car1=new Car_ ("BMW", "green",-1000, "new","gas", -500, LocalDate.of(2022,11,1) );
        System.out.println(car1);


        Homework homework = new Homework();

        System.out.println(Homework.creditCalculate(300));
        System.out.println(Homework.creditCalculate(300));
        System.out.println(Homework.creditCalculate(300));
        System.out.println(Homework.creditCalculate(300));
// Money exchange
        double rate = 0, summa, money;
        System.out.println("Enter Summa: ");
        summa = scanner.nextDouble();
        System.out.println(" Enter direction 1- USA, 2-EUR");
        int choice = scanner.nextInt();
        switch (choice) {
            case 1:
                rate = 26.3;
                System.out.println("USA :" + rate + summa);
                break;
            case 2:
                rate = 33.3;
                System.out.println("EUR:  " + rate + summa);
                break;
        }
        money = Homework.exchange(summa, rate);
        System.out.println(money);

        // Positive && Negative Number
          System.out.println(Homework.number(5));

        // Напишите метод, который в качестве аргумента принимает одномерный
        //целочисленный массив, и сортирует его “Методом пузырька”. Также
        //напишите отдельный метод, для вывода массива на экран.
        int array[]={99,-10,23,1555,12,45,-664,-43,5,6,7,-9000,3};
        System.out.println(" Исходный массив: ");
        for (int i = 0; i < array.length; i++)
            System.out.println(array[i]+" ");
        System.out.println();
        Homework.Array(array);
        System.out.println("Новый массыв:  ");
        for (int i = 0; i < array.length ; i++)
            System.out.println(array[i]+" ");
        System.out.println();
        }
    }

