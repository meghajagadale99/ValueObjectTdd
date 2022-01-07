package com.thoughtworks;

import org.junit.jupiter.api.Test;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.*;
import static org.junit.jupiter.api.Assertions.assertNotSame;


public
class RupeeTest {

    @Test
    void shouldEquateWhenTenRupeeToTenRupeeIsGiven() {
        int tenRupeeNote=10;

        Rupee tenRupee = new Rupee(tenRupeeNote);
        Rupee anotherTenRupee = new Rupee(tenRupeeNote);

        assertThat(tenRupee, is(equalTo(anotherTenRupee)));
    }

    @Test
    void shouldNotEquateWhenTenRupeeToTenRupeeIsGiven() {
        int tenRupeeNote = 10;

        Rupee tenRupee = new Rupee(tenRupeeNote);
        Rupee anotherTenRupee = new Rupee(tenRupeeNote);

        assertNotSame(tenRupee, anotherTenRupee);
    }

    @Test
    void shouldNotEquateWhenTenRupeeToFiveRupee() {
        int tenRupeeNote = 10;
        int fiveRupeeNote = 5;

        Rupee tenRupee = new Rupee(tenRupeeNote);
        Rupee fiveRupee = new Rupee(fiveRupeeNote);

        assertThat(tenRupee, is(not(equalTo(fiveRupee))));
    }
}
