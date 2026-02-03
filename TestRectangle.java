/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.rectangle;

/**
 *
 * @author USER
 */
public class TestRectangle {

    public static void main(String[] args) {
        System.out.println("--------------------------------------------");
        System.out.println("-------------------E1-----------------------");

        System.out.println("--------------------------------------------");
        Rectangle e1 = new Rectangle(4, 40);
        System.out.println("Width = " + e1.getWidth() + "\n" + "Height = " + e1.getHeight() + "\n" + "Area = " + e1.getArea() + "\n" + "Perimeter = " + e1.getPerimeter());
        System.out.println("--------------------------------------------");
        System.out.println("-------------------E2-----------------------");
        System.out.println("--------------------------------------------");

        Rectangle e2 = new Rectangle(3.5, 35.9);
        System.out.println("Width = " + e2.getWidth() + "\n" + "Height = " + e2.getHeight() + "\n" + "Area = " + e2.getArea() + "\n" + "Perimeter = " + e2.getPerimeter());

    }
}
