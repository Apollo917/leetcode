package com.apollo.leetcode.medium;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.extension.ExtensionContext;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.ArgumentsProvider;
import org.junit.jupiter.params.provider.ArgumentsSource;

import java.util.Arrays;
import java.util.LinkedList;
import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class MaximumTwinSumOfALinkedListTest implements ArgumentsProvider {

    private static MaximumTwinSumOfALinkedList obj;

    @BeforeAll
    public static void init() {
        obj = new MaximumTwinSumOfALinkedList();
    }

    @ParameterizedTest
    @ArgumentsSource(MaximumTwinSumOfALinkedListTest.class)
    public void test(LinkedList<Integer> head, int expectedResult) {
        assertEquals(expectedResult, obj.pairSum(head));
    }

    @Override
    public Stream<? extends Arguments> provideArguments(ExtensionContext extensionContext) {
        return Stream.of(
                Arguments.of(new LinkedList<>(Arrays.asList(5, 4, 2, 1)), 6),
                Arguments.of(new LinkedList<>(Arrays.asList(4, 2, 2, 3)), 7),
                Arguments.of(new LinkedList<>(Arrays.asList(1, 100000)), 100001)
        );
    }
}
