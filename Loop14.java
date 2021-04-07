class Loop14
{//14To

   public static void main(String args[])
   {
      int i,j;
	  
	  
	  //14...
	  
	  System.out.println("Q-14");
	  
	    System.out.println("");
	  for(i=5;i>=1;i--)
	  {
	   for(j=1;j<=i;j++)
	  {
	   System.out.print("* ");
	  }
	   System.out.println("");
	  }
	  
	   
	  //15...
     
	  System.out.println("Q-15");
	  
	    System.out.println("");
	 
	 
	  for(i=1;i<=5;i++)
	  {
	   for(j=1;j<=5;j++)
	  {
		  if(j<=i)
			{
			  System.out.print(j+" ");
			}
		  else{
				System.out.print("* ");
				}
	  
	  }
	   System.out.println("");
	  }
	  
	  
	  
	  System.out.println("Q-16");
	  
	    System.out.println("");
	  //16..
	   
	   for(i=1;i<=5;i++)
	  {
	   for(j=1;j<=5;j++)
	  {
		  if(i%2==1)
			{
			  System.out.print(j+" ");
			}
		  else{
				System.out.print("* ");
				}
	  
	  }
	   System.out.println("");
	  }
	  
	  
	  //17..
	  
	  System.out.println("Q-17");
	  
	    System.out.println("");
	  
	    for(i=1;i<=5;i++)
	  {
	   for(j=1;j<=5;j++)
	  {
		  if(j<=i)
			{
			  System.out.print(i+" ");
			}
		  else{
				System.out.print(j+" ");
				}
	  
	  }
	   System.out.println("");
	  }
	  
	  //18..need to solve again
	  
	  System.out.println("Q-18");
	  
	    System.out.println("");
	  
	    for(i=1;i<=6;i++)
	  {
	   for(j=1;j<=i;j++)
	  {
		  if(j%2==0)
			{
			  System.out.print("0 ");
			}
		  else{
				System.out.print("1 ");
				}
	  
	  }
	   System.out.println("");
	  
	  }
	  
	  //19..
	  System.out.println("Q-19");
	  
	    System.out.println("");
	  
	   
	   for(i=7;i>=1;i--)
	  {
	   for(j=7;j>=i;j--)
	  {
		   
			  if((i%2==1 && j%2==0) || ( i%2==0 && j%2==1))
		   {
			  System.out.print("0 ");
		   }else{
			    System.out.print("1 ");
			   
		   }
		 
	  }
	   System.out.println("");
	  }
	  
	  //20..
	  System.out.println("Q-20");
	  
	    System.out.println("");
	  
	   
	   for(i=1;i<=7;i++)
	  {
	   for(j=7;j>=i;j--)
	  {
		   
			  System.out.print(j%2+" ");
		 
	  }
	   System.out.println("");
	  }
	  
	  
	  //21..
	  System.out.println("Q-21");
	  
	    System.out.println("");
	   
	   for(i=1;i<=7;i++)
	  {
	   for(j=7;j>=i;j--)
	  {
		   if((i%2==1 && j%2==0) || ( i%2==0 && j%2==1))
		   {
			  System.out.print("0 ");
		   }else{
			    System.out.print("1 ");
			   
		   }
		 
	  }
	   System.out.println("");
	  }
	  
	  	  //22..
	  System.out.println("Q-22");
	  
	    System.out.println("");
	  
	   
	   for(i=1;i<=5;i++)
	  {
	   for(j=5;j>=1;j--)
	  {
		   
			  System.out.print(i+" ");
		 
	  }
	   System.out.println("");
	  }
	  
	 	  //23..
	  System.out.println("Q-23");
	  
	    System.out.println("");
	  
	   
	   for(i=1;i<=5;i++)
	  {
	   for(j=1;j<=i;j++)
	  {
		   
			  System.out.print(i+" ");
		 
	  }
	   System.out.println("");
	  }
	  
	  
	 	  //24..
	  System.out.println("Q-24");
	  
	    System.out.println("");
	  
	   
	   for(i=5;i>=1;i--)
	  {
	   for(j=5;j>=i;j--)
	  {
		   
			  System.out.print(i+" ");
		 
	  }
	   System.out.println("");
	  }
	  
	  //25....
	  System.out.println("Q-25");
	  
	    System.out.println("");
	  
	   int k=1;
	   for(i=1;i<=4;i++)
	  {
	   for(j=1;j<=i;j++)
	  {
		   
			  System.out.print(k+" ");
		 k++;
	  }
	   System.out.println("");
	  }
	  
	  	  //26....
	  System.out.println("Q-26");
	  
	    System.out.println("");
	  
	   int a=-1;
	   int b=1;
	   int c;
	   for(i=1;i<=4;i++)
	  {
	   for(j=1;j<=i;j++)
	  {
		   c=a+b;
			  System.out.print(c+" ");
			  a=b;
			  b=c;
		 
	  }
	   System.out.println("");
	  }
	  
	   //27....
	  System.out.println("Q-27");
	  
	    System.out.println("");
	  
	   int f=0;
	  int count=0;

	  for(i=1;i<=50;i++)
	  { f=0;
	   for(j=1;j<=i;j++)
	  { 
  
		   if(i%j==0)
		   {
			  f++;
		   } 
		 
	  }
	   
	  if(f==2){
		  
	  System.out.print(i +" ");
	    
	   }
	    
	  
	  }
	  
	  
	  
	  
	  
   }
}