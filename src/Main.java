public class Main {

    public static void main(String[] args) {
        Professor[] professors = new Professor[3];
        professors[0] = new Professor("Gianni", 8885L, 9991L, "Java");
        professors[1] = new Professor("Franco", 8886L, 9992L, "Robot");
        professors[2] = new Professor("Paolo", 8887L, 9993L, "Math");

        printJavistsDepartments(professors);
    }
    static void printJavistsDepartments(Professor[] professors){
        for (Professor professor : professors){
            long identifier = professor.getIdentifier();
            System.out.println( "identifier"+ " " + professor.getIdentifier());
            long id = professor.getDepartmentId();
            System.out.println(professor.getDepartmentId());
            if (professor.getCourse().equals("Java")){
                System.out.println("Course Java  Professor DepartmentId " + professor.getDepartmentId());
            }
            }

        }
    }
