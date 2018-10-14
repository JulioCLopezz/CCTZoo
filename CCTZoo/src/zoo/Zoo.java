/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package zoo;

import zoo.setuphelper.SetUpData;

/**
 * Main Class of the project 
 * @author Nancy Aguilera
 * @author Cesar Garcia
 * @author Julio Lopez
 */
public class Zoo {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
       SetUpData setData = new SetUpData();
       SetUp mnu = new SetUp();      
       setData.getItReady();
       System.out.println("///////////  Welcome to the Zoo \\\\\\\\\\\\\\");
       System.out.println("//////////////////////////////////////////////");      
       mnu.Choices(setData); 
        
    }
    
}
