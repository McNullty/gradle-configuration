package hr.mlade.cikara.gradle;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

class TestingClassIntegrationSpecification {

  @Test
  void add() {
    TestingClass tc = new TestingClass();
    assertEquals(0, tc.subtract(2,2));
  }
}