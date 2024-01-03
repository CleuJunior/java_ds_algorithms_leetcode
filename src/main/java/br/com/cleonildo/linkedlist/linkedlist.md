# Linked List in Java

## Overview
A linked list is a linear data structure where elements are stored in nodes, and each node points to the next node in 
the sequence. Unlike arrays, linked lists do not have a fixed size and can dynamically grow or shrink.

## Contents
- **Singly Linked List**: Implementation of a basic singly linked list.
- **Doubly Linked List**: Implementation of a doubly linked list with nodes pointing to both the next and previous nodes.
- **Circular Linked List**: Implementation of a circular linked list where the last node points back to the first.

## How Linked List Works

### Singly Linked List
A singly linked list is made up of nodes, where each node contains a data element and a reference (or link) to the next 
node in the sequence. The last node points to `null` to indicate the end of the list.

Example:
```java
class Node {
    int data;
    Node next;

    public Node(int data) {
        this.data = data;
        this.next = null;
    }
}
```

### Doubly Linked List
A doubly linked list is similar to a singly linked list, but each node has two references: one to the next node and 
another to the previous node. This allows for easy traversal in both directions.

Example:
```java
class Node {
    int data;
    Node next;
    Node prev;

    public Node(int data) {
        this.data = data;
        this.next = null;
        this.prev = null;
    }
}
```

### Circular Linked List
In a circular linked list, the last node points back to the first, creating a closed loop.

Example:
```java
class Node {
    int data;
    Node next;

    public Node(int data) {
        this.data = data;
        this.next = null;
    }
}
```

## Operations
1. **Insertion**: Adding a new node to the list.
2. **Deletion**: Removing a node from the list.
3. **Traversal**: Visiting each node in the list.
4. **Search**: Finding a specific node based on its value.
5. **Update**: Modifying the data of a node.

## Examples
```java
// Creating a singly linked list
LinkedList singlyList = new SinglyLinkedList();
singlyList.insert(10);
singlyList.insert(20);
singlyList.insert(30);
singlyList.traverse(); // Output: 10 -> 20 -> 30 -> null

// Creating a doubly linked list
LinkedList doublyList = new DoublyLinkedList();
doublyList.insert(5);
doublyList.insert(15);
doublyList.insert(25);
doublyList.traverseForward(); // Output: 5 -> 15 -> 25 -> null
doublyList.traverseBackward(); // Output: 25 -> 15 -> 5 -> null

// Creating a circular linked list
LinkedList circularList = new CircularLinkedList();
circularList.insert(1);
circularList.insert(2);
circularList.insert(3);
circularList.traverse(); // Output: 1 -> 2 -> 3 -> 1 -> ...
```
