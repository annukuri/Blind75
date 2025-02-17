package com.codes.blind75;

public class ProductArrayExceptSelf 
{
	public int[] productExceptSelf(int[] nums) 
    {
        int length= nums.length;
        int []  product = new int[length];
        int []  left = new int[length];
        int []  right = new int[length];
        left[0]=1; right[length-1]=1;
        for(int i=1; i<length; i++)
        {
            left[i]=left[i-1]*nums[i-1];
        }
        for(int j=length-2; j>=0; j--)
        {
            right[j]=right[j+1]*nums[j+1];
        }
        for(int i=0; i<length; i++)
        {
            product[i]=left[i]*right[i];
        }
        return product;
    }
}
