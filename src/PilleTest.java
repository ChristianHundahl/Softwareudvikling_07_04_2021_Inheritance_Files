public class PilleTest {
//Test class for Pille and PilleÆske
    public static void main(String[] args) {
        //Problem: Scanner reads all tokens as String
        String tal = "12";
        String bogstav = "tolv";
        //Solution: System.out.println(Integer.parseInt(tal) + 1); //.parseInt = transform to int

        Pille dopamin = new Mavesmerter("l", "f", "s", true, 2, "g");
        System.out.println(dopamin.getWeight()); //Controls access
        dopamin.setWeight(-1.0);
        System.out.println(dopamin.getWeight());

        try{
            Integer.parseInt(bogstav);
            //Add to an integer array
            System.out.println("Succes ! we parsed the number");
        }
        catch(NumberFormatException e){
            //Add to a String Array
            System.out.println("This was not a number");
        }
    }
}