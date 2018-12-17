/**
 * Name: Izzy Hurley
 * Lab Name: Bacteria
 * Lab Purpose: The goal of Bacteria is to create a class that holds information necessary for a testable e coli bacteria. This class holds the resistance data and fitness calculations.
 * Date: 11/26/18
 * Collaborators: None
 * ON MY HONOR: IH
 */
import java.util.Random;
public class Bacteria {
  private DNA dna;
  private Node [] plasmids; //plasmids are listed
    public int age;

  int fitness;

   public Bacteria(DNA a, Node [] plasmids){
      dna = a;
      this.plasmids = plasmids;
      fitness = calcFitness();



   }
   public Bacteria(){
      dna = DNA();//known bug
      plasmids = new Node[]{new Node("AmpC",0,0),new Node("AmpR",0,0), new Node("AmpRpromo",0,0)};// Four strings which will hold the accepted names for certian plamids
      // ecoli resistance can be  achieved most often through 3 plasmids (ampC, AmpR, AmpR promoter)
      fitness = this.calcFitness();




   }

   public int calcFitness(){
      Random r = new Random();
      int fit = 0;
      //on a 0 = death to 100 = perfect scale
      //fitness under 30 will be most probable death
      //fitness above 50 <75 will have 30 pecent death in a non pressured population
     if (dna.hasLseq()) fitness = 0; //automatic cell death
      //need to create a plasmid cap
         // not actually enough volume in a cellular system to contain more and more genetic material
      int plasmidCap = 5; //arbitrary not based on studies **definately something that could be improved with research

    while (plasmids[0].copynumber+plasmids[1].getCopynumber()+plasmids[2].getCopynumber() >plasmidCap){
        if (plasmids[0].distance < plasmids[1].distance&& plasmids[0].distance < plasmids[2].distance){ //closer plasmids will be kept
          if (plasmids[2].copynumber!=0)plasmids[2].copynumber --;//I chose to have promoter to be given up first so that i would see more resistance
            else if (plasmids[1].copynumber != 0)    plasmids[1].copynumber--;
            else plasmids[0].copynumber--;
        }
        if (plasmids[1].distance < plasmids[0].distance&& plasmids[1].distance < plasmids[2].distance){ //closer plasmids will be kept
            if (plasmids[2].copynumber!=0)plasmids[2].copynumber--;//I chose to have promoter to be given up first so that i would see more resistance
            else if (plasmids[0].copynumber != 0)    plasmids[0].copynumber--;
            else plasmids[1].copynumber--;
        }
        if (plasmids[2].distance < plasmids[2].distance&& plasmids[2].distance < plasmids[2].distance){ //closer plasmids will be kept
            if (plasmids[1].copynumber!=0)plasmids[1].copynumber--;//I chose to have ampR given up first arbitrarily
            else if (plasmids[0].copynumber != 0)    plasmids[0].copynumber--;
            else plasmids[2].copynumber--;
        }
    }


   double ampCcontibuter = plasmids[0].getCopynumber()*2 + plasmids[0].distance; //copy number more important than distance
   double ampRcontributer = (plasmids[1].getCopynumber()*plasmids[2].getCopynumber())/2 + (plasmids[1].distance*plasmids[2].distance)*2;

      fit = r.nextInt(10)+ 50;// a value between 50 and 60 as an accountance for other non resistance factors
       fit +=ampCcontibuter+ampRcontributer;
   return fit;


   }

   public void changePlasmidName(int index, String s){
       plasmids[index].plasmid = s;
   }
   public void changeCopyNumber(int index, int copyNumber){
       plasmids[index].copynumber = copyNumber;
   }

    public DNA getDna() {
        return dna;
    }

    public Node[] getPlasmids() {
        return plasmids;
    }

    public int getAge() {
        return age;
    }



}
