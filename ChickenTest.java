import static org.junit.Assert.*;
import org.junit.*;

public class ChickenTest{
  Chicken chicken;

  @Before 
  public void before() {
    chicken = new Chicken();
  }

  @Test
  public void canCluck() {
    assertEquals( "clucking", chicken.cluck() ); 
  }

  @Test
  public void hasNutritionValue() {
    assertEquals(1, chicken.nutritionValue());
  }
}
