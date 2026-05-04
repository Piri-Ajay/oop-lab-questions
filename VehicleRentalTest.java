/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Question02;

/**
 *
 * @author HP
 */
public class VehicleRentalTest {

    public static void main(String[] args) {

        Vehicle vehicle1 = new Car("CAR123", "Toyota", 3, 5000);
        Vehicle vehicle2 = new Bike("BIKE456", "Yamaha", 10, 200);

        System.out.println("---- Car Details ----");
        vehicle1.displayVehicleInfo();
        System.out.println("Rental Cost: " + vehicle1.calculateRentalCost());

        System.out.println("\n---- Bike Details ----");
        vehicle2.displayVehicleInfo();
        System.out.println("Rental Cost: " + vehicle2.calculateRentalCost());

        // runtime polymorphism because method depends on actual object type
    }
}