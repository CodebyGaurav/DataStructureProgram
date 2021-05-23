package datastructure;

import java.text.SimpleDateFormat;
import java.util.Date;

public class Print_DateByte {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	    SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy/MM/dd@HH:mm:ss");
	    Date date = new Date();
	    
	//    System.out.println(dateFormat.format(date));
	    
	    long epoch = date.getTime();
	    System.out.println(epoch);
	    
	    
//	    DateTimeFormatter dtf = DateTimeFormatter.ofPattern("yyyyMMdd");
//		LocalDate localDate = LocalDate.now();
//		System.out.println(dtf.format(localDate)); 
//	    
		
	    ////ABhi
	   // byte[] rrr = new byte[13];
		//String type = DatatypeConverter.printHexBinary(rrr);
		//byte[] b = DatatypeConverter.parseHexBinary(String);
	    
	}

}
/*
 * 			 */
