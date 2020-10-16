
/**
 * Write a description of Part2 here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Part2 {

      public String findSimpleGene (String s, String startCodon, String stopCodon){
          
    String geneString = "";
    
    int startIndex = s.indexOf(startCodon);
    if (startIndex == -1) {
    return "";}
    
    int stopIndex = s.indexOf(stopCodon,startIndex+3);
    if (stopIndex == -1){
    return "";}
    
    geneString = s.substring(startIndex, stopIndex+3);
    if (geneString.length() % 3 != 0) {
        return "";}
    
    return geneString; 
}
    
    public void testSimpleGene (){
        
   String s = "ATGAZERTYFTAA";
    System.out.println("DNA is " +s);
    System.out.println("GENE is " +findSimpleGene(s, "ATG", "TAA"));
    
   s = "ARRTEGETTAA";
    System.out.println("DNA is " +s);
    System.out.println("GENE is " +findSimpleGene(s, "ATG", "TAA"));
    
   s = "ATGKKIIOPMLA";
    System.out.println("DNA is " +s);
    System.out.println("GENE is " +findSimpleGene(s, "ATG", "TAA"));
   
   s = "KSQDQLJDIZAJEJPZAD";
    System.out.println("DNA is " +s);
    System.out.println("GENE is " +findSimpleGene(s, "ATG", "TAA"));
    
   s = "ATGAZERTYFGGTAA";
    System.out.println("DNA is " +s);
    System.out.println("GENE is " +findSimpleGene(s, "ATG", "TAA"));
    
   s = "atgazertyfggtaa";
    System.out.println("DNA is " +s);
    System.out.println("GENE is " +findSimpleGene(s, "atg", "taa"));
    
    
    }
}
