package exercise;

import java.util.Arrays;

public class TestExercise {
	public static void main(String[] args){
		boolean isSorted =false;
		int[] array = {44,21,5,312,77,3,34};
		
		int find= 77;
		for(int i=0; i<array.length-1; i++){
			if(array[i] < array[i+1]){
				isSorted=true;
			}
			else
				break;
		}
		
		if(isSorted)
			System.out.println("the array is already sorted");
		else{
		//selection sort
		for(int i=0; i<array.length; i++){
			  for(int j=i+1; j<array.length; j++){
				  if(array[i]>array[j]){
					  int temp = array[i];
					  array[i]=array[j];
					  array[j]=temp;
				  }
			  }
		}
		System.out.println("Array sorted based on selection sort is "+ Arrays.toString(array));
		
		//Insertion sort
	       for(int i=1; i<array.length; i++){
	    	   for(int j=i;j>0; j--){
	    		   if(array[j]>array[i]){
	    			   int temp = array[i];
						  array[i]=array[j];
						  array[j]=temp;
	    		   }
	    	   }
	       }
	        System.out.println("Array sorted based on insertion sort is "+ Arrays.toString(array));
	        
	        //bubble sort
	        for(int i=0; i< array.length ; i++){
	        	for(int j=0; j<array.length; j++){
	        		if(array[i]<array[j]){
						  int temp = array[i];
						  array[i]=array[j];
						  array[j]=temp;
					  }
	        	}
	        }
	        System.out.println("Array sorted based on bubble sort is    "+ Arrays.toString(array));        
		}
		
		
		//Binary search
		int start = 0;
		int end = array.length-1;
		
		
		while(end>=start){
			int mid = (start+end)/2;
			if(find< array[mid]){
				end = mid-1;
			}
			if(find> array[mid]){
				start = mid+1;
			}
			if(find == array[mid]){
				System.out.println("index at: " + mid);
				break;
			}
		}
	}
}
//Bubble sort o(n2)
//insertion sort o(n2)
//selection sort o(n2)	

//1. Already sorted array
//2. No elements in array
//3. random array
