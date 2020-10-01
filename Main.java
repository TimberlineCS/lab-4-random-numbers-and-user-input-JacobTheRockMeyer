import java.io.*;
import java.util.*;
public class Main{
public static void main(String args[]){
Scanner ape = new Scanner(System.in);
System.out.println("How many chimpanzees are there?");
int monkeynum = ape.nextInt();
System.out.println("What fraction of chimpanzees are eating bananas? Express as a decimal that is less than one");
double banananum = ape.nextDouble();
System.out.println("Provide a name for the first chimpanzee");
String name1 = ape.next();

System.out.println("Provide a name for the second chimpanzee");
String name2 = ape.next();

System.out.println("Provide a name for the third chimpanzee");
String name3 = ape.next();

int fallenapes = monkeynum - 3;

double eaters = monkeynum * banananum;

System.out.println("While walking through the zoo you meet ");
System.out.print(monkeynum);
System.out.print(" Chimpanzees, ");
System.out.print(eaters);
System.out.print(" of which were eating bannanas, sadly ");
System.out.print(fallenapes);
System.out.println(" fell out of the tree leaving 3 left who were named: ");
System.out.println(name1);
System.out.println(name2);
System.out.println("and");
System.out.println(name3);


}
}