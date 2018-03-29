
public class Over {

	public int runs[];
	public Over()
	{
		runs=new int[6];
	}
	
	public void add_runs_to_over(int ball,int score)
	{
		runs[ball-1]=score;
	}
	
	public int get_run_per_ball(int ball)
	{
		return runs[ball-1];
	}
	
	
}
