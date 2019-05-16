package animals;

import types.Primate;
/**
 * Write a description of class animals.Orangutan here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Orangutan extends Primate
{
    private String age;

    public Orangutan()
    {
        super("Orion","He is very wild, with reddish-brown fur");
        this.age = "very young";
    }


    public String makeNoise()
    {
        return "hollers";
    }
}
