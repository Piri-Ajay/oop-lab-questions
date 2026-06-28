/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author HP
 */
package tasktracker;

import java.sql.Connection;
import java.sql.PreparedStatement;
import javax.swing.JOptionPane;

public class TaskDAO {

    Connection con;

    public TaskDAO() {
        con = DatabaseConnection.getConnection();
    }

    public void addTask(Task task) {

        try {

            String sql = "INSERT INTO tasks VALUES (?, ?, ?)";

            PreparedStatement pst = con.prepareStatement(sql);

            pst.setInt(1, task.getTaskId());
            pst.setString(2, task.getTaskTitle());
            pst.setString(3, task.getStatus());

            pst.executeUpdate();

            JOptionPane.showMessageDialog(null, "Task Added Successfully");

        } catch (Exception e) {

            JOptionPane.showMessageDialog(null, e.getMessage());
        }
    }
}