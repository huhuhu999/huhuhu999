package cse360assign2;

public class main {
	public static void main (String[] args) {
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
		simplelist.add(11);
		simplelist.add(12);
	
		simplelist.remove(5);
		simplelist.remove(4);
		simplelist.remove(12);
		simplelist.remove(3);
		
		simplelist.append(88);
		simplelist.append(99);
		
		int first = simplelist.first();
		int last = simplelist.last();
		int size = simplelist.size();
		String str = simplelist.toString();
		System.out.println(str);
		System.out.println("first is " + first);
		System.out.println("last is " + last);
		System.out.println("size is " + size);
	}
}
