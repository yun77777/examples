package prgrmrs;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.StringTokenizer;

public class ex6_lv2 {

	public static void main(String[] args) {
		String[] record= {"Enter uid1234 Muzi", "Enter uid4567 Prodo","Leave uid1234","Enter uid1234 Prodo","Change uid4567 Ryan"};
		System.err.println(solution(record));
	}
	//"Prodo님이 들어왔습니다.", "Ryan님이 들어왔습니다.", "Prodo님이 나갔습니다.", "Prodo님이 들어왔습니다."
	public static String[] solution(String[] record) {
		List<String> list=new ArrayList<String>();
		Map<String,String> map=new HashMap<String, String>();
		
		for(String r : record) {
			StringTokenizer st=new StringTokenizer(r);
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
		int idx=0;
		for(String s : list) {
			int endIdx=s.indexOf("님");
			String id=s.substring(0,endIdx);
			res[idx++]=s.replace(id,map.get(id));
		}
		
//		for (int i = 0; i < res.length; i++) {
//			System.err.println(res[i]);
//		}
		
		return res;
	}
}

//	//"Prodo님이 들어왔습니다.", "Ryan님이 들어왔습니다.", "Prodo님이 나갔습니다.", "Prodo님이 들어왔습니다."
//	public static String[] solution(String[] record) {
////		public static String[] solution(String[] record) {
////		String[] str = {"님이 들어왔습니다.","님이 나갔습니다."};
//		
//		
//		List<Map<String,String>> list=new ArrayList<Map<String,String>>();
////		Map<String,String> map=new HashMap<String, String>();
//		
//		int cnt=0;
//		for(int i=0;i<record.length;i++) {
//			String[] tmp=record[i].split(" ");
//			String id="";
//			String nickName="";
//			Map<String,String> map=new HashMap<String, String>();
//			id=tmp[1];
//			//type, id, nickname
//			if(tmp[0].equals("Change")) {
//				for(int j=0;j<list.size();j++) {
//					if(list.get(j).get("id").equals(id)) list.get(j).put("nickName",tmp[2]);
//				}
//				System.err.print("Change: "+id+"'s nickname "+map.get(id)+"->"+tmp[2]);
//				System.err.println();
//				map.put("type","Change");
//				map.put("id",id);
////				map.put("nickName",tmp[2]);
//			}else {
//				if(tmp[0].equals("Enter")) {
//					for(int j=0;j<list.size();j++) {
//						if(list.get(j).containsKey("id")) System.err.println("lalala");
//						if(list.get(j).containsKey("id")) list.get(j).put("nickName",tmp[2]);
//					}
//					
//					nickName=tmp[2];
//					if(!map.containsKey(id)) {
//						map.put("type","Enter");
//						map.put("id",id);
//						map.put("nickName",nickName);
//					}
//					cnt++;
//				}
//				else if(tmp[0].equals("Leave")) {
//					map.put("type","Leave");
//					map.put("id",id);
//					map.put("nickName",nickName);
//					cnt++;
//				}
//			}
//			list.add(map);
//		}
//		System.err.println(list);
//		List<String> arrList=new ArrayList<String>();
//		
//		for(int i=0; i<list.size(); i++) {
//			String str="";
//			String type=list.get(i).get("type");
//			String id=list.get(i).get("id");
//			String nickName=list.get(i).get("nickName");
////			System.err.println(list.get(i));
//			if(type.equals("Enter")) str="님이 들어오셨습니다.";
//			if(type.equals("Leave")) str="님이 나갔습니다.";
//			
//			System.err.println(nickName+str);
//			arrList.add(nickName+str);
//		}
//		String[] answer = new String[arrList.size()-1];
//		for(int i=0;i<answer.length;i++) {
//			answer[i]=arrList.get(i);
//			System.err.println(answer[i]);
//		}
//		return answer;
//	}
//}

//package prgrmrs;
//
//import java.util.ArrayList;
//import java.util.HashMap;
//import java.util.List;
//import java.util.Map;
//
//public class ex6_lv2 {
//	
//	public static void main(String[] args) {
//		String[] record= {"Enter uid1234 Muzi", "Enter uid4567 Prodo","Leave uid1234","Enter uid1234 Prodo","Change uid4567 Ryan"};
//		System.err.println(solution(record));
//	}
//	
//	//"Prodo님이 들어왔습니다.", "Ryan님이 들어왔습니다.", "Prodo님이 나갔습니다.", "Prodo님이 들어왔습니다."
//	public static List<String> solution(String[] record) {
////		public static String[] solution(String[] record) {
////		String[] str = {"님이 들어왔습니다.","님이 나갔습니다."};
//		
////		String[] answer = {};
//		List<String> answer=new ArrayList<String>();
//		//List<Map<String,String>> list=new ArrayList<Map<String,String>>();
//		Map<String,String> map=new HashMap<String, String>();
//		for(int i=0;i<record.length;i++) {
//			String[] tmp=record[i].split(" ");
//			String str="";
//			String id="";
//			String nickName="";
//			id=tmp[1];
//			
//			if(tmp[0].equals("Change")) {
//				System.err.print("Change: "+id+"'s nickname "+map.get(id)+"->"+tmp[2]);
//				System.err.println();
//				map.put(id,tmp[2]);
//			}else {
//				if(tmp[0].equals("Enter")) {
//					str="님이 들어왔습니다.";
//					nickName=tmp[2];
//					if(!map.containsKey(id))
//						map.put(id,nickName);
//					else {
//						System.err.print("Change: "+id+"'s nickname "+map.get(id)+"->"+tmp[2]);
//						System.err.println();
//					}
//				}
//				else if(tmp[0].equals("Leave")) str="님이 나갔습니다.";
//				System.err.println(id+str);
//				answer.add(map.get(id)+str);
//			}
//		}
//		
//		
//		
//		return answer;
//	}
//}
