package osf.list.data;

import java.util.ArrayList;
import java.util.List;

import osf.list.VO.FoodVO;

public class FoodData {
	public static final List<FoodVO> FOOD_LIST = new ArrayList<>();
	static {
		FoodVO food = new FoodVO();
		food.setNumber(1);
		food.setName("참치");
		food.setPrice(30000);
		FOOD_LIST.add(food);
		
		food = new FoodVO();
		food.setNumber(2);
		food.setName("연어");
		food.setPrice(25000);
		FOOD_LIST.add(food);
		
		food = new FoodVO();
		food.setNumber(3);
		food.setName("과메기");
		food.setPrice(20000);
		FOOD_LIST.add(food);
		
		
	}
	
	
}
