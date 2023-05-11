#include <stdio.h>
 #include <string.h>
 void main() {
	int i,j,k1,m1;
	char st[100], key[30],temp[30],quot[100],rem[30],key1[30];
	printf("Enter Data: ");
	gets(st);
	printf("Enter Key: ");
	gets(key);
	k1=strlen(key);
	m1=strlen(st);
	strcpy(key1,key);
	for (i=0;i<k1-1;i++) {
		st[m1+i]='0';
	}
	for (i=0;i<k1;i++)
	 temp[i]=st[i];
	for (i=0;i<m1;i++) {
		quot[i]=temp[0];
		if(quot[i]=='0')
		 for (j=0;j<k1;j++)
		 key[j]='0'; 
         else
		 for (j=0;j<k1;j++)
		 key[j]=key1[j];
		for (j=k1-1;j>0;j--) {
			if(temp[j]==key[j])
			 rem[j-1]='0'; 
             else
			 rem[j-1]='1';
		}
		rem[k1-1]=st[i+k1];
		strcpy(temp,rem);
	}
	strcpy(rem,temp);
	printf("\nQuotient is ");
	for (i=0;i<m1;i++)
	 printf("%c",quot[i]);
	printf("\nRemainder is ");
	for (i=0;i<k1-1;i++)
	 printf("%c",rem[i]);
	printf("\nFinal data is: ");
	for (i=0;i<m1;i++)
	 printf("%c",st[i]);
	for (i=0;i<k1-1;i++)
	 printf("%c",rem[i]);
}