package Homework1;

import java.util.List;

public class ExecutionTimesBaseStatistics implements StatisticsLogger {
    private final List<Double> executionTimes;

public ExecutionTimesBaseStatistics(final List<Double> executionTimes) {
    this.executionTimes = executionTimes;
    }


    @Override
    public void displayStatistics() {
        final StringBuilder stringBuilder = new StringBuilder();
        executionTimes.forEach(executionTime -> stringBuilder.append("Execution time is - ").append(" \n"));
        System.out.println(stringBuilder.toString());

    }

    @Override
    public List<Double> getExecutionTimes() {
        return executionTimes;
    }
}
