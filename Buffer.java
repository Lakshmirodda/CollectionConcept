public class Buffer{
  public static void main(String[]args){
    StringBuffer sb=new StringBuffer("ad");
    StringBuffer sbb=new StringBuffer("Welcome");
    System.out.println(sb);
    System.out.println(sbb);
    System.out.println(sbb.append("java"));
    System.out.println(sbb.append("to java"));
    System.out.println(sb.insert(1,"bc"));
    System.out.println(sbb.replace(1,4,"java"));
    System.out.println(sbb.delete(1,4));
    System.out.println(sb.reverse());
    System.out.println(sb.substring(2));
    System.out.println(sb.substring(0,2));
    System.out.println(sb.length());
    System.out.println(sbb.capacity());
  }
}