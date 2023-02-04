package com.blz.Algorithm;

    import java.util.Arrays;
import java.util.Scanner;

    public class TaskSchedule {
         int deadline;
        int time;

        public TaskSchedule(int d, int m) {
        }
        public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);
            System.out.print("Enter the number of tasks: ");
            int t = sc.nextInt();
            TaskSchedule[] tasks = new TaskSchedule[t];
            for (int i = 0; i < t; i++) {
                System.out.print("Enter the deadline and time for task " + (i + 1) + ": ");
                int d = sc.nextInt();
                int m = sc.nextInt();
                tasks[i] = new TaskSchedule(d, m);
            }
            Arrays.sort(tasks);
            int maxOverShoot = 0;
            int time = 0;
            for (TaskSchedule task : tasks) {
                time += task.time;
                int overShoot = time - task.deadline;
                if (overShoot > maxOverShoot) {
                    maxOverShoot = overShoot;
                }
            }
            System.out.println("The maximum overshoot is: " + maxOverShoot);
        }
    }

    class Task implements Comparable<TaskSchedule> {
        int deadline;
        int time;

        Task(int deadline, int time) {
            this.deadline = deadline;
            this.time = time;
        }

        @Override
        public int compareTo(TaskSchedule other) {
            return Integer.compare(other.time, this.time);
        }
    }