package main;

import org.junit.Assert;
import org.junit.Test;

public class ProbabilityTest {

 Probability event1;
 Probability event2;

 @Test
 public void testWhenPropabilityOftwoEventsIsEqualReturnsTrue(){
  event1 = new Probability(0.5);
  event2 = new Probability(0.5);
   boolean result= event1.compare(event2);
  Assert.assertEquals(true, result);
 }


}