/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package q1ch3p1;

import java.util.Collections;
import java.util.LinkedList;
import java.util.List;
import java.util.Random;

/**
 *
 * @author rant
 */
public class Q1ch3p1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int sum = 0;
        float avg = 0;
        Random r = new Random();

        List<Integer> randomList = new LinkedList<>();
        for (int i = 0; i < 30; i++) {
            randomList.add(r.nextInt(100)+1);
        }
        System.out.println("Linked list before sorting:: \n " + randomList + "\n******************");
        Collections.sort(randomList);
        System.out.println("Linked list After sorting:: \n " + randomList + "\n******************");

        for (int i = 0; i < randomList.size(); i++) {
            sum += randomList.get(i);
        }
        System.out.println("The sum of elements of linked list :: " + sum + "\n****************");

        avg = ((float) sum) / randomList.size();
        System.out.println("The floating-point average of the elements :: " + avg);

    }
    
}
