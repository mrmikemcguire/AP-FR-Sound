
public class Sound
	{
	private int [ ] samples = new int [10];
	
	public static void main(String[] args)
		{
		// TODO Auto-generated method stub

		}
	
	public int limitAmplitude(int limit)
		{  
		int count = 0;
	
		for (int i = 0; i < samples.length; i++)
		      {
		      if (samples[i] > limit)
		        {
		        samples[i] = limit;
		        count++;
		        }
		      else if (samples[i] < -limit)
		        {
		        samples[i] = -limit;
		        count++;
		        }
		      }
		  return count;
		  }
	
	public void trimSilenceFromBeginning()
		{
	    int n = 0;
	    
	    while (samples[n] == 0)
	    	{
		    n++;
	    	}

	    int[] newSamples = new int[samples.length - n];

	    for (int i = 0; i < newSamples.length; i++)
	    	{
	    	newSamples[i] = samples[i+n];
	    	}
	    
	    samples = newSamples;
		}		
	}
