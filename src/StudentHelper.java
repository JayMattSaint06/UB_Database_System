
public class StudentHelper {

    public static void nullChecker(String argument){
        if (argument == null){
            throw new IllegalArgumentException("no information can be null. " +
                    "All information must have a value assigned to it before continuing this action.");
        }
    }

    public static void UBITHelper(String UBIT){
        if(UBIT.length() > 7 || UBIT.length() < 3){
            throw new IllegalArgumentException("Invalid UBIT: must be 3-7 characters");
        }else if(Character.isDigit(UBIT.charAt(0))){
            throw new IllegalArgumentException("Invalid UBIT: can not start with a number.");
        }
    }

    public static void PersonNumberHelper(String PersonNumber){
        if (!PersonNumber.startsWith("506")) {
            throw new IllegalArgumentException("Invalid Person Number: must start with '506'.");
        }else if(PersonNumber.length() != 8) {
            throw new IllegalArgumentException("Invalid Person Number: most be 8 characters long.");
        }else{
            for(int i = 0; i < PersonNumber.length(); i++){
                if (!Character.isDigit(PersonNumber.charAt(i))){
                    throw new IllegalArgumentException("Invalid Person Number: every character must be a number");
                }
            }
        }
    }


}
