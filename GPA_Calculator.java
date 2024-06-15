import java.util.Scanner;

public class GPA_Calculator {

    static final int MAX_SUBJECTS = 6;

    static String[] subjects = {
            "Programming Fundamentals",
            "Pre-Calculus",
            "English",
            "Pakistan Studies",
            "Ethics",
            "ICT"
    };

    static double totalPointsTheory = 0;
    static double totalPointsPractical = 0;
    static int totalCreditHoursTheory = 0;
    static int totalCreditHoursPractical = 0;

    static int getValidCreditHours() {
        Scanner scanner = new Scanner(System.in);
        int creditHours;
        while (true) {
            System.out.print("Enter the credit hours: ");
            creditHours = scanner.nextInt();

            if (creditHours >= 0) {
                return creditHours;
            } else {
                System.out.println("Credit hours must be greater than or equal to 0. Please try again.");
            }
        }
    }

    static double getValidMarks(String subject, String type) {
        Scanner scanner = new Scanner(System.in);
        double marks;
        while (true) {
            System.out.print("Enter the " + type + " marks for " + subject + ": ");
            marks = scanner.nextDouble();

            if (marks >= 0 && ((type.equals("theory") && marks <= 100) || (type.equals("practical") && marks <= 50))) {
                return marks;
            } else {
                System.out.println("Invalid " + type + " marks. Marks must be between 0 and " + (type.equals("theory") ? "100" : "50") + ". Please try again.");
            }
        }
    }

    static void getSubjectDetails(int choice) {
        String subject = subjects[choice - 1];
        int creditHours = getValidCreditHours();

        if (creditHours == 0) {
            System.out.println("Subject '" + subject + "' is non-credit. Skipping from GPA calculation.");
            return;
        }

        double theoryMarks = getValidMarks(subject, "theory");
        double practicalMarks = (subject.equals("Programming Fundamentals") || subject.equals("ICT")) ? getValidMarks(subject, "practical") : 0;

        double theoryPoints = (theoryMarks >= 93) ? 4.0 :
                (theoryMarks >= 87) ? 3.67 :
                        (theoryMarks >= 82) ? 3.33 :
                                (theoryMarks >= 77) ? 3.0 :
                                        (theoryMarks >= 72) ? 2.67 :
                                                (theoryMarks >= 68) ? 2.3 :
                                                        (theoryMarks >= 64) ? 2.0 :
                                                                (theoryMarks >= 60) ? 1.67 : 0.0;

        totalPointsTheory += theoryPoints * creditHours;
        totalCreditHoursTheory += creditHours;

        if (practicalMarks > 0) {
            double practicalPoints = (practicalMarks >= 46) ? 4.0 :
                    (practicalMarks >= 44) ? 3.67 :
                            (practicalMarks >= 42) ? 3.33 :
                                    (practicalMarks >= 39) ? 3.0 :
                                            (practicalMarks >= 37) ? 2.67 :
                                                    (practicalMarks >= 35) ? 2.3 :
                                                            (practicalMarks >= 32) ? 2.0 :
                                                                    (practicalMarks >= 30) ? 1.67 : 0.0;

            totalPointsPractical += practicalPoints * creditHours;
            totalCreditHoursPractical += creditHours;
        }
    }

    static void calculateAndDisplayGPA() {
        double gpaTheory = (totalCreditHoursTheory > 0) ? totalPointsTheory / totalCreditHoursTheory : 0.0;
        double gpaPractical = (totalCreditHoursPractical > 0) ? totalPointsPractical / totalCreditHoursPractical : 0.0;
        double overallGPA = (gpaTheory + gpaPractical) / 2.0;

        System.out.println("Overall GPA for theory and practical courses: " + overallGPA + " out of 4.0");

        if (overallGPA >= 3.67) {
            System.out.println("Your letter grade is: A");
        } else if (overallGPA >= 3.33) {
            System.out.println("Your grade is: B+");
        } else if (overallGPA >= 3.0) {
            System.out.println("Your grade is: B");
        } else if (overallGPA >= 2.67) {
            System.out.println("Your grade is: B-");
        } else if (overallGPA >= 2.3) {
            System.out.println("Your grade is: C+");
        } else if (overallGPA >= 2.0) {
            System.out.println("Your grade is: C");
        } else if (overallGPA >= 1.67) {
            System.out.println("Your grade is: C-");
        } else {
            System.out.println("Your grade is: F");
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.println("\nSubject Menu:");
            for (int i = 0; i < MAX_SUBJECTS; ++i) {
                System.out.println(i + 1 + ". " + subjects[i]);
            }
            System.out.print("Enter the corresponding number for the subject (0 to terminate): ");

            int choice = scanner.nextInt();

            if (choice == 0) {
                break;
            } else if (choice < 1 || choice > MAX_SUBJECTS) {
                System.out.println("Invalid choice. Please enter a number between 1 and " + MAX_SUBJECTS + ".");
                continue;
            }

            getSubjectDetails(choice);
        }

        calculateAndDisplayGPA();
    }
}
