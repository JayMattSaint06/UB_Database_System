public class UBStudent {
    private String firstName;
    private String lastName;
    private String PersonNumber;
    private String PNSubString = "506";
    private String email = "@buffalo.edu";

    public UBStudent(String firstName, String lastName, String PersonNumber, String email) {
        this.firstName = firstName;
        this.lastName  = lastName;
        if (!PersonNumber.contains(PNSubString)
        )
        this.PersonNumber = PersonNumber;
        this.email =
    }
}
