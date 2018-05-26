
package ejercicios3;

public class Circle extends GeometricShape {
double radius;
Circle(double radius){
this.radius = radius;
}
int getArea(){
double area= Math.PI * Math.pow(radius, 2);
return (int) area;}
int getPerimeter(){
double perimetro = 2 * Math.PI * radius ;
return (int) perimetro; }
}
