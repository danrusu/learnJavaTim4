package fundamentals.enumerations;

public enum LengthUnit {

    METER(1),
    CENTIMETER(0.01f),
    KM(1000),
    INCH(0.025f),
    FOOT(0.3f),
    MM(0.001f);

    LengthUnit(float conversionFactor) {
        this.conversionFactor = conversionFactor;
    }

    private float conversionFactor;

    public float getConversionFactor() {
        return conversionFactor;
    }

    @Override
    public String toString() {
        return name().toLowerCase();
    }
}
