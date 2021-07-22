package _04_JavaClassSearchAndSort;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

/*
 * Use the Arrays and Collections classes to implement the search and sort
 * methods below.
 */
public class _02_JavaClassSearchSort {
    
    public static int[] arraySort(int[] arr) {
        Arrays.sort(arr);
        return arr;
    }
    
    public static List<Double> listSort(List<Double> list){
        Collections.sort(list);
        return list;
    }

    public static Boolean arraySearch(char[] arr, char key) {
        boolean isFound=false;
        
        for(int i=0; i<arr.length; i++) {
        	if(arr[i]==key) {
        		isFound=true;
        	}
        }
        return isFound;
    }
    
    public static Boolean listSearch(List<Character> list, Character key) {
        boolean isFound=false;
        
        for(int i=0; i<list.size(); i++) {
        	if(list.get(i)==key) {
        		isFound=true;
        	}
        }
        return isFound;
    }
}
