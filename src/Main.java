import java.io.FileNotFoundException;

public class Main {
    public static void main(String[] args) throws FileNotFoundException {
        //Write a program that exemplifies the concept of inheritance. Comment the pro-
        //gram accordingly to describe your example.
        //You should use real-life concepts as classes in the program.
        Hovedpine panodil = new Hovedpine("rund", "blå", "Paracetamol", true,2, "migræne");
        Mavesmerter Alminox = new Mavesmerter("aflang", "hvid", "Aluminiumaminoacetat",true, 3, "mavekatar");
        PilleÆske æske1 = new PilleÆske();

        System.out.println(æske1.getPiller().size()); //
        æske1.getPiller().add(panodil);
        System.out.println(æske1.getPiller().size());
        Pille halveretPille = panodil.halvering();

        //Javadoc
        if (halveretPille != null){
            //æske1 = instans af PilleÆske
            //.getPiller = metode til at hente listen 'piller' fra PilleÆske-objektet
            //.add(nyPille) = metode tilføjer nyPille til æske1 liste attribut
            //Resultat: 'piller' tilføjer nyPille
            æske1.getPiller().add(halveretPille);
        }

        System.out.println(æske1.getPiller().size());

        FileReader.readFile();
    }
}

