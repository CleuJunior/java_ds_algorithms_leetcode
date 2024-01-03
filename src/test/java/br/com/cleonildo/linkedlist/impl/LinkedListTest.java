package br.com.cleonildo.linkedlist.impl;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNull;

public class LinkedListTest {

    private LinkedList<String> linkedListUnderTest;

    @Before
    public void setup() {
        this.linkedListUnderTest = new LinkedList<>("Fernando");
    }

    @Test
    public void testGetHead() {
        String expected = "Fernando";
        String actual = this.linkedListUnderTest.getHead();

        assertEquals(expected, actual);
    }

    @Test
    public void testGetTail() {
        String expected = "Fernando";
        String actual = this.linkedListUnderTest.getTail();

        assertEquals(expected, actual);
    }

    @Test
    public void testGetLength() {
        int expected = 1;
        int actual = this.linkedListUnderTest.getLength();

        assertEquals(expected, actual);
    }

    @Test
    public void testprintList() {
        LinkedList<String> linkedListPrint = new LinkedList<>("Claudio");

        String expected = "Claudio";
        String actual =  linkedListPrint.printList();

        assertEquals(expected, actual);
    }

    @Test
    public void testprintListMultiplesStrings() {
        LinkedList<String> linkedListPrint = new LinkedList<>();
        linkedListPrint.append("Claudio");
        linkedListPrint.append("Fernando");

        String expected = "Claudio Fernando";
        String actual =  linkedListPrint.printList();

        assertEquals(expected, actual);
    }

    @Test
    public void testAppend() {
        this.linkedListUnderTest.append("Claudio");
        this.linkedListUnderTest.append("Sheila");

        int expectedLength = 3;
        String expectedTail = "Sheila";

        int actualLength = this.linkedListUnderTest.getLength();
        String actualTail = this.linkedListUnderTest.getTail();

        assertEquals(expectedLength, actualLength);
        assertEquals(expectedTail, actualTail);
    }

    @Test
    public void testAppendWithLengthZero() {
        LinkedList<String> linkedListLengthZero = new LinkedList<>();
        linkedListLengthZero.append("Claudio");

        int expectedLength = 1;
        String expectedTail = "Claudio";

        int actualLength = linkedListLengthZero.getLength();
        String actualTail = linkedListLengthZero.getTail();

        assertEquals(expectedLength, actualLength);
        assertEquals(expectedTail, actualTail);
    }

    @Test
    public void testPrepend() {
        this.linkedListUnderTest.prepend("Claudio");

        int expectedLength = 2;
        String expectedTail = "Fernando";

        int actualLength = this.linkedListUnderTest.getLength();
        String actualTail = this.linkedListUnderTest.getTail();

        assertEquals(expectedLength, actualLength);
        assertEquals(expectedTail, actualTail);
    }

    @Test
    public void testPrependWithLengthZero() {
        LinkedList<String> linkedListLengthZero = new LinkedList<>();
        linkedListLengthZero.prepend("Claudio");

        int expectedLength = 1;
        String expectedTail = "Claudio";

        int actualLength = linkedListLengthZero.getLength();
        String actualTail = linkedListLengthZero.getTail();

        assertEquals(expectedLength, actualLength);
        assertEquals(expectedTail, actualTail);
    }

    @Test
    public void testRemoveFirst() {
        this.linkedListUnderTest.append("Claudio");

        String expectedStringRemoved = "Fernando";
        String expectedRemainString = "Claudio";
        int expectedLength = 1;

        String actualString = this.linkedListUnderTest.removeFirst();
        String actualRemainString = this.linkedListUnderTest.getHead();
        int actualLength = this.linkedListUnderTest.getLength();

        assertEquals(expectedStringRemoved, actualString);
        assertEquals(expectedRemainString, actualRemainString);
        assertEquals(expectedLength, actualLength);
    }

    @Test
    public void testRemoveFirstLengthZero() {
        LinkedList<String> linkedListLengthZero = new LinkedList<>();
        assertNull(linkedListLengthZero.removeFirst());
    }

}