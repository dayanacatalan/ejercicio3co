
package ejercicios3;

public class Rectangle extends GeometricShape {
double length, width;  
Rectangle(double length, double width){
this.length = length;
this.width = width;  }
int getArea(){
double area= length * width;
return (int) area; }
  
int getPerimeter(){
double perimetro = ((length * 2)+(width * 2));
return (int) perimetro;}
    
    
}
