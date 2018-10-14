package zoo;
import zoo.setuphelper.Printing;
import zoo.setuphelper.SetUpData;
import java.util.InputMismatchException;
import java.util.Random;
import java.util.Scanner;
/**
 * @author Nancy Aguilera
 */
public class ModifyZookeeper {
    
    Scanner kBNum = new Scanner(System.in);
    Scanner kBTxt = new Scanner(System.in);
    Random rG = new Random();
    
    /**
     *
     * @param setData
     * @param printOut
     */
    public void addZookeepers(SetUpData setData,Printing printOut)
    {
        System.out.println("How many Zookeepers do you want to add?  - (max 5)");
        try{
            int num = kBNum.nextInt();
            if(num>5)
            {
              System.out.println("sorry, system only allows max of 5");
              addZookeepers(setData,printOut);
            }
            else
            {
                for(int i=1;i<=num;i++)
                { 
                    System.out.println("Adding a new zookeeper to the zoo");
                        Zookeeper zookeeper = new Zookeeper();
                        System.out.println("please enter name of the zookeeper");
                        zookeeper.setName(kBTxt.nextLine());
                        System.out.println("please enter expert level of the zookeeper (from 1 to 5)");
                        zookeeper.setExpert(kBTxt.nextInt());                           
                        setData.currentZookeeper.add(zookeeper);                     
                    }            
                }
            System.out.println("Zookeeper added!");
                printOut.displayZookeeper(setData);
        }catch(InputMismatchException e)
        {
          System.out.println("please try again");
          kBTxt.next();
          kBNum.next();
          addZookeepers(setData,printOut);
        }
    }
    
    /**
     *
     * @param setData
     * @param printOut
     */
    public void updateZookeepers(SetUpData setData,Printing printOut)
    {
        Scanner kBNum = new Scanner(System.in);
        Scanner kBTxt = new Scanner(System.in);
        int zookeeperUpdated = 0;
      System.out.println();
      System.out.println("Currently zookeepers inside the zoo");
      System.out.println("please enter the zookeeper No. you want to update");
        for(int i=0;i< setData.currentZookeeper.size();i++)
        {
           System.out.println();
           System.out.println("//////////////////////////////////////////////");
            Zookeeper zookeeper = setData.currentZookeeper.get(i);
           System.out.println("Zookeeper No. : "+(i+1));
           System.out.println(zookeeper);
           System.out.println();
           System.out.println("//////////////////////////////////////////////");
            System.out.println("Select the ID of the zookeeper you want to update");
        }
        zookeeperUpdated = kBNum.nextInt()-1;
        Zookeeper zookeeper = setData.currentZookeeper.get(zookeeperUpdated);
        System.out.println("Insert a new Zookeeper");
            System.out.println("enter the name of the new zookeeper");
            String name = kBTxt.nextLine();
            System.out.println("enter the level of expert of the zookeeper (from 1 to 5)");
            int expert = kBTxt.nextInt();
            zookeeper.infoZooke(name, expert);
            System.out.println("The zookeeper has been updated");
            setData.currentZookeeper.set(zookeeperUpdated, zookeeper);
            printOut.displayZookeeper(setData);
            
    }
    
     public void searchZookeepers(SetUpData setData,Printing printOut)
    {
        Scanner kBNum = new Scanner(System.in);
        Scanner kBTxt = new Scanner(System.in);
        int zookeeperSearch = 0;
      System.out.println();
      System.out.println("Currently zookeepers inside the zoo");
      System.out.println("To find a zookeeper, insert the ID ");
        for(int i=0;i< setData.currentZookeeper.size();i++)
        {
           System.out.println();
           System.out.println("//////////////////////////////////////////////");
            Zookeeper zookeeper = setData.currentZookeeper.get(i);
           System.out.println("Zookeeper No. : "+(i+1));
           System.out.println(zookeeper);
           System.out.println();
           System.out.println("//////////////////////////////////////////////");
            System.out.println("Searching by ID, insert the ID of the zookeeper ");
        }
        zookeeperSearch = kBNum.nextInt()-1;
        Zookeeper zookeeper = setData.currentZookeeper.get(zookeeperSearch);
            setData.currentZookeeper.set(zookeeperSearch, zookeeper);
            //printOut.displayZookeeper(setData);
            System.out.println(zookeeper);
    }
    
}
