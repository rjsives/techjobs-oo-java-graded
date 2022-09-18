package org.launchcode.techjobs.oo.test;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.JUnit4;
import org.launchcode.techjobs.oo.*;

import static org.junit.Assert.*;


/**
 * Created by LaunchCode
 */
@RunWith(JUnit4.class)
public class JobTest {
    @Test
    public void testSettingJobId() {
        Job testJobEmpty1 = new Job();
        Job testJobEmpty2 = new Job();
        assertNotEquals(testJobEmpty1,testJobEmpty2);
    }
@Test
    public void testJobConstructorSetsAllFields(){
    Job testJob = new Job("Product tester", new Employer("ACME"), new Location("Desert"), new PositionType("Quality control"), new CoreCompetency("Persistence"));
    assertEquals("Product tester", testJob.getName());
    assertEquals("ACME", testJob.getEmployer().getValue());
    assertEquals("Desert", testJob.getLocation().getValue());
    assertEquals("Quality control", testJob.getPositionType().getValue());
    assertEquals("Persistence", testJob.getCoreCompetency().getValue());

    assertTrue(testJob instanceof Job);
    assertTrue(testJob.getEmployer() instanceof Employer);
    assertTrue(testJob.getLocation() instanceof Location);
    assertTrue(testJob.getPositionType() instanceof PositionType);
    assertTrue(testJob.getCoreCompetency() instanceof CoreCompetency);

}

@Test
    public void testJobsForEquality(){
    Job firstJob = new Job("Quality Assurance Manager", new Employer("Platinum Driveline"), new Location("Eureka"), new PositionType("Quality control"), new CoreCompetency("Ethical"));
    Job secondJob = new Job("Quality Assurance Manager", new Employer("Platinum Driveline"), new Location("Eureka"), new PositionType("Quality control"), new CoreCompetency("Ethical"));

    assertFalse(firstJob.equals(secondJob));
}

}
