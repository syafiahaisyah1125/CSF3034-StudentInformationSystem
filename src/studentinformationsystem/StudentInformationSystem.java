/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package studentinformationsystem;

public class StudentInformationSystem {

    public static void main(String[] args) {
        String studentName = "Aisyah Syafiah";
        String studentId = "S84809";
       
        double mark1 = 42.5;
        double mark2 = 45.0;
        double totalMark = mark1 + mark2;
        
        System.out.println("Name: "+ studentName);
        System.out.println("Student ID: "+ studentId);
        System.out.println("Mark 1: " + mark1);
        System.out.println("Mark 2: " + mark2);
        System.out.println("Total Mark: " + totalMark);
         
        if (totalMark >= 80){
            System.out.println("Result: Excellent");
        } else if (totalMark >= 50){
            System.out.println("Result: Good");
        } else{
            System.out.println("Result: Needs Improvement");
        }   
            

        }
        
      

    }
    
}
