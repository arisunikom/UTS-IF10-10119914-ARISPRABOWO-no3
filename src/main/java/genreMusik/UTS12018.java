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
public class UTS12018 {
    public static void main(String[] args) {
      MusicGenre MusicGenre = new MusicGenre();
      Rnb Rnb = new Rnb();
      Rnb.genreBlues("Jimmy Hendrick");
      Rnb.genreJazz("Chad Baker");
      
      Folk Folk = new Folk();
      Folk.genreFolk("Bob Dylan");
      
      Rockabilly Rockabilly = new Rockabilly();
      Rockabilly.genreRockabilly("Elvis Presley");
      
      HardRock HardRock = new HardRock();
      HardRock.genreProgressiveRock("Elvis Presley");
      HardRock.genrePsycehedellic("The Doors");
      HardRock.genrePopRock("Kiss");
      
      Metal Metal = new Metal();
      Metal.genrePunk("MXPX");
      Metal.genreHeavyMetal("Metalica");
      
      Grindcore Grindcore = new Grindcore();
      Grindcore.genreGrindcore("Mesin Tempur");
      
      DeathMetal DeathMetal = new DeathMetal();
      DeathMetal.genreDeathMetal("JASAD");
      
      DeathCoreKepiting DeathCoreKepiting = new DeathCoreKepiting();
      DeathCoreKepiting.genreDeathCoreKepiting("Revenge The Fate");
      
      BlackMetal BlackMetal = new BlackMetal();
      BlackMetal.genreBlackMetal("Behemonth");
      
      NewSkul NewSkul = new NewSkul();
      NewSkul.genreNewSkul("HATEBREED");
    }   
}
