package rs.ac.ni.pmf.oop2.vezbe.encoders;

public class ComplexEncoder extends AbstractEncoder
{
    public ComplexEncoder()
    {
        super("");
    }

    @Override
    protected String applyAlgorithm(String input, String password)
    {
        return password + input + password;
    }
}
