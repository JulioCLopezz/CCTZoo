/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package zoo;
import zoo.setuphelper.Printing;
import zoo.setuphelper.SetUpData;
import java.util.InputMismatchException;
import java.util.Random;
import java.util.Scanner;
/**
 *
 * @author Nancy Aguilera
 */
public class ModifyAnimal {
    
    Scanner kBNum = new Scanner(System.in);
    Scanner kBTxt = new Scanner(System.in);
    Random rG = new Random();
    
    /**
     *
     * @param setData
     * @param printOut
     */
    public void addAnimals(SetUpData setData,Printing printOut)
    {
        System.out.println("How many Animals do you want to add?  - (max 5)");
        try{
            int num = kBNum.nextInt();
            if(num>5)
            {
              System.out.println("sorry, system only allows max of 5");
              addAnimals(setData,printOut);
            }
            else
            {
                for(int i=1;i<=num;i++)
                { 
                    System.out.println("select Animal Type ");
                    System.out.println("\n1 for Mammal\n 2 for Aquatic\n 3 for Reptile\n 4 for Insect\n"
                            + "5 for Avian\n 6 for Aquatic-Mammal\n 7 for Avian-aquatic\n"
                            + "8 for Avian-mammal\n 9 for Reptile-aquatic");
                    int type = kBNum.nextInt();
                    if(type==1)
                    {
                      int j = 1;
                        for(String s : setData.sDU.mammalAnimals)
                        {
                            System.out.println("enter "+ j +" for : "+s);
                            j++;
                        } 
                        System.out.println("Select the animal you want to add");
                        Mammal mal = new Mammal();
                        mal.setAnimals(setData.sDU.mammalAnimals[kBNum.nextInt()-1]);
                       mal.setRequiredExpert(rG.nextInt(5)+1);
                       System.out.println("required Zookeeper expert of : "+mal.getRequiredExpert());
                        System.out.println("currently available zookeepers qualified to take care of the animal");
                       
                        for(int l=0;l< setData.currentZookeeper.size();l++)
                        {                            
                            if(setData.currentZookeeper.get(l).getExpert()>=mal.getRequiredExpert())
                            {
                                System.out.println("Zookeeper id No. : "+l+" "
                                        +setData.currentZookeeper.get(l));
                            }
                        }
                        kBNum.nextLine();
                        System.out.println("please enter the id No. of your Zookeeper");
                        mal.setZookeeper(setData.currentZookeeper.get(kBNum.nextInt()));
                        Animal animal = new Animal();
                        animal.setTypeAssigned(mal);
                        System.out.println("please enter a date of birth (dd/mm/yy)");
                        animal.setDateofbirth(kBTxt.nextLine());
                         System.out.println("please enter a date of arrival (dd/mm/yy)");
                        animal.setDateofarrival(kBTxt.nextLine());
                         System.out.println("please enter gender (male/female)");
                        animal.setGender(kBTxt.nextLine());
                         System.out.println("please enter offspring (Yes/No)");
                        animal.setOffspring(kBTxt.nextLine());
                         System.out.println("please enter medication (Yes/No)");
                        animal.setMedication(kBTxt.nextLine());
                         System.out.println("please enter vaccine (Yes/No)");
                        animal.setVaccine(kBTxt.nextLine());
                        System.out.println("please enter exhibit number ");
                        animal.setExhibitnumber(kBTxt.nextLine());
                        
                        setData.currentAnimals.add(animal);                     
                    }
                    else if(type==2){ 
                    int j = 1;
                        for(String s : setData.sDU.aquaticAnimals)
                        {
                            System.out.println("enter "+ j +" for : "+s);
                            j++;
                        } 
                        System.out.println("Select the animal you want to add");
                        Aquatic aquatic = new Aquatic();
                        aquatic.setAnimals(setData.sDU.aquaticAnimals[kBNum.nextInt()-1]);
                       aquatic.setRequiredExpert(rG.nextInt(5)+1);
                       System.out.println("required Zookeeper expert of : "+aquatic.getRequiredExpert());
                        System.out.println("currently available zookeepers qualified to take care of the animal");
                       
                        for(int l=0;l< setData.currentZookeeper.size();l++)
                        {                            
                            if(setData.currentZookeeper.get(l).getExpert()>=aquatic.getRequiredExpert())
                            {
                                System.out.println("Zookeeper id No. : "+l+" "
                                        +setData.currentZookeeper.get(l));
                            }
                        }
                        kBNum.nextLine();
                        System.out.println("please enter the id No. of your Zookeeper");
                        aquatic.setZookeeper(setData.currentZookeeper.get(kBNum.nextInt()));
                        Animal animal = new Animal();
                        animal.setTypeAssigned(aquatic);
                        System.out.println("please enter a date of birth (dd/mm/yy)");
                        animal.setDateofbirth(kBTxt.nextLine());
                         System.out.println("please enter a date of arrival (dd/mm/yy)");
                        animal.setDateofarrival(kBTxt.nextLine());
                         System.out.println("please enter gender (male/female)");
                        animal.setGender(kBTxt.nextLine());
                         System.out.println("please enter offspring (Yes/No)");
                        animal.setOffspring(kBTxt.nextLine());
                         System.out.println("please enter medication (Yes/No)");
                        animal.setMedication(kBTxt.nextLine());
                         System.out.println("please enter vaccine (Yes/No)");
                        animal.setVaccine(kBTxt.nextLine());
                        System.out.println("please enter exhibit number ");
                        animal.setExhibitnumber(kBTxt.nextLine());
                        
                        setData.currentAnimals.add(animal);    
                    }
                    else if(type==3){ 
                    int j = 1;
                        for(String s : setData.sDU.reptileAnimals)
                        {
                            System.out.println("enter "+ j +" for : "+s);
                            j++;
                        } 
                        System.out.println("Select the animal you want to add");
                        Reptile reptile = new Reptile();
                        reptile.setAnimals(setData.sDU.reptileAnimals[kBNum.nextInt()-1]);
                       reptile.setRequiredExpert(rG.nextInt(5)+1);
                       System.out.println("required Zookeeper expert of : "+reptile.getRequiredExpert());
                        System.out.println("currently available zookeepers qualified to take care of the animal");
                       
                        for(int l=0;l< setData.currentZookeeper.size();l++)
                        {                            
                            if(setData.currentZookeeper.get(l).getExpert()>=reptile.getRequiredExpert())
                            {
                                System.out.println("Zookeeper id No. : "+l+" "
                                        +setData.currentZookeeper.get(l));
                            }
                        }
                        kBNum.nextLine();
                        System.out.println("please enter the id No. of your Zookeeper");
                        reptile.setZookeeper(setData.currentZookeeper.get(kBNum.nextInt()));
                        Animal animal = new Animal();
                        animal.setTypeAssigned(reptile);
                        System.out.println("please enter a date of birth (dd/mm/yy)");
                        animal.setDateofbirth(kBTxt.nextLine());
                         System.out.println("please enter a date of arrival (dd/mm/yy)");
                        animal.setDateofarrival(kBTxt.nextLine());
                         System.out.println("please enter gender (male/female)");
                        animal.setGender(kBTxt.nextLine());
                         System.out.println("please enter offspring (Yes/No)");
                        animal.setOffspring(kBTxt.nextLine());
                         System.out.println("please enter medication (Yes/No)");
                        animal.setMedication(kBTxt.nextLine());
                         System.out.println("please enter vaccine (Yes/No)");
                        animal.setVaccine(kBTxt.nextLine());
                        System.out.println("please enter exhibit number ");
                        animal.setExhibitnumber(kBTxt.nextLine());
                        
                        setData.currentAnimals.add(animal);    
                    }
                    else if(type==4)
                        {
                      int j = 1;
                        for(String s : setData.sDU.insectAnimals)
                        {
                            System.out.println("enter "+ j +" for : "+s);
                            j++;
                        } 
                        System.out.println("Select the animal you want to add");
                        Insect insect = new Insect();
                        insect.setAnimals(setData.sDU.insectAnimals[kBNum.nextInt()-1]);
                       insect.setRequiredExpert(rG.nextInt(5)+1);
                       System.out.println("required Zookeeper expert of : "+insect.getRequiredExpert());
                        System.out.println("currently available zookeepers qualified to take care of the animal");
                       
                        for(int l=0;l< setData.currentZookeeper.size();l++)
                        {                            
                            if(setData.currentZookeeper.get(l).getExpert()>=insect.getRequiredExpert())
                            {
                                System.out.println("Zookeeper id No. : "+l+" "
                                        +setData.currentZookeeper.get(l));
                            }
                        }
                        kBNum.nextLine();
                        System.out.println("please enter the id No. of your Zookeeper");
                        insect.setZookeeper(setData.currentZookeeper.get(kBNum.nextInt()));
                        Animal animal = new Animal();
                        animal.setTypeAssigned(insect);
                         System.out.println("please enter a date of birth (dd/mm/yy)");
                        animal.setDateofbirth(kBTxt.nextLine());
                         System.out.println("please enter a date of arrival (dd/mm/yy)");
                        animal.setDateofarrival(kBTxt.nextLine());
                         System.out.println("please enter gender (male/female)");
                        animal.setGender(kBTxt.nextLine());
                         System.out.println("please enter offspring (Yes/No)");
                        animal.setOffspring(kBTxt.nextLine());
                         System.out.println("please enter medication (Yes/No)");
                        animal.setMedication(kBTxt.nextLine());
                         System.out.println("please enter vaccine (Yes/No)");
                        animal.setVaccine(kBTxt.nextLine());
                        System.out.println("please enter exhibit number ");
                        animal.setExhibitnumber(kBTxt.nextLine());
                        
                        setData.currentAnimals.add(animal);                                         
                    } 
                    else if(type==5){   
                      int j = 1;
                        for(String s : setData.sDU.avianAnimals)
                        {
                            System.out.println("enter "+ j +" for : "+s);
                            j++;
                        } 
                    System.out.println("Select the animal you want to add");
                        Avian avian = new Avian();
                        avian.setAnimals(setData.sDU.avianAnimals[kBNum.nextInt()-1]);
                        System.out.println("please select if the animal flight");
                        int k = 1;
                       for(String s : setData.sDU.avianFlight)
                        {
                            System.out.println("enter "+ k +" for : "+s);
                            k++;
                        }
                       avian.setAnimals(setData.sDU.avianFlight[kBNum.nextInt()-1]);
                       avian.setRequiredExpert(rG.nextInt(5)+1);
                       System.out.println("required Zookeeper rating of : "+avian.getRequiredExpert());
                       System.out.println("currently available zookeepers qualified to take care of the animal");
                       
                        for(int l=0;l< setData.currentZookeeper.size();l++)
                        { 
                            if(setData.currentZookeeper.get(l).getExpert()>=avian.getRequiredExpert())
                            {
                                System.out.println("Zookeeper id No. : "+l+" "
                                        +setData.currentZookeeper.get(l));
                            }
                        }
                        kBNum.nextLine();
                        System.out.println("please enter the id No. of your Zookeeper");
                        avian.setZookeeper(setData.currentZookeeper.get(kBNum.nextInt()));
                        Animal animal = new Animal();
                        animal.setTypeAssigned(avian);
                         System.out.println("please enter a date of birth (dd/mm/yy)");
                        animal.setDateofbirth(kBTxt.nextLine());
                         System.out.println("please enter a date of arrival (dd/mm/yy)");
                        animal.setDateofarrival(kBTxt.nextLine());
                         System.out.println("please enter gender (male/female)");
                        animal.setGender(kBTxt.nextLine());
                         System.out.println("please enter offspring (Yes/No)");
                        animal.setOffspring(kBTxt.nextLine());
                         System.out.println("please enter medication (Yes/No)");
                        animal.setMedication(kBTxt.nextLine());
                         System.out.println("please enter vaccine (Yes/No)");
                        animal.setVaccine(kBTxt.nextLine());
                        System.out.println("please enter exhibit number ");
                        animal.setExhibitnumber(kBTxt.nextLine());
                        
                        setData.currentAnimals.add(animal);                                         
                  }
                    else if(type==6){
                      int j = 1;
                        for(String s : setData.sDU.aquaticMammalAnimals)
                        {
                            System.out.println("enter "+ j +" for : "+s);
                            j++;
                        } 
                        System.out.println("Select the animal you want to add");
                        AquaticMammal aqm = new AquaticMammal();
                        aqm.setAnimals(setData.sDU.aquaticMammalAnimals[kBNum.nextInt()-1]);
                       aqm.setRequiredExpert(rG.nextInt(5)+1);
                       System.out.println("required Zookeeper expert of : "+aqm.getRequiredExpert());
                        System.out.println("currently available zookeepers qualified to take care of the animal");
                       
                        for(int l=0;l< setData.currentZookeeper.size();l++)
                        {                            
                            if(setData.currentZookeeper.get(l).getExpert()>=aqm.getRequiredExpert())
                            {
                                System.out.println("Zookeeper id No. : "+l+" "
                                        +setData.currentZookeeper.get(l));
                            }
                        }
                        kBNum.nextLine();
                        System.out.println("please enter the id No. of your Zookeeper");
                        aqm.setZookeeper(setData.currentZookeeper.get(kBNum.nextInt()));
                        Animal animal = new Animal();
                        animal.setTypeAssigned(aqm);
                         System.out.println("please enter a date of birth (dd/mm/yy)");
                        animal.setDateofbirth(kBTxt.nextLine());
                         System.out.println("please enter a date of arrival (dd/mm/yy)");
                        animal.setDateofarrival(kBTxt.nextLine());
                         System.out.println("please enter gender (male/female)");
                        animal.setGender(kBTxt.nextLine());
                         System.out.println("please enter offspring (Yes/No)");
                        animal.setOffspring(kBTxt.nextLine());
                         System.out.println("please enter medication (Yes/No)");
                        animal.setMedication(kBTxt.nextLine());
                         System.out.println("please enter vaccine (Yes/No)");
                        animal.setVaccine(kBTxt.nextLine());
                        System.out.println("please enter exhibit number ");
                        animal.setExhibitnumber(kBTxt.nextLine());
                        
                        setData.currentAnimals.add(animal);                                          
                    }
                    else if(type==7){
                    int j = 1;
                        for(String s : setData.sDU.avianAquaticAnimals)
                        {
                            System.out.println("enter "+ j +" for : "+s);
                            j++;
                        } 
                    System.out.println("Select the animal you want to add");
                        AvianAquatic avq = new AvianAquatic();
                        avq.setAnimals(setData.sDU.avianAquaticAnimals[kBNum.nextInt()-1]);

                       avq.setRequiredExpert(rG.nextInt(5)+1);
                       System.out.println("required Zookeeper rating of : "+avq.getRequiredExpert());
                       System.out.println("currently available zookeepers qualified to take care of the animal");
                       
                        for(int l=0;l< setData.currentZookeeper.size();l++)
                        { 
                            if(setData.currentZookeeper.get(l).getExpert()>=avq.getRequiredExpert())
                            {
                                System.out.println("Zookeeper id No. : "+l+" "
                                        +setData.currentZookeeper.get(l));
                            }
                        }
                        kBNum.nextLine();
                        System.out.println("please enter the id No. of your Zookeeper");
                        avq.setZookeeper(setData.currentZookeeper.get(kBNum.nextInt()));
                        Animal animal = new Animal();
                        animal.setTypeAssigned(avq);
                         System.out.println("please enter a date of birth (dd/mm/yy)");
                        animal.setDateofbirth(kBTxt.nextLine());
                         System.out.println("please enter a date of arrival (dd/mm/yy)");
                        animal.setDateofarrival(kBTxt.nextLine());
                         System.out.println("please enter gender (male/female)");
                        animal.setGender(kBTxt.nextLine());
                         System.out.println("please enter offspring (Yes/No)");
                        animal.setOffspring(kBTxt.nextLine());
                         System.out.println("please enter medication (Yes/No)");
                        animal.setMedication(kBTxt.nextLine());
                         System.out.println("please enter vaccine (Yes/No)");
                        animal.setVaccine(kBTxt.nextLine());
                        System.out.println("please enter exhibit number ");
                        animal.setExhibitnumber(kBTxt.nextLine());
                        
                        setData.currentAnimals.add(animal);
                    }
                    else if(type==8){
                    int j = 1;
                        for(String s : setData.sDU.avianMammalAnimals)
                        {
                            System.out.println("enter "+ j +" for : "+s);
                            j++;
                        } 
                    System.out.println("Select the animal you want to add");
                        AvianMammal avm = new AvianMammal();
                        avm.setAnimals(setData.sDU.avianMammalAnimals[kBNum.nextInt()-1]);
                        System.out.println("please select if the animal flight");
                        int k = 1;
                       for(String s : setData.sDU.avianFlight)
                        {
                            System.out.println("enter "+ k +" for : "+s);
                            k++;
                        }
                       avm.setAnimals(setData.sDU.avianFlight[kBNum.nextInt()-1]);
                       avm.setRequiredExpert(rG.nextInt(5)+1);
                       System.out.println("required Zookeeper rating of : "+avm.getRequiredExpert());
                       System.out.println("currently available zookeepers qualified to take care of the animal");
                       
                        for(int l=0;l< setData.currentZookeeper.size();l++)
                        { 
                            if(setData.currentZookeeper.get(l).getExpert()>=avm.getRequiredExpert())
                            {
                                System.out.println("Zookeeper id No. : "+l+" "
                                        +setData.currentZookeeper.get(l));
                            }
                        }
                        kBNum.nextLine();
                        System.out.println("please enter the id No. of your Zookeeper");
                        avm.setZookeeper(setData.currentZookeeper.get(kBNum.nextInt()));
                        Animal animal = new Animal();
                        animal.setTypeAssigned(avm);
                         System.out.println("please enter a date of birth (dd/mm/yy)");
                        animal.setDateofbirth(kBTxt.nextLine());
                         System.out.println("please enter a date of arrival (dd/mm/yy)");
                        animal.setDateofarrival(kBTxt.nextLine());
                         System.out.println("please enter gender (male/female)");
                        animal.setGender(kBTxt.nextLine());
                         System.out.println("please enter offspring (Yes/No)");
                        animal.setOffspring(kBTxt.nextLine());
                         System.out.println("please enter medication (Yes/No)");
                        animal.setMedication(kBTxt.nextLine());
                         System.out.println("please enter vaccine (Yes/No)");
                        animal.setVaccine(kBTxt.nextLine());
                        System.out.println("please enter exhibit number ");
                        animal.setExhibitnumber(kBTxt.nextLine());
                        
                        setData.currentAnimals.add(animal);
                    }
                    else if(type==9){                      
                        int j = 1;
                        for(String s : setData.sDU.reptileAquaticAnimals)
                        {
                            System.out.println("enter "+ j +" for : "+s);
                            j++;
                        } 
                        System.out.println("Select the animal you want to add");
                        ReptileAquatic ra = new ReptileAquatic();
                        ra.setAnimals(setData.sDU.reptileAquaticAnimals[kBNum.nextInt()-1]);
                       ra.setRequiredExpert(rG.nextInt(5)+1);
                       System.out.println("required Zookeeper expert of : "+ra.getRequiredExpert());
                        System.out.println("currently available zookeepers qualified to take care of the animal");
                       
                        for(int l=0;l< setData.currentZookeeper.size();l++)
                        {                            
                            if(setData.currentZookeeper.get(l).getExpert()>=ra.getRequiredExpert())
                            {
                                System.out.println("Zookeeper id No. : "+l+" "
                                        +setData.currentZookeeper.get(l));
                            }
                        }
                        kBNum.nextLine();
                        System.out.println("please enter the id No. of your Zookeeper");
                        ra.setZookeeper(setData.currentZookeeper.get(kBNum.nextInt()));
                        Animal animal = new Animal();
                        animal.setTypeAssigned(ra);
                         System.out.println("please enter a date of birth (dd/mm/yy)");
                        animal.setDateofbirth(kBTxt.nextLine());
                         System.out.println("please enter a date of arrival (dd/mm/yy)");
                        animal.setDateofarrival(kBTxt.nextLine());
                         System.out.println("please enter gender (male/female)");
                        animal.setGender(kBTxt.nextLine());
                         System.out.println("please enter offspring (Yes/No)");
                        animal.setOffspring(kBTxt.nextLine());
                         System.out.println("please enter medication (Yes/No)");
                        animal.setMedication(kBTxt.nextLine());
                         System.out.println("please enter vaccine (Yes/No)");
                        animal.setVaccine(kBTxt.nextLine());
                        System.out.println("please enter exhibit number ");
                        animal.setExhibitnumber(kBTxt.nextLine());
                        
                        setData.currentAnimals.add(animal); }
                }
                printOut.displayAnimals(setData);
            }
        }catch(InputMismatchException e)
        {
          System.out.println("please try again");
          kBTxt.next();
          kBNum.next();
          addAnimals(setData,printOut);
        }
    }
    
