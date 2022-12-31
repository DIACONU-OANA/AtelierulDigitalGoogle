package exceptions;

public class Main {
    public int test(int i){
        try{
            System.out.println("Try ");
            exceptionalMethod(i);
            System.out.println("Try2 ");
            return 0;
        }catch(Exception e){
            System.out.println("catch ");
            return 1;
        }finally{
            System.out.println("finally");
            return 2;
        }
    }

    private void exceptionalMethod(int i){
        if(i>2)  throw new ClassCastException();
    }

    public static void main(String[] args) {
        System.out.println((new Main()).test(5));
    }
}
