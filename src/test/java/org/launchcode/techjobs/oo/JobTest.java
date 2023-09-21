package org.launchcode.techjobs.oo;



import org.junit.Test;
import static org.junit.jupiter.api.Assertions.*;


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


    @Test
    public void testSettingJobId() {

        assertNotEquals(j1.getId(),  j2.getId());
    }

    @Test
    public void testJobConstructorSetsAllFields() {

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

        assertFalse(j3.getId() == j4.getId());
    }

    @Test
    public void testToStringStartsAndEndsWithNewLine() {
//        String str = "\nID: " + j3.getId() +
//                "\nName: " + j3.getName() +
//                "\nEmployer: " + j3.getEmployer() +
//                "\nLocation: " + j3.getLocation() +
//                "\nPosition Type: " + j3.getPositionType() +
//                "\nCore Competency: " + j3.getCoreCompetency();;
//        String expected = str + newline;
//        assertEquals(expected, j3.toString());//
        String str = "\nID: " + j3.getId() +
                "\nName: " + j3.getName() +
                "\nEmployer: " + j3.getEmployer() +
                "\nLocation: " + j3.getLocation() +
                "\nPosition Type: " + j3.getPositionType() +
                "\nCore Competency: " + j3.getCoreCompetency();;
        String expected = str + newline;
        assertEquals(expected, j3.toString());

    }

    @Test
    public void testToStringContainsCorrectLabelsAndData() {

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

        assertEquals("Data not available", j5.getLocation().toString());
    }

}
