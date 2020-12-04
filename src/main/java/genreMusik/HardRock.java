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
public class HardRock extends Rnb implements PopRock, ProgressiveRock, PsychedelicRock{
    public void genreHardRock(String artisName){
        System.out.println(artisName+" Adalah Musisi Hard Rock");
    };

    @Override
    public void genrePopRock(String artistName) {
        System.out.println(artistName+" Adalah Musisi Pop Rock");
    }

    @Override
    public void genreProgressiveRock(String artistName) {
        System.out.println(artistName+" Adalah Musisi Progressive Rock");
    }

    @Override
    public void genrePsycehedellic(String artistName) {
        System.out.println(artistName+" Adalah Musisi Psycehedellic");
    }
}
