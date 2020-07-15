/* Diane Lansinger
 * CS 211 Summer 2020
 * IC 01A
 * Main code provided by Prof. James Livingston
 * Method intersect added by Diane Lansinger
 * 07-08-20
 * 
 * Exercise from Chapter 10 slide 28:
 * We start with a working client that will test the method's operation.
 * Task:
 * Write a method, intersect, that accepts two sorted array lists of integers
 * as parameters and returns a new list that contains only the elements that
 * are found in both lists.
*/
import java.util.*;

public class ListExercise {
    public static void main (String[] args) {
        List<Integer> list1 = Arrays.asList(1, 4, 8, 9, 11, 15, 17, 28, 41, 59);
        List<Integer> list2 = Arrays.asList(4, 7, 11, 17, 19, 20, 23, 28, 37, 59, 81);
        System.out.println("list1: " + list1);
        System.out.println("list2: " + list2);
        System.out.println("intersect(list1, list2): " + intersect(list1, list2));            
    }

    public static ArrayList intersect(List<Integer> list1, List<Integer> list2){
        ArrayList<Integer> list3 = new ArrayList<Integer>();
        for (int i = 0; i < list2.size(); i++){
            int num = list2.get(i);
            if (list1.contains(num)){
                list3.add(num); //add element from list1 at i to list3                
            }
        } 
        return list3;    
    }
}

