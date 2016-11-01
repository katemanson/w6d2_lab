import java.util.*;

public class Bear implements Trainable {
  
  private String name;
  private ArrayList<Edible> belly;
  private boolean trainable;

  public Bear(String name, boolean trainable){
    this.name = name;
    this.belly = new ArrayList<Edible>();
    this.trainable = trainable;
  }

  public String getName(){
    return this.name;
  }

  public int foodCount(){
    return this.belly.size();
  }

  public void eat(Edible food){
    this.belly.add(food);
  }

  // public boolean bellyFull(){
  //   return foodCount() == belly.length;
  // }

  public void sleep(){
    this.belly.clear();
  }

  public Edible throwUp() {
    if (foodCount() > 0) {
      return this.belly.remove(0);
    }
    return null;
  }

  public int totalNutrition() {
    int total = 0;
    for ( int i = 0; i < foodCount() ; i++ ){
      total += belly.get(i).nutritionValue();
    }
    return total;
    }

   public boolean trainable() {
    return this.trainable;
   } 

}
