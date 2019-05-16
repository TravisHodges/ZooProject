package animals;

import types.Reptile;

/**
 * Write a description of class animals.Alligator here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Alligator extends Reptile
{
    // instance variables - replace the example below with your own
    private String age;

    /**
     * Constructor for objects of class animals.Alligator
     */
    public Alligator()
    {
        super("Ally","Covered in scales with large teeth. ");
        this.age = "Old and mean";
    }

    @Override
    public String makeNoise()
    {
        return super.makeNoise();
    }
}
