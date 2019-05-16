package animals;

import types.Bird;
/**
 * Write a description of class animals.Parrot here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */

public class Parrot extends Bird
{
    private String age;

    public Parrot()
    {
        super("Jose", "very colorful and sometimes mocks people");
        this.age = "very young";
    }

    @Override
    public String makeNoise()
    {
        return super.makeNoise();
    }
}
