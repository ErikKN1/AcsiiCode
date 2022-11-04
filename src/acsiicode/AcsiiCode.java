/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package acsiicode;

import java.util.Scanner;

/**
 *
 * @author erik
 */
public class AcsiiCode {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner InDate=new Scanner(System.in);
        int Option, code;
        char character;
        System.out.println("what do you want to do?\n 1-convert from code to character \n 2-convert character to code");
        Option=InDate.nextInt();
        switch(Option){
            case 1:
                   System.out.println("convert from code to character ");
                   System.out.println("Enter code to transform ");
                   code=InDate.nextInt();
                   character=(char)code;
                   System.out.println("the code " + code + " transformed to ACSII code is: "+character);
            break;
            case 2:
                System.out.println("convert from character to code ");
                System.out.println("Enter character to transform");
                character=InDate.next().charAt(0); //pasamos caracter a codigo
                code=(int)character;
                System.out.println("El caracter " + character + " convertido a ACSII ES " +code );
            break;
            default:
                System.out.println("Invalid Option");
            break;                
        }    
    }
}
