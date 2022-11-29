package rs.ac.ni.pmf.oop2.vezbe.encoders;

public abstract class AbstractEncoder
{
    private final String salt;

    public AbstractEncoder(String salt)
    {
        this.salt = salt;
    }

    public final String encode(final String input, final String password)
    {
        final String encoded = applyAlgorithm(input, password);

        return encoded + salt;
    }

    protected abstract String applyAlgorithm(String input, String password);
}
