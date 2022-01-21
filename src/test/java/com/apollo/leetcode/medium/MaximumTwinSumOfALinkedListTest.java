package com.apollo.leetcode.medium;

import org.junit.jupiter.api.extension.ExtensionContext;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.ArgumentsProvider;
import org.junit.jupiter.params.provider.ArgumentsSource;

import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class MaximumTwinSumOfALinkedListTest implements ArgumentsProvider {

    @ParameterizedTest
    @ArgumentsSource(BestTimeToBuyAndSellStockIITest.class)
    public void test(int[] input, int expectedResult) {
    }

    @Override
    public Stream<? extends Arguments> provideArguments(ExtensionContext extensionContext) {
        return Stream.of();
    }
}
