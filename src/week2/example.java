package week2;

public class example {
    private String firstName;
    private String lastName;
    private int gradeLevel;
    private double gpa;

    private static int totalStudents = 0;
    public example(String fName, String lName, int grade)
    {
        firstName = fName;
        lastName = lName;
        gradeLevel = grade;

        totalStudents++;
    }

    public static int getTotalStudents()
    {
        return totalStudents;
    }

    public String getFirstName()
    {
        return firstName;
    }

    public String getLastName()
    {
        return lastName;
    }

    public int getGradeLevel()
    {
        return gradeLevel;
    }

    public double getGPA()
    {
        return gpa;
    }

    public void setGPA(double theGPA)
    {
        gpa = theGPA;
    }
    public String toString()
    {
        return firstName + " " + lastName + " is in grade: " + gradeLevel;
    }
}