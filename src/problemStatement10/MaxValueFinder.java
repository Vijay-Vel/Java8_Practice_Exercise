package problemStatement10;

import java.util.concurrent.ForkJoinPool;
import java.util.concurrent.RecursiveTask;

public class MaxValueFinder extends RecursiveTask<Integer> {

	private static final int SEQUENTIAL_THRESHOLD = 1000;
	private static final long serialVersionUID = 1L;

    private int[] array;
    private int start;
    private int end;

    public MaxValueFinder(int[] array, int start, int end) {
        this.array = array;
        this.start = start;
        this.end = end;
    }

    @Override
    protected Integer compute() {
    	if (end - start <= SEQUENTIAL_THRESHOLD) {
            int max = array[start];
            for (int i = start + 1; i < end; i++) {
                if (array[i] > max) {
                    max = array[i];
                }
            }
            System.out.println("Max value found: " + max + ", range: " + start + "-" + end);
            return max;
        } else {
            int mid = (start + end) / 2;
            MaxValueFinder leftTask = new MaxValueFinder(array, start, mid);
            MaxValueFinder rightTask = new MaxValueFinder(array, mid, end);

            invokeAll(leftTask, rightTask);

            int leftMax = leftTask.join();
            int rightMax = rightTask.join();

            System.out.println("Subtask result: " + Math.max(leftMax, rightMax) + ", range: " + start + "-" + end);
            return Math.max(leftMax, rightMax);
        }
    }

    public static void main(String[] args) {
        int[] array = new int[10000];
        for (int i = 0; i < array.length; i++) {
            array[i] = i;
        }

        ForkJoinPool forkJoinPool = new ForkJoinPool();
        MaxValueFinder task = new MaxValueFinder(array, 0, array.length);

        int result = forkJoinPool.invoke(task);

        System.out.println("\nMax value of the array: " + result);
    }
}
