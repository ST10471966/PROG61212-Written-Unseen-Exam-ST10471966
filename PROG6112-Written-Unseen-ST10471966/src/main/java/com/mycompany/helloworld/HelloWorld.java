/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.helloworld;

import java.util.Random;
import java.util.Scanner;
import javax.swing.JOptionPane;

public class HelloWorld {

    public static void main(String[] args) {
        System.out.println("Hello World");
        
        //Date: 23/02/2025
        
        //Value Replacing Exercise
            //Don't write numbers!
            //Don't change the existing lines, only include new ones!
            //int first = 7;
            //int second = 19;
            //System.out.println("First=" + first + " Second=" + second);
            
         //Glass Exercise
            //int first = 7;
            //int second = 19;
            //int third;
            //third = second;
            //second = first;
            //first = third;
         
            //System.out.println("First=" + first + " Second=" + second);
            
          //Temperature Exercise
            //Write a program that reads in an integer value denoting a temperature value in Celcius grade
            //Calculate and print the Fahrenheit Grade
            //Farenheit= 9/5 C + 32
            //What do we NOT know?
                //How to read in a number
                //How to make calculations
            //System.out.println("Give in the Celsuis Value:");    
            //Scanner sc = new Scanner(System.in); //Read or Scan a number
            //double celsuis = sc.nextDouble();
            //double fahrenheit = 9.0/5.0* celsuis + 32.0;
            //System.out.println("Fahrenheit= " +fahrenheit);
            
            //Boiling Exercise
                //Write a program that reads in a temperature value(In Celsuis)- 
                //and prints out if the water is boiling at the specified temperature
                //what do we not NOT know?
                    //how to run a part of code based on a condition
                //System.out.println("Give in the temperarure:");
                //Scanner sc = new Scanner(System.in); //Read or Scan
                //int temp = sc.nextInt();
                //if (temp >= 100){ //How ro run part of code based on a condition
                    //System.out.println("The water is boiling.");
                //}
                //else {
                    //System.out.println("The water is not boiling.");
                //}
            
            //Boiling Exercise with 3 options
                //Write a program that reads temperature values(in Celcuis) and-
                //prints out wether thewater is BOILING or FREEZING or NORMAL -
                //At the specified temperature
                //What do we NOT know? 
                    //Joining If's (Copy the "Boiling Exercise" and more if statements
                    
                //System.out.println("Give in the temperarure:");
                //Scanner sc = new Scanner(System.in); //Read or Scan
                //int temp = sc.nextInt();
                //if (temp >= 100){ 
                    //System.out.println("The water is boiling.");
                //}
                //else { //How to Jjoin if statements
                    //if (temp <= 0){ 
                        //System.out.println("The water is freezing.");
                    //}
                    //else { 
                       // System.out.println("The water is in a normal state");
                   // } 
                //} 
                
                //ALternative Method(3 If statements/branches)
                //if (temp >= 100){ //first if statement/branch
                    //System.out.println("The water is boiling.");
                //}
                //if { //second if statement/branch
                //if (temp <= 0){ 
                        //System.out.println("The water is freezing.");
                    //}
                //if  (0 < temp && temp > 100){ //third statement/branch   
                       // System.out.println("The water is in a normal state");
                   // } 
                //} 
            
            // "&&" = True, if BOTH conditions are true(AND)
            // "||" = True if either conditions are true(OR)
            // "!" = Negate: makes true out of the false and false out of the true(NOT)
            
            //Fighting exercise
                //Summary of everything learnt today
                //Write a program with which you can simulate one round of a fight-
                //between you and a monster
                //FIrst we read in the attributes of each of you
                //Then we will play 1 round of the fight
                    //Fighting rules
                    //Attributes:
                    //Attack Points(AP)
                    //Defense Points(DP)
                    //Damage(D)
                    //Life Points(LP)
                //Fight(One Round):
                    //Attacker is chose randomly(Coin toss)
                    //Attack Points +2 Dice ? ENemy's Defense Points
                        //>: Attack hits defender, so life points decreased by damage
                        //<=: Miss
                //What we do NOT know
                    //How to generate random numbers
                    
                Scanner sc = new Scanner(System.in);
                System.out.println("Attack Points of Monster:");
                int monsterAP = sc.nextInt();
                System.out.println("Defense Points of Monster:");
                int monsterDP = sc.nextInt();
                System.out.println("Damage of Monster:");
                int monsterD = sc.nextInt();
                System.out.println("Life Points of Monster:");
                int monsterLP = sc.nextInt();
                
                System.out.println("Player Attack Points:");
                int playerAP = sc.nextInt();
                System.out.println("Player Defense Points");
                int playerDP = sc.nextInt();
                System.out.println("Player Damage:");
                int playerD = sc.nextInt();
                System.out.println("Player Life Points");
                int playerLP =sc.nextInt();
                
                int rounds = 2;
                while (rounds < 3) {
                Random generator = new Random(); //Random number generator
                boolean attacker = generator.nextBoolean();
                if (attacker){
                    System.out.println("You will atack");
                    int dice = generator.nextInt(6) + 1 + generator.nextInt(6)+1;
                    int attackValue = playerAP + dice;
                    System.out.println("Rolled: " + dice);
                    System.out.println("Your Attack: " + attackValue);
                    if (attackValue > monsterD){
                        System.out.println("Your attack was successful.");
                        monsterLP = monsterLP - playerD;
                        System.out.println("Monster's Life Point: " + monsterLP);
                    } else {
                        System.out.println("Your Attack was unsuccessful.");
                    }
                } else { 
                    System.out.println("Monster Attacks.");
                    int dice = generator.nextInt(6) + 1 + generator.nextInt(6)+1;
                    int attackValue = playerAP + dice;
                    System.out.println("Rolled: " + dice);
                    System.out.println("Monster's Attack: " + attackValue);
                     if (attackValue > playerD){
                        System.out.println("The monster's attack was successful.");
                        playerLP = playerLP - monsterD;
                        System.out.println("Player Life Point: " + playerLP);   
                } else {
                         System.out.println("The monster's attack was unsucceful.");
                     }
                }
                rounds++; 
                }
    }
}
