package in.ait.security;


import java.util.Base64;
import java.util.Base64.Decoder;
import java.util.Base64.Encoder;

public class PasswordService {
         //making changes for bug 101
        int i=50;
        int j=20;
	
	public static String encode(String txt) {
		Encoder encoder= Base64.getEncoder();
		return encoder.encodeToString(txt.getBytes());
	}
	
	public static String decode(String encodeTxt) {
                
                String name="dhananjay";
		Decoder decoder=Base64.getDecoder();
		byte[] decode =decoder.decode(encodeTxt);
		return new String(decode);
	}
	
	
	


}
