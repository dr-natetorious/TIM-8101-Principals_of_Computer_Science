#include <string>
#include "taco.h"
using namespace std;

Taco::Taco()
{
	this->quantity = 0;
}

void Taco::set_quantity(long quantity)
{
    this->quantity =quantity;
}
        
long Taco::get_quantity() const
{
    return this->quantity;
}

void Taco::set_meat(string value)
{
    this->meat = value;
}

string Taco::get_meat() const
{
    return this->meat;
}