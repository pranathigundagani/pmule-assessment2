package com.proj;

public class Sales {
	public static boolean checkProductId(int productId) 
	{
		if (productId >=10000 & productId <= 100000)
		 {
			 return true;
		 }
		 else
		 {
		     return false;
		 }
		}
		public String getAmount(String size)
		{
			if (size.equals("S"))
			{
					return "30$";
			}
			else if (size.equals("M"))
			{
				return "50$";
			}
			else 
			{
				return "80$";
			}
		}

}
