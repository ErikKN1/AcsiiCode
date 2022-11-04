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
        // TODO code application logic here
        Scanner InDate=new Scanner(System.in);
        char code;
        System.out.println("Enter character to transform");
        code=InDate.next().charAt(0); //pasamos caracter a codigo
        int codeA=(int)code;
        System.out.println("El caracter " + code + " convertido a ACSII ES " +codeA );
        
    }
    
}
