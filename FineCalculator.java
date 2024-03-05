package kowshik.library;

import java.time.LocalDate;
import java.time.temporal.ChronoUnit;

public class FineCalculator {
    public double calculateFine(Book book) {
        // Assuming a daily fine rate, modify as per your requirements
        double dailyFineRate = 0.50;

        if (!book.isAvailable()) {
            LocalDate dueDate = LocalDate.now().plusDays(14); // Assuming a 14-day borrowing period
            long daysOverdue = ChronoUnit.DAYS.between(dueDate, LocalDate.now());

            if (daysOverdue > 0) {
                return daysOverdue * dailyFineRate;
            }
        }
        return 0;
    }
}