    /**
     *
     * @param setData
     * @param printOut
     */
    public void updateAnimals(SetUpData setData,Printing printOut)
    {
        Scanner kBNum = new Scanner(System.in);
        Scanner kBTxt = new Scanner(System.in);
        int animalUpdated = 0;
      System.out.println();
      System.out.println("Currently animals inside the zoo");
      System.out.println("please enter the animal No. you want to update");
        for(int i=0;i< setData.currentAnimals.size();i++)
        {
           System.out.println();
           System.out.println("//////////////////////////////////////////////");
            Animal animal = setData.currentAnimals.get(i);
           System.out.println("Animal No. : "+(i+1));
           System.out.println(animal);
           System.out.println();
           System.out.println("//////////////////////////////////////////////");           
        }
        animalUpdated = kBNum.nextInt()-1;
        Animal animal = setData.currentAnimals.get(animalUpdated);
        
        System.out.println("Update animal info");
            System.out.println("enter new arrival date");
            String dateofarrival = kBTxt.nextLine();
            System.out.println("enter new date of birth of the animal");
            String dateofbirth = kBTxt.nextLine();
            System.out.println("enter new gender for the animal");
            String gender = kBTxt.nextLine();
            System.out.println("enter new offspring");
            String offspring = kBTxt.nextLine();
            System.out.println("enter new medication");
            String medication = kBTxt.nextLine();
            System.out.println("enter new vaccine");
            String vaccine = kBTxt.nextLine();
            System.out.println("enter new exhibit number");
            String exhibitnumber = kBTxt.nextLine();
            animal.info(dateofarrival, dateofbirth, gender,offspring,medication,vaccine, exhibitnumber);
            System.out.println("The animal has been updated");
            setData.currentAnimals.set(animalUpdated, animal);
            printOut.displayAnimals(setData);
    }
    
    public void searchAnimals(SetUpData setData,Printing printOut)
    {
        Scanner kBNum = new Scanner(System.in);
        Scanner kBTxt = new Scanner(System.in);
        int animalSearch = 0;
      System.out.println();
      System.out.println("Currently animals inside the zoo");
      System.out.println("To find an animal, insert the ID ");
        for(int i=0;i< setData.currentAnimals.size();i++)
        {
           System.out.println();
           System.out.println("//////////////////////////////////////////////");
           Animal animal = setData.currentAnimals.get(i);
           System.out.println("Animal No. : "+(i+1));
           System.out.println(animal);
           System.out.println();
           System.out.println("//////////////////////////////////////////////");
            System.out.println("Searching by ID, insert the ID of the animal ");
        }
        animalSearch = kBNum.nextInt()-1;
        Animal animal = setData.currentAnimals.get(animalSearch);
            setData.currentAnimals.set(animalSearch, animal);
            //printOut.displayAnimals(setData);
            System.out.println(animal);
            
    }
    
}
