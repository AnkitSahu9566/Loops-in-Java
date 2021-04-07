class Loop31
{

   public static void main(String args[])
   {
      int i,j;
	  
	  
	  //31...
	  
	    System.out.println("");
	  System.out.println("Q-31");
	    System.out.println("");
		
	  for(i=1;i<=8;i++)
	  {
		  if(i%2==0)
		  {
			  System.out.print("   "); 
		  }
	   for(j=1;j<=11;j++)
	  {
	   System.out.print("* ");
	  }
	   System.out.println("");
	  }
	  
	     System.out.println("");
	  //32...
	  
	  
	    System.out.println("");
	  System.out.println("Q-32");
	    System.out.println("");
		
		
	  for(i=1;i<=6;i++)
	  { 
  
	  for(int k=1;k<=i;k++)
	  { System.out.print("   ");
	  }
	   for(j=1;j<=11;j++)
	  {
	   System.out.print("* ");
	  }
	  
	   System.out.println("");
	  }
	    System.out.println("");
	  System.out.println("Q-33");
	    System.out.println("");
		//33..
		
	  for(i=1;i<=5;i++)
	  { 
	   for(j=1;j<=5;j++)
	  {
		  if(i%2==0)
		  {       System.out.print("A ");
	       }
		   else{
	             System.out.print(j+" ");
		    }
	  }
	  
	   System.out.println("");
	  }
	  System.out.println("");
	  System.out.println("Q-34");
	    System.out.println("");
		//34...
		
	  for(i=1;i<=5;i++)
	  { 
	   for(j=1;j<=5;j++)
	  {
		  if(i==j)
		  {       System.out.print("0 ");
	       }
		   else{
	             System.out.print(j+" ");
		    }
	  }
	  
	   System.out.println("");
	  }
	    
		System.out.println("");
	  System.out.println("Q-35");
	    System.out.println("");
		//35...
		
	  for(i=1;i<=5;i++)
	  { 
	   for(j=1;j<=5;j++)
	  {
		  if((i%2==1 && j%2==0) || ( i%2==0 && j%2==1))
		  {       System.out.print("* ");
	       }
		   else{
	             System.out.print(j+" ");
		    }
	  }
	  
	   System.out.println("");
	  }
	  
	  System.out.println("");
	  System.out.println("Q-36");
	    System.out.println("");
		//36...
		int k;
	  for(i=1;i<=5;i++)
	  { k=0;
	   for(j=5;j>=1;j--)
	  {
		  if(i%2==0)
		  {       System.out.print(j+" ");
	       }
		   else{
			   k++;
	             System.out.print(k+" ");
		    }
	  }
	  
	   System.out.println("");
	  }
	  
	  System.out.println("");
	  System.out.println("Q-37");
	    System.out.println("");
		//37...
		
	  for(i=1;i<=5;i++)
	  { 
	   for(j=1;j<=5;j++)
	  {
		  if(i==1 || i==5 || j==1 || j==5)
		  {       System.out.print("* ");
	       }
		   else{
			   
	             System.out.print(j+" ");
				 }
	  }
	  
	   System.out.println("");
	  }
	  
	  System.out.println("");
	  System.out.println("Q-38");
	    System.out.println("");
		//38...
		
	  for(i=1;i<=5;i++)
	  { 
	   for(j=1;j<=5;j++)
	  {
		  if(i<=2)
		  {       System.out.print(j+" ");
	       }
		   else{
			   
	             System.out.print(i*j+" ");
				 }
	  }
	  
	   System.out.println("");
	  }
	 
	  System.out.println("");
	  System.out.println("Q-39");
	    System.out.println("");
		//39...
		
	  for(i=1;i<=5;i++)
	  { 
	   for(j=1;j<=5;j++)
	  {
		  if(i%2==1)
		  {       System.out.print(i+" ");
	       }
		   else{
			   
	             System.out.print(j+" ");
				 }
	  }
	  
	   System.out.println("");
	  }
	 
	 
	  System.out.println("");
	  System.out.println("Q-40");
	    System.out.println("");
		//40...
		
	  for(i=1;i<=5;i++)
	  { for(k=i;k<=5;k++)
	  { System.out.print(" ");}
	   for(j=1;j<=i;j++)
	  { 
	             System.out.print(j+" ");
		 }
	  
	   System.out.println("");
	  }
	  System.out.println("");
	  System.out.println("Q-41");
	    System.out.println("");
		//41...
		int kk=-1;
	  for(i=1;i<=5;i++)
	  { for(k=i;k<=5;k++)
	  { System.out.print("  ");}
  kk=kk+2;
	   for(j=1;j<=kk;j++)
	  { 
	             System.out.print(j+" ");
		 }
	  
	   System.out.println("");
	  }
	 
	  System.out.println("");
	  System.out.println("Q-42");
	    System.out.println("");
		//42...
		kk=-1;
	  for(i=1;i<=5;i++)
	  { for(k=i;k<=5;k++)
	  { System.out.print("  ");}
  kk=kk+2;
	   for(j=1;j<=kk;j++)
	  { 
	             System.out.print(i+" ");
		 }
	  
	   System.out.println("");
	  }
	 
	 System.out.println("");
	  System.out.println("Etra Loop Questions");
	    System.out.println("");
		//Extra ...
		kk=-1;
		int l=0;
	  for(i=1;i<=5;i++)
	  { for(k=i;k<=5;k++)
	  { System.out.print("  ");}
  kk=kk+2;
  
	   for(j=1;j<=kk;j++)
	  { if(j<=i)
		  {
			     System.out.print(j+" ");
				 l=j;
          }else{
		        l--;
			  System.out.print(l+" ");}

		 }
	  
	   System.out.println("");
	  }
	 
	 
	 System.out.println("");
	  System.out.println("45");
	    System.out.println("");
		//45 ...
		kk=-1;
	  for(i=5;i>=1;i--)
	  { for(k=i;k>=1;k--)
	  { System.out.print("  ");}
  kk=kk+2;
	   for(j=1;j<=kk;j++)
	  { 
	             System.out.print(i+" ");
		 }
	  
	   System.out.println("");
	  }
	  
	  
	 System.out.println("");
	  System.out.println("46");
	    System.out.println("");
		//46...
		kk=11;
	  for(i=5;i>=1;i--)
	  { for(k=5;k>=i;k--)
	  { System.out.print("  ");}
  kk=kk-2;
	   for(j=1;j<=kk;j++)
	  { 
	             System.out.print(j+" ");
		 }
	  
	   System.out.println("");
	  }
	 
		
	 System.out.println("");
	  System.out.println("47");
	    System.out.println("");
		//47...
		kk=11;
		l=0;
		int ss=0;
	  for(i=5;i>=1;i--)
	  { for(k=5;k>=i;k--)
	  { System.out.print("  ");}
  kk=kk-2;
	   for(j=kk;j>=1;j--)
	  { if(j>=i)
		  { ss=5;
			     System.out.print(ss+" ");
ss++;				
				l=ss;
          }else{
		        l++;
			  System.out.print(l+" ");}
		 }
	  
	   System.out.println("");
	  } 
		 
	 
	 }	  
}