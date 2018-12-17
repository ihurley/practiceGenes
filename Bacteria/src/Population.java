/**
 * Name: Izzy Hurley
 * Lab Name: Population
 * Lab Purpose: The goal of Population is to create a program that can create sample populations of e coli bugs and calculate the total fitness while adhering to population growth pressures.
 * Date: 12/16/18
 * Collaborators: None
 * ON MY HONOR: IH
 */

public class Population {
   private Bacteria [] pop;
   private  int size;
   private int maxPop;
   private int avgFitness; //important for competition standards

   public Population(Bacteria bacteria){// population needs to start with an individual
       pop = new Bacteria[maxPop];
     pop[1] = bacteria;
     maxPop = 100;
     avgFitness = calcAvgFitness();
     size = 1;
   }

   public void death(int index){
      for( int  i = index; i<size; i++){
          pop[index] = pop[index+1];

      }
      pop[size] =null;
      size--;

   }

   public void birth(Bacteria Pclone){//parent clone imputed
       //this method is not yet functional
      Bacteria birth = new Bacteria( new DNA(Pclone.getDna().replicate()),Pclone.getPlasmids());
     // if (size==maxPop){
     //     if (birth.fitness>avgFitness){birth}
      //}

    //   birth.fitness>
   }



    public int calcAvgFitness() {
       int sum = 0;
        for (int i = 0; i < pop.length; i++){
           sum+= pop[i].fitness;
        }
       return sum/pop.length;
    }


}
