package DataStructure;

public class LazyIncrment {

	  public static byte[] increment(byte[] A)
	  {
	    byte carry= 1;
	    for(int i = 0; i<A.length; i++){
	        byte b = A[i];
	        A [i] ^= carry;
	         carry &= b;
	    }
	    return A;
	  }

	  private static String toBinString (byte [] a) 
	  {
	      String res = "";
	      for (int i = 0; i <a. length; i++) 
	      {
	          res = (a [i] == 0 ? "0": "1") + res;
	      }
	      return res;
	}
	public static void main(String[] args) {
	         
		
			byte [] A ={0};

	         increment(A);
	             System.out.println (toBinString (A));


	}
	 
}
