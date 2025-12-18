
public class StudentHelper {

    public static void nullChecker(String argument){
        if (argument == null){
            throw new IllegalArgumentException("the following cannot be null: first name, last name, UBIT, and Person Number.");
        }
    }

    public static void UBITHelper(String UBIT){
        if(UBIT.length() > 7 || UBIT.length() < 3){
            throw new IllegalArgumentException("Invalid UBIT: must be 3-7 characters");
        }else if(Character.isDigit(UBIT.charAt(0))){
            throw new IllegalArgumentException("Invalid UBIT: can not start with a number.");
        }
    }

    public static void personNumberHelper(String personNumber){
        if (!personNumber.startsWith("506")) {
            throw new IllegalArgumentException("Invalid Person Number: must start with '506'.");
        }else if(personNumber.length() != 8) {
            throw new IllegalArgumentException("Invalid Person Number: most be 8 characters long.");
        }else{
            for(int i = 0; i < personNumber.length(); i++){
                if (!Character.isDigit(personNumber.charAt(i))){
                    throw new IllegalArgumentException("Invalid Person Number: every character must be a number");
                }
            }
        }
    }

    public static void balanceHelper(double balance){
        balance = Math.round(balance * 100.0) / 100.0;
    }


}
