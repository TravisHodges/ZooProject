package animals;

import types.Equine;

public class Zebra extends Equine
{
    // instance variables - replace the example below with your own
    private String age;

    public Zebra()
    {
        super("Zip" , "Black with white Stripes. Or is it white with black stripes ???");
        this.age = "Young";
    }

    @Override
    public String makeNoise()
    {
        return super.makeNoise();
    }
}
