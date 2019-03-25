#include <stdio.h>
#include "taco.h"
#include "list.h"
#include "Number.h"
#include "Program.h"
Program::Program()
{
}


Program::~Program()
{
}

void Program::Run()
{
	printf("Start App...\n");

	Number<7> num;
	printf("num=%d\n", num.get_Value());


	Nate::List<Taco> list(10);
	Nate::List<int> ints(10);
	Nate::List<double> doubles(10);

	for (int i = 0; i < 100; i++)
	{
		Taco t;
		t.set_quantity(i + 1);
		t.set_meat("beef");

		list.add_Item(t);

		Taco q = list.get_Item(i);
		printf("Taco %d\n", q.get_quantity());

		ints.add_Item(i);
		doubles.add_Item(i);
	}
}

