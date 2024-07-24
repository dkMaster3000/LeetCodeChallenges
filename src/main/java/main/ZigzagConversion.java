package main;

import java.util.HashMap;

public class ZigzagConversion {
    public String convert(String s, int numRows) {
        HashMap<Integer, String> map = new HashMap<>();


        int idx = 0;
        int d = 1;

        for (int i = 0; i < s.length(); i++) {
            if (map.containsKey(idx)) {
                map.put(idx, map.get(idx) + s.charAt(i));
            } else {
                map.put(idx, String.valueOf(s.charAt(i)));
            }

            if (idx == numRows - 1) {
                d = -1;
            }

            if (idx == 0) {
                d = 1;
            }

            idx += d;
        }


        StringBuilder m = new StringBuilder();

        for (Integer i : map.keySet()) {
            m.append(map.get(i));
        }

        return m.toString();
    }
}
