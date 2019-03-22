#include <iostream>
#include <stdio.h>
#include "taco.h"
#include "list.h"
#include "Program.h"

using namespace std;
using namespace Nate;

void say_taco()
{
    printf("taco taco taco... burrito\n");
}

void pointer_fun()
{
	int* x = (int*)malloc(sizeof(int)*20);
	if (x == 0)
	{
		return;
	}

	for (int i = 0; i < 20; i++)
	{
		x[i] = i;
		printf("x[%d]= %p / %d\n", i, &x[i], x[i]);
	}
}

void pointer_fun2()
{
	int my_var = 1234;
	int* pVar = &my_var;

	printf("Variable Addresses: &my_var=%p \t pVar=%p\n", &my_var, pVar);
	printf("            Values: my_var=%d \t pVar=%d\n", my_var, pVar);
	printf("      Dereferenced:          \t pVar=%d\n", *pVar);
}

int main(int argc, char**argv)
{
    Taco taco;
    taco.set_quantity(7);
    taco.set_meat("beef");

    printf("Hello there!\n");
    printf("Can I have %d %s tacos? Thanks!\n", 
        taco.get_quantity(),
        taco.get_meat().c_str());

	// do pointer stuff
	pointer_fun();
	pointer_fun2();

	// Run Program.
	Program program;
	program.Run();
}

