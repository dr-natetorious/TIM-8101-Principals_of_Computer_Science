CC=g++
CFLAGS=-I.
DEPS= hello.h taco.h
OBJ= hello.o taco.o

%.o : %.c $(DEPS)
	$(CC) -c -o $@ $< $(CFLAGS)

hello: $(OBJ)
	$(CC) -o bin/$@ $^ $(CFLAGS)