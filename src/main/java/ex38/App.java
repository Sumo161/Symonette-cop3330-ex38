package ex38;

/*
 *  UCF COP3330 Summer 2021 Assignment 2 Solution
 *  Copyright 2021 Nyles Symonette
 */

//
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.function.Predicate;
import java.util.stream.Collectors;

public class App {
    public static void main(String[] args) {
        Scanner inputScanner = new Scanner(System.in);
        System.out.print("Enter a list of numbers, separated by spaces: ");
        String numbersString = inputScanner.nextLine();

        
        ArrayList<Integer> numbers = new ArrayList<>();
        for (String number : numbersString.split(" ")) {
            numbers.add(Integer.parseInt(number));
        }

        Predicate<Integer> isEven = number -> number % 2 == 0;
        List<Integer> evenNumbers = numbers.stream().filter(isEven).collect(Collectors.toList());
        System.out.print("The even numbers are ");
        for (Integer evenNumber : evenNumbers) {
            System.out.print(evenNumber + " ");
        }
        System.out.println();

        inputScanner.close();
    }
}
