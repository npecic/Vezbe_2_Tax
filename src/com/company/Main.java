package com.company;

public class Main {

    public static void main(String[] args) {

        Wine wine = new Wine("Grabak", "14124563295" , 567.53, 0.7 );
        Chocolate chocolate = new Chocolate("Milka", "1441414144", 325.25, 0.3);

        System.out.println(wine);
        System.out.println(chocolate);

        System.out.println(chocolate.calculatePriceWithTax());
        System.out.println(wine.calculatePriceWithTax());
    }
}
