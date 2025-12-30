package net.konic.corejava.map;

import java.util.HashMap;

import java.util.Map;

    public class FailFastMapProblem {

        public static void main(String[] args) {

            // Create HashMap

            Map<Integer, String> map = new HashMap<>();

            map.put(1, "Java");

            map.put(2, "Python");

            map.put(3, "Spring");

            // for-each loop uses Iterator internally

            for (Integer key : map.keySet()) {

                System.out.println(key);

                map.remove(2); // Throws ConcurrentModificationException

            }

            // Program will not reach here

            System.out.println(map);

        }

    }

