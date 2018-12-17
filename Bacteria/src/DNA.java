/**
 * Name: Izzy Hurley
 * Lab Name: DNA
 * Lab Purpose: The goal of DNA is to create a program is to create and replicate the plain DNA sequence for an e coli bacteria
 * Date: 11/26/18
 * Collaborators: None
 * ON MY HONOR: IH
 */
import java.util.Random;
public class DNA {
    Random r = new Random();
    private String seq;

    public DNA(){
        seq = "GAATTCGAGCTCGGTACCCGGGGATCCTCTAGAGTCCTGCATGCAAGCRGG";
    } //base pair sequence of pUC18 17 codon sequence 51 base pairs

    public DNA(String s) {
        seq = s;
    }

    public boolean hasLseq() {
        for (int i = 0; i < 51; i += 3) {
            return seq.substring(i, i + 3).equals("CTA");
        }
return false;
    }// method to determine if endenbrough sequence is present in the DNA if this sequence is present

    //a method for automatic cell death becuase it is important to consider that DNA is not only effecting the proteins for this condition but also a host of other biological functions
    //this is an oversimplification and would be more accurate with a more nuanced protien to DNA connection but for the purpose of this exoeriment was ruled good enough
    public String replicate() {//a dna mitosis method which accounts for random mutations
        String seq = this.getSeq();
        int randomint = r.nextInt(1000000); //to account for rare mutations
        if (randomint < 52) {//random mutations can occur without affect to this chromosome or gene sequence for B-lactamase coding on pUC18
            seq = seq.substring(0, randomint) + seq.charAt(randomint + 1) + seq.charAt(randomint) + seq.substring(randomint + 2);}
            //System.out.println(seq);}
            //System.out.println(seq.size());
            return seq;
        }


    public String getSeq() {
        return seq;
    }

}
