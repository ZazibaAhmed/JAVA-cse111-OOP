public class Volume extends Point{
    public double radius;
    public Volume(double y){
        super(y);
        radius=y;
    }
    double space(){
    System.out.println("The Volume of the circle is ");
    double vol=(4.0/3.0)*Math.PI*Math.pow(radius,3);
    return vol;
   }
}