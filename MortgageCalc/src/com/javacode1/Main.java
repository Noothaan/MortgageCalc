package com.javacode1;


import java.util.Scanner;

        public class Main {

            public static void main(String[] args) {

                Scanner scan = new Scanner(System.in);


                Double principle = 0.0;
                Double rate = 0.0;
                Double time = 0.0;
                Double payment = 0.0;

                // input
                System.out.print("Enter Principal Amount: ");
                principle = scan.nextDouble();
                System.out.print("Enter Interest Rate: ");
                rate = scan.nextDouble();
                System.out.print("Enter Time (in years): ");
                time = scan.nextDouble();

                // monthly payment
                payment = calculator(principle, rate, time);

                // show result
                System.out.println("Monthly Payment = " + payment);


                scan.close();

            }


            public static double calculator(double principle, double rate,
                                            double time) {

                rate = (rate/100)/12;


                time = time * 12;


                double payment = principle * (  (rate * Math.pow(1+rate, time))
                        / (Math.pow(1+rate, time) - 1) );
                return payment;
            }

        }

