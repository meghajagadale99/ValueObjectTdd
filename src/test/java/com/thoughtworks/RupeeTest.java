package com.thoughtworks;

import org.junit.jupiter.api.Test;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.equalTo;
import static org.hamcrest.Matchers.is;
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
        int tenRupeeNote=10;

        Rupee tenRupee = new Rupee(tenRupeeNote);
        Rupee anotherTenRupee = new Rupee(tenRupeeNote);

       assertNotSame(tenRupee,anotherTenRupee);
    }
}
