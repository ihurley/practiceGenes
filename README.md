# practiceGenes
Genetic algorithms are methods for representing optimization based upon natural selection. 
Genetic algorithms reach optimizations by modifying populations through trait mutation.
Evolution occurs in genetic programs as children are created and generations are tested against “environmental standards”. 
This program aims to model E coli genetic evolution with the environmental pressure of ampicillin.
This specific case of evolution has been shown in medical testing systems to have horizontal gene transfer rather than typical vertical transfer based on cloning. 

One of the classes contained is a python file called practice.py. This file was coded from a tutorial  where I drew inspiration for the different elements of my project. The bacteria.js file is a previously thought out code structure which remains in case a future collaborator would wish to translate the project into python. 

*The Bacteria folder is the bulk of the functional code. This folder provides an (while incomplete) program for create predictive models of e coli in response to ampicillin.*

..* The goal of Driver is to create a program that can run sample populations through multiple generations. This program aims to create predictive data of e coli resistance.

..*The goal of Bacteria is to create a class that holds information necessary for a testable e coli bacteria. This class holds the resistance data and fitness calculations.

..* The goal of Population is to create a program that can create sample populations of e coli bugs and calculate the total fitness while adhering to population growth pressures.

..* The goal of DNA is to create a program is to create and replicate the plain DNA sequence for an e coli bacteria.

..* The goal of Bacteria is to create a class that can model plasmid structure and separation for bacteria. These values will supplement the fitness calculations of the bacteria.

1. In order to build a genetic algorithm it is paramount to understand the host of variables that will go into curating your sample population, controlling your influences, adjusting fitness standards, and achieving accurate simulated reproduction.  

..* Here is an explanation the basics of creating a genetic algorithm. 

        1. In order to create a sample population 
..* A sample population will need to start with a variety of organisms with some sort of genetic variety. 
Genetics can be represented in a host of different ways. While strings of base pair equivalent sets may be the most obvious solution. However such presence could be coded for using binary bit compression or a series of other variables. If a string based on the genetic sequence is the preferable representation than a program such as snapGene or snapGene viewer will be incredibly helpful. Here you can isolate the specific functional groups of the DNA that need to be included and get the sequence for those groups. Genetic algorithms which focus on specific mutations are going to differ greatly from those which focus more largely on environments and populations. When considering how to represent the genetic material crucial to your experiment it is also important to consider how genetics are processed in the reproduction of such an organism. In order to procure data representative of a sexually reproducing organism, data that can be set to crossover and intermix at chromosomal centromere separation accurate rates is also important. A sexually reproducing organisms will not need these same capabilities as they reproduce through processes of cloning. However, in considering asexual reproducers one must also understand the role of plasmid based horizontal gene transfer.  
For this sample population it is crucial to have trackers on how close the bugs are to each other. This allows for accurate horizontal gene transfer to occur. Also, when dealing with transferable genetics in a single generation it is advantageous to represent these through variables rather than full sequences as plasmids often exist outside the main genetic ring of bacterium. 

    2. In order to choose a language 
The impetus behind mapping evolution through genetic programs is most often an issue of efficiency. Models allow scientists to observe a greater scale of data than possible in the time frame of the natural kingdom. Thusly, the efficiency of a program is important. Also, because populations in actuality will likely be large data sets it is important that data storage be considered as well. This made me lean towards the prototype model of python. However, in beginning projects coder time is of the essence so a coder’s preferred language can be used.  
In order to create a fitness standard

    3. Choose a scale for your fitness.
Scales of 10 or 100 are often very intuitive and thus a good bet. Then analyze the factors going into your fitness. What are the mutations that cause increases or decreases in fitness and how do environmental factors affect prevalence of these factors. Comment your fitness scale and standards above your fitness calculation despite the fact that these will not be used here. Then using scaled equations choose a fitness calculation that will produce individuals whom will be properly affected by your standards. 

