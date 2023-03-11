
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;


public class hashing {
    public static String gethash(String pass){
       try{
           MessageDigest md = MessageDigest.getInstance("SHA-256");
           md.update(pass.getBytes());
           byte byteData[] =md.digest();
           StringBuilder sb =new StringBuilder();
           for (int i=0;i<byteData.length;i++){
               sb.append(Integer.toString((byteData[i] & 0xff)+0x100,16).substring(1));
           }
           
           return sb.toString();
       }
       catch(NoSuchAlgorithmException e){
           System.out.println(e.getMessage());
           return null;
       }
        
    }
    
}
