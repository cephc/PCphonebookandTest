import book.Phonebook;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class PhonebookTest {

    @Test
    public void addTest(){
        //Given
        Phonebook phonebook = new Phonebook();
        String expected = "302-555-5789";

        //when
        phonebook.add("Chatyra", "302-555-5789");
        String actual = phonebook.lookUp("Chatyra");

        //then
        Assertions.assertEquals(expected, actual);
    }
    @Test
    public void removeTest(){
        //Given
        Phonebook phonebook = new Phonebook();
        Boolean expected = false;

        //when
        phonebook.remove("Taylor");
        Boolean actual = phonebook.hasEntry("Taylor");

        //then
        Assertions.assertEquals(expected, actual);
    }
    @Test
    public void hasEntryTest(){
        //Given
        Phonebook phonebook = new Phonebook();
        Boolean expected = true;

        //when
        phonebook.add("Malachi", "302-555-3216");
        phonebook.hasEntry("Malachi");
        Boolean actual = phonebook.hasEntry("Malachi");

        //then
        Assertions.assertEquals(expected, actual);
    }
    @Test
    public void lookUpTest(){
        //Given
        Phonebook phonebook = new Phonebook();
        String expected = "302-555-1234";

        //when
        phonebook.add("Taylor", "302-555-1234");
        phonebook.lookUp("Taylor");
        String actual = phonebook.lookUp("Taylor");

        //then
        Assertions.assertEquals(expected,actual);
    }
    @Test
    public void reverseLookUpTest(){
        //Given
        Phonebook phonebook = new Phonebook();
        String expected = "Will";


        //when
        phonebook.add("Will", "302-555-0987");
        phonebook.reverseLookUp("302-555-0987");
        String actual = phonebook.reverseLookUp("302-555-0987");

        //then
        Assertions.assertEquals(expected, actual);
    }
}
