package Exception;

public class MyArraySizeException extends Exception {
    public MyArraySizeException(String s, int size) {;
        System.out.println(s+"["+ size + "]"+"["+ size + "]");
    }
}