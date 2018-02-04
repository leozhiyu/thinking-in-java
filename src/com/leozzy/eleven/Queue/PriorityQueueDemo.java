package com.leozzy.eleven.Queue;

import java.util.*;

/**
 * @author Leo
 * @create 2018-02-03 8:51
 * @desc
 */
public class PriorityQueueDemo {
    public static void main(String[] args) {
        PriorityQueue<Integer> priorityQueue = new PriorityQueue();
        Random rand = new Random(47);
        for (int i = 0;i < 10;i++){
            priorityQueue.offer(rand.nextInt(i+10));
        }
        System.out.println(priorityQueue);

        List<Integer> ints = Arrays.asList(25,22,20,18,14,9,3,1,1,2,3,9,14,18,21,23,25);
        priorityQueue= new PriorityQueue<>(ints.size(), Collections.reverseOrder());
        priorityQueue.addAll(ints);
        System.out.println(priorityQueue);

        String fact = "EDUCATION SHOULD ESCHEW OBFUSCATION";
        List<String> strings = Arrays.asList(fact.split(""));
        PriorityQueue<String> stringPQ = new PriorityQueue<>(strings);
        System.out.println(stringPQ);

        stringPQ = new PriorityQueue<>(strings.size(),Collections.reverseOrder());
        stringPQ.addAll(strings);
        System.out.println(stringPQ);

    }
}
