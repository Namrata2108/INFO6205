package edu.neu.coe.info6205;

import edu.neu.coe.info6205.sort.Helper;
import edu.neu.coe.info6205.sort.HelperFactory;
import edu.neu.coe.info6205.sort.elementary.InsertionSort;
import edu.neu.coe.info6205.util.Config;
import edu.neu.coe.info6205.util.Timer;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Random;

public class Assignment2
{
    private static Object ConfigTest;

    public static void main(String[] args)
    {

        InsertionSort sorter = new InsertionSort();
        //reverse sorted
        final List<Integer> list = new ArrayList<>();
        list.add(7);
        list.add(6);
        list.add(3);
        list.add(2);
        Integer[] xs = list.toArray(new Integer[0]);
        Timer timer = new Timer();
        timer.stop();
        timer.resume();
        final double mean = timer.repeat(100, () -> {
            sorter.sort(xs,0,list.size());
            return null;
        });
        System.out.println(mean);
        //random
        final List<Integer> list3 = new ArrayList<>();
        list3.add(2);
        list3.add(6);
        list3.add(7);
        list3.add(3);
        Integer[] xs3 = list3.toArray(new Integer[0]);
        Timer timer3 = new Timer();
        final double mean3 = timer3.repeat(100, () -> {
            sorter.sort(xs3,0,list3.size());
            return null;
        });
        System.out.println(mean3);
        //partially sorted
        final List<Integer> list2 = new ArrayList<>();
        list2.add(2);
        list2.add(3);
        list2.add(7);
        list2.add(6);
        Integer[] xs2 = list2.toArray(new Integer[0]);
        Timer timer2 = new Timer();
        final double mean2 = timer2.repeat(100, () -> {
            sorter.sort(xs2,0,list2.size());
            return null;
        });
        System.out.println(mean2);
        //sorted array
        final List<Integer> list1 = new ArrayList<>();
        list1.add(2);
        list1.add(3);
        list1.add(6);
        list1.add(7);
        Integer[] xs1 = list1.toArray(new Integer[0]);
        Timer timer1 = new Timer();
        final double mean1 = timer1.repeat(100, () -> {
            sorter.sort(xs1,0,list1.size());
            return null;
        });
        System.out.println(mean1);
        //array with different sizes
        int k=1;
        for(int j=1;j<6;j++)
        {
            Random rd = new Random(); // creating Random object
            int max=7000;
            int min=0;
            final Integer[] tr = new Integer[j*2*k];
            for (int i = 0; i < tr.length; i++)
            {
                int randomNum = rd.nextInt((max - min) + 1) + min;
                tr[i] = randomNum; // storing random integers in an array
                //System.out.println(tr[i]); // printing each array element
            }
            List <Integer> pr = Arrays.asList(tr);
            Timer timer4 = new Timer();
            final double mean4 = timer4.repeat(100, () -> {
                sorter.sort(tr,0,pr.size());
                return null;
            });
            System.out.println(mean4);
        }
    }
}
