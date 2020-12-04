/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package genreMusik;

/**
 *
 * @author 
 * Aris Prabowo
 * IF10K 10119914
 */
public class Metal extends HardRock implements HeavyMetal{
    public void genreMetal(String artisName){
        System.out.println(artisName+" Adalah Musisi Metal");
    }
    
    @Override
    public void genreHeavyMetal(String artistName) {
        System.out.println(artistName+" Adalah Musisi Heavy Metal");
    }

    @Override
    public void genrePunk(String artisName) {
        System.out.println(artisName+" Adalah Musisi Punk");  
    }
     public void genreGrunge(String artisName){
        System.out.println(artisName+" Adalah Musisi Grunge");
    }
    
}
