package enumeraion.test;

public class AuthGradeMain1 {
    public static void main(String[] args) {
        AuthGrade[] grades = AuthGrade.values();
        for (AuthGrade grade : grades) {
            System.out.println("Grade: " + grade.name() + ", levle: " + grade.getLevel() + ", description: " + grade.getDescription());
        }
    }
}
