import java.time.OffsetDateTime;

public class Leone extends Animale{

    public Leone(String colore, int id, OffsetDateTime dataDiNascita) {
        super(colore, id, dataDiNascita);

    }

    @Override
    public String verso() {
        return "ruggito" ;
    }
}
