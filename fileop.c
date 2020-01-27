#include<stdio.h>
#include<stdlib.h>

void main(){
FILE *fpt1 , *fpt2;
fpt1 = fopen("file1.txt","r");
fpt2 = fopen("file2.txt","w");
char c;
c = fgetc(fpt1);
while(c!=EOF)
{
	fputc(c,fpt1);
	c = fgetc(fpt1);
}
fclose(fpt1);
fclose(fpt2);

}

