package ExceptionsAndFinal;

public class Main {

    public static void main(String[] args) {
        int a=200;
        int b=0;
        int c[]=new int[3];
        //final is like a constant, we cannot alter the value once its defined
        final int d=6;


        // we can use multiple catch blocks with one try block, or we can combine them
        try{
            a=a/b;
            c[10]=5;
        }catch (ArithmeticException e){
            System.out.println(e);
        }
        catch (ArrayIndexOutOfBoundsException e){
            System.out.println(e);
        }
        finally {
            System.out.println("finally will run atlast even if the exception occurs");
        }
        try{
            a=a/b;
            c[10]=5;
//            d=7;//we cannot assign it will show error
        }catch (ArithmeticException | ArrayIndexOutOfBoundsException e){
            System.out.println(e);
        }
        finally {
            System.out.println("finally will run atlast even if the exception occurs");
        }
    }

}
