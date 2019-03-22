# What are Pointer?

When a variable is passed between functions, it is often by reference.

This prevents the need for duplicating the physical bytes, resulting in faster performance.

## What is the syntax for pointers?

```c
void pointer_fun2()
{
    // create a variable with value 1234
	int my_var = 1234;

    // create a pointer and initialize to the address of my_var
	int* pVar = &my_var;

	printf("Variable Addresses: &my_var=%p \t pVar=%p\n", &my_var, pVar);
	printf("            Values: my_var=%d \t pVar=%d\n", my_var, pVar);
	printf("      Dereferenced:          \t pVar=%d\n", *pVar);
}
```

The above snippet results in this cheat sheet

```text
Variable Addresses: &my_var=006FFE08     pVar=006FFE08
            Values: my_var=1234          pVar=7339528
      Dereferenced:                     *pVar=1234
```

## How can I use pointers to dynamic arrays?

```c
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
```