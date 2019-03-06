package osf.list.service.impl;

import java.util.List;
import java.util.Map;

import osf.list.dao.FoodDAO;
import osf.list.dao.impl.FoodDAOIpml;
import osf.list.service.FoodService;

public class FoodServiceImpl implements FoodService {
	private FoodDAO fdao = new FoodDAOIpml();

	@Override
	public List<Map<String, String>> selectFoodList() {
		// TODO Auto-generated method stub
		return fdao.selectFoodList();
	}

	@Override
	public boolean insertFood(Map<String, String> food) {
		// TODO Auto-generated method stub
		return fdao.insertFood(food);
	}

	@Override
	public Map<String, String> selectFood(Map<String, String> food) {
		// TODO Auto-generated method stub
		return fdao.selectFood(food);
	}

}
