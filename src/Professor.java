 /*1. Declare a class Professor with the following instance variables:
- name: String
- identifier: long
- departmentId: long
- course: String
2. Implement a method printJavistsDepartments that takes an array of Professor
objects as parameter and prints to the terminal the value of the departmentId string of
each element of the array, if for that specific element the course value is “Java”.
3. Implement a main method where:
- An array of 3 Professor objects is allocated.
- The method printJavistsDepartments is called, passing the allocated array as
parameter.
- The value of the identifier attribute for each element of the array is printed to
screen, if for that specific element the name attribute contains any
whitespace*/
 public class Professor {

    private String name;
    private long identifier;
    private long departmentId;
    private String course;

    public Professor(String name, long identifier, long departmentId, String course){
        this.name = name;
        this.identifier = identifier;
        this.departmentId = departmentId;
        this.course = course;
    }

     public long getDepartmentId() {
         return departmentId;
     }

     public String getCourse() {
         return course;
     }

     public long getIdentifier() {
         return identifier;
     }
 }
