package InterviewQuestions;

import java.util.HashMap;
import java.util.Map;

public class CharterFrequency {
public static void main(String[] args) {
	String str="Hello Hai Hello Ram Hai Bhargav say Hai";
	Map<String, Integer> map=new HashMap<String, Integer>();
	String strArr[]=str.split("");
	for (int i = 0; i < str.length(); i++) {
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
			
