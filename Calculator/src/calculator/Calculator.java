/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package calculator;

import java.util.Scanner;

/**
 *
 * @author baris
 */
public class Calculator {
    
    
    public static void main(String[] args) {
        
        int a = 5, b = 3, func;
        Scanner bar = new Scanner(System.in);
        
        System.out.println("Toplama için 0 giriniz\n"
                + "Çikarma için 1 giriniz\n"
                + "Çarpma için 2 giriniz\n"
                + "Bölme için 3 giriniz");
        
        func = bar.nextInt();
        
        if(func == 0){
            //toplama
            System.out.println(Toplama(a, b));
        }else if(func == 1){
            //çikarma
        }else if(func == 2){
            //çarpma
        }else if(func == 3){
            //bölme
        }else{
            System.out.println("Hatali islem");
        }
        
    }
    
    public static int Toplama(int a, int b){
        return a + b;
    }
    
}
