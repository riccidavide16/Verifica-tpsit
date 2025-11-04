/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package maincomposizionenavemototre;

/**
 *
 * @author ricci.davide
 */
public class Motore {
    private double cilindrata;
    private double cavalli;
    
    public Motore(double ci ,double ca)
    {
        this.cilindrata = ci;
        this.cavalli = ca;
    }
    
    public double getCilindrata()
    {
        return cilindrata;
    }
    public double getCavalli()
    {
        return cavalli;
    }
    @Override
    public String toString()
    {
        return "Motore{cilindrata= " + cilindrata +","+ " cavalli= " + cavalli+"}";
    }
}
