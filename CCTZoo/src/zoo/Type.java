/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package zoo;

/**
 * @author Cesar Gracia
 * @author Nancy Aguilera
 */
public interface Type {
    
    void setZookeeper(Zookeeper zookeeper);
    /**
     *
     * @return
     */
    int getRequiredExpert();
    
}
