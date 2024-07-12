package entities;

public class Student
{
    private String name;
    private double firstGrade;
    private double secondGrade;

    public Student(String name, double firstGrade, double secondGrade)
    {
        this.name = name;
        this.firstGrade = firstGrade;
        this.secondGrade = secondGrade;
    }

    public String getName()
    {
        return name;
    }

    public double getFirstGrade()
    {
        return firstGrade;
    }

    public double getSecondGrade()
    {
        return secondGrade;
    }
}
