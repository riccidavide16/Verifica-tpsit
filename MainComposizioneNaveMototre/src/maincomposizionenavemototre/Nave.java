/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package maincomposizionenavemototre;

/**
 *
 * @author ricci.davide
 */
public class Nave {
    private String nome;
    private double stazzaTonnellate; 
    private Motore motore;
    
    public Nave(String n ,double sT,double cilindrata,double cavalli)
    {
        this.nome = n;
        this.stazzaTonnellate = sT;
        this.motore = new Motore(cilindrata,cavalli);
    }
    public Motore getMotore()
    {
        return motore;
    }
    @Override
    public String toString()
    {
        return "Nave{nome= " + nome +","+ " stazzaTonnellate= " + stazzaTonnellate + "," + " motore= " + motore ;
    }
}
