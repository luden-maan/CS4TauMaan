/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ex01.tau.maan;

/**
 *
 * @author TAU
 */
public class Ex01TauMaan {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        String name1 = "Dean Florenuel";
        String cookierun1 = "Weekly";
        byte age1 = 22;
        System.out.printf("Name: %s%nFrequency of playing Cookie Run Kingdom: %s%nAge: %d", name1,cookierun1,age1);
                
        String name2 = "Luden Cleide";
        String cookierun2 = "Weekly";
        byte age2 = 15;
        System.out.printf("Name: %s%nFrequency of playing Cookie Run Kingdom: %s%nAge: %d%n", name2,cookierun2,age2);
        
        String name3 = "Claiden Tris";
        String cookierun3 = "Daily";
        byte age3 = 5;
        System.out.printf("Name: %s%nFrequency of playing Cookie Run Kingdom: %s%nAge: %d%n", name3,cookierun3,age3);
        
        int agegap = age1-age3;
        if(cookierun1==cookierun2){
            System.out.print("");
        }
        
    }
    
}
