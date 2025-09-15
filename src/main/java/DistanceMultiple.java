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
        Scanner sc = new Scanner(System.in);
        System.out.println("How many runs?:  ");
        int runs = sc.nextInt();
        sc.nextLine();
        while (runs-- > 0) {
            //Gets the coordinates
            System.out.println("Enter first coordinate:  ");
            String fcoord = sc.nextLine();
            System.out.println("Enter second coordinate:  ");
            String scoord = sc.nextLine();


            //Splits the string into an array
            String[] coords = fcoord.substring(1, fcoord.length()-1).split(",");
            String[] scoords = scoord.substring(1, scoord.length()-1).split(",");


            //Gets the separate x values
            int x1 = Integer.parseInt(coords[0].trim());
            int y1 = Integer.parseInt(coords[1].trim());
            int x2 = Integer.parseInt(scoords[0].trim());
            int y2 = Integer.parseInt(scoords[1].trim());


            //Calculate and print
            System.out.println(x1 + " " + y1 + " " + x2 + " " + y2);
            System.out.println(Math.sqrt(Math.pow(x2-x1, 2) - Math.pow(y2-y1, 2)));
        }
    }
}
