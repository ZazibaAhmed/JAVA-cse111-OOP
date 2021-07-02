class B{
  public static int temp = 3;
  public int y = 1;
  public static int x = 1;
  public int sum = 2;
  public B(){
    y = temp + 1 ;
    x = 3 + temp + x;
    temp-=2;
  }  
  public B(B b){
    sum = b.sum + 20;
    x = b.x + x;
  }
  public void methodA(int m, int [] n){
    int x = 0;
    y = y + m + (temp++);
    x = x + 2 +  (++n[0]);
    sum = sum + x + y;
    n[0] = sum + 2;
    System.out.println(x + " " + y+ " " + sum);  
  }  
  public void methodA(int m, int n){    
    int [] y = {0};
    this.y = y[0] + this.y + m; 
    x = this.y + 2 + temp - n;
    methodA(x, y);
    sum = x + y[0] + this.sum;
    System.out.println(x + " " + y[0]+ " " + sum);
  }
}
