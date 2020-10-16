
/**
 * Write a description of Part1 here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Part1 {

    public String findSimpleGene (String s){
        String geneString = "";
    int startIndex = s.indexOf("ATG");
    if (startIndex == -1) {
    return "";}
    int stopIndex = s.indexOf("TAA",startIndex+3);
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
    System.out.println("GENE is " +findSimpleGene(s));
    
   s = "ARRTEGETTAA";
    System.out.println("DNA is " +s);
    System.out.println("GENE is " +findSimpleGene(s));
    
   s = "ATGKKIIOPMLA";
    System.out.println("DNA is " +s);
    System.out.println("GENE is " +findSimpleGene(s));
   
   s = "KSQDQLJDIZAJEJPZAD";
    System.out.println("DNA is " +s);
    System.out.println("GENE is " +findSimpleGene(s));
    
   s = "ATGAZERTYFGGTAA";
    System.out.println("DNA is " +s);
    System.out.println("GENE is " +findSimpleGene(s));
    
    
    }
}
