package datastructure.GCL17;

import java.util.Scanner;

public class PrimeNumber {

//	Method 1
   static boolean isPrime(int n)
    {
 
        if (n <= 1)
            return false;
 
        else if (n == 2)
            return true;
 
        else if (n % 2 == 0)
            return false;
 
        for (int i = 3; i <= Math.sqrt(n); i += 2)
        {
            if (n % i == 0)
                return false;
        }
        return true;
    }
	
   //Method 2
   static boolean isPrimAnother(int n) {
	   for( int i=2; (i*i) <= n;i++) {
		   if(n % i==0) {
			   return false;
		   }
	   }
	return true;
   }
   
   
   //method 3
   static boolean isPrimeMethod(int n) {
	   int i=2;
	   if(n==0||n==1)
		   return false;
	   if(n==i)
		   return true;
	   if (n%i==0)
		   return false;
	return isPrimeMethod(n);
   }
   
	public static void main(String[] args) {
		 Scanner s = new Scanner(System.in);
		 /***************************Method1 ***********************************/		
		 System.out.print("Enter the value: ");
		int n = s.nextInt();
		if (isPrime(n)) {
			System.out.println("true :"+n);
		} else {
			System.out.println("false :"+n);
		}
		 /***************************Method2 ***********************************/		

		System.out.print("Enter the value Another: ");
		int n1 = s.nextInt();
		 
		 
		if (isPrimAnother(n1)) {
			System.out.println("true :"+n1);
		} else {
			System.out.println("false :"+n1);
		}
		 /***************************Method3 ***********************************/		

		System.out.print("Enter the value Method another: ");
		int n2 = s.nextInt();
		 
		 
		if (isPrimeMethod(n2)) {
			System.out.println("true :");
		} else {
			System.out.println("false :");
		}

	}

}
