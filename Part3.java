
/**
 * Write a description of Part3 here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Part3 {

    public boolean twoOccurrences(String stringa, String stringb) {
        
        int firstOcc = stringa.indexOf(stringb);
        
        if (firstOcc == -1) {
            return false; 
        }
         else {
             int secOcc = stringa.indexOf(stringb, firstOcc + stringb.length());
            {
             if (secOcc == -1){
                 return false;
                }
                else {
                    return true;
                }
            }
            
        }
            
          
       
           
    }
    
    public String lastPart(String stringa, String stringb){
     
        int firstOcc = stringa.indexOf(stringb);
        
        if (firstOcc == -1){
            return stringa;
        }
        else { 
            int rest = stringa.indexOf(stringb, firstOcc + stringb.length());
            String Srest = stringa.substring(rest, stringa.length());
            return Srest;
        }
        
    }
    
    public void testLastPart() {
     
        String a = "banana";
        String b = "an";
        System.out.println("it occurs hence print the next part = " + lastPart(a, b));
        
        a = "monkey";
        b = "qu";
        System.out.println("it doesn't occur hence print String a = " + lastPart(a, b));
    }

   
    public void testTwoOccurences(){
        
        String a = "I love Sulaf a lot";
        String b = "lo";
        System.out.println("String a is " +a);
        System.out.println("String b is " +b);
        boolean test = twoOccurrences(a, b);
        System.out.println("Test is " +test);
        
        a = "Sulaf is a very sexy woman";
        b = "lo";
        System.out.println("String a is " +a);
        System.out.println("String b is " +b);
        test = twoOccurrences(a, b);
        System.out.println("Test is " +test);
    }
      
}
