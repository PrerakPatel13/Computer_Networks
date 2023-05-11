#include<stdio.h>
#include<string.h>
int main()
{
char a[30], st[50]="", t[3], start, end, x[3], s[3], d[3], y[3];
int i, j, p = 0,q = 0;
printf("Enter string:");
scanf ("%s",a);
printf("Enter starting delimiter:");
scanf(" %c", &start);
printf("Enter ending delimiter:");
scanf(" %c", &end);
x[0] = s[0] = s[1] = start;
x[1] = s[2] ='\0';
y[0] = d[0] = d[1] = end;
d [2] = y[1] ='\0';
strcat(st, x) ;
for(i=0; i<strlen(a); i++)
{
t[0] = a[i];
t[1] ='\0' ;
if( t[0] ==start)
strcat(st, s);
else if( t[0] ==end)
strcat (st, d);
else
strcat (st, t) ;
}
strcat (st, y);
printf("After stuffing:%s", st);
return 0;
}