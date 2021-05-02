public class Hovedpine extends Pille{
    private String hovedpineType;

    public Hovedpine(String shape, String color, String activeElement, boolean canBeSpilt, double weight, String hovedpineType){
        super (shape, color, activeElement, canBeSpilt, weight);
        this.hovedpineType = hovedpineType;
    }


}

