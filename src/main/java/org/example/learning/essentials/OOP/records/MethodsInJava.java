package org.example.learning.essentials.OOP.records;

/**
 * Created by User on 25.05.2025
 */
public class MethodsInJava {

    public static void main(String[] args) {
        Rectangle rectangle = new Rectangle(4,5);
        System.out.println(rectangle.getArea());
        System.out.println(rectangle.getPerimeter());
        System.out.println(rectangle.isSquare());
        String string = rectangle.toString();
        System.out.println(string);
        Rectangle resize = rectangle.resize(1, 11);
        System.out.println(resize);
        Rectangle rectangle1 = resize.resizeByHeight(5);
        System.out.println(rectangle1);
        System.out.println();
        Rectangle rectangle2 = ShapeFactory.createRectangle(5,55);
        System.out.println(rectangle2);

    }

    private static class ShapeFactory{

        public static Rectangle createRectangle(int width, int height){
            return new Rectangle(width, height);
        }

        @SuppressWarnings("unused")
        public static Rectangle createSquare(int width){
            //noinspection SuspiciousNameCombination
            return new Rectangle(width,width);
        }

    }

    @SuppressWarnings("unused")
    private static abstract class Shape{

        abstract int getArea();
        abstract int getPerimeter();
        abstract void description();

    }


   @SuppressWarnings("unused")
   private static class Rectangle extends Shape{
       private final int width;
       private final int height;

       public Rectangle(int width, int height) {
           this.width = width;
           this.height = height;
       }

       //simple factory method
       @SuppressWarnings("unused")
       public static Rectangle createSquare(int sideLength) {
           return new Rectangle(sideLength, sideLength);
       }

       @SuppressWarnings("SameParameterValue")
       private Rectangle resize(int newWidth, int newHeight){
           return  new Rectangle(newWidth,newHeight);
       }


       private Rectangle resize(int newWidth){
           return  new Rectangle(newWidth,this.height);
       }


       @SuppressWarnings("SameParameterValue")
       private Rectangle resizeByHeight(int newHeight){
           return  new Rectangle(this.width,newHeight);
       }

       @SuppressWarnings("unused")
       public boolean isEqualTo(Rectangle other) {
           return this.width == other.width && this.height == other.height;
       }

       @Override
       void description() {
           System.out.println("Shape with area: " + getArea() + " and perimeter: " + getPerimeter());
       }

       @Override
       public int getArea(){
           return width*height;
       }

       @Override
       public int getPerimeter(){
           return 2*(width+height);
       }
       public boolean isSquare(){
           return width==height;
       }

       public int getHeight() {
           return height;
       }

       @SuppressWarnings("unused")
       public int getWidth() {
           return width;
       }

       @Override
       public String toString() {
           return  "Rectangle{" +
                   "width=" + width +
                   ", height=" + height +
                   ", area=" + getArea() +
                   ", perimeter=" + getPerimeter() +
                   ", square=" + isSquare() +
                   '}';
       }

   }
}
