#include <iostream>
#include <stdio.h>
#include "hello.h"
#include "taco.h"
using namespace std;

void say_taco()
{
    printf("taco taco taco... burrito\n");
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
}