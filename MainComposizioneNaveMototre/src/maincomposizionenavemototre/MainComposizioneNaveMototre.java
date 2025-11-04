/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package maincomposizionenavemototre;

/**
 *
 * @author ricci.davide
 */
public class MainComposizioneNaveMototre {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Nave nave1 = new Nave("Aurora", 32000.5, 12000, 40000);
        System.out.println(nave1);  //Nave{nome='Aurora', stazzaTonnellate=32000.5, motore=Motore{cilindrata=12000, cavalli=40000}}
  
        Motore motoreNave1 = nave1.getMotore();
        System.out.println(motoreNave1);    //Motore{cilindrata=12000, cavalli=40000}
    }
    
}
