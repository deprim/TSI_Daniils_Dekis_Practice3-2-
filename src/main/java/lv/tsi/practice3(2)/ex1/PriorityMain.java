package lv.tsi.practice3.exercise1;

public class PriorityMain {

    public static void main(String[] args) {
        PriorityThread min = new PriorityThread("Min");
        PriorityThread max = new PriorityThread("Max");
        PriorityThread norm = new PriorityThread("Norm");


        max.setPriority(Thread.MAX_PRIORITY);
        norm.setPriority(Thread.NORM_PRIORITY);
        min.setPriority(Thread.MIN_PRIORITY);

        max.start();
        norm.start();
        min.start();
    }
}
