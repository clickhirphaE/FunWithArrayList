
//import java.util.ArrayList;
//import java.util.Arrays;
import java.util.*;

public class Array_ListHoldingColors {
    public static void main(String args[]) {
        String tt = "", zz = "A";
        //Question:[1]   create a new array list to hold colors
        // This is arraylist initialization in one Line
        Scanner ff = new Scanner(System.in);
        ArrayList<String> colors = new ArrayList<>();//(Arrays.asList("Red","green","blue","yellow"));

        //Question:[2]   Adding Element at the specified Index
        colors.add("red");
        colors.add("green");
        colors.add("yellow");
        System.out.println(colors);
        System.out.println("---------------------");
        //Question:[3] Using the array list created above, print out the value at index 1.
        System.out.println("Printing out the value at Index 1:" + colors.get(1));
        System.out.println("----------------------");
        //Question:[4] Using the array list above, prompt the user for one new color,
        // and add that color to the array list.
        System.out.println("Please Enter only (1) color you want:");
        for (int x = 0; x < 1; x++) {
            tt = ff.nextLine();
        }
        colors.add(tt);

        //Question 5: Using the array list, continue prompting the user for
        // colors until they type in "Q" or "q" to quit.
        // Each time the user enters a color, add that to the array list. Print out the list at the end.
        System.out.println("Enter As Many color as u want & type in (Q)or(q) to quit:");
        while (!zz.equalsIgnoreCase("Q")) {
            zz = ff.nextLine();
            if (!zz.equalsIgnoreCase("Q")) {
                colors.add(zz);
            }}
            System.out.println("The colors:" + colors);

    }}
