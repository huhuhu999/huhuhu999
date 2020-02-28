package assign1;

import static org.junit.jupiter.api.Assertions.*;

class SimpleListTest {

	@org.junit.jupiter.api.Test
	void hw1test() {
		SimpleList simplelist = new SimpleList();
		simplelist.add(1);
		simplelist.add(2);
		simplelist.add(3);
		simplelist.add(4);
		simplelist.add(5);
		simplelist.add(6);
		simplelist.add(7);
		simplelist.add(8);
		simplelist.add(9);
		simplelist.add(10);
		//count
		int total;
		total = simplelist.count();
		System.out.println("There are " + total +" elements in the list.");
		//toString
		String str;
		str = simplelist.toString();
		System.out.println(str);
		//search
		int location;
		location = simplelist.search(2);
		System.out.println("2 at location "+location);
	}
	
	@org.junit.jupiter.api.Test
	void hw1test2() {
		SimpleList simplelist = new SimpleList();
		simplelist.add(1);
		simplelist.add(2);
		simplelist.add(3);
		simplelist.add(4);
		simplelist.add(5);
		simplelist.add(6);
		simplelist.remove(5);
		simplelist.remove(3);
		//count
		int total;
		total = simplelist.count();
		System.out.println("There are " + total +" elements in the list.");
		//toString
		String str;
		str = simplelist.toString();
		System.out.println(str);
		//search
		int location;
		location = simplelist.search(2);
		System.out.println("2 at location "+location);
	}

}
