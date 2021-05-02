import java.util.ArrayList;
//Class for constructing PilleÆske
public class PilleÆske {
    private int size;
    private ArrayList<Pille> piller;

    public PilleÆske(){
        piller = new ArrayList<>();
    }

    public int getSize() {
        return size;
    }

    public ArrayList<Pille> getPiller() {
        return piller;
    }
}
