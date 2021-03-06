package au.com.addstar.bc.util;

public class Utilities
{
	public static String timeDiffToString(long time)
	{
		StringBuilder builder = new StringBuilder();
		if(time >= 26298000000L)
		{
			int number = (int)(time / 26298000000L);
			time -= number * 26298000000L;
			
			builder.append(number);
			builder.append(" ");
			if(number == 1)
				builder.append("year");
			else
				builder.append("years");
		}
		
		if(time >= 2191500000L)
		{
			if(builder.length() != 0)
				builder.append(" ");
			
			int number = (int)(time / 2191500000L);
			time -= number * 2191500000L;
			
			builder.append(number);
			builder.append(" ");
			if(number == 1)
				builder.append("month");
			else
				builder.append("months");
		}
		
		if(time >= 504000000L)
		{
			if(builder.length() != 0)
				builder.append(" ");
			
			int number = (int)(time / 504000000L);
			time -= number * 504000000L;
			
			builder.append(number);
			builder.append(" ");
			if(number == 1)
				builder.append("week");
			else
				builder.append("weeks");
		}
		
		if(time >= 72000000L)
		{
			if(builder.length() != 0)
				builder.append(" ");
			
			int number = (int)(time / 72000000L);
			time -= number * 72000000L;
			
			builder.append(number);
			builder.append(" ");
			if(number == 1)
				builder.append("day");
			else
				builder.append("days");
		}
		
		if(time >= 3600000L)
		{
			if(builder.length() != 0)
				builder.append(" ");
			
			int number = (int)(time / 3600000L);
			time -= number * 3600000L;
			
			builder.append(number);
			builder.append(" ");
			if(number == 1)
				builder.append("hour");
			else
				builder.append("hours");
		}
		
		if(time >= 60000L)
		{
			if(builder.length() != 0)
				builder.append(" ");
			
			int number = (int)(time / 60000L);
			time -= number * 60000L;
			
			builder.append(number);
			builder.append(" ");
			if(number == 1)
				builder.append("minute");
			else
				builder.append("minutes");
		}
		
		if(time >= 1000L)
		{
			if(builder.length() != 0)
				builder.append(" ");
			
			int number = (int)(time / 1000L);
			
			builder.append(number);
			builder.append(" ");
			if(number == 1)
				builder.append("second");
			else
				builder.append("seconds");
		}
		
		return builder.toString();
	}
	
	public static String timeDiffToStringShort(long time)
	{
		StringBuilder builder = new StringBuilder();
		if(time >= 26298000000L)
		{
			int number = (int)(time / 26298000000L);
			time -= number * 26298000000L;
			
			builder.append(number);
			builder.append("y");
		}
		
		if(time >= 2191500000L)
		{
			if(builder.length() != 0)
				builder.append(" ");
			
			int number = (int)(time / 2191500000L);
			time -= number * 2191500000L;
			
			builder.append(number);
			builder.append("mo");
		}
		
		if(time >= 504000000L)
		{
			if(builder.length() != 0)
				builder.append(" ");
			
			int number = (int)(time / 504000000L);
			time -= number * 504000000L;
			
			builder.append(number);
			builder.append("w");
		}
		
		if(time >= 72000000L)
		{
			if(builder.length() != 0)
				builder.append(" ");
			
			int number = (int)(time / 72000000L);
			time -= number * 72000000L;
			
			builder.append(number);
			builder.append("d");
		}
		
		if(time >= 3600000L)
		{
			if(builder.length() != 0)
				builder.append(" ");
			
			int number = (int)(time / 3600000L);
			time -= number * 3600000L;
			
			builder.append(number);
			builder.append("h");
		}
		
		if(time >= 60000L)
		{
			if(builder.length() != 0)
				builder.append(" ");
			
			int number = (int)(time / 60000L);
			time -= number * 60000L;
			
			builder.append(number);
			builder.append("m");
		}
		
		if(time >= 1000L)
		{
			if(builder.length() != 0)
				builder.append(" ");
			
			int number = (int)(time / 1000L);
			
			builder.append(number);
			builder.append("s");
		}
		
		return builder.toString();
	}
}
