package com.company;

public class Main {

    public static void main(String[] args) {
        double[] numbers ={1.1, 2.2, -3.3, 5, 10, 5, 5, 2};
        boolean negativeNumber = false;
        int count = 0;
        double result = 0;

        for (double number: numbers ) {
            if (number < 0){
                negativeNumber = true;
            }
            if (negativeNumber){
                if (number > 0){
                    result = result + number;
                    count++;

                }
            }
        }
        System.out.println(result/count);
    }
}
