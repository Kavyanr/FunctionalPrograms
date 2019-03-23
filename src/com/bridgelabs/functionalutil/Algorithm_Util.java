package com.bridgelabs.functionalutil;

import java.io.BufferedReader;
import java.io.IOException;
import java.util.*;

public class Algorithm_Util {
	static Scanner scanner = new Scanner(System.in);

	public static int inputinteger() {
		return scanner.nextInt();

	}
	public static double inputDouble() {
		return scanner.nextDouble();
	}

	public static char inputChar() {
		return scanner.next().charAt(0);
	}

	public static String inputString() {
		return scanner.next();
	}

	// GENERATING PRIME NUMBERS
	public static void isPrime(int min, int max) {
		int i, count,k=0;
		List<Integer> list=new ArrayList<Integer>();
		while (min <= max) {
			count = 0;
			i = 2;
			//Divisors always lies between 0 to (number/2)
			while (i <= min / 2) {
				if (min % i == 0) {
					count++;
					
					break;
				}
				i++;
			}
			if (count == 0 && min != 1)
			{ 
					list.add(min);

			}	
			min++;
		}
		for(int kl:list)
			System.out.println(kl + " ");
		
	}



	//ANAGRAM
	public static boolean isAnagram(String str1, String str2) {
		int i;
		String first=str1.replaceAll("\\s"," ");
		String second=str1.replaceAll("\\s"," ");
		if (first.length() != second.length())
			return false;

		char[] s1 = first.toCharArray();
		char[] s2 = second.toCharArray();
		Arrays.sort(s1);
		Arrays.sort(s2);
		for (i = 0; i < first.length(); i++) {
			if (s1[i] != s2[i])
				return false;
		}
		return true;

	}


	// INSERTION SORT FOR INTEGERS
	public static <T extends Comparable<T>> void insertionSort(T[] array) {
		int i = 0, j = 0, w;
		for (i = 0; i < array.length; i++) {
			for (j = 0; j <= i; j++) {
				if (array[j].compareTo(array[i])>0) {
					T temp = array[j];
					array[j] = array[i];
					for (w = i; w > j + 1; w--)
						array[w] = array[w - 1];
					array[w] = temp;
				}
			}
		}
		for (T kl : array)
			System.out.println(kl + " ");
		System.out.println(" ");
	}

	// INSERTION SORT FOR STRING LIST
	public static void insertString(List <String> array,int n) {

		int i = 0, j = 0, w;
		String temp;
		for (i = 0; i < array.size(); i++) {
			for (j = 0; j <= i; j++) {
				if (array.get(j).compareTo(array.get(i))>0)
				{
					temp = array.get(j);
					array.set(j, array.get(i));
					for (w = i; w > j + 1; w--) {
						array.set(w, array.get(w-1));}+
					array.set(w, temp);
				}
			}
		}

		for (String k:array)
			System.out.print(k + " ");
		System.out.println(" ");
	}
	// BUBBLE SORT 

	public static <T extends Comparable <T>> void BubbleSort(T[] array)
	{
		int i;
		int n=array.length;
		for (i = 0; i < n-1; i++) {
			for (int j = 0; j < n - i - 1; j++) {
				if (array[j].compareTo(array[j+1])>0) {
					T temp = array[j];
					array[j] = array[j + 1];
					array[j + 1] = temp;
				}
			}
		}
		for (i = 0; i < n; i++) {
			System.out.println(array[i] + " ");
		}
	}

	// BUBBLE SORT FOR STRING
	public static void isBubbleString(String str) {
		char[] array = str.toCharArray();
		char temp;
		int i, n = array.length;
		for (i = 0; i < n - 1; i++) {
			for (int j = 0; j < n - i - 1; j++) {
				if (array[j] > array[j + 1]) {
					temp = array[j];
					array[j] = array[j + 1];
					array[j + 1] = temp;
				}
			}
		}
		for (i = 0; i < n; i++) {
			System.out.print(array[i] + " ");
		}
	}



	// BINARY SEARCH 
	public static <T extends Comparable<T>> void BinarySearch(T[] arr,T key) {

		int low=0,high=arr.length-1,mid = 0;
		mid = (low + high) / 2;
		while (low <= high) {
			if (key.compareTo(arr[mid])>0)
				low = mid + 1;
			else if (arr[mid].equals(key)) {
				System.out.println("key element found at index " + mid);
				break;
			} else
				high = mid - 1;

		mid = (low + high) / 2;
		}
		if (low > high)
		{
			System.out.println("key element not found");
		}
	}
	
