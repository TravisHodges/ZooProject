package animals;

import types.Primate;

public class Ring_Tailed_Lemurs extends Primate
{
    private String age;

    public Ring_Tailed_Lemurs()
    {
        super("Maddy","has a very cool looking long black and white tail");
        this.age = "adult";
    }

    @Override
    public String makeNoise() {
        return super.makeNoise();
    }
}
