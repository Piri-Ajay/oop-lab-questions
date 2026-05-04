/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Question01;

/**
 *
 * @author HP
 */
public class DeliveryChargeTest {

    public static void main(String[] args) {

        DeliveryChargeCalculator calc = new DeliveryChargeCalculator();

        System.out.println("Base Charge: " + calc.calculateCharge(1000));

        System.out.println("With Distance: " + calc.calculateCharge(1000, 5));

        System.out.println("With Distance & Weight: " + calc.calculateCharge(1000, 5, 2));

        System.out.println("With Express: " + calc.calculateCharge(1000, true));

        // compile-time polymorphism because method is selected at compile time based on parameters
    }
}