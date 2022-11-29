package rs.ac.ni.pmf.oop2.vezbe.encoders.managers;

import rs.ac.ni.pmf.oop2.vezbe.encoders.AbstractEncoder;

public class EncoderManager
{
    private final AbstractEncoder currentEncoder;

    public EncoderManager(AbstractEncoder currentEncoder)
    {
        this.currentEncoder = currentEncoder;
    }

    public void encodeData(final String first, final String second)
    {
        System.out.println(currentEncoder.encode(first, "pass"));
        System.out.println(currentEncoder.encode(second, "pass"));


    }
}
