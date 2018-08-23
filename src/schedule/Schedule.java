/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package schedule;

/**
 *
 * @author 19085
 */
public class Schedule {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        String firstName = "Rodolfo";
        String lastName = "De Armas";
        int year = 2019;
        System.out.println("My name is " +firstName + " " + lastName + " and i'll graduate in " +year);
        
        String periodOne = "AP Calculus BC";
        String periodTwo = "AP Computer Science A";
        String periodThree = "AP English Literature";
        String periodFour = "AP Microeconomics";
        String periodFive = "AP Physics";
        String periodSix = "AP US Government"; 
        String periodSeven = "Hon Social Justice";
        String teacherOne = "Mr. Ortega";
        String teacherTwo = "Mr. Larrubia";
        String teacherThree = "Mr. Panzer";
        String teacherFour = "Mr. Ciocca";
        String teacherFive = "Mr. Sanchez";
        String teacherSix = "Ms. McCullagh";
        String teacherSeven = "Mr. Davis";
        
        System.out.println("+--------------------------------------------------+");
        System.out.println("| 1 |               " + periodOne + " | " + teacherOne + "    | ");
        System.out.println("| 2 |      " + periodTwo + "   | " + teacherTwo + "  | ");
        System.out.println("| 3 |        " + periodThree + " | " + teacherThree + "    | ");
        System.out.println("| 4 |            " + periodFour + " | " + teacherFour + "    | ");
        System.out.println("| 5 |                  " + periodFive + "  | " + teacherFive + "   | ");
        System.out.println("| 6 |            " + periodSix + "  | " + teacherSix + " | ");
        System.out.println("| 7 |           " + periodSeven + " | " +teacherSeven + "     | ");
        System.out.println("+--------------------------------------------------+");
    }
    
}
