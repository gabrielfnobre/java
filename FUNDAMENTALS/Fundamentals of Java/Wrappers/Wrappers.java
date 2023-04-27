//

public class Wrappers {

    public static void main(String[] args){
        //Ex01
        Byte b = 100;
        Short s = 1000;
        Integer i = 10000;
        Long l = 1000000L;
        System.out.println("Ex01\n" + b + 5);
        System.out.println(s + 50);
        System.out.println(i + 500);
        System.out.println(l + 5000 + "\n");

        //Ex02
        Float f = 2.3F;
        Double d = 43.5;
        System.out.println("Ex02\n" + f + 5);
        System.out.println(d + 50 + "\n");

        //Ex03
        Character c = 'a';
        System.out.println("Ex03\n" + Character.toUpperCase(c));
        
        //Ex04
        Boolean bool = true;
        System.out.println("\nEx04\n" + Boolean.logicalAnd(bool, false) + "\n");

        //Ex05
        Double numeroDeString = Double.parseDouble("10");
        System.out.println(numeroDeString);

        Boolean booleanDeInterger = Boolean.parseBoolean("true");
        System.out.println(booleanDeInterger);
    }

}
