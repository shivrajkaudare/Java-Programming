public class Address
 {
 String state;
 String city;
 }
 public Address(String state , String city)
 {
 this.state = state;
 this.city = city;
 
public class Employee
 {
 String name;
 Address address;
 public Emp(Stringname, Addressaddress){
 this.name = name;
 this.address = address;
 }
 void display()
 {
 System.out.println(name);
 System.out.println(address.state);
 System.out.println(address.city);
 }
 public static void main(String[]args)
 {
 Addressa1 = newAddress(“MH","Pune");
 Employee e1 = newEmployee(“Abc",a1);
 e1.display();
 }
 }
