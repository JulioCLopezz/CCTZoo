
package zoo.setuphelper;

import zoo.Animal;
import zoo.Zookeeper;
import java.util.ArrayList;
import java.util.Random;
import zoo.Aquatic;
import zoo.AquaticMammal;
import zoo.Avian;
import zoo.AvianAquatic;
import zoo.AvianMammal;
import zoo.Insect;
import zoo.Mammal;
import zoo.Reptile;
import zoo.ReptileAquatic;
import zoo.Type;

/**
 * Class that create the initial data of the zoo and set the values on the Array
 * List that whole the ZooKeeper objects and Animal Objects
 * @author Julio Lopez
 */
public class SetUpData 
{
    int DataAnimal = 100; // Initial quantity of Animal
    int DataKeeper = 40;  // Initial quantity of keeper

    public StoredData sDU = new StoredData(); // data
    public ArrayList<Animal> currentAnimals = new ArrayList();
    public ArrayList<Zookeeper> currentZookeeper = new ArrayList();
    public ArrayList<Type> currentType = new ArrayList();

    Random rG = new Random();
   
    /**
     * Class that manage the order to run the classes an populate the Zoo data
     */
    public void getItReady()
    {
        createData();
        fillZookeepers();
        fillType();
        fillAnimals();
    }
    
    /**
     * Method to add the data of objects created in the array list 
     */
    public void createData()
    {  
        for(int i=0;i<DataAnimal;i++)
        {
           currentAnimals.add(new Animal());           
           currentType.add(null);
        }
        for(int i=0;i<DataKeeper;i++)
        {        
           currentZookeeper.add(new Zookeeper());
        }
    }
    
    /**
     * Method to create the zookeeper assigning its details
     */
    public void fillZookeepers()
    {
        for(Zookeeper zok : currentZookeeper)
        {
            zok.setName(sDU.names[rG.nextInt(sDU.names.length)]);
            zok.setExpert(rG.nextInt(5)+1);
        }
    }
    
    /**
     * Method to create the differen class of animals assigning its details 
     */
    public void fillType()
    {
        for(int i=0;i<DataAnimal;i++)
        {           
            if(rG.nextInt(5)>=3)
            {
               Mammal mal = new Mammal();
               mal.setAnimals(sDU.mammalAnimals[rG.nextInt(sDU.mammalAnimals.length)]);
               mal.setRequiredExpert(rG.nextInt(5)+1);
               mal.setZookeeper(selectZookeeper(mal,currentZookeeper));
               currentType.set(i, mal);
            }
            else if (rG.nextInt(5)>=3)
            {
               Reptile reptile = new Reptile();
               reptile.setAnimals(sDU.reptileAnimals[rG.nextInt(sDU.reptileAnimals.length)]);
               reptile.setRequiredExpert(rG.nextInt(5)+1);
               reptile.setZookeeper(selectZookeeper(reptile,currentZookeeper));
               currentType.set(i, reptile);
               
               ReptileAquatic ra = new ReptileAquatic();
               ra.setAnimals(sDU.reptileAquaticAnimals[rG.nextInt(sDU.reptileAquaticAnimals.length)]);
               ra.setRequiredExpert(rG.nextInt(5)+1);
               ra.setZookeeper(selectZookeeper(ra,currentZookeeper));
               currentType.set(i, ra);
            }
            else if (rG.nextInt(5)>=3)
            {
               Aquatic aquatic = new Aquatic();
               aquatic.setAnimals(sDU.aquaticAnimals[rG.nextInt(sDU.aquaticAnimals.length)]);
               aquatic.setRequiredExpert(rG.nextInt(5)+1);
               aquatic.setZookeeper(selectZookeeper(aquatic,currentZookeeper));
               currentType.set(i, aquatic);
               
               AquaticMammal aqm = new AquaticMammal();
               aqm.setAnimals(sDU.aquaticMammalAnimals[rG.nextInt(sDU.aquaticMammalAnimals.length)]);
               aqm.setRequiredExpert(rG.nextInt(5)+1);
               aqm.setZookeeper(selectZookeeper(aqm,currentZookeeper));
               currentType.set(i, aqm);
            }
            else if (rG.nextInt(5)>=3)
            {
            Avian avian = new Avian();
               avian.setAnimals(sDU.avianAnimals[rG.nextInt(sDU.avianAnimals.length)]);
               avian.setRequiredExpert(rG.nextInt(5)+1);
               avian.setZookeeper(selectZookeeper( avian,currentZookeeper));
               currentType.set(i, avian);
            
            AvianAquatic aq = new AvianAquatic();
               aq.setAnimals(sDU.avianAquaticAnimals[rG.nextInt(sDU.avianAquaticAnimals.length)]);
               aq.setRequiredExpert(rG.nextInt(5)+1);
               aq.setZookeeper(selectZookeeper( aq,currentZookeeper));
               currentType.set(i, aq);
               
            AvianMammal am = new AvianMammal();
               am.setAnimals(sDU.avianMammalAnimals[rG.nextInt(sDU.avianMammalAnimals.length)]);
               am.setRequiredExpert(rG.nextInt(5)+1);
               am.setZookeeper(selectZookeeper(am,currentZookeeper));
               currentType.set(i, am);
            }
            else
            {
               Insect insect = new Insect();
               insect.setAnimals(sDU.insectAnimals[rG.nextInt(sDU.insectAnimals.length)]);
               insect.setRequiredExpert(rG.nextInt(5)+1);
               insect.setZookeeper(selectZookeeper(insect,currentZookeeper));
               currentType.set(i, insect);
            }
        }
    }
    
    /**
     * Method to filla the array that will contain the animals with all its details
     */
    public void fillAnimals()
    {
        for(Animal f : currentAnimals)
        {
            f.setDateofbirth(sDU.dateofBirth[rG.nextInt(sDU.dateofBirth.length)]);
            f.setDateofarrival(sDU.dateofArrival[rG.nextInt(sDU.dateofArrival.length)]);
            f.setGender(sDU.gender[rG.nextInt(sDU.gender.length)]);
            f.setOffspring(sDU.offSpring[rG.nextInt(sDU.offSpring.length)]);
            f.setMedication(sDU.medication[rG.nextInt(sDU.medication.length)]);
            f.setVaccine(sDU.vaccine[rG.nextInt(sDU.vaccine.length)]);
            f.setExhibitnumber(sDU.exhibitNumber[rG.nextInt(sDU.exhibitNumber.length)]);
            f.setTypeAssigned((Type)currentType.get(rG.nextInt(currentType.size())));
        }       
    }
    /**
     * Class to assign the keeper to the animal
     * @return currentZookeeper.get(select) int the keeper number
     */
    public Zookeeper selectZookeeper(Type ac, ArrayList<Zookeeper> currentZookeepers)
    {
        int select = currentZookeepers.size()-1;
        while(ac.getRequiredExpert()>currentZookeepers.get(select).getExpert()&& select >=1)
        {
            select--;
        }
        return currentZookeepers.get(select);
    }
}
