package com.example.week41.repository;

import org.junit.jupiter.api.Assumptions;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.orm.jpa.DataJpaTest;

import java.util.Arrays;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

@DataJpaTest
class BookRepositoryTest {
    @Autowired
    private BookRepository bookRepository;

    @Test
    void deleteById() {
        int sizeBefore = bookRepository.findAll().size();
        bookRepository.deleteById(1l);
        int sizeAfter = bookRepository.findAll().size();
        assertEquals(sizeBefore - 1, sizeAfter);

    }

    @Test
    void lambdaExpressions() {
        List<Integer> numbers = Arrays.asList(1, 2, 3);
        assertTrue(numbers.stream()
                .mapToInt(Integer::intValue)
                .sum() > 5, () -> "Sum should be greater than 5");
    }

    @Test
    void testAssume() {
        Assumptions.assumeTrue(false);
        assertEquals(1,1);
    }
}