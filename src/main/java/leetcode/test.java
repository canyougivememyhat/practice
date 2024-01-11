package leetcode;

import java.util.*;

public class test {

    public static void main(String[] args) {
        test t = new test();

        int[][] nums = {{0,1,0,0},{1,1,1,0},{0,1,0,0},{1,1,0,0}};

        System.out.println(t.findComplement(2147483647));
        //2147483647
    }

    public int findComplement(int num) {
        int bits = 0;
        int temp = num;
        while(temp != 0){
            bits++;
            temp /= 2;
        }
        if(bits == 31){
            temp = Integer.MAX_VALUE;
        }else {
            temp = (int)Math.pow(2, bits)-1;
        }
        return num ^ temp;
    }

}




















