package _03_More_Algorithms;

import java.util.List;

/*
 * Write your methods in this class
 */
public class Algorithms {
    
    public static String multiply(int num1, int num2) {
       int num3=num1*num2;
        return num1+" x "+num2+ " = "+num3;
    }
    
    public static int findBrokenEgg(List<String> eggs) {
        for(int i=0; i< eggs.size(); i++) {
        	if(eggs.get(i).equals("cracked")) {
        		return i;
        	}
        }
        return 0;
    }
    public static String sortWords(List<String> words) {
    	
    }
    
    public static boolean isPrime(int integer) {
    	for(int i=2; i<=integer/2; i++) {
    		if(integer%i==0) {
    			return false;
    		}
    	}
    	return true;
    }
    
    public static boolean isSquare(double integer) {
    	int number=(int)Math.sqrt(integer);
    	if(number*number!=integer) {
    		return false;
    	}
    	else {
    		return true;
    	}
    }
    
    public static boolean isCube(double integer) {
    	
    	int number=(int) Math.cbrt(integer);
    	if(number*number*number!=integer) {
    		return false;
    	}
    	else {
    		return true;
    	}
    }
}
