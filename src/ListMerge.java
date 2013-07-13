import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;


/**
 * @author Lichman Andrew vmdeep@yandex.ru
 * @task
 * Необходимо написать код на java, 
 * объединяющий два списка без повторений в один список, 
 * в котором также не будет содержаться повторений. 
 * Оцените сложность вашего алгоритма.
 * 
 * @comment
 * Сложность : O(n);
 */
public class ListMerge {
	
	public static void main(String[] args) {
		List<Integer> a = new ArrayList<Integer>();
		List<Integer> b = new ArrayList<Integer>();
		Integer i = 0;
		while(true){
			a.add(i);
			b.add(i);
			if((i++) == 20) break;
			
		}
		
		Merge m = new ArrayMerge(a.size()+b.size());
		m.go(a.iterator());
		m.go(b.iterator());
		m.print();
		
		m = new SetMerge();
		m.go(a.iterator());
		m.go(b.iterator());
		m.print();
		
	}
}

interface Merge {
	public void go(Iterator<Integer> r);
	public void print();
}

class SetMerge implements Merge{
	private Set<Integer> set = new HashSet<Integer>();
	
	@Override
	public void go(Iterator<Integer> r) {
		while(r.hasNext()){
			set.add(r.next());
		}
	}
	
	@Override
	public void print(){
		System.out.println(set);
	}

}


class ArrayMerge implements Merge{
    private Integer[] arr;
    
    public ArrayMerge(int cap) {
    	arr = new  Integer[cap];
	}
    
	@Override
	public void go(Iterator<Integer> r) {
		while(r.hasNext()){
			Integer x = r.next();
			if(arr[x.hashCode()] == null){
				arr[x.hashCode()] = x;
			}
			
		}
		
	}

	@Override
	public void print() {	
		for(int i = 0; i<arr.length; i++)
			if(arr[i] != null) System.out.print(arr[i]+" ");
	}
	
}