package com.thoughtworks;

import org.junit.jupiter.api.Test;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.*;
import static org.junit.jupiter.api.Assertions.assertNotSame;


public
class RupeeTest {

    @Test
    void shouldEquateWhenTenRupeeToTenRupeeIsGiven() {
        int tenRupeeNote = 10;

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
        int fiveRupeee = 5;

        Rupee tenRupee = new Rupee(tenRupeeNote);
        Rupee fiveRupee = new Rupee(fiveRupeee);

        assertThat(tenRupee, is(not(equalTo(fiveRupee))));
    }

    @Test
    void shouldNotEquateWhenTenRupeeToNull() {
        int tenRupeeNote = 10;

        Rupee tenRupee = new Rupee(tenRupeeNote);

        assertThat(tenRupee, is(not(equalTo(null))));
    }

    @Test
    void shouldNotEquateWhenTenRupeeToObjectOfDifferentType() {
        int tenRupeeNote = 10;

        Rupee tenRupee = new Rupee(tenRupeeNote);
        Object object = new Object();

        assertThat(tenRupee, is(not(equalTo(object))));
    }

    @Test
    void shouldEquateTenRupeeToSumOfSevenRupeeAndThreeRupee() {
        int tenRupeeNote = 10;

        Rupee tenRupee = new Rupee(tenRupeeNote);
        Rupee sevenRupee = new Rupee(7);
        Rupee threeRupee = new Rupee(3);

        Rupee result = sevenRupee.sum(threeRupee);

        assertThat(result, is(equalTo(tenRupee)));

    }
}
