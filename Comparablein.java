import java.util.*;
class Emp implements Comparable<Emp>{
  int id;
  String name;
  int salary;
  Emp(int id,String name, int salary){
    this.id=id;
    this.name=name;
    this.salary=salary;
  }
  public String toString(){
    return "Emp [id = "+id+" , name = "+name+" , salary = "+salary+"]";
  }
  public int compareTo(Emp o){
    return o.salary-this.salary;
  }
}
  public class Comparablein{
    public static void main(String[]args){
      Emp e=new Emp(100,"adi",20000);
      Emp e1=new Emp(10,"rodda",400000);
      Emp e2=new Emp(19,"lakshmi",30000);
      Emp e3=new Emp(9,"reddy",50000);
      Queue<Emp>p=new PriorityQueue<Emp>();
      p.add(e);
      p.add(e1);
      p.add(e2);
      p.add(e3);
      for(Emp s:p){
        System.out.println(s);
      }
    }
    
  }
