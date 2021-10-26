#include<stdio.h>
#include<conio.h>
#include<string.h>
#include <ctype.h>
#include <stdlib.h>

char stack[20];
int top=-1;
void push(char x)
{
	stack[++top]=x;

}
char pop()
{
	if (top==-1)
	return-1;
	else;
	return stack[top--];
}
int priority(char x)
{
	if(x=='(')
	return 0;
	if(x=='+'||x=='-')
	return 1;
	if ( x=='*'||x=='/')
	return 2;
 return 0;

}
struct Stack
{
    int top;
    unsigned capacity;
    int* array;
};
struct Stack* createStack( unsigned capacity )
{
    struct Stack* stack = (struct Stack*) malloc(sizeof(struct Stack));

    if (!stack) return NULL;

    stack->top = -1;
    stack->capacity = capacity;
    stack->array = (int*) malloc(stack->capacity * sizeof(int));

    if (!stack->array) return NULL;

    return stack;
}

int isEmpty(struct Stack* stack)
{
    return stack->top == -1 ;
}

char peek(struct Stack* stack)
{
    return stack->array[stack->top];
}

char pop2(struct Stack* stack)
{
    if (!isEmpty(stack))
	return stack->array[stack->top--] ;
    return '$';
}

void push1(struct Stack* stack, char op)
{
    stack->array[++stack->top] = op;
}
int evaluatePostfix(char* exp1)
{
    struct Stack* stack = createStack(strlen(exp1));
    int i;
    if (!stack) return -1;
    for (i = 0; exp1[i]; ++i)
    {
	if (isdigit(exp1[i]))
	    push1(stack, exp1[i] - '0');
	else
	{
	    int val1 = pop2(stack);
	    int val2 = pop2(stack);
	    switch (exp1[i])
	    {
	     case '+': push1(stack, val2 + val1); break;
	     case '-': push1(stack, val2 - val1); break;
	     case '*': push1(stack, val2 * val1); break;
	     case '/': push1(stack, val2/val1);   break;
	    }
	}
    }
    return pop2(stack);
}


void main()
{

char exp1[20];
char exp[20];
char *e,x;
clrscr();
printf("Enter the infix expression=\n");
scanf("%s",exp);
e=exp;
while(*e!='\0')
{
	if (isalnum(*e))
	printf("%c",*e);
	else if(*e=='(')
	push(*e);
	else if(*e==')')
	{
	while((x=pop())!='(')
	printf("%c",x);
	}
	else
	{
		while(priority(stack[top])>=priority(*e))
		printf("%c",pop());
		push(*e);

	}
	e++;

}
while(top!=-1)
{

	printf("%c",pop());

}
printf("\nEnter the postfix expression=\n");
scanf("%s",exp1);
    printf ("\nValue of %s is %d ",exp1, evaluatePostfix(exp1));
getch();
}