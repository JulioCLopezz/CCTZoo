/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package zoo;
import zoo.setuphelper.Printing;
import zoo.setuphelper.SetUpData;
import java.util.InputMismatchException;
import java.util.Scanner;

/**
 * Class holding the menu that will allow interact with the programm
 * @author Julio Lopez
 */
public class SetUp 
{
    Printing printOut = new Printing();
    ModifyAnimal changeAnil = new ModifyAnimal();
    ModifyZookeeper changeZooke = new ModifyZookeeper();
    Scanner kB = new Scanner(System.in);
    
    /**
     * Method that hold the menu and different choices allowed for this programm
     * @param setData SetUpData Array List that contain the whole data generated
     */
    public void Choices(SetUpData setData)
    {
        //Menu with options
        System.out.println("please make your choice from the options below");
        System.out.println();
        System.out.println("enter 1 to view the list of animals");
        System.out.println("enter 2 to add an animal");
        System.out.println("enter 3 to update an animal");
        System.out.println("enter 4 to search an animal");
        System.out.println("enter 5 to view the list of zookeepers");
        System.out.println("enter 6 to add a zookeeper");
        System.out.println("enter 7 to update a zookeeper");
        System.out.println("enter 8 to search a zookeeper");
        System.out.println("enter 0 to exit program");
        //Variable choice to hold the selection of user
        int choice = kB.nextInt();
      try{  
         switch(choice)
         {
           //option to display the Animals and details
           case 1: printOut.displayAnimals(setData);
                   System.out.println();
                   Choices(setData);                    
               break;
               
           //option to add animals
           case 2: changeAnil.addAnimals(setData, printOut);
                   System.out.println();
                   Choices(setData);
               break;
           //option to update animals    
           case 3: changeAnil.updateAnimals(setData, printOut);
                   System.out.println();
                   Choices(setData);
               break;
               
            //option to search for animals   
            case 4: changeAnil.searchAnimals(setData, printOut);
                   System.out.println();
                   Choices(setData);
               break;
               
           //option to display zookeepers
           case 5: printOut.displayZookeeper(setData);
                    System.out.println();
                    Choices(setData);
            //option to add zookeeper        
            case 6: changeZooke.addZookeepers(setData, printOut);
                   System.out.println();
                   Choices(setData);
               break;
            
            //option to update zookeeper
            case 7: changeZooke.updateZookeepers(setData, printOut);
                   System.out.println();
                   Choices(setData);
               break;
            
            //option to search zookeeper
            case 8: changeZooke.searchZookeepers(setData, printOut);
                   System.out.println();
                   Choices(setData);
               break;
               
            //option to leave the programm
           case 0: System.out.println("closing system.... Bye");
                   System.exit(0);
                   
            //default action in case of mismatch
           default:System.out.println("Wrong option !");
                   System.out.println("please try again");
             Choices(setData);                         
         }
      }catch(InputMismatchException e)
      {
        System.out.println("please try again");
        kB.next();
        Choices(setData);
      }
    }    
}
