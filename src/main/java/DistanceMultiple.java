// NAME                 : Adam Sagin
// GROUP                : APCS-A
// LAST MODIFIED        : 9/9/25
// PROBLEM ID           : 2.8
// PROBLEM DESCRIPTION  : An application that prompts for (x, y) coordinates
//                      : and calculates and prints the distance
// SOURCES I USED       : Java Software Solutions for AP Computer Science
// PEOPLE I HELPED      :
//PEOPLE WHO HELPED ME  :


import java.util.Scanner;


public class DistanceMultiple {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in).useDelimiter("[(),\\s]+");

        System.out.println("How many runs?:  ");
        int runs = sc.nextInt();
        System.out.println(runs);
        //sc.nextLine();
        while (runs-- > 0) {

            System.out.println("Enter Coordinates");
            int x1 = sc.nextInt();
            int y1 = sc.nextInt();
            int x2 = sc.nextInt();
            int y2 = sc.nextInt();

            //Calculate and print
            System.out.println(Math.sqrt(Math.pow(x2-x1, 2) - Math.pow(y2-y1, 2)));
        }
    }
}
