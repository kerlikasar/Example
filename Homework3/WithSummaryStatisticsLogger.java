package Homework3;

import java.util.List;

public class WithSummaryStatisticsLogger implements StatisticsLogger {
    private final StatisticsLogger statisticsLogger;
    public WithSummaryStatisticsLogger (final StatisticsLogger statisticsLogger) {
        this.statisticsLogger = statisticsLogger;

    }

    @Override
    public void displayStatistics() {
        System.out.println(getExecutionTimes().stream().mapToDouble(x -> x).summaryStatistics());
        statisticsLogger.displayStatistics();

    }

    @Override
    public List<Double> getExecutionTimes() {
        return statisticsLogger.getExecutionTimes();
    }
}
