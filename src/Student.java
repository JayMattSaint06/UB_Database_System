import
public class Student {
    private String firstName;
    private String lastName;
    private String UBIT;
    private String PersonNumber;
    private String major;
    private String email;

    public Student(String firstName, String lastName, String UBIT, String PersonNumber, String major) {
        StudentHelper.UBITHelper(UBIT);
        StudentHelper.PersonNumberHelper(PersonNumber);
        this.firstName = firstName;
        this.lastName  = lastName;
        this.UBIT = UBIT.toLowerCase();
        this.PersonNumber = PersonNumber;
        this.email = this.UBIT + "@buffalo.edu";
        this.major = major;
    }
}
