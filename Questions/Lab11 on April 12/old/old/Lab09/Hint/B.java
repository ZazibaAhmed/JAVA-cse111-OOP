public class B{
  public static void main(String []args){
    String []a={"chicken","beef","kfc","american burger","baton rouge"};
    int i,j;
    String tmp;
    i=0;
    while(i<a.length){
      j=1;
      while(j<a.length){
        if(a[j-1].compareToIgnoreCase(a[j])>0){
          tmp=a[j-1];
          a[j-1]=a[j];
          a[j]=tmp;
        }
        ++j;
      }
      ++i;
    }
    
    i=0;
    while(i<a.length){
      System.out.print(a[i]+", ");
      ++i;
    }
  }
}