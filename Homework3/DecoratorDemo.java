package Homework3;

import java.util.List;

public class DecoratorDemo {
    public static void main(String[] args) {
        final StatisticsLogger statisticsLogger = new WithMeanStatisticsLogger(
                         new WithSummaryStatisticsLogger(
                         new ExecutionTimesBaseStatistics(List.of(1.0, 2.0, 3.0))));
                statisticsLogger.displayStatistics();
    }
}
