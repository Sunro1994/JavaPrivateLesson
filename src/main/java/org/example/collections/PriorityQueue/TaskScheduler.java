package org.example.collections.PriorityQueue;

import java.util.PriorityQueue;

public class TaskScheduler {
    public static void main(String[] args) {
        // PriorityQueue 인스턴스 생성
        PriorityQueue<Task> taskQueue = new PriorityQueue<>();

        // 작업 추가
        taskQueue.add(new Task(3, "Write report"));
        taskQueue.add(new Task(1, "Fix critical bug"));
        taskQueue.add(new Task(2, "Update documentation"));

        // 작업을 우선순위에 따라 실행
        while (!taskQueue.isEmpty()) {
            Task task = taskQueue.poll();
            System.out.println("Executing task: " + task.getDescription() + " with priority " + task.getPriority());
        }
    }
}