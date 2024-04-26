```
class DoublyLinkedList {
    static class Node {
        int data;
        Node prev;
        Node next;

        Node(int data) {
            this.data = data;
            this.prev = null;
            this.next = null;
        }
    }

    Node head;
    Node tail;

    DoublyLinkedList() {
        head = null;
        tail = null;
    }
```

1. `class DoublyLinkedList {`: This line starts the declaration of the `DoublyLinkedList` class.

2. `static class Node {`: This line declares a static nested class named `Node` within the `DoublyLinkedList` class. This nested class represents a node in the doubly linked list.

3. `int data; Node prev; Node next;`: Inside the `Node` class, these lines declare three instance variables: `data`, `prev`, and `next`. These variables represent the data stored in the node, a reference to the previous node, and a reference to the next node, respectively.

4. `Node(int data) { ... }`: This block defines a constructor for the `Node` class. It initializes a node with the given data and sets the `prev` and `next` references to `null`.

5. `Node head; Node tail;`: These lines declare two instance variables within the `DoublyLinkedList` class: `head` and `tail`. These variables represent references to the first and last nodes of the doubly linked list, respectively.

6. `DoublyLinkedList() { ... }`: This block defines a constructor for the `DoublyLinkedList` class. It initializes the `head` and `tail` references to `null`, indicating an empty doubly linked list.

In summary, this code segment sets up the basic structure for a doubly linked list implementation. It defines a nested `Node` class to represent individual nodes in the list, and it initializes the `head` and `tail` references to `null` in the `DoublyLinkedList` class constructor, indicating that the list is initially empty.

```
void insert(int data) {
        Node newNode = new Node(data);
        if (head == null) {
            head = newNode;
            tail = newNode;
        } else {
            tail.next = newNode;
            newNode.prev = tail;
            tail = newNode;
        }
    }

```

1. `Node newNode = new Node(data);`: This line creates a new node with the given data. It initializes a new `Node` object with the `data` provided as an argument to the method.

2. `if (head == null) { ... }`: This conditional statement checks if the doubly linked list is empty, i.e., if the `head` reference is `null`. If the list is empty, it means there are no nodes in the list yet.

    a. `head = newNode;`: If the list is empty, this line sets both `head` and `tail` references to the newly created node (`newNode`). Since there are no existing nodes in the list, the newly created node becomes both the head and the tail of the list.

    b. `tail = newNode;`: This line also sets the `tail` reference to the newly created node (`newNode`). Since the list was empty, the only node in the list (the newly created node) is both the head and the tail of the list.

3. `else { ... }`: If the doubly linked list is not empty, i.e., if there are already nodes in the list, this block of code executes.

    a. `tail.next = newNode;`: This line updates the `next` reference of the current tail node to point to the newly created node (`newNode`). Since the list is not empty, the current tail node needs to point to the new node to maintain the order of the list.

    b. `newNode.prev = tail;`: This line sets the `prev` reference of the newly created node (`newNode`) to point back to the current tail node. This step establishes the backward link from the newly created node to the previous node in the list.

    c. `tail = newNode;`: Finally, this line updates the `tail` reference to point to the newly created node (`newNode`). Since the newly created node is now the last node in the list, it becomes the new tail of the list.

In summary, the `insert` method adds a new node with the given data to the end of the doubly linked list. It handles both cases where the list is empty and when it already contains nodes.


```
 void print() {
        Node current = head;
        System.out.print("Doubly linked list (forward): ");
        while (current != null) {
            System.out.print(current.data + " ");
            current = current.next;
        }
        System.out.println();
        System.out.print("Doubly linked list (backward): ");
        current = tail;
        while (current != null) {
            System.out.print(current.data + " ");
            current = current.prev;
        }
        System.out.println();
    }

```




1. `void print() {`: This line starts the declaration of the `print` method.

2. `Node current = head;`: This line initializes a variable `current` to traverse the list starting from the `head`. It sets `current` to reference the first node in the doubly linked list.

3. `System.out.print("Doubly linked list (forward): ");`: This line prints a message indicating that the following output represents the doubly linked list in the forward direction. It does not include a newline character, so subsequent output will be on the same line.

4. `while (current != null) { ... }`: This loop iterates over the nodes of the doubly linked list in the forward direction until it reaches the end of the list (i.e., until `current` becomes `null`).

    a. `System.out.print(current.data + " ");`: Within the loop, this line prints the data stored in the current node (`current.data`). It appends a space character after printing the data to separate each element.

    b. `current = current.next;`: This line updates the `current` reference to point to the next node in the doubly linked list. It moves `current` forward to the next node.

5. `System.out.println();`: This line prints a newline character to end the current line. It moves the cursor to the next line for the next output.

6. `System.out.print("Doubly linked list (backward): ");`: This line prints a message indicating that the following output represents the doubly linked list in the backward direction. Similar to the forward message, it does not include a newline character.

7. `current = tail;`: This line resets the `current` variable to traverse the list in the backward direction, starting from the `tail`. It sets `current` to reference the last node in the doubly linked list.

8. `while (current != null) { ... }`: This loop iterates over the nodes of the doubly linked list in the backward direction until it reaches the beginning of the list (i.e., until `current` becomes `null`).

    a. `System.out.print(current.data + " ");`: Within the loop, this line prints the data stored in the current node (`current.data`). It appends a space character after printing the data to separate each element.

    b. `current = current.prev;`: This line updates the `current` reference to point to the previous node in the doubly linked list. It moves `current` backward to the previous node.

9. `System.out.println();`: This line prints a newline character to end the current line, completing the output for the backward direction.

In summary, the `print` method prints the elements of the doubly linked list in both forward and backward directions, with each element separated by a space character. It first traverses the list from the `head` to the `tail` to print the elements in the forward direction, and then traverses the list from the `tail` to the `head` to print the elements in the backward direction.

```

 public static void main(String[] args) {
        DoublyLinkedList dll = new DoublyLinkedList();

        // Example: Inserting elements into the doubly linked list
        for (String arg : args) {
            int data = Integer.parseInt(arg);
            dll.insert(data);
        }

        // Print the doubly linked list
        dll.print();
    }
```


1. `public static void main(String[] args) {`: This line defines the entry point of the Java program. It declares the `main` method, which is a special method in Java that serves as the starting point for execution.

2. `DoublyLinkedList dll = new DoublyLinkedList();`: This line creates a new instance of the `DoublyLinkedList` class named `dll`. It initializes an empty doubly linked list.

3. `for (String arg : args) { ... }`: This loop iterates over the command-line arguments passed to the program. The `args` parameter is an array of strings containing the command-line arguments.

    a. `int data = Integer.parseInt(arg);`: Within the loop, each command-line argument (`arg`) is converted to an integer using the `parseInt` method of the `Integer` class. This is necessary because command-line arguments are initially provided as strings.

    b. `dll.insert(data);`: After parsing each command-line argument as an integer, the `insert` method of the `DoublyLinkedList` instance (`dll`) is called to insert the parsed integer into the doubly linked list.

4. `dll.print();`: After inserting all the elements into the doubly linked list, this line calls the `print` method of the `DoublyLinkedList` instance (`dll`). This method prints the elements of the doubly linked list in both forward and backward directions, as explained in the previous explanation of the `print` method.

In summary, the `main` method creates a doubly linked list, inserts elements parsed from command-line arguments into the list, and then prints the elements of the list in both forward and backward directions. This allows for testing the functionality of the doubly linked list implementation provided by the `DoublyLinkedList` class.
