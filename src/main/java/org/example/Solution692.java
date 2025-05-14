package org.example;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.PriorityQueue;

/**
 * Top K Frequent Words
 */
public class Solution692 {
    public List<String> topKFrequent(String[] words, int k) {
        List<String> result = new ArrayList<>();
        Map<String, Integer> map = new HashMap<>();
        for (String word : words) {
            map.put(word, map.getOrDefault(word, 0) + 1);
        }
        PriorityQueue<Map.Entry<String, Integer>> pq = new PriorityQueue<>(
                (left, right) -> {
                    if ((int) left.getValue() == right.getValue()) {
                        return right.getKey().compareTo(left.getKey());
                    }
                    return left.getValue().compareTo(right.getValue());

                }
        );
        for (Map.Entry<String, Integer> entry : map.entrySet()) {
            pq.offer(entry);
            if (pq.size() > k) {
                pq.poll();
            }
        }
        for (int i = 0; i < k; i++) {
            result.add(0, pq.poll().getKey());
        }
        return result;
    }
}
