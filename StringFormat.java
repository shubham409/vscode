public class StringFormat {

    public static void main(String[] args) {

        Byte b1=127;
        Short s1= 859;
        Integer i1 = 5757;
        Long l1 = (long)595858;
        Long l2 = 595858l;
        Long l3 = 595858L;

        Float f1=959.606f;
        Float f2 = 959.606F;
        Double d1 = 9590.9696d;
        Double d2 = 9590.9696D;


        Character c1=65;
        Character c2 = 65;
        String s= "google";
        
        System.out.printf("%1$s %1$s", s);

        System.out.printf("%1$10d  %2$18f",i,d);

        System.out.printf("%1$s %1$s", s);

        System.out.printf("%1$s %1$s", s);

    }
}