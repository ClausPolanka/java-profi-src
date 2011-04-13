package javaprofi;

import org.junit.Test;

import static org.hamcrest.CoreMatchers.is;
import static org.hamcrest.MatcherAssert.assertThat;

public class JavaProfi {

    @Test
    public void foo() {
        assertThat("Foo", true, is(true));
    }

}
