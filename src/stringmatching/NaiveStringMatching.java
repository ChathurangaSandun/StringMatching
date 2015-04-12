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
public class NaiveStringMatching {
    
    String text;
    String pattern;

    public NaiveStringMatching(String text, String pattern) {
        this.text = text;
        this.pattern = pattern;
    }
    
    ArrayList<Integer> niveStringMatching(){
        int n = this.text.length();
        int m = this.pattern.length();
        ArrayList<Integer> possions = new ArrayList<>();
        
        for (int i = 0; i < n; i++) {
            boolean ok = true; 
            for (int j = 0; j < m; j++) {                
                if(text.charAt(j+i) != pattern.charAt(j)){
                    ok = false;                    
                    break ;
                }
                
            }
            if(ok){
                possions.add(i+1);
            }
        } 
        
        return  possions;
    }
    
    
}
