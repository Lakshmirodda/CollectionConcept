public class Sample4{
  public static void main(String[]args){
    String s="AdiLakshmi";
    System.out.println(s.toUpperCase());
    System.out.println(s.toLowerCase());
    System.out.println(s.isEmpty());
    System.out.println(s.startsWith("A"));
    System.out.println(s.endsWith("i"));
    System.out.println(s.startsWith("adi"));
    System.out.println(s.endsWith("hmi"));
    System.out.println(s.contains("ksh"));
    System.out.println(s.replace('A','B'));
    System.out.println(s.replace("Adi","idl"));
    String t="123456";
    System.out.println(t.replace("123","321"));
    

  }
}