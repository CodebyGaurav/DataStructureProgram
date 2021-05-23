package DataStructure;

public class BInary_Convert {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		 int n = 2;
		 
		 int array[] = new int[32];
		 for(int i=0;i<24;i++) {
			 array[i]=0;
		 }
		 int j=31;
		 while(n > 0)
	        {
	            int a = n % 2;
	            array[j]=a;
	            n = n / 2;
	            j--;	
	        }
	     
	     for(int i=0;i<32;i++) {
	    	 System.out.print(array[i]);
	    	 
	    	
		 }
	     
	    // byte[] bytes = {0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0}; 
	     
	     
	}

}
