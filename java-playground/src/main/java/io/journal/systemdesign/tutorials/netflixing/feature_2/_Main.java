package io.journal.systemdesign.tutorials.netflixing.feature_2;

import java.util.*;

import static io.journal.systemdesign.tutorials.netflixing.feature_2.MergeSortList.mergeKCounty;

class _Main {
    public static void main(String[] args) {

        LinkedListNode a = io.journal.systemdesign.tutorials.netflixing.feature_2.LinkedList.createLinkedList(new int[]{11, 41, 51});

        LinkedListNode b = io.journal.systemdesign.tutorials.netflixing.feature_2.LinkedList.createLinkedList(new int[]{21, 23, 42});

        LinkedListNode c = io.journal.systemdesign.tutorials.netflixing.feature_2.LinkedList.createLinkedList(new int[]{25, 56, 66, 72});

        List<LinkedListNode> list1 = new ArrayList<LinkedListNode>();
        list1.add(a);
        list1.add(b);
        list1.add(c);

        System.out.print("All movie ID's from best to worse are:\n");
        LinkedList.display(mergeKCounty(list1));
    }
}

/*
Output
All movie ID's from best to worse are:
11, 21, 23, 25, 41, 42, 51, 56, 66, 72
*/