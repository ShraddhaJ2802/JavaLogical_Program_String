package com.bridgelab.arraylogicprg;

import java.util.ArrayList;
import java.util.List;

public class PascaleTraingle {
    public List<List<Integer>> generate(int numRows) {
        List<List<Integer>> triangle = new ArrayList<>();

        // Base case: numRows is 0
        if (numRows == 0) return triangle;

        // First row always contains 1
        triangle.add(new ArrayList<>());
        triangle.get(0).add(1);

        // Generating subsequent rows
        for (int rowNum = 1; rowNum < numRows; rowNum++) {
            List<Integer> row = new ArrayList<>();
            List<Integer> prevRow = triangle.get(rowNum - 1);

            // First element of each row is always 1
            row.add(1);

            // Compute the elements in between
            for (int j = 1; j < rowNum; j++) {
                row.add(prevRow.get(j - 1) + prevRow.get(j));
            }

            // Last element of each row is always 1
            row.add(1);

            // Add the row to the triangle
            triangle.add(row);
        }

        return triangle;
    }

    public static void main(String[] args) {

        PascaleTraingle pascaleTraingle = new PascaleTraingle();

        int numRows = 5;
        List<List<Integer>> result = pascaleTraingle.generate(numRows);

        // Print Pascal's Triangle
        for (List<Integer> row : result) {
            System.out.println(row);
        }
    }
}
