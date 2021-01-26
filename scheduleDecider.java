import java.io.FileInputStream;
import java.nio.charset.StandardCharsets;

public class scheduleDecider {

    public static void main(String[] args) { 
        
        try {

            FileInputStream input = new FileInputStream("/Users/eggsaladsandwich/Box Sync/scheduleDecider/currentDay.txt");
            String activities[] = new String[]{"workout", "apply", "program"};
            
            byte[] data = input.readAllBytes();
            String string = new String(data, StandardCharsets.UTF_8);
            
            System.out.print("Today's activities: ");
            System.out.println(string);
            
            input.close();
        }catch(Exception e){
            System.out.println("Exception thrown: " + e);
        } 




    }

    private static String bytesToHex(byte[] hash) {
        StringBuffer hexString = new StringBuffer();
        for (int i = 0; i < hash.length; i++) {
            String hex = Integer.toHexString(0xff & hash[i]);
            if(hex.length() == 1) {
                hexString.append('0');
            }
            hexString.append(hex);
        }
        return hexString.toString();
    }

}