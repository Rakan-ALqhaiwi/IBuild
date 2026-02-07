/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */
package com.mycompany.stock;


public class TestStock {

    public static void main(String[] args) {
        Stock s = new Stock("ORCL", "Oracle Corporation");

        s.setPreviousClosingPrice(34.5);
        s.setCurrentPrice(34.35);

        System.out.println("Stock Symbol: " + s.getSymbol());
        System.out.println("Stock Name: " + s.getName());
        System.out.println("Previous Closing Price: " + s.getPreviousClosingPrice());
        System.out.println("Current Price: " + s.getCurrentPrice());
        System.out.println("Price Change Percentage: " + s.getChangePercent() + "%");

    }
}
