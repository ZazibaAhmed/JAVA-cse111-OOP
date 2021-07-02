public class Task5_Lab10{
    public static void main(String[]args){
        Myclass m = new Myclass();
        int x;
        try{
            x=m.readInteger();
            System.out.println("Perechi, User gave "+x);
        }catch(EitaIntegerNoiException e){
            System.out.println("parlam na "+e);
        }
    }
}