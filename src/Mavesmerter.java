public class Mavesmerter extends Pille{
    private String smertekilde;

    public Mavesmerter(String shape, String color, String activeElement, boolean canBeSpilt, double weight, String smertekilde) {
        super (shape, color, activeElement, canBeSpilt, weight);
        this.smertekilde = smertekilde;
    }
}
