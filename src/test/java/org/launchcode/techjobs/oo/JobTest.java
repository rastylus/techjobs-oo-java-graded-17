package org.launchcode.techjobs.oo;



import org.junit.Test;
import org.junit.Assert.*;
import static org.junit.jupiter.api.Assertions.*;

//import static org.junit.Assert.assertNotEquals;


public class JobTest {
    @Test
    public void emptyTest() {
        assertEquals(0, 0);
    }

    @Test
    public void testSettingJobId() {
        String msg = "Ids are equal";
       Job j1 = new Job();
       Job j2 = new Job();
//        assertNotEquals(j1.getId() != j2.getId());
    }
    @Test
    public void testJobConstructorSetsAllFields() {
        Job j3 = new Job("Product tester", new Employer("ACME"),
                new Location("Desert"), new PositionType("Quality control"),
                new CoreCompetency("Persistence"));

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
    public void testJobsForEqaulity() {
        Job j4 = new Job("Product tester", new Employer("ACME"),
                new Location("Desert"), new PositionType("Quality control"),
                new CoreCompetency("Persistence"));
        Job j5 = new Job("Product tester", new Employer("ACME"),
                new Location("Desert"), new PositionType("Quality control"),
                new CoreCompetency("Persistence"));

        assertFalse(j4.getId() == j5.getId());
    }
    //TODO: Create your unit tests here

}
