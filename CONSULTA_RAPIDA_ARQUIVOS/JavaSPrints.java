//JAVA'S PRINTS

//Here we will explain how to use "print" methods of the Java "System.out" object.
//We have 3 models print, they are:
//  System.out.println - Inserts a new line after the text;
//  System.out.print - Keep the cursor on the same line after the text;
//  System.out.printf - Specifies a formatted character for the text, using "%" added special character. 
//  Below we have some examples:
//                      %s - strings
//                      %d - integers
//                      %f - floats
//                      %2f - doubles
//                      %2b - booleans
//                      %2c - character


public class JavaSPrints {

    public static void main(String[] args){

        System.out.print("No jump the line|");
        System.out.println("jumping the line");
        System.out.printf("%s %d%s %s", "A text formatted by", 1, "th", "time");

    }

}