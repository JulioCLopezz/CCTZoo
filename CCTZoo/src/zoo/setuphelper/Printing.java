
package zoo.setuphelper;

import zoo.Animal;
import zoo.Zookeeper;
import zoo.setuphelper.SetUpData;
import zoo.Type;

/**
 * Class to print the Data generated
 * @author Julio Lopez
 */
public class Printing 
{
    /**
     * Method to display the animals details held in the ArrayList
     * @param setData
     */
    public void displayAnimals(SetUpData setData)
    {
        for(int i = 0; i<setData.currentAnimals.size();i++)
        {
            System.out.println("Animal No : "+(i+1));
            Animal f = setData.currentAnimals.get(i);
            System.out.println(f);
            System.out.println();
            System.out.println("///////////////////////////////////////////////");
            System.out.println();            
        }
    }
    
    /**
     * Method to display the details of the different type of animals
     * @param setData SetUpData ArrayList
    */
    public void displayType(SetUpData setData)
    {
        for(int i = 0; i<setData.currentType.size();i++)
        {
            System.out.println("Type No : "+(i+1));
            Type ty = setData.currentType.get(i);
            System.out.println(ty);
            System.out.println();
            System.out.println("///////////////////////////////////////////////");
            System.out.println();            
        }
    }
    
    /**
     * Method to display the zookeeper details
     * @param setData SetUpData ArrayList with all the zookeeper details
     */
    public void displayZookeeper(SetUpData setData)
    {
        for(int i = 0; i<setData.currentZookeeper.size();i++)
        {
            System.out.println("Zookeeper id No : "+(i+1));
            Zookeeper zok = setData.currentZookeeper.get(i);
            System.out.println(zok);
            System.out.println();
            System.out.println("///////////////////////////////////////////////");
            System.out.println();            
        }
    }
}
