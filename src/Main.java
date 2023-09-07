public class Main {

    public static void main(String[] args) {
        Professor[] professors = new Professor[3];
        professors[0] = new Professor("Gianni", 1275L, 2589L, "Java");
        professors[1] = new Professor("Franco", 1299L, 2585L, "Robot");
        professors[2] = new Professor("Paolo", 1231L, 2571L, "Math");

        printJavistsDepartments(professors);
    }
    static void printJavistsDepartments(Professor[] professors){
        for (Professor professor : professors){
            long id = professor.getDepartmentId();
            System.out.println(professor.getDepartmentId());
            if (professor.getCourse().equals("Java")){
                System.out.println("Course java ProfessorId " + professor.getDepartmentId());
            }
            }

        }
    }
