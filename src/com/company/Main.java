package com.company;
import java.util.Collections;
import java.util.Scanner;
import java.util.ArrayList;
import java.util.Random;
public class Main {

    public static void main(String[] args) {
	    Scanner k = new Scanner(System.in);
        ArrayList<String> movies = new ArrayList<String>();
        Random r = new Random();
        boolean repeat;
	    do{
            System.out.print("Enter a movie: ");
            movies.add(k.nextLine());
            System.out.print("Do you want to enter a new movie(press q to quit)?");
            String a = k.nextLine();
            repeat = !a.equalsIgnoreCase("q");
        } while(repeat);
	    /*for (int i = 0; i < movies.size(); i++){
	        if(movies.size()>1) {
                System.out.print(movies.get(i) + ", ");
            }
	        else {
                System.out.print(movies.get(i));
            }
        }*/
        //Collections.sort(movies);
        movies.sort(String::compareToIgnoreCase);
        System.out.println(movies);
        System.out.println("You should watch " + movies.get(r.nextInt(movies.size())));
    }
}
