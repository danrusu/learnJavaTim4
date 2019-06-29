package fundamentals.enumerations;

import static fundamentals.enumerations.LengthUnit.*;

public class LengthUnitTest {

    public static void main(String[] args) {

        LengthUnit lengthUnit = METER;
        LengthUnit lengthUnit2 = INCH;
        System.out.println("lengthUnit type: " +
                lengthUnit.getClass().getName());

        System.out.println("toString: ");
        System.out.println(lengthUnit); // expected: meter
        System.out.println(lengthUnit2); // expected: inch

        //System.out.println(lengthUnit.toString());

        System.out.println("lengthUnit name: " + lengthUnit.name());

        System.out.println("Conversion factors: ");
        System.out.println(KM.getConversionFactor());
        System.out.println(INCH.getConversionFactor());
        System.out.println(CENTIMETER.getConversionFactor());
        System.out.println(FOOT.getConversionFactor());

        System.out.println("\nConversions:");
        convertToMeter(1, METER);
        convertToMeter(1, KM);
        convertToMeter(100, INCH);
        convertToMeter(100, CENTIMETER);
        convertToMeter(30, FOOT);
        convertToMeter(1000, MM);
    }

    public static void convertToMeter(float length, LengthUnit lengthUnit){
        float lengthInMeters = length * lengthUnit.getConversionFactor();
        //return;
       /* switch (lengthUnit){
            case METER:
                lengthInMeters = length;
                break;
            case INCH:
                lengthInMeters = 0.025F * length;
                break;
            case CENTIMETER:
                lengthInMeters = 0.01F * length;
                break;
            case FOOT:
                lengthInMeters = 0.3f * length;
                break;
            case KM:
                lengthInMeters = 1000 * length;
                break;
        }*/

        System.out.println(length + " " + lengthUnit + " = "
                + lengthInMeters + " meter");

        System.out.println("Switch way: 100 CENTIMETER to METER");
        System.out.println(convertToMeterSwitch(100, CENTIMETER));
    }

    public static float convertToMeterSwitch(float length, LengthUnit lengthUnit){

        float defaultLength = length;

        switch (lengthUnit){
            case METER: return length;
            case INCH: return 0.025F * length;
            case CENTIMETER: return 0.01F * length;
            case FOOT: return 0.3f * length;
            case KM: return 1000 * length;

            //default: return length;
        }

        return defaultLength;
    }
}
