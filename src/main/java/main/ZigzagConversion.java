package main;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Objects;

public class ZigzagConversion {
    public String convert(String s, int numRows) {

        HashMap<Integer, String> map = new HashMap<>();
        List<Integer> rows = new ArrayList<>();

        for (int i = 0; i < s.length(); i++) {
            if (i == 0) {
                map.put(1, String.valueOf(s.charAt(0)));
                rows.add(1);
            } else {
                int row = getRow(rows, numRows);

                if (map.containsKey(row)) {
                    map.put(row, map.get(row) + s.charAt(i));
                } else {
                    map.put(row, String.valueOf(s.charAt(i)));
                }
            }
        }

        StringBuilder m = new StringBuilder();

        for (Integer i : map.keySet()) {
            m.append(map.get(i));
        }

        return m.toString();
    }

    public int getRow(List<Integer> rows, int numRows) {
        int newRowNumber;
        if (rows.getLast() == 1) {
            newRowNumber = numRows >= 2 ? 2 : 1;
        } else if (Objects.equals(rows.getLast() - 1, rows.get(rows.size() - 2))) {

            if (rows.getLast() + 1 > numRows) {
                newRowNumber = rows.getLast() - 1;

            } else {
                newRowNumber = rows.getLast() + 1;

            }
        } else {
            if (rows.getLast() - 1 < 1) {
                newRowNumber = rows.getLast() + 1;

            } else {
                newRowNumber = rows.getLast() - 1;

            }
        }
        rows.add(newRowNumber);
        return newRowNumber;
    }
}
