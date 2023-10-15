/*Define a class Student which has name, DSA, OOPS and DBMS as instance variables. Marks in DSA, OOPS
and DBMS are out of 60 each. Define a constructor to initialize the instance variables. Override the toString
method to display the name and percentage of the student. Define a main to demo the above class.*/

public class Student
{

  private String name;

  private int DSA, OOPS, DBMS;

  public Student (String n, int a, int b, int c)
  {

    name = n;

    DSA = a;

    OOPS = b;

    DBMS = c;

  }
  public String toString ()
  {

    double percent = (DSA + OOPS + DBMS) * 100.0 / 180;

    return String.format ("%s - %.1f%%", name, percent);

  }

}


class Main
{

  public static void main (String[]args)
  {

    Student s = new Student ("Alex", 45, 43, 48);

      System.out.println (s);

  }
}

//Output: Alex - 75.6%
