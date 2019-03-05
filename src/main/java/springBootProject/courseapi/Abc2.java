package springBootProject.courseapi;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.Scanner;

public class Abc2 {

    /*
    Given 2 arrays of ints, a and b, return true if
    they have the same first element or they have the same last element.

    Both arrays will be length 1 or more.


commonEnd([1, 2, 3], [7, 3]) → true
commonEnd([1, 2, 3], [7, 3, 2]) → false
commonEnd([1, 2, 3], [1, 3]) → true


     */

    public List<Integer> doubling(List<Integer> nums) {
        nums.replaceAll(n -> n * 2);
        return nums;
    }

    public List<Integer> doubling2(List<Integer> nums) {
        for (Integer o: nums){
            o = o*2;
        }

        return nums;
    }




    public static void main(String[] args) {

        Abc2 abc2 = new Abc2();
        List list = new ArrayList();
        list.add(2);
        list.add(3);
        list.add(4);
        System.out.println(abc2.doubling(list));
        System.out.println(abc2.doubling2(list));

        System.out.println();

    }
}
