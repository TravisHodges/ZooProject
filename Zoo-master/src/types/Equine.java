package types;

import animal_qualities.Walking;
import main.Animal;

public class Equine extends Animal implements Walking
{
    public Equine()
    {
     super("Equine" , "Zebras and Horses");
    }
    public Equine(String name, String desc)
    {
        super(name, desc);
    }
    public String makeNoise()
    {
        return "neighs";
    }
    public String eat()
    {
        return "grasses";
    }
    public String walk()
    {
        return "runs and walks";
    }
}
