package rs.ac.ni.pmf.oop2.vezbe.encoders;

public class AnotherSimpleEncoder extends AbstractEncoder
{

    public AnotherSimpleEncoder(String salt)
    {
        super(salt);
    }

    @Override
    protected String applyAlgorithm(String input, String password)
    {
        return password + input;
    }
}
