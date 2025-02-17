package com.codes.blind75;
import java.util.*;
public class ContainsDuplicates 
{
	public boolean containsDuplicate(int[] nums) 
    {
		Set<Integer> no_dups= new HashSet<>(nums.length);
	    for(int x: nums)    
	    {
	        if(no_dups.contains(x))
	            return true;
	        no_dups.add(x);
	    }
	    return false;
    }
}
