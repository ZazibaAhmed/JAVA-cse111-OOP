//TAsk9 LAB4
public class Vehicle2010 extends Vehicle
{
    public void moveUpperRight(){
    moveUp();
    moveRight();
  }
  public void moveUpperLeft(){
    moveUp();
    moveLeft();
  }
  public void moveLowerRight(){
    moveDown();
    moveRight();
  }
  public void moveLowerLeft(){
    moveDown();
    moveLeft();
  }
  public boolean equals(Vehicle2010 v){
    if((this.x==v.x)&&(this.y==v.y))
    {
      return true;
    }
    else
    {
      return false;
    }
  }
}

  
  
  
  
  
  
  
  
  
                              
    
    
    
    
    
    
    
    
    
    
    
    
  
