import java.time.OffsetDateTime;

abstract class Animale {
    String colore;
    int id;
    OffsetDateTime dataDiNascita;

    public Animale(String colore,int id,OffsetDateTime dataDiNascita) {
        this.colore = colore;
        this.id = id;
        this.dataDiNascita = dataDiNascita;
    }

    @Override
    public String toString() {
        return "Animale{" +
                "colore='" + colore + '\'' +
                ", id=" + id +
                ", dataDiNascita=" + dataDiNascita +
                '}';
    }

    public String verso(){
        return "";

    }
}
