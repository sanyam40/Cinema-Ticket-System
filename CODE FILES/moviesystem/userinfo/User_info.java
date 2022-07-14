package moviesystem.userinfo;

import java.io.*;
import java.util.Objects;
import java.util.Scanner;

public class User_info{
    Scanner sc=new Scanner(System.in);
    public String userid;
    public String password;
    public User_info(){
        this.userid=userid;
        this.password=password;
    }
    public boolean input(){
        boolean input_01=true;
        System.out.print("1.USERID : ");
        this.userid=sc.nextLine();
        System.out.print("2.PASSWORD : ");
        this.password=sc.nextLine();
        //MATCHING ID PASS FROM A TEXT FILE
        try (BufferedReader buffer = new BufferedReader(new FileReader("USERDETAILS.txt"))) {
            String firstLine = buffer.readLine();
            int n = 2;
            String secondline;
            try (BufferedReader br = new BufferedReader(new FileReader("USERDETAILS.txt"))) {
                for (int i = 1; i < 2; i++)
                    br.readLine();
                secondline = br.readLine();
            }
            if(Objects.equals(firstLine, this.userid )&& Objects.equals(secondline,this.password)){
                System.out.println("       LOGIN SUCCESSFULLY :)");
                input_01=true;
            }
            else {
                System.out.println("INCORRECT DETAILS");
                input_01=false;
            }

        } catch (IOException ex) {
            System.out.println("ERROR !");
        }
        return input_01;


    }
}
