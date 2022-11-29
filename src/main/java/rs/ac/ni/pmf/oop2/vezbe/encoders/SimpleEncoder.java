package rs.ac.ni.pmf.oop2.vezbe.encoders;

public class SimpleEncoder extends AbstractEncoder
{
    public SimpleEncoder(String salt)
    {
        super(salt);
    }

    @Override
    protected String applyAlgorithm(String input, String password)
    {
        return input + password;
    }
}
