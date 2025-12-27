package stuff.tests;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Set;

import static org.junit.Assert.*;
import org.junit.Test;
import stuff.Student;
import stuff.StudentHelper;


public class StudentTests {

    private static double EPSILON = 1e-7;
    //null checker/helper tests==============================================================================================
    @Test
    public void testFirstNameNull(){
        Student s = new Student(null, "Doe", "johndoe", "50601234", "Computer Science");
        assertNull("Error: null checker for First Name.", s.getFirstName());
    }

    @Test
    public void testLastNameNull(){
        Student s = new Student("John", null, "johndoe", "50601234", "Computer Science");
        assertNull("Error: null checker for Last Name.", s.getLastName());
    }

    @Test
    public void testUBITNull() {
        Student s = new Student("John", "Doe", null, "50601234", "Computer Science");
        assertNull("Error: null checker for UBIT.", s.getUBIT());
    }

    @Test
    public void testPersonNumberNull(){
        Student s = new Student("John", "Doe:", "johndoe", null, "Computer Science");
        assertNull("Error: null checker for Last Name.", s.getLastName());
    }

    @Test
    public void testMajorNull(){

    }

    //test UBIT Helper Method================================================================================================
    @Test
    public void testUBITNormal1(){

    }

    @Test
    public void testUBITNormal2(){

    }

    @Test
    public void testUBITTooShort(){

    }

    @Test
    public void testUBITTooLong(){

    }

    @Test
    public void testUBITFirstCharacterIsADigit(){

    }

    //test Person Number Helper Method==========================================================================================
    @Test
    public void testPersonNumberWrongStart(){

    }

    @Test
    public void testPersonNumberLessThanEightCharacters(){

    }

    @Test
    public void testPersonNumberMoreThanEightCharacters(){

    }

    @Test
    public void testPersonNumberNonDigit1(){

    }

    @Test
    public void testPersonNumberNonDigit2(){

    }

    @Test
    public void testPersonNumberNonDigit3(){

    }

    @Test
    public void testPersonNumberProper(){

    }

    //Miscellaneous tests====================================================================================================
    @Test
    public void testEmailUsingGetter(){

    }

    @Test
    public void testEmailUsingUBITSetter(){

    }
}
