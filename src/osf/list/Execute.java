package osf.list;

import java.util.HashMap;
import java.util.Map;

import osf.list.controller.FoodController;
import osf.list.data.FoodData;

public class Execute {
	public static void main(String[] args) {
		FoodController fc = new FoodController();
		// 푸드콘트롤을 호출해야 하니까 메모리 생성해주고
		Map<String,String> req = new HashMap<>();
		//요청할 객체 
		Map<String,Object> res = new HashMap<>();
		// 응답받을 객체 
		req.put("cmd","food");
		req.put("number","2");
		fc.doGet(req, res);
		System.out.println(res);	
		
		req = new HashMap<>();
		res = new HashMap<>();
		req.put("cmd","insert");
		req.put("number","5");
		
		req.put("name","연어");
		req.put("price","25000");
		fc.doPost(req, res);
		System.out.println(res);	
		System.out.println(FoodData.FOOD_LIST);
//		req.put("cmd","update");
//		req.put("number","4");
//		req.put("name","해장국");
//		fc.doPost(req, res);
//		
//		req = new HashMap<>();
//		res = new HashMap<>();
//		req.put("cmd","delete");
//		req.put("number","1");
//		fc.doPost(req, res);
//		System.out.println(res);
//		
//		req.put("cmd", "foodlist");
//		fc.doGet(req, res); 
//		System.out.println(res);
		
	}
}
