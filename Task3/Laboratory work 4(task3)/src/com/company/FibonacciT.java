//Автор: Удинська Наталія

package com.company;

    public class FibonacciT {
        public static void main(String[] args) {
            int position = 6;
            long value = 0;

            Fibonacci fibonacci = new Fibonacci();
            for (int i = -9; i < 9; i++) {
                value = fibonacci.getNumber(i);
                System.out.println("fibonacci position " + i + " is " + value);
            }
        }
    }