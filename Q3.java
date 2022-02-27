import java.io.*;

class ExceptionA extends Exception {

}
class ExceptionB extends ExceptionA {

}

class Q3 {
    public static void main(String[] args){
        try {
        }
        catch(NullPointerException e) {
            System.out.println(e);
        }
        try {
                throw new ExceptionA();
        } catch(ExceptionA e) {
            System.out.println(e);
        }
        try {
                throw new ExceptionB();
        }catch(ExceptionB e) {
            System.out.println(e);
        }
        try {
            throw new IOException();
        } catch(IOException e) {
            System.out.println(e);
        }
    }
}