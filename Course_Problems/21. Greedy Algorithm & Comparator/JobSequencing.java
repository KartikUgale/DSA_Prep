import java.util.ArrayList;
import java.util.Collections;

public class JobSequencing {
    static class Job {
        char id;
        int deadline, profit;

        public Job(char id, int deadline, int profit) {
            this.id = id;
            this.deadline = deadline;
            this.profit = profit;
        }
    }

    public static void jobSeq(int[][] jobInfo) {
        ArrayList<Job> jobs = new ArrayList<>();

        char ch = 'A';
        for (int i = 0; i < jobInfo.length; i++) {
            jobs.add(new Job(ch, jobInfo[i][0], jobInfo[i][1]));
            ch++;
        }

        Collections.sort(jobs, (a, b) -> b.profit - a.profit); // sort on the basis of profit in descending order

        ArrayList<Integer> seq = new ArrayList<>(); // to store the sequence of jobs (ans)
        int time = 0;
        for (int i = 0; i < jobs.size(); i++) {
            if (jobs.get(i).deadline > time) {
                seq.add(i);
                time++;
            }
        }

        System.out.println("Max Jobs that can be done = " + seq.size());
        for (int i : seq) {
            System.out.print(jobs.get(i).id + " "); // print the job sequence (ans) based on the index
        }
    }

    public static void main(String[] args) {
        int[][] jobInfo = { { 4, 20 }, { 1, 10 }, { 1, 40 }, { 1, 30 } }; // {deadline, profit} // {A}{B}{C}{D}
                                                                          // respectivly
        jobSeq(jobInfo);
    }
}