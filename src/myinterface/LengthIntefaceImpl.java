package myinterface;

public class LengthIntefaceImpl  {

   public static void main(String[] args) {
    LengthInterface lengthInterface=str->str.length();

    System.out.println("Length of the string using LengthInterface is "+lengthInterface.getLength("ashutosh"));

    String str="Ashutosh Kumar Tiwari";
    System.out.println("Length of "+str+" is "+lengthInterface.getLength(str));

    String str1=new String("Ashutosh Kumar Tiwari");
    System.out.println("Length of "+str1+" is "+lengthInterface.getLength(str1));

    // System.out.println(str==str1);
    // System.out.println(str.equals(str1));
    // System.out.println(str.equals(null));
    // System.out.println(str1.equals(null));
    System.out.println(str==null);
    System.out.println(str1==null);
   }
}
