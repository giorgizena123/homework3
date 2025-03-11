import java.util.*;

class BasketballPlayer implements Comparable<BasketballPlayer> {
    String firstName, lastName;
    int points, rebounds, blocks, assists, turnovers;

    public BasketballPlayer(String firstName, String lastName, int points, int rebounds, int blocks, int assists, int turnovers) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.points = points;
        this.rebounds = rebounds;
        this.blocks = blocks;
        this.assists = assists;
        this.turnovers = turnovers;
    }
    public double getRating() {
        return points + rebounds + (assists * 1.5) + (blocks * 2) - (turnovers * 2);
    }

    @Override
    public int compareTo(BasketballPlayer o) {
        return Double.compare(o.getRating(), this.getRating());
    }

    @Override
    public String toString() {
        return firstName + " " + lastName + " - Rating: " + getRating();
    }
}
