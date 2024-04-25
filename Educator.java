import java.util.ArrayList;

public class Educator {
    String name;
    ArrayList<Student> student;
    Game game;

    public Educator() {
        name = "BLANK";
        student = new ArrayList<>();
        game = new Game();
    }

    public Educator(String n) {
        name = n;
        student = new ArrayList<>();
        game = new Game();
    }

    public Educator(String n, ArrayList<Student> stud) {
        name = n;
        student = stud;
        game = new Game();
    }

    public void assignCodingChallenge() {
        System.out.println("Assigning Challenge...");
    }
}