package ru.netology.services;

import static org.junit.jupiter.api.Assertions.*;

class freelancerServiceTest {

    @Test
    public void testWhenFreelancerRestThreeMonts() {
        freelancerService service = new freelancerService();

        int actual = service.calculate(income:10_000, expenses:3_000, threshold:20_000);
        int expected = 3;

        Assertions.assertEquals(expected, actual);

    }

}