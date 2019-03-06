package osf.list.dao.impl;

import java.util.List;
import java.util.Map;

import osf.list.dao.FoodDAO;
import osf.list.data.FoodData;

public class FoodDAOIpml implements FoodDAO {

	@Override
	public List<Map<String, String>> selectFoodList() {
		// TODO Auto-generated method stub
		return FoodData.FOOD_LIST;
		
	}

	@Override
	public boolean insertFood(Map<String, String> food) {
		// TODO Auto-generated method stub
		return FoodData.FOOD_LIST.add(food);
	}

	@Override
	public Map<String, String> selectFood(Map<String, String> food) {
		// TODO Auto-generated method stub
		for(int i=0;i<FoodData.FOOD_LIST.size();i++) {
			Map<String,String> f=FoodData.FOOD_LIST.get(i);
			if(f.get("번호").equals(food.get("번호"))) {
				return f;
			}
		}
//		for(Map<String,String> f:FoodData.FOOD_LIST) {
//			if(f.get("번호").equals(food.get("번호"))) {
//				return f;
//			}
//		}
		return null;
	}
	
}
