package insurancecategory;

import javax.swing.JOptionPane;

public class InsuranceCategory {

    public static void main(String[] args) {
        String gender,
               age;
        
    gender = JOptionPane.showInputDialog("Please Enter Gender [Male = 1 / Female = 0]"); //Allows a user to enter their desired gender
    age = JOptionPane.showInputDialog("Please Enter Age"); //Allows a user to enter their desired age
    
    int gender1 = Integer.parseInt(gender); //Convert the numbers from type string to type integer
    int age1 = Integer.parseInt(age); //Convert the numbers from type string to type integer
    char category = 0;
    
        if (age1<18){        
        JOptionPane.showMessageDialog(null, "Age Required To Be 18 At Minimum", "Error", JOptionPane.ERROR_MESSAGE); //Displays an error message if the age entered is less than 18
        }
        
        else if (gender1>1 || gender1<0) {
        JOptionPane.showMessageDialog(null, "Please Enter The Number 1 or 2", "Error", JOptionPane.ERROR_MESSAGE); //Displays an error message if the value entered is other than 1 or 2
        }
        
        else if ((age1<=26) && (gender1==1 || gender1==0)) { //Calculations - Statements are executed depending on whether they are true or false
        category='A';
        }

        else if ((age1<=60) && (gender1==0)) {
        category='B';
        }

        else if ((age1<=60) && (gender1==1)) {
        category='C';
        }

        else if (age1>=60) {
        category='D';  
        }
        
        if (category!=0) {
        JOptionPane.showMessageDialog(null, "Your Insurance Category Is: " + category, "Category", JOptionPane.PLAIN_MESSAGE); //Displays results of the calculations above
        }
        
    System.exit(0); //Terminates the program

    }
    
}
