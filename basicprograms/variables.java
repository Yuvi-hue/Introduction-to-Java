public class variables {
    public static void main(String[] args) {
        int myInt=16;
        double shoeSize=9.5;
        char myInitial='Y';
        String myName="John";
        double result=myInt*shoeSize;
        System.out.println(myInt+" "+shoeSize+" "+myInitial+" "+myName+" "+result);
        burp();

    }
    private static void burp() {
        System.out.println("Buuurrrrpp");
    }
}