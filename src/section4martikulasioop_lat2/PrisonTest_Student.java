/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package section4martikulasioop_lat2;

/**
 *
 * @author Devi - BOE
 */
public class PrisonTest_Student {
        public static void main(String[] args){
        Cell1 cell = new Cell1("Cell A", true);
        
        Prisoner_Student prisioner = new Prisoner_Student("John", 321, cell);
        
        //Display prisoner information
        prisioner.display();
        
        //Open or close the door
        prisioner.openDoor();
            
    }
    
}
