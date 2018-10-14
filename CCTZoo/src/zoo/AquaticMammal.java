/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package zoo;

/**
 * Class that hold all the attributes of animals that will be created for the Zoo
 * @author Cesar Garcia
 */
public class AquaticMammal implements Type{
    
    public String animals;
    private Zookeeper zookeeper;
    private int requiredExpert;

    @Override
    public int getRequiredExpert() {
        return requiredExpert;
    }

    public void setRequiredExpert(int requiredExpert) {
        this.requiredExpert = requiredExpert;
    }

    public String getAnimals() {
        return animals;
    }

    public void setAnimals(String animals) {
        this.animals = animals;
    }

    public Zookeeper getZookeeper() {
        return zookeeper;
    }

    /**
     * Method to set a Zookeeper to this animal
     * @param zookeeper
     */
    @Override
    public void setZookeeper(Zookeeper zookeeper) {
        this.zookeeper = zookeeper;
    }
    
        @Override
    public String toString() 
    {
        return "Aquatic-mammal\n Animal = " +animals+"\n"
                + "Zookeeper = "+zookeeper+"\n";
    }   
}   