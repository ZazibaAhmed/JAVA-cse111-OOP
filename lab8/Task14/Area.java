public class Area extends Point{
    public double radius;
    public Area(double x){
        super(x);
        radius=x;
    }
    double space(){
    System.out.println("The Area of the circle is ");
    
    double area=Math.PI*Math.pow(radius,2);
    return area;
   }
}