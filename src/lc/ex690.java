package lc;

import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Queue;

public class ex690 {
    public int getImportance(List<Employee> employees, int id) {
    	//BFS
    	int sum=0;
    	Map<Integer,Employee> map=new HashMap<>();
    	for(Employee e:employees) {
    		map.put(e.id,e);
    	}
    	Queue<Employee> queue=new LinkedList<>();
    	queue.offer(map.get(id));
    	while(!queue.isEmpty()) {
    		Employee cur=queue.poll();
    		sum+=cur.importance;
    		for(int subordinate:cur.subordinates) queue.offer(map.get(subordinate));
    	}
    	return sum;
	}
    
 // Definition for Employee.
    class Employee {
        public int id;
        public int importance;
        public List<Integer> subordinates;
    };
}
