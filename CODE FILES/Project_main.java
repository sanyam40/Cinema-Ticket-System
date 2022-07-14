import moviesystem.moivecatalog.*;
import moviesystem.seatarragment.*;
import moviesystem.userinfo.*;
import java.util.*;
public class Project_main {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
    Movie_Catalog M1=new Movie_Catalog();
    Seat_Arragment s1=new Seat_Arragment();
    M1.intro();
    User_info U1=new User_info();
    boolean input_01=U1.input();
        if (!input_01) {
            System.out.println("ENTER THE CORRECT DETAILS : ");
            U1.input();
        }
        M1.Menu01_display();
        M1.Menu02_input();
        s1.seats();
    }
}
