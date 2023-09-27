/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package section4martikulasioop;

/**
 *
 * @author Devi - BOE
 */
public class PrisonTest_Student_7_5 {
    public static void main(String[] args){
        Cell cell = new Cell("Cell A", true);
        
        Prisoner_Student_7_5 prisioner = new Prisoner_Student_7_5("John", 321, cell);
        
        //Display prisoner information
        prisioner.display();
        
        //Open or close the door
        prisioner.openDoor();
            
    }
}
