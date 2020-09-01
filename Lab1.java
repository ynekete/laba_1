/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab1;
import java.util.Scanner;
/**
 *
 * @author student
 */
public class Lab1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
         int Sum = 0;  
                        Scanner s = new Scanner(System.in);  
                        int[]a= new int[10];  
                        int i=0;  
                        System.out.println("Введите элементы массива");  
//                        while ( i < 10) {  
//                            a[i]=s.nextInt();  
//                            Sum=Sum+a[i];  
//                            i++;  
//                        }  
//                        for(int j = 0; j < 10; j++){
//                            a[i]=s.nextInt();
//                            Sum = Sum+a[i];                 
//                        }
                          do{
                            a[i]=s.nextInt();  
                            Sum=Sum+a[i];  
                            i++; 
                          }                        
                          while(i < 10);
                        System.out.println("Сумма ="+Sum);  
    }
    
}
