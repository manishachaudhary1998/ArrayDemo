package com.array;

public class MaximumNo {
public static void main(String[] args) {
	int a[]= {4,5,6,23,3,8,9};
	int max=a[0];
	for(int i=0;i<a.length;i++) {
		if(a[i]>max) {
		max=a[i];
		}
	}
	System.out.println("maximum no>>"+max);	
}
}
