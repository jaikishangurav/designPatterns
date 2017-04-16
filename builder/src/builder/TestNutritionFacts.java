package builder;

public class TestNutritionFacts {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		NutritionFacts cocaCola=new NutritionFacts.Builder(240, 8).calories(100).sodium(35).carbohydrate(27).build();
		System.out.println(cocaCola);
	}

}
