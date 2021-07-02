public class Animal {

  private String sound = "Animal Sound";

  public Animal(){
  }
  
  Animal(String sound){
    this.sound=sound;
  }

  public String makeSound(){
    return sound;
  }
}
