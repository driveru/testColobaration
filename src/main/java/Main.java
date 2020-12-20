public class Main {
    public static void main(String[] args) {
        iPerson chel = new Chelovek();
        chel.blurp();
    }
}

class Chelovek implements iPerson{
    static final int age = 35;
    public void blurp(){
        System.out.println("аауауаюююуаюуююыаыюаыюаююыауююыауыа");
    }
}
