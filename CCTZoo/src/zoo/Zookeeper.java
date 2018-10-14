/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package zoo;

/**
 *
 * @author Nancy Aguilera
 */
public class Zookeeper {
        
    private String name;
    private int expert;

    Zookeeper(String name, int expert) {
        super();
		this.name = name;
		this.expert = expert;
    }
    
    public Zookeeper() {
        }
    
    public void infoZooke(String name, int expert)
    {
        setName(name);
        setExpert(expert);
    }
    
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
    
    public int getExpert() {
        return expert;
    }

    public void setExpert(int expert) {
        this.expert = expert;
    }
 
        @Override
	public String toString() {
		return "Zookeeper [Name = " + name + ", Expert = " + expert + "] \n";
	}
    
}
