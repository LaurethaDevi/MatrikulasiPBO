/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package section2martikulasioop;

/**
 *
 * @author Devi - BOE
 */
//public menjelaskan bahwa semua class bisa diakses oleh Section2Matrikulasioop
public class Customer {
        //properties
        String Nama;
        String Address;
        int Age;
        String order_number;
        String customer_number;
        
        //behavior, void artinya general
        void shop(){
            
        }
        void setAddress(String address){
            this.Address = address ;
            
        }
        void addItemToChart(String Item){
            
        }
        String askDiscount(){
            return "";
            
        }
        void displayCustomer(){
            System.out.println("\nNama: " +this.Nama + 
                    "\nAlamat : "+this.Address +
                    "\nUsia : " +this.Age + 
                    "\nCustomer Number : " +this.customer_number + 
                    "\nOrder Number : " +this.order_number);
        }
}
