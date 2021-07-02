class B{
  void sayHi(int count){
    if(count >0){
      System.out.println("Hi "+count);
      sayHi(count - 1);
    }
    System.out.println("Bye "+count);
  }
}