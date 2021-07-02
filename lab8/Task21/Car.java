public class Car{
    public static int count;
    public int year;
    public Car(int x){
        year=x;
        count++;
    }
    public static int getObjectCount(){
        return count;
    }
    public int getYear(){
        return year;
    }
}
    
        
        