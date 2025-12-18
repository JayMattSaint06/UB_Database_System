public class Student {
    private String firstName;
    private String lastName;
    private String UBIT;
    private String PersonNumber;
    private String Major;
    private String email;

    public Student(String firstName, String lastName, String UBIT, String PersonNumber, String Major) {
        this.firstName = firstName;
        this.lastName  = lastName;
        if(UBIT.length() > 7 || UBIT.length() < 3){
            throw new IllegalArgumentException("Invalid UBIT: must be between 3 and 7 characters")
        }
        this.UBIT = UBIT;
        if (!PersonNumber.startsWith("506")) {
            throw new IllegalArgumentException("Invalid Person Number: must start with '506'.")

            this.PersonNumber = PersonNumber;
        }
        this.email =
    }
}
