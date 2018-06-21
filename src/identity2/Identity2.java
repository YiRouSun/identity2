/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package identity2;

/**
 *
 * @author nisun5097
 */
public class Identity2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        double Nfindsurvivors;
        double Sfindsurvivors;
        double Totalsfindsurvivors;
        Nfindsurvivors = 3;
        Sfindsurvivors = 100;
        Totalsfindsurvivors = Nfindsurvivors * Sfindsurvivors;
        System.out.println(Totalsfindsurvivors);
        
        double Nputchair;
        double Sputchair;
        double Totalsputchair;
        Nputchair = 4;
        Sputchair = 250;
        Totalsputchair = Nputchair * Sputchair;
        System.out.println(Totalsputchair);
        
        double Nreturesurvivors;
        double Sreturesurvivors;
        double Totalsreturesurvivors;
        Nreturesurvivors = 3;
        Sreturesurvivors = 800;
        Totalsreturesurvivors = Nreturesurvivors * Sreturesurvivors;
        System.out.println(Totalsreturesurvivors);
        
        double Nhitsurvivors;
        double Shitsurvivors;
        double Totalshitsurvivors;
        Nhitsurvivors = 7;
        Shitsurvivors = 200;
        Totalshitsurvivors = Nhitsurvivors * Shitsurvivors;
        System.out.println(Totalshitsurvivors);
        
        double Wholetotal;
        Wholetotal = Totalsfindsurvivors + Totalsputchair + Totalsreturesurvivors + Totalshitsurvivors;
        System.out.println(Wholetotal);
        double Numbersurvivorsescape = 1;
       
         if (Numbersurvivorsescape> 2)
        {
           System.out.println("You win the game.");
        }
        else 
        {
           System.out.println("You fail the game");
                }
        
                
    }
    
}
