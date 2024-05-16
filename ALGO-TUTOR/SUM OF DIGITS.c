#iclude<stdio.h>
int sum(int);
int main()
{
int digit;
scanf("%d",&digit);
int  ans;
ans=sum(digit);
printf("%d",ans);
}
int sum(int digit)
{
if(digit==0)
{
return 0;
}
else
{
return((digit%10) + sum(digit/10));
}
}
