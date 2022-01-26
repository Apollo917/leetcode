package com.apollo.leetcode.easy;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.extension.ExtensionContext;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.ArgumentsProvider;
import org.junit.jupiter.params.provider.ArgumentsSource;

import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class ValidMountainArrayTest implements ArgumentsProvider {

    private static ValidMountainArray foo;

    @BeforeAll
    public static void init() {
        foo = new ValidMountainArray();
    }

    @ParameterizedTest
    @ArgumentsSource(ValidMountainArrayTest.class)
    public void test(int[] arr, boolean expectedResult) {
        assertEquals(expectedResult, foo.validMountainArray(arr));
    }

    @Override
    public Stream<? extends Arguments> provideArguments(ExtensionContext extensionContext) {
        return Stream.of(
                Arguments.of(new int[]{1, 2}, false),
                Arguments.of(new int[]{3, 5, 5}, false),
                Arguments.of(new int[]{0, 3, 2, 1}, true)
        );
    }
}
