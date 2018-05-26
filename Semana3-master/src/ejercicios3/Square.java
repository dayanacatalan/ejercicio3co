
package ejercicios3;

public class Square extends GeometricShape {
double side;
Square (double side ){
this.side = side;}
int getArea(){
double area= side * 2;
return (int) area; }
int getPerimeter(){
double Perimetro = (side*4);
return (int) Perimetro; }
    
}
