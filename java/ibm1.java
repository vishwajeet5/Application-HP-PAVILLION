/*When multiple tasks are executed on a single threaded cpu the tasks are scheduled based on the principle of preemption.
When a higher priority task arrives in execution queue then the lower priority task are pre-empted ,i.e. it's execution is paused until higher priority task is completed.
There are n functions to be executed on a single threaded cpu,with each function having a unique I'd between 0 to  n-1.Given an integer n ,
 representing the number of functions to be executed and an execution log as an array of strings, logs, of size m, determine the execution time of each of the functions.
Execution times is the sum of execution time for all calls to a functions.Any string representing an execution log Is of the form {function_id}:{"start"l"end"}:{timestamp},
indicating that the function with I'd= function_id, either starts or ends at a time identified by the Timestamp value.*/

import java.util.*;

public class ibm1 {
    

    public static int[] getFunctionExecutionTime(int n, String[] logs) {
        int[] executionTime = new int[n];
        Map<Integer, Integer> startTimeMap = new HashMap<>();

        int prevTimestamp = 0;
        for (String log : logs) {
            String[] parts = log.split(":");
            int functionId = Integer.parseInt(parts[0]);
            String eventType = parts[1];
            int timestamp = Integer.parseInt(parts[2]);

            if (eventType.equals("start")) {
                if (startTimeMap.containsKey(functionId)) {
                    // If the function has already started, update its execution time
                    executionTime[functionId] += timestamp - prevTimestamp;
                }
                startTimeMap.put(functionId, timestamp);
            } else { // eventType is "end"
                int startTime = startTimeMap.get(functionId);
                executionTime[functionId] += timestamp - startTime + 1; // Add 1 to include the end timestamp
                startTimeMap.remove(functionId);
            }

            prevTimestamp = timestamp;
        }

        return executionTime;
    }

    public static void main(String[] args) {
        int n = 3;
        String[] logs = {"0:start:0","1:start:2","2:start:3","2:end:5","1:end:6","0:end:7"};

        int[] executionTime = getFunctionExecutionTime(n, logs);
        System.out.println("Execution time for each function:");
        for (int i = 0; i < executionTime.length; i++) {
            System.out.println("Function " + i + ": " + executionTime[i]);
        }
    }
}
