package prgrmrs;

public class skillTrees_lv2 {

	public static void main(String[] args) {
		String[] skill_trees= {"BACDE", "CBADF", "AECB", "BDA"};
		System.err.println(solution("CBD", skill_trees));
	}

	public static int solution(String skill, String[] skill_trees) {
		int cnt=skill_trees.length, idx=0, prevIdx=0;
		for (int i = 0; i < skill_trees.length; i++) {
			prevIdx=skill_trees[i].indexOf(skill.charAt(0));
			for (int j = 1; j < skill.length(); j++) {
				idx=skill_trees[i].indexOf(skill.charAt(j));//오름차순이어야됨
				if(prevIdx>idx && idx!=-1||prevIdx==-1 && idx!=-1) {
					cnt--;
					break;
				}
				prevIdx=idx;
				
			}
		}
		return cnt;
	}
}
