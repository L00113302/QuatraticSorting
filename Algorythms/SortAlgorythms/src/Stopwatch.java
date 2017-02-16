// stopwatch 
public class Stopwatch {
	private long elapsedTime;
	private long startTime;
	private boolean isRunning;
	
	public Stopwatch(){
		reset();
	}
	//start stopwatch
	public void start(){
		if(isRunning)
			return;
		isRunning=true;
		startTime=System.currentTimeMillis();
	}
	
	public void startNano(){
		if(isRunning)
			return;
		isRunning=true;
		startTime=System.nanoTime();
	}
	
	
	// stops the stopwatch and adds to elapsed time
	public void stop(){
		if(!isRunning)
			return;
		isRunning=false;
		long endTime=System.currentTimeMillis();
		elapsedTime=elapsedTime + endTime - startTime;
	}
	
	public void stopNano(){
		if(!isRunning)
			return;
		isRunning=false;
		long endTime=System.nanoTime();
		elapsedTime=elapsedTime + endTime - startTime;
	}
	
	// returns total elapsed time
	public long getElapsedTime(){
		if(isRunning)
		{
			long endTime = System.currentTimeMillis();
			return elapsedTime + endTime - startTime;
		}
		else
			return elapsedTime;
	}
	
	// returns total elapsed time nanoseconds
		public long getElapsedTimeNano(){
			if(isRunning)
			{
				long endTime = System.nanoTime();
				return elapsedTime + endTime - startTime;
			}
			else
				return elapsedTime;
		}
		
	// stop watch and reset elapsed time to 0
	public void reset()
	{
		elapsedTime = 0;
		isRunning = false;
	}
}
