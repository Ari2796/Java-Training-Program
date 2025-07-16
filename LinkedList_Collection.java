import java.util.LinkedList;
public class LinkedList_Collection {
	
	    LinkedList<Integer> list = new LinkedList<>();

	    // Insert at beginning
	    public void insertBegin(int x) {
	        list.addFirst(x);
	    }

	    // Insert at end
	    public void insertEnd(int x) {
	        list.addLast(x);
	    }

	    // Insert at specific position
	    public void insertAt(int index, int x) {
	        if (index < 0 || index > list.size()) {
	            System.out.println("Invalid index");
	            return;
	        }
	        list.add(index, x);
	    }

	    // Delete by value
	    public void deleteValue(int x) {
	        boolean removed = list.removeFirstOccurrence(x);
	        if (!removed) {
	            System.out.println(x + " not found");
	        }
	    }

	    // Delete by index
	    public void deleteAt(int index) {
	        if (index < 0 || index >= list.size()) {
	            System.out.println("Invalid index");
	            return;
	        }
	        list.remove(index);
	    }

	    // Retrieve element at index
	    public void getElement(int index) {
	        if (index < 0 || index >= list.size()) {
	            System.out.println("Invalid index");
	            return;
	        }
	        System.out.println("Element at index " + index + ": " + list.get(index));
	    }

	    // Replace element at index
	    public void setElement(int index, int x) {
	        if (index < 0 || index >= list.size()) {
	            System.out.println("Invalid index");
	            return;
	        }
	        list.set(index, x);
	    }

	    // Search
	    public void search(int x) {
	        System.out.println("Contains " + x + "? " + list.contains(x));
	        System.out.println("First index: " + list.indexOf(x));
	        System.out.println("Last index: " + list.lastIndexOf(x));
	    }

	    // Stack operations
	    public void push(int x) {
	        list.push(x);
	    }

	    public void pop() {
	        if (!list.isEmpty()) {
	            System.out.println("Popped: " + list.pop());
	        } else {
	            System.out.println("Stack is empty");
	        }
	    }

	    // Queue operations
	    public void offer(int x) {
	        list.offer(x);
	    }

	    public void poll() {
	        System.out.println("Polled: " + list.poll());
	    }

	    // Display list using iterator
	    public void display() {
	        System.out.print("List: ");
	        for (int val : list) {
	            System.out.print(val + " ");
	        }
	        System.out.println();
	    }

	    public void displayReverse() {
	        System.out.print("Reverse: ");
	        Iterator<Integer> it = list.descendingIterator();
	        while (it.hasNext()) {
	            System.out.print(it.next() + " ");
	        }
	        System.out.println();
	    }

	    // Clear all
	    public void clearAll() {
	        list.clear();
	        System.out.println("List cleared");
	    }

	    public static void main(String[] args) {
	    	LinkedList_Collection obj = new LinkedList_Collection();

	        System.out.println("1. Insert at begin/end");
	        obj.insertBegin(20);
	        obj.insertEnd(30);
	        obj.insertBegin(10);
	        obj.display(); // 10 20 30

	        System.out.println("2. Insert at index 1");
	        obj.insertAt(1, 15);
	        obj.display(); // 10 15 20 30

	        System.out.println("3. Delete by value 20");
	        obj.deleteValue(20);
	        obj.display(); // 10 15 30

	        System.out.println("4. Delete by index 0");
	        obj.deleteAt(0);
	        obj.display(); // 15 30

	        System.out.println("5. Retrieve and update index");
	        obj.getElement(1);
	        obj.setElement(1, 35);
	        obj.display(); // 15 35

	        System.out.println("6. Search for 35");
	        obj.search(35); // true, index 1

	        System.out.println("7. Stack operations (push/pop)");
	        obj.push(5); // push front
	        obj.display();
	        obj.pop();   // pop front
	        obj.display();

	        System.out.println("8. Queue operations (offer/poll)");
	        obj.offer(50); // add end
	        obj.display();
	        obj.poll();    // remove front
	        obj.display();

	        System.out.println("9. Display in reverse order");
	        obj.displayReverse();

	        System.out.println("10. Clear all");
	        obj.clearAll();
	        obj.display();
	    }
	}


