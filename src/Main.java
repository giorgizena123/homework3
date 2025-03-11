import java.util.*;
public class Main {
    public static void main(String[] args) {

        List<BasketballPlayer> players = new ArrayList<>();
        players.add(new BasketballPlayer("LeBron", "James", 25, 8, 2, 10, 3));
        players.add(new BasketballPlayer("Michael", "Jordan", 30, 6, 3, 5, 2));

        players.sort(null);
        System.out.println("Basketball Players Sorted by Rating (Descending):" + players);

        players.sort(Comparator.comparingDouble(BasketballPlayer::getRating));
        System.out.println("Basketball Players Sorted by Rating (Ascending):" + players);

        List<Student> students = new ArrayList<>();
        students.add(new Student("John", "Doe", new GregorianCalendar(2002, Calendar.MARCH, 10).getTime(), new ArrayList<>(Arrays.asList(90, 85, 88))));
        students.add(new Student("Alice", "Smith", new GregorianCalendar(2001, Calendar.JUNE, 15).getTime(), new ArrayList<>(Arrays.asList(95, 92, 90))));

        System.out.println("Students Unsorted:" + students);

        students.sort(null);
        System.out.println("Students Sorted Lexicographically:" + students);

        students.sort(Comparator.comparingDouble(Student::getAverageGrade).reversed());
        System.out.println("Students Sorted by Average Grade:" + students);

        students.sort(Comparator.comparing(s -> s.birthDate));
        System.out.println("Students Sorted by Birth Date:" + students);


        List<Car> cars = new ArrayList<>();
        cars.add(new Car("Toyota", "Camry", 2018, 60000, new Engine("Petrol", 4, 2.5)));
        cars.add(new Car("BMW", "X5", 2020, 40000, new Engine("Diesel", 6, 3.0)));

        System.out.println("Cars Unsorted:" + cars);

        cars.sort(null);
        System.out.println("Cars Sorted by Year:" + cars);

        cars.sort(Comparator.comparingInt(car -> car.mileage));
        System.out.println("Cars Sorted by Mileage:" + cars);

        cars.sort(Comparator.comparingDouble(car -> car.engine.capacity));
        System.out.println("Cars Sorted by Engine Capacity:" + cars);
    }
}
