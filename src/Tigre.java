import java.time.OffsetDateTime;

public class Tigre extends Animale{
    public Tigre(String colore, int id, OffsetDateTime dataDiNascita) {
        super(colore, id, dataDiNascita);
    }

    @Override
    public String verso() {
        return "ruggito";
    }
}
