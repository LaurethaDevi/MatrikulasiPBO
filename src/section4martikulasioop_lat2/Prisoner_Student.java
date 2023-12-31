/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package section4martikulasioop_lat2;

/**
 *
 * @author Devi - BOE
 */
public class Prisoner_Student {
        //Fields 
    public String name;
    public double height;
    public int sentence;
    private int prisonerID;
    private Cell1 cell; //Add Cell field
    
    //Constructor
    public Prisoner_Student(String name, int prisonerID, Cell1 cell){
 	this.name = name;
 	this.prisonerID = prisonerID;
 	this.cell = cell;// Set the Cell field based on constructor parameter
    }
    
    //Methods
    public void think(){
       System.out.println("I'll have my revenge.");
    }
    
    public String getName() {
        return name;
    }

    public int getPrisonerID() {
       return prisonerID;
    }

    public Cell1 getCell() {
       return cell;
  }
   //Exercise 1, Part 2
    public void openDoor() {
        // Access and modify the corresponding field in the Cell object
        if (cell.isDoorOpen()) {
            cell.setDoorOpen(false);
            System.out.println("Door is closed.");
        } else {
            cell.setDoorOpen(true);
            System.out.println("Door is opened.");
        }
    }
    public void display(){
        //System.out.println("Name: " +name);
        //System.out.println("Height: " +height);
        //System.out.println("Sentence: " +sentence);
        
        System.out.println("Prisoner Information:");
        System.out.println("Name: " + name);
        System.out.println("Prisoner ID: " + prisonerID);
        System.out.println("Cell Name: " + cell.getCellName());  // Print the cell's name
    }
    
}
