public abstract class Pille {
    //Attributes
    final boolean IS_IT_MEDICINE = true;
    private String shape;
    private String color;
    private String activeElement;
    private double weight;
    private boolean canBeSplit;

    //Constructor
    public Pille(String shape, String color, String activeElement, boolean canBeSplit, double weight){
        this.shape =shape;
        this.color = color;
        this.activeElement = activeElement;
        this.weight = weight;
        this.canBeSplit = canBeSplit;
    }

    //Metoder
    public Pille halvering(){
        if (canBeSplit){
            weight = weight/2;
            canBeSplit = false;
            return this;
            //Pille secondHalf = new Pille(this.shape, this.color, this.activeElement,false, this.weight) {};
            //return secondHalf;
        }
        else{
            Pille[] pillAsArray = {this};
            return null;
        }
    }

    public String getWeight() {
        return "The weight of the pill is " + this.weight + " mg";
    }

    public void setWeight(double weight) {
        if (weight > 0.00) {
            this.weight = weight;
        }
        else{
            System.out.println("Wrong input");
        }
    }

    @Override
    public String toString() {
        return "Pille{" +
                "IS_IT_MEDICINE=" + IS_IT_MEDICINE +
                ", shape='" + shape + '\'' +
                ", color='" + color + '\'' +
                ", activeElement='" + activeElement + '\'' +
                ", weight=" + weight +
                ", canBeSpilt=" + canBeSplit +
                '}';
    }
}