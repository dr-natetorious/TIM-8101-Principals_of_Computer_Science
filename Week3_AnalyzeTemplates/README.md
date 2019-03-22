# Section 2: Week 3: Algorithms and Data Structures

This week has focused on trends in code generation and a brief refresher on C++.

## What notes exist from this week?

- [Makefiles.md](Makefiles.md): Notes from setting up Make
- [Templates.md](Templates.md): Notes from using C++ templates
- [Pointers.md](Pointers.md): Notes from C pointer guide

## What is the Core Assignment?

This week, you read about sequence template classes. Your assignment for the week is to create a report on this useful class in which you will describe the following:

1. What are template classes? (1 page)
2. Where are they used? Include a real-world example. (1 page)
3. What are some benefits and drawbacks of using template classes? (1 page)
4. What are some alternatives to template classes, and where/when would you use them? (1 page)
5. Create a small code example template classes in a language of your choice (must not be a copy/paste example from the web). Place comments at every line of the code describing what it does. (Note: The comments do not count toward code length limit.)
6. What research has been conducted using template classes? (1 page)
7. What is some future research you can envision using template classes? (1 page)

## How Do I Get Build Environment?

The [devenv.bat](CppRefresher/devenv.bat) script will:

- Initialize a Debian Linux based container
- Install the `build-essential` package
- Map the [CppRefresher](CppRefresher) directory to the containers `/src`

Running `make` will build all code in the project.

Alternatively a Visual Studio 2019 project is provided.

## How was the code Imported into Visual Studio Project

1. First the code was written for `make` and the debian environment.

2. File -> New Solution From Existing Code

3. Specify C++ Console application

4. This simple project figured everything out and `Build -> Build Solution` "just worked"