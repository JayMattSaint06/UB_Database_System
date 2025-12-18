public class Student {
    private String firstName;
    private String lastName;
    private String UBIT;
    private String PersonNumber;
    private String major;
    private String email;
    private double balance;

    /**
     * Student information
     * @param firstName first name of the student.
     * @param lastName last name of the student
     * @param UBIT Student's ID name. email consists of UBIT + @buffalo.edu
     * @param PersonNumber Student's 8-digit ID number.
     * @param major Student's major.
     */
    public Student(String firstName, String lastName, String UBIT, String PersonNumber, String major) {
        //if null, exception thrown, program ends.
        StudentHelper.nullChecker(firstName);
        StudentHelper.nullChecker(lastName);
        StudentHelper.nullChecker(UBIT);
        StudentHelper.nullChecker(PersonNumber);

        //if parameters don't meet requirements, exception thrown, program ends.
        StudentHelper.UBITHelper(UBIT);
        StudentHelper.PersonNumberHelper(PersonNumber);

        this.firstName = firstName;
        this.lastName  = lastName;
        this.UBIT = UBIT.toLowerCase();
        this.PersonNumber = PersonNumber;
        this.email = this.UBIT + "@buffalo.edu";
        if(major == null){
            this.major = "Undecided";
        }else {
            this.major = major;
        }
        this.balance = 0.00;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getUBIT() {
        return UBIT;
    }

    //email must match UBIT; email setter within setUBIT
    public void setUBIT(String UBIT) {
        this.UBIT = UBIT.toLowerCase();
        this.email = this.UBIT + "@buffalo.edu";
    }

    public String getPersonNumber() {
        return PersonNumber;
    }

    public void setPersonNumber(String personNumber) {
        PersonNumber = personNumber;
    }

    public String getMajor() {
        return major;
    }

    public void setMajor(String major) {
        this.major = major;
    }

    //no setter needed for Email; Email set by change in setUBIT
    public String getEmail() {
        return email;
    }

    //balance getter and setter may not be needed; placeholders
    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }
}
