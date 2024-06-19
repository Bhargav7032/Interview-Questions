package InterviewQuestions;

import java.util.HashMap;
import java.util.Map;

public class wordFrequency {
	public static void main(String[] args) {
//	String str="Hello Bhargav Say Hai Bhargav is Java Developer";
//	Map<String, Integer>map=new HashMap<String, Integer>(); 
//	String strArr[]=str.split(" ");
//	for (int i = 0; i < strArr.length; i++) {
//	String word=strArr[i];
//	if (map.containsKey(word)) {
//		Integer count=map.get(word);
//		count++;
//		map.put(word, count);
//	}else {
//		map.put(word, 1);
//	}
//	}
//	System.out.println(map);
		
		
		String str="Hello Bhargav Say Hai Bhargav is Java Developer";
		Map<String,Integer>map=new HashMap<String,Integer>();
		String strArr[]=str.split(" ");
		for (int i = 0; i < strArr.length; i++) {
			String word=strArr[i];
			if (map.containsKey(word)) {
			 Integer count=map.get(word);
			 count++;
			 
			 map.put(word, count);
			}else {
				map.put(word, 1);
			
		}
	
		}
		System.out.println(map);
}
}
