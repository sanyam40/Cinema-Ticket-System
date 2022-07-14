package moviesystem.seatarragment;
import moviesystem.moivecatalog.Movie_Catalog;
import moviesystem.seatbooking.Seat_Booking;

import java.util.Scanner;
import java.lang.*;
public class Seat_Arragment {
    Movie_Catalog m1=new Movie_Catalog();
    int [][] num = {
            {1, 2, 3, 4, 5},
            {6, 7, 8, 9, 10},
            {11, 12, 13, 14, 15}
    };
    public void SEAT_DISPLAY(int input01, int input02) {
        Scanner sc = new Scanner(System.in);
        if (input01 == 1 && input02 == 1) {
            System.out.println("Please have a look at the seating plan FOR YEH JAWANI HAI DEEWANI ");
        }
        else if (input01 == 1 && input02 == 2) {
            System.out.println("Please have a look at the seating plan FOR ZINDAGI NA MILEGI DOBARA ");

        }
        else if (input01 == 1 && input02 == 3) {
            System.out.println("Please have a look at the seating plan FOR LOVE AAJ KAL ");

        }
        else if (input01 == 2 && input02 == 1) {
            System.out.println("Please have a look at the seating plan FOR NIKAA JALDAAR ");
        }
        else if (input01 == 2 && input02 == 2) {
            System.out.println("Please have a look at the seating plan FOR QISMAT ");

        }
        else if (input01 == 2 && input02 == 3) {
            System.out.println("Please have a look at the seating plan FOR SUFNA ");
        }
        else if (input01 == 3 && input02 == 1) {
            System.out.println("Please have a look at the seating plan FOR NOTEBOOK ");
        }
        else if (input01 == 3 && input02 == 2) {
            System.out.println("Please have a look at the seating plan FOR JURRASIC WORLD ");
        }
        else if (input01 == 3 && input02 == 3) {
            System.out.println("Please have a look at the seating plan FOR SPIDERMAN-NO WAY HOME ");
        }
        else{
            System.out.println("INCORRECT INPUT ! PLS ENTER THE CORRECT ONE");
            m1.Menu02_display();
        }
    }
    public void seats() {
        System.out.println("------------------------------");
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 5; j++) {
                System.out.print(num[i][j] + " ");
            }
            System.out.println();
        }
        System.out.println("------------------------------");
        seat_input();
    }
    public void seat_input(){
        System.out.println("ENTER THE SEAT YOU WANT TO BOOK : ");
        Scanner sc=new Scanner(System.in);
        int input03=sc.nextInt();
        Seat_Booking s1=new Seat_Booking();
        s1.booking(input03,num);

    }



}




