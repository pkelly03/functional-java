package com.kata;

import junit.framework.Assert;
import junit.framework.TestCase;
import org.hamcrest.CoreMatchers;
import org.hamcrest.core.Is;
import org.junit.Test;

import static org.hamcrest.CoreMatchers.equalTo;
import static org.junit.Assert.assertThat;

/**
 * author : pkelly
 */
public class FunctionalProgInJavaExercise1Test {

    @Test
    public void shouldProduceSameValueForImperativeAndDeclarativeMethods() {

        long declarativeValue = FunctionalProgInJavaExercise1.declarativeFactorial(5);
        long imperativeValue = FunctionalProgInJavaExercise1.imperativeFactorial(5);

        assertThat(declarativeValue, Is.is(CoreMatchers.equalTo(imperativeValue)));

    }
}
