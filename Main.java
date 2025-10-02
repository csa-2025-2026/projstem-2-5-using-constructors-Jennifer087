import java.util.Scanner;

public class Main
{
  public static void main(String[] args)
  {
    // Problem 1
    // Scanner sc = new Scanner(System.in);
    Circle c1 = new Circle (10.1); // makes acircle radius 10.1
    Circle c2 = new Circle (14.0);
    Circle c3 = new Circle (20.5);
   System.out.println(c1.toString() + "\n" + c2.toString() + "\n" + c3.toString ()); 

  System.out.println (c1.toString());
  //not static - it belongs to each object 

   // Problem 2
   double lenWid;
   double len;
   double wid;
   Rectangle rectangle1;
   Rectangle rectangle2;

   System.out.println ("Type a length: ");
   len = sc.nextDouble ();

   System.out.println ("Type a width: ");
    wid = sc.nextDouble ();

    rectangle1 = new Rectangle (lenWid);
    rectangle2 = new Rectangle (len, wid);

    system.out.println(r1.toString () + "\n" + r2.toString ());

    //Problem 3
    double sideLength;
    RegularPolygon r1;
    RegularPolygon r2;

    System.out.println ("Type a side length");
    sideLength = sc.nextDouble ();

    r1 = new RegularPolygon (sideLength);
    r2 = new RegularPolygon (4, side);
    
    System.out.println ("Equilateral triangle with side length" + r1.toString () + "\n" + "square with side length" + r2.toString);

    
  }
}

  