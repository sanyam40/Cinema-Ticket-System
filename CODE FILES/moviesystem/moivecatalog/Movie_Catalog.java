package moviesystem.moivecatalog;

import moviesystem.seatarragment.Seat_Arragment;

import java.io.*;
import java.util.*;

public class Movie_Catalog{
    int input01;
    public void intro(){
        System.out.println("WELCOME TO CINEMA BOOKING SYSTEM  ");
        System.out.println("__________________________________");
        System.out.println("#       MOVIE PLUS               #");
        System.out.println("__________________________________");
        System.out.println("ENTER THE FOLLOWING DETAILS : ");
    }
    public void Menu01_display(){
        System.out.println("__________________________________");
        System.out.println("1.HINDI"+"\n"+"2.PUNJABI"+"\n"+"3.ENGLISH");
        System.out.println("                                         ");
        Menu02_display();
    }
    public int Menu02_display(){
        Scanner sc=new Scanner(System.in);
        System.out.print("CHOOSE THE CATEGORY FOR DIFFERENT MOVIES : ");
        input01 = sc.nextInt();
        if(input01 == 1){
            try {
                File myObj = new File("HINDIMOVIE.txt");
                Scanner myReader = new Scanner(myObj);
                while (myReader.hasNextLine()) {
                    String data = myReader.nextLine();
                    System.out.println(data);
                }
                myReader.close();
            } catch (FileNotFoundException e) {
                System.out.println("An error occurred.");
                e.printStackTrace();
            }
        }
        else if(input01==2){
            try {
                File myObj = new File("PUNJABIMOVIE.txt");
                Scanner myReader = new Scanner(myObj);
                while (myReader.hasNextLine()) {
                    String data = myReader.nextLine();
                    System.out.println(data);
                }
                myReader.close();
            } catch (FileNotFoundException e) {
                System.out.println("An error occurred.");
                e.printStackTrace();
            }
        }
        else if(input01==3){
            try {
                File myObj = new File("ENGLISHMOVIE.txt");
                Scanner myReader = new Scanner(myObj);
                while (myReader.hasNextLine()) {
                    String data = myReader.nextLine();
                    System.out.println(data);
                }
                myReader.close();
            } catch (FileNotFoundException e) {
                System.out.println("An error occurred.");
                e.printStackTrace();
            }
        }
        else{
            System.out.println("INCORRECT INPUT ! PLS ENTER THE CORRECT ONE ");
            Menu02_display();
        }
        return input01;

    }
    public void Menu02_input(){
        Scanner sc=new Scanner(System.in);
        System.out.print("ENTER THE CHOICE FOR ABOVE MOVIES : ");
        int input02=sc.nextInt();
        Seat_Arragment s1=new Seat_Arragment();
        s1.SEAT_DISPLAY(input01,input02);
    }
}
