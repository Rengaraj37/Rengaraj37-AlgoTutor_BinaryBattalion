FACTORIAL:

#include<stdio.h>  
int main()    
{    
  int num;    
  int i=0,fact=1;
  scanf("%d",&num);    
  for(i=1;i<=num;i++){    
  fact=fact*i;    
}    
  printf(" %d ",fact);    
  return 0;  
}   
