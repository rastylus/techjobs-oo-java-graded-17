package org.launchcode.techjobs.oo;



import org.junit.Test;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
//import org.junit.Assert.*;
import static org.junit.jupiter.api.Assertions.*;

//import static org.junit.Assert.assertNotEquals;

public class JobTest {

        String newline = System.lineSeparator();
        Job j1 = new Job();
        Job j2 = new Job();
        Job j3 = new Job("Product tester", new Employer("ACME"),
                new Location("Desert"), new PositionType("Quality control"),
                new CoreCompetency("Persistence"));
        Job j4 = new Job("Product tester", new Employer("ACME"),
            new Location("Desert"), new PositionType("Quality control"),
            new CoreCompetency("Persistence"));
        Job j5 = new Job("Product tester", new Employer("ACME"),
            new Location(""), new PositionType("Quality control"),
            new CoreCompetency("Persistence"));
//    @BeforeEach
//    public void init(){
////        //persist your data
//    }
//
//    @AfterEach
//    public void clear(){
//        //remove your data
//    }


    @Test
    public void testSettingJobId() {
//        String msg = "Ids are equal";
//       Job j1 = new Job();
//       Job j2 = new Job();

        assertNotEquals(j1.getId(),  j2.getId());
    }
    @Test
    public void testJobConstructorSetsAllFields() {
//        Job j3 = new Job("Product tester", new Employer("ACME"),
//                new Location("Desert"), new PositionType("Quality control"),
//                new CoreCompetency("Persistence"));
//
        assertTrue(j3.getName() instanceof String);
        assertEquals(j3.getName(), "Product tester");
        assertTrue(j3.getEmployer() instanceof Employer);
        assertEquals(j3.getEmployer().toString(), "ACME");
        assertTrue(j3.getLocation() instanceof Location);
        assertEquals(j3.getLocation().toString(), "Desert");
        assertTrue(j3.getPositionType() instanceof PositionType);
        assertEquals(j3.getPositionType().toString(), "Quality control");
        assertTrue(j3.getCoreCompetency() instanceof CoreCompetency);
        assertEquals(j3.getCoreCompetency().toString(), "Persistence");
    }
    @Test
    public void testJobsForEquality() {
//        Job j4 = new Job("Product tester", new Employer("ACME"),
//                new Location("Desert"), new PositionType("Quality control"),
//                new CoreCompetency("Persistence"));
//        Job j5 = new Job("Product tester", new Employer("ACME"),
//                new Location("Desert"), new PositionType("Quality control"),
//                new CoreCompetency("Persistence"));

        assertFalse(j3.getId() == j4.getId());
    }
    @Test
    public void testToStringStartsAndEndsWithNewLine() {
        String str = "\nID: " + j3.getId() +
                "\nName: " + j3.getName() +
                "\nEmployer: " + j3.getEmployer() +
                "\nLocation: " + j3.getLocation() +
                "\nPosition Type: " + j3.getPositionType() +
                "\nCore Competency: " + j3.getCoreCompetency();;
        String expected = str + newline;
        assertEquals(expected, j3.toString());
//        String str = "";
//        Job j6 = new Job("Product tester", new Employer("ACME"),
//                new Location("Desert"), new PositionType("Quality control"),
//                new CoreCompetency("Persistence"));
//        String newline = System.getProperty("line.separator");
//        String fullStr = newline + str + newline;
//        boolean hasNewline = fullStr.contains(newline);
//
//        assertEquals( System.lineSeparator() + "" + System.lineSeparator(),
//                j3.toString());
//        assertTrue(hasNewline);
    }
    @Test
    public void testToStringContainsCorrectLabelsAndData() {
//        Job j7 = new Job("Product tester", new Employer("ACME"),
//                new Location("Desert"), new PositionType("Quality control"),
//                new CoreCompetency("Persistence"));
        String newline = System.lineSeparator();
        String str = "ID: " + j3.getId() +
                "\nName: " + j3.getName() +
                "\nEmployer: " + j3.getEmployer() +
                "\nLocation: " + j3.getLocation() +
                "\nPosition Type: " + j3.getPositionType() +
                "\nCore Competency: " + j3.getCoreCompetency();

//
//        assertEquals(System.lineSeparator() +
//                        "\nID: 3" +
//                        "\nID: 3" +
//                        "\nName: Product tester" +
//                        "\nEmployer: ACME" +
//                        "\nLocation: Desert" +
//                        "\nPosition Type: Quality control" +
//                        "\nCore Competency: Persistence" +
//                        System.lineSeparator(),
//                j3.toString());

            assertEquals(
            newline +
                        str +
                        newline,
                j3.toString());

    }

    @Test
    public void testToStringHandlesEmptyField() {
//        Job j8 = new Job("Product tester", new Employer("ACME"),
//                new Location(), new PositionType("Quality control"),
//                new CoreCompetency("Persistence"));

        assertEquals("Data not available", j5.getLocation().toString());
    }
//    @Test
//    public void checkValue() {
//        assertEquals("Desert", j3.getLocation().getValue());
//    }

}
