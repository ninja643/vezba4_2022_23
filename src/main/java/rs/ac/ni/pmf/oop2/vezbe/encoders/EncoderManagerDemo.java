package rs.ac.ni.pmf.oop2.vezbe.encoders;

import rs.ac.ni.pmf.oop2.vezbe.encoders.managers.EncoderManager;

public class EncoderManagerDemo
{
    public static void main(String[] args)
    {
        final EncoderManager simpleEncoderManager = new EncoderManager(new SimpleEncoder("123"));
        simpleEncoderManager.encodeData("ABC", "DEF");

        final EncoderManager anotherEncoderManager = new EncoderManager(new AnotherSimpleEncoder("999"));
        anotherEncoderManager.encodeData("ABC", "DEF");

        final EncoderManager complexEncoderManager = new EncoderManager(new ComplexEncoder());
        complexEncoderManager.encodeData("ABC", "DEF");

        final AbstractEncoder myEncoder = new AbstractEncoder("_myTest")
        {
            @Override
            protected String applyAlgorithm(String input, String password)
            {
                return input + " | " + password;
            }
        };

        new EncoderManager(myEncoder).encodeData("ABD", "DEF");
    }
}
