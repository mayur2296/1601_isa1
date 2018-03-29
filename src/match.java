
public class match {

	public match(){
		// TODO Auto-generated method stub
		Inning inning1=new Inning(5);
		
		
		inning1.overs[0].add_runs_to_over(1, 6);
		inning1.overs[0].add_runs_to_over(2, 2);
		inning1.overs[0].add_runs_to_over(3, 5);
		inning1.overs[0].add_runs_to_over(4, 2);
		inning1.overs[0].add_runs_to_over(5, 0);
		inning1.overs[0].add_runs_to_over(6, 1);
		
		
		inning1.overs[1].add_runs_to_over(1, 6);
		inning1.overs[1].add_runs_to_over(2, 3);
		inning1.overs[1].add_runs_to_over(3, 5);
		inning1.overs[1].add_runs_to_over(4, 2);
		inning1.overs[1].add_runs_to_over(5, 0);
		inning1.overs[1].add_runs_to_over(6, 1);
		
		
		System.out.println("Total score is "+inning1.get_total_score());
		
		System.out.println("score on 1st over 3rd ball is "+inning1.overs[0].get_run_per_ball(3));
		
		
		System.out.println("score of 2nd over "+inning1.get_score_per_over(1));
	}

}
