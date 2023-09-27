/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package section4martikulasioop_lat3;

import section4martikulasioop_lat2.Cell1;

/**
 *
 * @author Devi - BOE
 */
public class Prisoner_Student {

    private String name;
    private int prisonerID;
    private Cell3 cell;

    public Prisoner_Student(String name, int prisonerID, Cell3 cell) {
        this.name = name;
        this.prisonerID = prisonerID;
        this.cell = cell;
    }

    public String getName() {
        return name;
    }

    public int getPrisonerID() {
        return prisonerID;
    }

    public Cell3 getCell() {
        return cell;
    }

    public void display() {
        System.out.println("Prisoner Information:");
        System.out.println("Name: " + name);
        System.out.println("Prisoner ID: " + prisonerID);
        System.out.println("Cell Name: " + cell.getCellName());  // Print the cell's name
    }
}


