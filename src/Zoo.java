import java.util.ArrayList;
import java.util.List;

public class Zoo implements ZooInterface{
    List<Animale>animali= new ArrayList<>();

    @Override
    public void addAnimal(Animale animale) {
        animali.add(animale);
    }

    @Override
    public void rimuovereAnimal(Animale animale) {
        animali.remove(animale);
    }

    @Override
    public void stampaAnimali() {
        System.out.println(animali);
    }
}
