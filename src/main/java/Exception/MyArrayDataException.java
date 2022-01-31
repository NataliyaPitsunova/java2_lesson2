package Exception;

    public class  MyArrayDataException extends Exception {
        public MyArrayDataException(String s, int i, int j) {
            System.out.println(s + "["+ i + "]"+"["+ j + "]");
        }
    }
