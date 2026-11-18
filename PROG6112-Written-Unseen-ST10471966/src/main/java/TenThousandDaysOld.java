/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */

import java.time.LocalDate;
import javax.swing.JOptionPane;
public class TenThousandDaysOld {

    public static void main(String[] args) {
        JOptionPane.showMessageDialog(null,
                "We want to see how old you would be if we added 10000 days"
                        + " to your birthday");
        String birthday = JOptionPane.showInputDialog(
                "Enter your birthday:(YYYY-MM-DD) ");
        LocalDate dateMyBirth = LocalDate.parse(birthday);
        
        JOptionPane.showMessageDialog(null,
                "You are " + dateMyBirth.toEpochDay() + " days old");
        JOptionPane.showMessageDialog(null,
                "You would be " + (dateMyBirth.toEpochDay() + 10000) + " days old");
        
    }
    
}
