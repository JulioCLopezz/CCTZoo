/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package zoo;

/**
 * Class that hold attributes to generate animals of Aquatic class implementing
 * the interface type
 * @author Cesar Garcia
 */
public class Aquatic implements Type{
    //atributes of the Aquatic animal
    public String animals;
    private Zookeeper zookeeper;
    private int requiredExpert;
    
    /**
     * Method to set the zookeeper, expert and kind of animal
     * @param animals String specific aquatic animal name
     * @param zookeeper Zookeeper object zookeeper that will take care of the animal
     * @param requiredExpert int level of expert for license
     */
    public void infoType(String animals, Zookeeper zookeeper, int requiredExpert)
    {
        setRequiredExpert(requiredExpert);
        setAnimals(animals);
        setZookeeper (zookeeper);
    }
    
    @Override
    /**
     * Method to access the expert required for this animal
     * @return requiredExpert int number of the expert required
     */    
    public int getRequiredExpert() {
        return requiredExpert;
    }

    /**
     * Method to set the experte required for this animal
     * @param requiredExpert 
     */
    public void setRequiredExpert(int requiredExpert) {
        this.requiredExpert = requiredExpert;
    }

    /**
     * Method to access the kind of aquatic animal
     * @return animals String kind of aquatic animal
     */
    public String getAnimals() {
        return animals;
    }

    /**
     * Method to set the kind of aquatic animal
     * @param animals 
     */
    public void setAnimals(String animals) {
        this.animals = animals;
    }

    /**
     * Method to access the zookeeper details
     * @return zookeeper Zookeeper object zookeeper
     */
    public Zookeeper getZookeeper() {
        return zookeeper;
    }

    /**
     * Method to set the zookeeper details
     * @param zookeeper
     */
    @Override
    public void setZookeeper(Zookeeper zookeeper) {
        this.zookeeper = zookeeper;
    }
    
    /**
     * Method to structure the Aquatic Animal details for display it
     * @return set of String values that colect Aquatic animal details
     */
    @Override
    public String toString() 
    {
        return "Aquatic\n Animal = " +animals+"\n"
                + "Zookeeper = "+zookeeper+"\n";
    }   
}   
