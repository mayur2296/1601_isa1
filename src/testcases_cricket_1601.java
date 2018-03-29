import static org.junit.Assert.*;

import org.junit.Test;

public class testcases_cricket_1601 {

	@Test
	public void test() {
		
Inning inning1=new Inning(5);

		
		
		inning1.overs[1].add_runs_to_over(1, 6);
		inning1.overs[1].add_runs_to_over(2, 3);
		inning1.overs[1].add_runs_to_over(3, 5);
		inning1.overs[1].add_runs_to_over(4, 2);
		inning1.overs[1].add_runs_to_over(5, 0);
		inning1.overs[1].add_runs_to_over(6, 1);
		
		
		
		inning1.overs[2].add_runs_to_over(1, 6);
		inning1.overs[2].add_runs_to_over(2, 2);
		inning1.overs[2].add_runs_to_over(3, 5);
		inning1.overs[2].add_runs_to_over(4, 2);
		inning1.overs[2].add_runs_to_over(5, 0);
		inning1.overs[2].add_runs_to_over(6, 1);
		
		inning1.overs[3].add_runs_to_over(1, 0);
		inning1.overs[3].add_runs_to_over(2, 0);
		inning1.overs[3].add_runs_to_over(3, 0);
		inning1.overs[3].add_runs_to_over(4, 0);
		inning1.overs[3].add_runs_to_over(5, 0);
		inning1.overs[3].add_runs_to_over(6, 0);
		
		
		
		System.out.println("\n score of 2nd over "+inning1.get_score_per_over(2));
		
		System.out.println("\n score on 1st over 3rd ball is "+inning1.overs[1].get_run_per_ball(3));
		
		
		System.out.println("\n score of 3rd over "+inning1.get_score_per_over(3));
		
		System.out.println("\n Total score is "+inning1.get_total_score());
	
	}
}

