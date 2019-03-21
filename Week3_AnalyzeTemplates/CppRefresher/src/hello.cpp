#include <iostream>
#include <stdio.h>
#include "taco.h"
#include "list.h"

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

void do_list_stuff()
{
	List list(7);
	for (int i = 0; i < 100; i++)
	{
		list.add_Item(i);
		printf("item[%d] = %d\n", i, list.get_Item(i));
	}
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

	// test list
	do_list_stuff();
}

