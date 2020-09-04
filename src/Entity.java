import java.time.LocalDate;

public class Entity {
    String name;
    LocalDate dateCreated;

    public Entity() {
        name="";
        dateCreated = LocalDate.now();
    }

    public Entity(String n) {
        name = n;
        dateCreated = LocalDate.now();
    }

    /* Add setters and getters */


    /* you complete this */
    public String toString() {

    }
}
