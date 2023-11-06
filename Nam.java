import java.util.*;
class Emp{
    String name;
    Double salary;
    int id;
    Emp(String name, double salary,int id){
        this.name=name;
        this.salary=salary;
        this.id=id;
    }
    public String toString(){
        return "name = "+name+" , salary = "+salary+" , id = "+id;
    }
}
    class des implements Comparator<Emp>{
        public int compare(Emp o1,Emp o2){
            return o2.name.compareTo(o1.name);
        }
    }
    public class Nam{
        public static void main(String[]args){
            Emp e1=new Emp("adi",2000,1);
            Emp e2=new Emp("rani",20000,2);
            Emp e3=new Emp("shiva",3000,3);
            Set<Emp> a=new TreeSet<>(new des());
            a.add(e1);
             a.add(e2);
              a.add(e3);
              for(Emp e:a){
                  System.out.println(e);
              }
        }
    }
