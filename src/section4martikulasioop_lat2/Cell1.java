/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package section4martikulasioop_lat2;

/**
 *
 * @author Devi - BOE
 */
public class Cell1 {
    private String cellName;   // Name of the cell
    private boolean isDoorOpen; // Boolean to describe whether the door is open or not

    // Two-argument constructor
    private Cell1(String cellName, boolean isDoorOpen) {
        this.cellName = cellName;
        this.isDoorOpen = isDoorOpen;
    }

    // Getter for cellName
    public String getCellName() {
        return cellName;
    }

    // Setter for cellName
    public void setCellName(String cellName) {
        this.cellName = cellName;
    }

    // Getter for isDoorOpen
    public boolean isDoorOpen() {
        return isDoorOpen;
    }

    // Setter for isDoorOpen
    public void setDoorOpen(boolean doorOpen) {
        isDoorOpen = doorOpen;
    }

    @Override
    public String toString() {
        return "Cell{" +
                "cellName='" + cellName + '\'' +
                ", isDoorOpen=" + isDoorOpen +
                '}';
    }
    
}
