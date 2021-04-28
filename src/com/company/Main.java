package com.company;

public class Main {

    public static void main(String[] args) {
	int n = 1500000;
	Solution s = new Solution();
	System.out.println(s.countPrimes(n));
    }
}

class Solution {
    public int countPrimes(int n) {
        int count = 0;
        boolean primary = true;
        for(int i = 2;i<n;i++){
            primary = true;
            for(int j = 2;j<=Math.sqrt(i);j++)
            {
                if(i%j==0)
                {
                    primary = false;
                    break;
                }
            }
            if(primary)
            {
                count++;
            }
        }
        return count;
    }
}
