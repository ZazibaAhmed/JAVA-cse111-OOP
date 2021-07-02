public class MainMethod{
  public static void main(String[] args){
    Instrument a=new Guitar();
    Instrument b=new Keyboard();
    Instrument c=new Violin();
    a.play();
    a.adjust();
    a.compose();
    b.play();
    b.adjust();
    b.compose();
    c.play();
    c.adjust();
    c.compose();
  }
}