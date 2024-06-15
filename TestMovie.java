class Movie {
    private String rating;
    private int id;
    private String title;

    public Movie(String rating, int id, String title) {
        this.rating = rating;
        this.id = id;
        this.title = title;
    }

    public String getRating() {
        return rating;
    }

    public void setRating(String rating) {
        this.rating = rating;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (!(obj instanceof Movie)) return false;
        Movie other = (Movie) obj;
        return this.id == other.id;
    }

    public double calcLateFees(int daysLate) {
        return 2 * daysLate;
    }
}

class Action extends Movie {
    public Action(String rating, int id, String title) {
        super(rating, id, title);
    }

    public double calcLateFees(int daysLate) {
        return 3 * daysLate;
    }
}

class Comedy extends Movie {
    public Comedy(String rating, int id, String title) {
        super(rating, id, title);
    }

    public double calcLateFees(int daysLate) {
        return 2.5 * daysLate;
    }
}

class Drama extends Movie {
    public Drama(String rating, int id, String title) {
        super(rating, id, title);
    }
}

class Rental {
    private Movie movie;
    private int customerId;
    private int daysLate;

    public Rental(Movie movie, int customerId, int daysLate) {
        this.movie = movie;
        this.customerId = customerId;
        this.daysLate = daysLate;
    }

    public double calculateLateFees() {
        return movie.calcLateFees(daysLate);
    }
}

public class TestMovie {
    public static void main(String[] args) {
        
        Movie actionMovie = new Action("PG-13", 1, "Action Movie");
        Movie comedyMovie = new Comedy("PG", 2, "Comedy Movie");
        Movie dramaMovie = new Drama("PG-13", 3, "Drama Movie");

        Rental rental1 = new Rental(actionMovie, 101, 2);
        Rental rental2 = new Rental(comedyMovie, 102, 3);
        Rental rental3 = new Rental(dramaMovie, 103, 1);

        double totalLateFees = rental1.calculateLateFees() + rental2.calculateLateFees() + rental3.calculateLateFees();

        System.out.println("Total late fees owed: $" + totalLateFees);
    }
}
