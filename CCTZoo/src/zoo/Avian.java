/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package zoo;

/**
 *
 * @author Cesar Garcia
 */
public class Avian implements Type{
 
    public String animals;
    private String flight;
    private Zookeeper zookeeper;
    private int requiredExpert;

    public String getAnimals() {
        return animals;
    }

    public void setAnimals(String animals) {
        this.animals = animals;
    }

    public String getFlight() {
        return flight;
    }

    public void setFlight(String flight) {
        this.flight = flight;
    }
    
    public Zookeeper getZookeeper() {
        return zookeeper;
    }

    @Override
    public void setZookeeper(Zookeeper zookeeper) {
        this.zookeeper = zookeeper;
    }

    @Override
    public int getRequiredExpert() {
        return requiredExpert;
    }

    public void setRequiredExpert(int requiredExpert) {
        this.requiredExpert = requiredExpert;
    }
    
            @Override
    public String toString() 
    {
        return "Avian\n Animal = " +animals+"\n"
                + "Flight = "+" Yes"+"\n"
                + "Zookeeper = "+zookeeper+"\n";
    }
    
}
