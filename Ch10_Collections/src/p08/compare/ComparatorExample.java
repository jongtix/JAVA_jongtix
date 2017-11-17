package p08.compare;

import java.util.Iterator;
import java.util.TreeSet;

public class ComparatorExample {
	public static void main(String[] args) {
		TreeSet<Fruit> treeSet = new TreeSet<>(new DescendingComparator());
		treeSet.add(new Fruit("포도", 3000));
		treeSet.add(new Fruit("수박", 10000));
		treeSet.add(new Fruit("딸기", 6000));
		
		Iterator<Fruit> it = treeSet.iterator();
		while (it.hasNext()) {
			Fruit fruit = it.next();
			System.out.println(fruit.name + " : " + fruit.price);
		}
	}
}
