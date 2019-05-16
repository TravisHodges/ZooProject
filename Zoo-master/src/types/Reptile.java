package types;

import animal_qualities.Swimming;
import main.Animal;

public class Reptile extends Animal implements Swimming
{
    public Reptile()
    {
        super("Reptiles", "They slither around the ground or swim");
    }
    public Reptile(String name, String desc)
    {
        super(name, desc);
    }
    public String makeNoise()
    {
        return "idk";
    }
    public String eat()
    {
        return "other animals";
    }
    public String swim()
    {
        return "Swims and floats";
    }
}
