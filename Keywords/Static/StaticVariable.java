// Static Variable :-
// - The static variable can be used to refer to the common property of all objects.
// - The static variable gets memory only once in the class area at the time of class loading.

class Emp_stat
 {
    intid;
    Stringname;
    static String company_name="Wipro";
    Emp_stat(intid,Stringname)
 {
    this.id=id;
    this.name=name;
 }
 public void emp_details()
 {
    System.out.println("Id="+id);
    System.out.println("Name="+name);
    System.out.println("Company name="+company_name);
 }
 } 
public class static_variable
 {
 public static void main(String[] args) 
{
     Emp_state=new Emp_stat(1,"abc");
     e.emp_details();
     Emp_state1=new Emp_stat(2,"pqr");
     e1.emp_details();
 }
