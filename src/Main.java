import java.time.OffsetDateTime;
import java.util.List;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        OffsetDateTime data1 = OffsetDateTime.parse("2024-01-01T00:00:00Z");
        OffsetDateTime data2 = OffsetDateTime.parse("2000-07-09T01:10:08Z");
        Leone leone1 = new Leone("giallo", 1, data1);
        Tigre tigre1 = new Tigre("bianca", 2, data1);
        Leone leone2 = new Leone("bianco", 3, data2);
        Tigre tigre2 = new Tigre("arancione", 2, data2);
        Zoo zoo1 = new Zoo();
        zoo1.addAnimal(leone1);
        zoo1.addAnimal(leone2);
        zoo1.addAnimal(tigre1);
        zoo1.addAnimal(tigre2);
        zoo1.stampaAnimali();

        System.out.println(zoo1.listaLeoni());


       }
    }
//creareuna classe astratta Animale che abbia un metodo di nome verso che ritorna una stringa
//creare 2 classi che estendono Animale, (esempio Leone, Tigre)

//creare un'interfaccia per uno zoo che contenga i metodi per
// aggiungere, rimuovere e visualizzare gli animali
//aggiungere un metodo allo zoo che ritorni una lista
// di un determinato tipo di animale (esempio, lista dei leoni)