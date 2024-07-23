class Abcd
 {
    int id;
    String name;
    static String company_name = "Wipro";
 static void display()
 {
    System.out.println("I am static method");
    company_name = "amdocs";
 }
 Abcd(intid,Stringname)
 {
    this.id = id;
    this.name = name;
 }

 public void emp_details()
 {
    System.out.println("Id = "+id);
    System.out.println("Name = "+name);
    System.out.println("Company name = "+company_name);
 }
 } 
public class static_variable
 {
 public static void main(String[] args) 
{
    Abcd.display();
    Abcda=new Abcd(1,"abcd");
    a.emp_details();
 }
 }
