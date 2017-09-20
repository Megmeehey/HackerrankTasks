package DaysOfCode.Day12;

public class Person {
    protected String firstName;
    protected String lastName;
    protected int idNumber;

    // Constructor
    Person(String firstName, String lastName, int identification){
        this.firstName = firstName;
        this.lastName = lastName;
        this.idNumber = identification;
    }

    // Print person data
    public void printPerson(){
        System.out.println(
                "Name: " + lastName + ", " + firstName
                        + 	"\nID: " + idNumber);
    }

}

class Student extends Person{
    private int[] testScores;

    /*
    *   Class Constructor
    *
    *   @param firstName - A string denoting the Person's first name.
    *   @param lastName - A string denoting the Person's last name.
    *   @param id - An integer denoting the Person's ID number.
    *   @param scores - An array of integers denoting the Person's test scores.
    */
    public Student(String firstName, String lastName, int id, int[] scores) {
        super(firstName, lastName, id);
        this.testScores = scores;
    }

    /*
    *   Method Name: calculate
    *   @return A character denoting the grade.
    */
    public String calculate() {
        String grade;
        int sum = 0;
        for (int i = 0; i < testScores.length; i++) {
            sum += testScores[i];
        }
        sum /= testScores.length;
        if (90 <= sum && sum <= 100) {
            grade = "O";
        } else if (80 <= sum && sum < 90) {
            grade = "E";
        } else if (70 <= sum && sum < 80) {
            grade = "A";
        } else if (55 <= sum && sum < 70) {
            grade = "P";
        } else if (40 <= sum && sum < 55) {
            grade = "D";
        } else {
            grade = "T";
        }
        return grade;
    }
}