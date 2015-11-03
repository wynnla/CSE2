//Winston La
//lab10
//will create an array of strings named tudent of a random size.
//ask user to fill up array useing scanner
//Create a second midterm array of the same size
//fill in the array midterm with midterm randomized integers in range 0 to 100
//print out members of array

import java.util.Scanner;
public class Arrays{
    //declare arrays
    public static void main(String[] args){
    Scanner input = new Scanner(System.in);
    int Studentnum = (int)(Math.random()*5)+5;
    String students[];
    students = new String[Studentnum];
    int midterm[];
    midterm = new int[Studentnum];
    //for loop to fill in arrays
    for(int i = 0; i < Studentnum; i++){
        System.out.print("Enter the name of the student: ");
        students[i] = input.next();
        midterm[i] = (int)(Math.random()*100);
    }
    for (int j = 0; j < Studentnum; j++){
        System.out.println(students[j]+ " :   "+ midterm[j]);
    }
    } //end of main
}