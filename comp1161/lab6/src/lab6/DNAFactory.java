package lab6;

 


/**
 * Routines for generating unique DNA 8 character code.
 * Used when creating new DNA. 
 * 
 * @author COMP1161 
 * @version 1.00
 */
public class DNAFactory{
    private static int counter = 0;
    private static String[] geneBank =
    {"ACTGAAAA",
     "ACTGAAAC",
     "ACTGAAAT",
     "ACTGAAAG",
     "ACTGAACA",
     "ACTGAACC",
     "ACTGAACT",
     "ACTGAACG",
     "ACTGAATA",
     "ACTGAATC",
     "ACTGAATT",
     "ACTGAATG",
     "ACTGAAGA",
     "ACTGAAGC",
     "ACTGAAGT",
     "ACTGAAGG",
     "ACTGACAA",
     "ACTGACAC",
     "ACTGACAT",
     "ACTGACAG",
     "ACTGACCA",
     "ACTGACCC",
     "ACTGACCT",
     "ACTGACCG",
     "ACTGACTA",
     "ACTGACTC",
     "ACTGACTT",
     "ACTGACTG",
     "ACTGACGA",
     "ACTGACGC",
     "ACTGACGT",
     "ACTGACGG",
    };

    
    /**
     * Generate new DNA code by merging parents' genes with child's gene
     * @param motherDNA mother's gene code
     * @param fatherDNA father's gene code
     * @return new code
     */
    public static String createNewDNACode(String motherDNA, String fatherDNA)
    {
        counter++;
        return "AAAAAAAA"+"CCCCCCCC"+geneBank[counter];
    }
    
    

}


