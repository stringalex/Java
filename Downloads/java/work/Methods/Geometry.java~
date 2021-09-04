//Alex Stringer
//4/9/2019
//Java Geometry Lab

import java.util.Scanner;

/**
 This program demonstrates static methods.
 */

public class Geometry
{
  
  /**Prints the various Method options user may choose.
   */ 
  public static void printMenu(){
    System.out.println("This is a geometry calculator\n" + 
                       "Choose what you would like to calculate\n" +
                       "1. Find the area of a circle\n" +
                       "2. Find the area of a rectangle\n" +
                       "3. Find the area of a triangle\n" +
                       "4. Find the circumference of a circle\n" +
                       "5. Find the perimeter of a rectangle\n" +
                       "6. Find the perimeter of a triangle\n" +
                       "Enter the number of your choice: ");
  }
  /**Calculates the area of a circle.
     Program needs a variable of type double and returns a double.
     @param radius A double.
     @return the product of PI multiplied by your double squared. 
     */
  public static double circleArea(double radius){
    double value = Math.PI * (radius * radius);
    return value;
  }
  /**Calculates the area of a rectangle.
   * It takes two doubles, the length and width, and multiplies them together.
   * @param length the first double.
   * @param width the second double.
   * @return the product of the two doubles.
   */
  public static double rectangleArea(double length, double width){
    double value = length * width;
    return value;
  }
  /**Calculates the area of a triangle
   * @param height the first double
   * @param base the second double
   * @return product of the two doubles multiplied by a half.
   */
  public static double triangleArea(double height, double base){
    double value = 0.5*(base * height);
    return value;
  }
  /**Calculates the circumference of a circle.
   * Multiplies the radius by 2(PI) and returns a double.
   * @param radius a double.
   * @return the product of double multiplied by 2(PI).
   */
  public static double circleCircumference(double radius){
    double value = 2*Math.PI*radius;
    return value;
  }
  /**Calculates the perimeter of a rectangle.
   * Requires two double's and multiplies each by 2 then adds them together.
   * @param length a double.
   * @param width a double.
   * @return the value of doubles multiplied by 2 then added together.
   */
  public static double rectanglePerimeter(double length, double width){
    double value = (2*length) + (2*width);
    return value;
  }
  /**Calculates the Perimeter of a triangle.
   * Adds 3 doubles together to return a value stored in double.
   * @param side1 the first double.
   * @param side2 the second double.
   * @param side3 the third double.
   * @return the sum of all 3 doubles.
   */
  public static double trianglePerimeter(double side1, double side2,double side3){
    double value = side1 + side2 + side3;
    return value;
  }
  public static void main (String [] args)
  {
    int choice;   //the user's choice
    double value = 0; //the value returned from the method
    char letter;  //the Y or N from the user's decision to exit
    double radius;  //the radius of the circle
    double length;  //the length of the rectangle
    double width;  //the width of the rectangle
    double height;  //the height of the triangle
    double base;  //the base of the triangle
    double side1;  //the first side of the triangle
    double side2;  //the second side of the triangle
    double side3;  //the third side of the triangle
    
    // create a scanner object to read from the keyboard
    Scanner keyboard = new Scanner (System.in);
    
    // do loop was chosen to allow the menu to be displayed first
    do
    {
      // call the printMenu method
      printMenu();
      
      choice = keyboard.nextInt();
      
      switch (choice)
      {
        case 1:
          System.out.print("Enter the radius of the circle:  ");
          radius = keyboard.nextDouble();
          //call the circleArea method and store the result in the value variable    
          value = circleArea(radius);
          System.out.println("The area of the circle is " + value);
          break;
          
        case 2:
          System.out.print("Enter the length of the rectangle:  ");
          length = keyboard.nextDouble();
          System.out.print("Enter the width of the rectangle:  ");
          width = keyboard.nextDouble();
          //call the rectangleArea method and store the result in the value variable
          value = rectangleArea(length,width);
          System.out.println("The area of the rectangle is " + value);
          break;
          
        case 3: 
          System.out.print("Enter the height of the triangle:  ");
          height = keyboard.nextDouble();
          System.out.print("Enter the base of the triangle:  ");
          base = keyboard.nextDouble();
          //call the triangleArea method and store the result in the value variable
          value = triangleArea(height,base);
          System.out.println("The area of the triangle is " + value);
          break;
          
        case 4:
          System.out.print("Enter the radius of the circle:  ");
          radius = keyboard.nextDouble();
          //call the circumference method and store the result in the value variable
          value = circleCircumference(radius);
          System.out.println("The circumference of the circle is " + value);
          break;
          
        case 5:
          System.out.print("Enter the length of the rectangle:  ");
          length = keyboard.nextDouble();
          System.out.print("Enter the width of the rectangle:  ");
          width = keyboard.nextDouble();
          //call the perimeter method and store the result in the value variable
          value = rectanglePerimeter(length,width);
          System.out.println("The perimeter of the rectangle is " + value);
          break;
          
        case 6:
          System.out.print("Enter the length of side 1 of the triangle:  ");
          side1 = keyboard.nextDouble();
          System.out.print("Enter the length of side 2 of the triangle:  ");
          side2 = keyboard.nextDouble();
          System.out.print("Enter the length of side 3 of the triangle:  ");
          side3 = keyboard.nextDouble();
          //call the perimeter method and store the result in the value variable
          value = trianglePerimeter(side1,side2,side3);
          System.out.println("The perimeter of the triangle is " + value);
          break;
        default:
          System.out.println("You did not enter a valid choice.");
      } 
      keyboard.nextLine(); //consumes the new line character after the number      
      System.out.println("Do you want to exit the program (Y/N)?:  ");
      String answer = keyboard.nextLine();
      letter = answer.charAt(0);
    } while (letter != 'Y' && letter != 'y');
  }
  
  
  
}