	// BUBBLE SORT USING LIST
	public static void bubble(List<Integer> nos, int n) {
		int i, temp;

		for (i = 0; i < nos.size() - 1; i++) {
			for (int j = 0; j < nos.size() - i - 1; j++) {

				if (nos.get(j) > nos.get(j + 1)) {
					temp = nos.get(j);
					nos.set(j, nos.get(j + 1));
					nos.set(j + 1, temp);

				}
			}
		}
		for (int k:nos) {
			System.out.println(k+ " ");
		}

	}
	//TEMPERATURE CONVERSION
	public static void temperatureConversion(double temperature, int choice) {

		switch (choice) {
		case 1:
			double Fahrenheit = (temperature * 9 / 5) + 32;
			System.out.println(Fahrenheit + " F");
		case 2:
			double Celsius = (temperature - 32) * 5 / 9;
			System.out.println(Celsius + " C");
		default:
			break;
		}

	}

	// MONTHLYPAYMENT
	public static void monthlyPayment(float p, float y, float r2) {
		float n;
		float r, payment, denominator;
		n = 12 * y;
		r = r2 / (12 * 100);
		denominator = (float) Math.pow(1 + r, -n);
		payment = p * r / (1 - denominator);
		System.out.println("Payment:" + payment);
	}

	// SQUAREROOT
	public static double sqrt(int c) {
		double t = c;
		double epsilon = 1e-15;

		while(Math.abs(t - c / t) > epsilon*t) {
			t = ((c / t) + t) / 2;
		}
		return t;
	}

	//DECIMAL TO BINARY CONVERSION
	public static void toBinary(int num)
	{
		int i, power=0;
		int array[]=new int[40];
		while(num>0)
		{
			array[power]=num%2;
			power++;
			num=num/2;
		}

		for(i=power-1;i>=0;i--)
		{
			System.out.println(array[i]);
		}
	}

	//DAYS OF WEEK
	public static void dayOfWeek(int d,int m,int y)
	{
		int y0 = y-(14-m) / 12;

	    int	x = y0 + (y0/4)-(y0/100)+(y0/400);

		int	 m0 = m + 12 * ((14-m) / 12)-2;

		int d0 = ((d+x+(31*m0))/12)%7;
		System.out.println("Day of the week: "+d0);
	}
	//SWAP NIBBLES
	public static int swapNibbles(int x) {
		{ 
			return ((x & 0x0F) << 4 | (x & 0xF0) >> 4); 
		}
	}
	//IS POWER OF 2
	public static boolean isPowerOfTwo(int res)
	{
		return (int)(Math.ceil((Math.log(res) / Math.log(2)))) ==  
				(int)(Math.floor(((Math.log(res) / Math.log(2))))); 
	}

   //MERGE SORT
	public static String[] merge(String[] array)
	{
		if (array.length>=2)
		{
			String left[]= new String[array.length/2];
			String right[]= new String[array.length-(array.length/2)];
			for( int i=0;i<left.length;i++)
			{
				left[i]= array[i];
			}
			for( int j=0;j<right.length;j++)
			{
				right[j]= array[j+(array.length/2)];
			}
			merge(left);
			merge(right);
			mergeSort(array,left,right);		
		}
		return array;
	}
	
	
	public static void mergeSort(String[] array, String[] left, String[] right)
	{
		int a=0,b=0;
		for(int i=0;i<array.length;i++)
			if(b>=right.length ||
			(a< left.length && left[a].compareToIgnoreCase(right[b])<0))
			{
				array[i]=left[a];
				a++;
			}
			else
			{

				array[i]=right[b];
				b++;	
			}
		for(String str:array)
		 {
			 System.out.println(array);
		 }
	}
	public static int vendingMachine(int money,int notes[])
	{
		int rem,i=0,result=0,total=0;
		if(money==0)
			return -1;
		else
		{
			if(money>=notes[i])
			{
				result=money/notes[i];
				rem=money%notes[i];
				money=rem;
				total=total+result;
				System.out.println(notes[i]+   " Notes ---> " +result );
			}
			i++;
		}
		return result;
	}
	//find the number
	public static int find(int low, int high)
	{
		int mid;
		while(low!=high)
		{
			mid=(low+high)/2;
			System.out.println("Enter 1 if the number is between " + low + " - "+ mid );
			System.out.println("Enter 2 if number is between " +(mid+1) + "-" + high);
			int c=Algorithm_Util.inputinteger();
			if(c==1)
				high=mid;
			else
				low=mid+1;
		}
		return low;
		}
	//palindrome
	public static void primePallindrome() {
		System.out.println();
		boolean b;
		for (int j = 2; j <= 1000; j++) {
			b = true;
			for (int i = 2; i < j / 2; i++) {
				if (j % i == 0) {
					b = false;
					break;
				}
			}
			if (b && isPallindrome(j))
				System.out.print(j + " ");
		}
	}

	public static boolean isPallindrome(List<Integer> List) {
		int temp = n;
		int sum = 0;
		while (temp != 0) {
			int r = temp % 10;
			sum = sum * 10 + r;
			temp = temp / 10;
		}
		if (sum == n) {
			return true;
		}
		return false;
	}

}

