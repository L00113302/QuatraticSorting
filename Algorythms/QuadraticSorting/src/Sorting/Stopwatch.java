package Sorting;
// stopwatch 
public class Stopwatch {
	private long elapsedTimeM, elapsedTimeN;
	private long startTimeM, startTimeN;
	private boolean isRunningM, isRunningN;
	
	public Stopwatch(){
		reset();
	}
	//start stopwatch
	public void start(){
		if(isRunningM)
			return;
		isRunningM=true;
		startTimeM=System.currentTimeMillis();
	}
	
	public void startNano(){
		if(isRunningN)
			return;
		isRunningN=true;
		startTimeN=System.nanoTime();
	}
	
	
	// stops the stopwatch and adds to elapsed time
	public void stop(){
		if(!isRunningM)
			return;
		isRunningM=false;
		long endTime=System.currentTimeMillis();
		elapsedTimeM=elapsedTimeM + endTime - startTimeM;
	}
	
	public void stopNano(){
		if(!isRunningN)
			return;
		isRunningN=false;
		long endTime=System.nanoTime();
		elapsedTimeN=elapsedTimeN + endTime - startTimeN;
	}
	
	// returns total elapsed time
	public long getElapsedTime(){
		if(isRunningM)
		{
			long endTime = System.currentTimeMillis();
			return elapsedTimeM + endTime - startTimeM;
		}
		else
			return elapsedTimeM;
	}
	
	// returns total elapsed time nanoseconds
		public long getElapsedTimeNano(){
			if(isRunningN)
			{
				long endTime = System.nanoTime();
				return elapsedTimeN + endTime - startTimeN;
			}
			else
				return elapsedTimeN;
		}
		
	// stop watch and reset elapsed time to 0
	public void reset()
	{
		elapsedTimeM = 0;
		elapsedTimeN = 0;
		isRunningM = false;
		isRunningN = false;
	}
}
