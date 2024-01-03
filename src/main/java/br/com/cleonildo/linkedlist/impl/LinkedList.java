package br.com.cleonildo.linkedlist.impl;

public class LinkedList<T> {
    private Node<T> head;
    private Node<T> tail;
    private int length;

    public LinkedList() {
    }

    public LinkedList(T value) {
        Node<T> newNode = new Node<>(value);
        this.head = newNode;
        this.tail = newNode;
        this.length = 1;
    }

    public T getHead() {
        return this.head.value;
    }

    public T getTail() {
        return this.tail.value;
    }

    public int getLength() {
        return this.length;
    }

    public String printList() {
        Node<T> temp = this.head;

        StringBuilder sb = new StringBuilder();

        while (temp != null){
            sb.append(temp.value).append(" ");
            temp = temp.next;
        }

        return sb
                .toString()
                .trim();
    }

    public void append(T value) {
        Node<T> newNode = new Node<>(value);

        if (this.length == 0) {
            this.head = newNode;
            this.tail = newNode;
            this.length++;
            return;
        }

        this.tail.next = newNode;
        this.tail = newNode;
        this.length++;
    }

    public void prepend(T value) {
        Node<T> newNode = new Node<>(value);

        if (this.length == 0) {
            this.head = newNode;
            this.tail = newNode;
            this.length++;
            return;
        }

        newNode.next = this.head;
        this.head = newNode;
        this.length++;
    }

    public T get(int index) {
        if (index < 0 || index >= length)
            return null;

        Node<T> temp = this.head;

        for(int i = 0; i < index; i++) {
            temp = temp.next;
        }
        return temp.value;
    }

    public boolean set(int index, T value) {
        Node<T> temp = this.getNode(index);

        if (temp != null) {
            temp.value = value;
            return true;
        }

        return false;
    }


    public boolean insert(int index, T value)  {
        if (index < 0 || index > this.length)
            return false;

        if (index == 0) {
            prepend(value);
            return true;
        }

        if (index == this.length) {
            append(value);
            return true;
        }

        Node<T> newNode = new Node<>(value);
        Node<T> temp = this.getNode(index - 1);
        newNode.next = temp.next;
        temp.next = newNode;
        this.length++;
        return true;
    }

    public T removeFirst() {
        if (this.length == 0) {
            return null;
        }

        Node<T> temp = this.head;
        this.head = this.head.next;
        temp.next = null;
        this.length--;

        if (this.length == 0) {
            this.tail = null;
        }

        return temp.value;
    }

    public T remove(int index) {
        if (index < 0 || index >= this.length) {
            return null;
        }

        if (index == 0) {
            return this.removeFirst();
        }

        if (index == this.length - 1) {
            return this.removeLast();
        }

        Node<T> prev = this.getNode(index - 1);
        Node<T> temp = prev.next;

        prev.next = temp.next;
        temp.next = null;
        this.length--;
        return temp.value;
    }

    private Node<T> getNode(int index) {
        if (index < 0 || index >= length)
            return null;

        Node<T> temp = this.head;

        for(int i = 0; i < index; i++) {
            temp = temp.next;
        }
        return temp;
    }

    public T removeLast() {
        if (this.length == 0) {
            return null;
        }

        Node<T> temp = this.head;
        Node<T> pre = this.head;

        while (temp.next != null) {
            pre = temp;
            temp = temp.next;
        }

        this.tail = pre;
        this.tail.next = null;
        this.length--;

        if (this.length == 0) {
            this.head = null;
            this.tail = null;
        }

        return temp.value;
    }

    public void reverse() {
        Node<T> temp = this.head;
        this.head = this.tail;
        this.tail = temp;
        Node<T> after = temp.next;
        Node<T> before = null;

        for (int i = 0; i < this.length; i++) {
            after = temp.next;
            temp.next = before;
            before = temp;
            temp = after;
        }
    }

    private static class Node <T> {
        T value;
        Node<T> next;

        public Node(T value) {
            this.value = value;
        }
    }

}
