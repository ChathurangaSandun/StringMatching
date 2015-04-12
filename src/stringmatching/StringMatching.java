/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package stringmatching;

import java.util.ArrayList;

/**
 *
 * @author Chathuranga - Pamba
 */
public class StringMatching {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        NaiveStringMatching NSM = new NaiveStringMatching("aaaaabaaac","c");
        ArrayList<Integer> niveStringMatching = NSM.niveStringMatching();
        if(!niveStringMatching.isEmpty()){
            for (Integer pos : niveStringMatching) {
                System.out.println("    "+pos);
            }
        }else{
            System.out.println("there is no matchers ");
        }

    }
    
}
