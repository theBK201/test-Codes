public class Uhrzeit {

    int stunden;
    int minuten;


    public Uhrzeit(int std, int min) {
        this.stunden = std;
        this.minuten = min;
    }

    public int getStunden() {
        return stunden;
    }

    public int getMinuten() {
        return minuten;
    }


    public void setStunden(int std) {
        while (std < 0) std +=24;
        stunden = std % 24;
    }

    public void setMinuten(int min) {
        while (min < 0) min += 60;
        minuten = min % 60;
    }


    @Override
    public String toString() {
        return "Es is "+stunden + ":"+ minuten +(
                stunden < 6 ? " Nacht!":
                stunden < 10 ? " Morgens!":
                stunden < 12 ? " Vormitag!":
                stunden < 14 ? " Mittag!":
                stunden < 18 ? " Nachmitag!":
                stunden < 22 ? " Abends":
                        "Nacht"
        );
    }
}