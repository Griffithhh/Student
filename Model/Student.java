package Model;

/**
 * Klasa reprezentuje obiekt "Student".
 */
public class Student {
    private String name;          // Imię studenta
    private String numberAlbumu;  // Numer albumu studenta
    private String numberGroup;   // Numer grupy

    /**
     * Konstruktor klasy Student.
     *
     * @param imie         Imię studenta.
     * @param numerAlbumu  Numer albumu studenta.
     * @param numerGrupy   Numer grupy.
     */
    public Student(String imie, String numerAlbumu, String numerGrupy) {
        this.name = imie;
        this.numberAlbumu = numerAlbumu;
        this.numberGroup = numerGrupy;
    }

    /**
     * Pobierz imię studenta.
     *
     * @return Imię studenta.
     */
    public String getImie() {
        return name;
    }

    /**
     * Pobierz numer albumu studenta.
     *
     * @return Numer albumu studenta.
     */
    public String getNumerAlbumu() {
        return numberAlbumu;
    }

    /**
     * Pobierz numer grupy.
     *
     * @return Numer grupy.
     */
    public String getNumerGrupy() {
        return numberGroup;
    }

    /**
     * Przesłonięta metoda toString do reprezentacji obiektu Student jako ciągu znaków.
     *
     * @return Ciąg znaków reprezentujący obiekt Student.
     */
    @Override
    public String toString() {
        return "Student [imie=" + name + ", numerAlbumu=" + numberAlbumu + ", numerGrupy=" + numberGroup + "]";
    }
}