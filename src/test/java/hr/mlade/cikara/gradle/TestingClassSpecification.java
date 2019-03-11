package hr.mlade.cikara.gradle;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class TestingClassSpecification {

  @Test
  void add() {
    TestingClass tc = new TestingClass();
    assertEquals(4, tc.add(2,2));
  }
}