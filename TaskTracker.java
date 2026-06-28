/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package tasktracker;

public class TaskTracker {

    public static void main(String[] args) {
        DatabaseConnection.getConnection();
        java.awt.EventQueue.invokeLater(() -> new TaskFrame().setVisible(true));
    }
}