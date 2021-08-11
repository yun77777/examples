package review.prgrmrs;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.StringTokenizer;

public class openChatting_lv2 {

	public static void main(String[] args) {
		String[] record={"Enter uid1234 Muzi", "Enter uid4567 Prodo","Leave uid1234","Enter uid1234 Prodo","Change uid4567 Ryan"};
		
		System.err.println(solution(record));
	}
	
	//"Prodo님이 들어왔습니다.", "Ryan님이 들어왔습니다.", "Prodo님이 나갔습니다.", "Prodo님이 들어왔습니다."
	public static String[] solution(String[] record) {
		Map<String, String> map=new HashMap<String, String>();
		List<String> list=new ArrayList<>();
		for(int i=0; i<record.length; i++) {
			StringTokenizer st=new StringTokenizer(record[i]);
			String type=st.nextToken();
			String id=st.nextToken();
			String nickName="";
			if(!type.equals("Leave")) nickName=st.nextToken();
			switch(type) {
				case "Enter":
					map.put(id,nickName);
					list.add(id+"님이 들어왔습니다.");
					break;
				case "Leave":
					list.add(id+"님이 나갔습니다.");
					break;
				case "Change":
					map.put(id,nickName);
					break;
			}
		}
		String[] res=new String[list.size()];
		int i=0;
		for(String s: list) {
			int idx=s.indexOf("님");
			String id=s.substring(0,idx);
			res[i++]=s.replace(id,map.get(id));
		}

		System.err.println(list);
//		for(int i=0; i<list.size(); i++) {
//			int idx=list.get(i).indexOf("님");
//			String id=list.get(i).substring(0,idx);
//			res[i]=list.get(i).replace(id,map.get(id));
//		}
		
		for(String s:res) System.err.println(s);
		System.err.println(list);
		return res;
	}
}
