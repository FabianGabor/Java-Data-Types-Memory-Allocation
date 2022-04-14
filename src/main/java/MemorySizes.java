import org.openjdk.jol.info.ClassLayout;

public class MemorySizes {
    public static void main(String[] args) {
        System.out.println(ClassLayout.parseClass(DataTypes.class).toPrintable());
    }
}

class DataTypes {
    private boolean booleanValue;
    private byte byteValue;
    private char charValue;
    private short shortValue;
    private int intValue;
    private long longValue;
    private float floatValue;
    private double doubleValue;
    private String stringValue;
}
