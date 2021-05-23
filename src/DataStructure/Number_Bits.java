package DataStructure;

class Number_Bits{ 

	 public static int bin(int n)  
		{  
		 
		    if (n > 1)  
		    bin(n>>1);  
		    int k = n % 2;  
		    System.out.print(n % 2);
		    
			return k; 
		}  
		  
	public static void main(String[] args) { 
		 
		Byte arr[] = {0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0};
		int orginial = arr.length;
		System.out.println("Btye Array : "+orginial);
		
		Number_Bits num = new Number_Bits();	
		String s = "25";
		System.out.println("User input : "+s);
		int a=Integer.parseInt(s); 
		//bin(a);
		int a1[]= new int[bin(a)];
		
		System.out.println();
		
		
		
//		for (int i=0; i<a1.length; i++){
//		    a1[i]=i;
//		   // System.out.println(a1);
//		} 
//		System.out.println(a1);
	} 
}