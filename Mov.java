import java.util.*;
class Movie {
     String title;
     int year;
     double cost;
    public Movie(String title, int year, double cost) {
        this.title = title;
        this.year = year;
        this.cost = cost;
    }
    public String toString() {
        return "Movie{" +
                "title='" + title +
                ", year=" + year +
                ", cost=" + cost +
                '}';
    }
}
public class Mov {
    public static void main(String[] args) {
        List<Movie> a = new ArrayList<>();
       a.add(new Movie("abdd", 2023, 100));
        a.add(new Movie("ccdd", 2020, 90));
        a.add(new Movie("aass", 2022, 150));
        Collections.sort(a, Comparator.comparingInt(b -> b.year));
        System.out.println("Sorted by year:");
        for (Movie b : a) {
            System.out.println(b);
        }
        Collections.sort(a, Comparator.comparingDouble(b -> b.cost));
        System.out.println("Sorted by cost:");
        for (Movie b : a) {
            System.out.println(b);
        }
    }
}