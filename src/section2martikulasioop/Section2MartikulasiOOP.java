/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package section2martikulasioop;

/**
 *
 * @author Devi - BOE
 */
//Yang dijalankan adalah yang ada setigita duluan
//Main Method

public class Section2MartikulasiOOP {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        Customer cust1 = new Customer();
        //memanggil properties
        cust1.Nama = "Bryan Susilo";
        cust1.Age = 25;
        cust1.customer_number = "00123";
        cust1.order_number = "00212";
        
        //memanggil behavior
        String alamat = " Jl. Raya Sukolilo" ;
        cust1.setAddress(alamat);
        
        cust1.displayCustomer();
        
    }
                   
    }
                    
 
