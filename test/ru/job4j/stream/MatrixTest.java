package ru.job4j.stream;

import org.junit.Test;

import java.util.Arrays;
import java.util.List;

import static org.hamcrest.Matchers.is;
import static org.junit.Assert.assertThat;

public class MatrixTest {

    @Test
    public void whenMatrixToList() {
        Integer[][] matrix = {{1, 2}, {3, 4}};
        List<Integer> result = Matrix.martixToList(matrix);
        List<Integer> expected = Arrays.asList(1, 2, 3, 4);
        assertThat(result, is(expected));
    }
}