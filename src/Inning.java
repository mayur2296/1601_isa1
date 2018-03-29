
public class Inning {
	
	Over overs[];
	public int total_overs;
	public Inning(int total_over)
	{
		total_overs=total_over;
		overs=new Over[total_over];
		for(int k=0;k<total_over;k++)
		{
			overs[k]=new Over();
		}
	}
	
	public int get_total_score()
	{
		int score = 0;
		for(int i=0;i<total_overs;i++)
		{
			for(int j=0;j<6;j++)
			{
				score=score+overs[i].get_run_per_ball(j+1);
			}
		}
		return score;
	}


	public int get_score_per_over(int over_no)
	{
		int over_score = 0;
		for(int j=0;j<6;j++)
		{
			over_score=over_score+overs[over_no].get_run_per_ball(j+1);
		}
		return over_score;
	}
}

