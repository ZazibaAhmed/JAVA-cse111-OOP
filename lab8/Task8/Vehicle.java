//task8 LAB4
public class Vehicle 
{
  public int x,y;
  public String toString() {
      return "( "+x+" , "+y+" )";
    }
  public void moveUp(){
    y++;
   }
  public void moveDown(){
    y--;
  }
  public void moveLeft(){
    x--;
  }
  public void moveRight(){
    x++;
  }
}
