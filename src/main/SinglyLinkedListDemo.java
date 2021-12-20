package main;

public class SinglyLinkedListDemo {
	
	public static void main(String[] args) {
		Car c1 = new Car("Tesla", "Model S Plaid");
		Car c2 = new Car("BMW", "X1 Sports");
		Car c3 = new Car("Ferari", "Testa Rossa");
		Car c4 = new Car("Volkswagen", "ID.4 EV");
		Car c5 = new Car("Land Rover", "2022 Rover SV");
		Car c6 = new Car("Toyota", "Rodland");
		Car c7 = new Car("Ford", "2021 MUSTANG");
		
		Car[] carList = {c1, c2, c3};
		SinglyLinkedList list  = new SinglyLinkedList();
		
		System.out.println("====== Adding 3 Cars in the Linked List ======");
		for(Car c: carList) {
			list.addFromFirst(c);
		}
		
		System.out.println("List: " + list);
		System.out.println("List (Size): " + list.size);
		System.out.println();
		
		
		System.out.println("====== Adding 'c4' and 'c5' towards the end of singly linked list ====");
		list.addFromLast(c4);
		list.addFromLast(c5);
		System.out.println(list);
		System.out.println("List (Size): " + list.size);
		System.out.println();
		
		
		System.out.println("====== Inserting 'c6' -> Toyota, at Index 1 of singly linked list ====");
		list.insert(c6, 1);
		System.out.println(list);
		System.out.println("List (Size): " + list.size);
		System.out.println();
		
		
		System.out.println("====== Removing 'Volkswagen' at 4rd index from the singly linked list ====");
		list.remove(4);
		System.out.println(list);
		System.out.println("List (Size): " + list.size);
		System.out.println();
		
		
		System.out.println("====== Testing Iterable implementation from the singly linked list ====");
		for(Car c: list) {
			System.out.print(c +", ");
		}
	}
	

}
