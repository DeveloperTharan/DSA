package DSA.DynamicPrograming;

import java.util.Scanner;

class DaynamicArray{
	
	private int arr[];
	private int size;
    private static final int initialcapacity = 16;
    private int capacity;
    // constructor 
	DaynamicArray(){
	    size = 0;
	    arr = new int[initialcapacity];
        capacity = initialcapacity;
	}
	// for expending
	private void expandArray() {
        capacity = capacity * 2;
        java.util.Arrays.copyOf(arr, capacity);
    }
	// add
	public void add(int val) {
	    arr[size] = val;
	    size++;
	    if(size==capacity) {
	    expandArray();
	    }
	}	
	//display
	public void display() {
	    for(int i=0; i<size; i++) {
	        System.out.print(arr[i]+" ");
	    }
	}
	public void insertAt(int pos, int val) {
	    if(size==capacity) {
		    expandArray();
		}
	    for(int i=size-1; i>=pos; i--) {
	        arr[i+1] = arr[i];
	    }
	    arr[pos] = val;
	    size++;
	}
	public void deleteAt(int pos) {
	    for(int i=pos+1; i<size; i++) {
	        arr[i-1] = arr[i];
	        size--;
	    }
	    if(capacity > initialcapacity && capacity > 3*size) {
	        lesstheArray();
	    }
	}
	public void lesstheArray() {
	    capacity = capacity / 2;
	    arr = java.util.Arrays.copyOf(arr, capacity);
	}
}

public class DynamicProgram {

	public static void main(String[] args) {
		
		DaynamicArray list = new DaynamicArray();
		try (Scanner scan = new Scanner(System.in)) {
			while(true) {
			  System.out.println("\n________List Menu__________\n");
			  System.out.println("1. Insert the value at end \n");
			  System.out.println("2. Display the list \n");
			  System.out.println("3. Insert the value at specific position \n");
			  System.out.println("4. Delete from specific position \n");
			  System.out.println("5. Exit \n");
			  System.out.println("\n___________________________\n");
			  System.out.println("Enter your choice \n");
			  int choice = scan.nextInt();
			  int val, pos;
			  
			   switch(choice) {
			   
			   case 1: System.out.println("Enter the data: ");
			           val = scan.nextInt();
			           list.add(val);
			           break;
			           
			   case 2: list.display(); 
			           break;
			           
			   case 3: System.out.println("Enter the specific position(position starts from 0): ");
			           pos = scan.nextInt();
			              if(pos<0) {
			            	  System.out.println("Invalid position: ");
			              }
			              System.out.println("Enter the value: ");   
			           val = scan.nextInt();
			           list.insertAt(pos,val);
			           break;
			           
			   case 4: System.out.println("Enter the specific position(position starts from 0): "); 
			           pos = scan.nextInt();
			           if(pos<0) {
			            	  System.out.println("Invalid position: ");
			              }
			           list.deleteAt(pos);
			           break;
			          
			   case 5: System.exit(0);
			   
			   default:System.out.println("Invalid choice");
			   }
			}
		}
	}
}

