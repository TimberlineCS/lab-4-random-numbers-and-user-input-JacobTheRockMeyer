import java.io.*;
import java.util.*;
public class chimps{
public static void main(String args[]){
Scanner integarscan = new Scanner(System.in);
System.out.println("provide a negative integar");
int negative = integarscan.nextInt();
System.out.println("Provide a second integar that is greater than "+ Math.abs(negative));
int positive = integarscan.nextInt();
 
int ran1 = (int)(Math.random()*(positive - negative) + negative);
int ran2 = (int)(Math.random()*(positive - negative) + negative);
 
System.out.println("You have generated " + ran1 + " and a " + ran2);

}
}
