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
public class Rnb extends MusicGenre implements Blues, Jazz{
    @Override
    public void genreBlues(String artistName) {
        System.out.println(artistName+" Adalah Musisi Blues");
    }
    @Override
    public void genreJazz(String artistName) {
        System.out.println(artistName+" Adalah Musisi Jazz");
    }
}
