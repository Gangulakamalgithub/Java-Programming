package com.example.variables;

public class VariablePrinter {
    public static void main(String[] args) {

        /* instance variables*/
        int instanceVar;
        instanceVar = 100000000;
        System.out.println("instance Variable : " + instanceVar);

        /*Simple Variables*/
        byte sNumber;
        sNumber = 40;
        System.out.println("Serial.Number : " + sNumber);

        short amount;
        amount = 3000;
        System.out.println("Amount : " + amount);

        int salary;
        salary = 300000;
        System.out.println("Salary : " + salary);

        long annualSalary;
        annualSalary = 24353448434555L;
        System.out.println("Annual Salary : " + annualSalary);

        float incrementPercentage;
        incrementPercentage = 2345678.23f;
        System.out.println("Increment Percentage : " + incrementPercentage);

        double avgAnnualRevenue;
        avgAnnualRevenue = 2345637.233;
        System.out.println("Average Annual Salary : " + avgAnnualRevenue);

        char person;
        person = 'M';
        System.out.println("Person Male Or Female : " + person);

        boolean isMale;
        isMale = true;
        System.out.println("Person Is A Male : " + isMale);

         /* Automatic Conversion*/
        int number = 10;//implicit Casting
        double numberDouble = number;
        System.out.println("Integer value: " + number);
        System.out.println("Double value after implicit casting: " + numberDouble);

        /*Manual Conversion*/
        double numDouble = 20.0;//explicit Casting
        int numInt = (int)numDouble;
        System.out.println("Double Value : " + numDouble);
        System.out.println("Integer Value After explicit Casting : " + numInt);

        /* convert char to int after ASCII value8*/
        char letter = 'k';
        int letterInt = letter;
        System.out.println("ASCII  Value : " + letterInt);

        /*convert int to char after ASCII value*/
        int num = 88;
        char resultChar = (char)num;
        System.out.println("ASCII Value : " + resultChar);

        /*Arithmetic Operations*/
        int price = 150;
        double discountPrice = 24.50;
        int addition = price + (int)discountPrice;
        int subtraction = price - (int)discountPrice;
        int multiplication = price * (int)discountPrice;
        int division = price / (int)discountPrice;

        System.out.println("Addition ; " + addition);
        System.out.println("Subtraction ; " + subtraction);
        System.out.println("Multiplication ; " + multiplication);
        System.out.println("Division ; " + division);

        











    }
}
