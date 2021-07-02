public abstract class Instrument{
  public abstract void play();
  public abstract void adjust();
  public void compose(){
    System.out.println("In the compose method of Instrument");
  }
}