# Week 4 Analyzing Programming Languages

The core focus of this week has been on programming languages and how they are used.

A deep dive into the compiler technologies was also performed.

## What did you learn?

### C/C++ as a build target

It was interesting to see how C/C++ is a build target in many ways. 

Niche languages can use the LLVM compiler to generate into C/C++ source code.

Afterwards standardized tools exist to inject optimiziers and mutators into the Abstract Syntax Tree.

There are parallels to this model and the new efforts in Microsoft's Rosyln compiler.

### Compilation as a recursive process

When I think of compiling code I picture something along the lines of:
- dotnet build foo.sln
- gcc bar.c -o cheese

However it is actually more maintainable for larger scale systems to have multiple passes.

Perhaps the first pass expands out Domain Specific Langauge (DSL), then the second generates typelibs, and finally the actual code is compiled.

Each of these investments into the build system ultimately pays off by reducing developer time.

### Language Design

The [Programming Language Pragmatics](https://ebookcentral.proquest.com/lib/ncent-ebooks/detail.action?docID=649018#) was very complete. 

With each of the concepts it gave credit to the originating languages and described how others continued the effort.


## What were the assignments for the week?

The [Assignment.md](Assignment.md) provides the broad description.

- [Part A: The Compliation Process](Week4_UnderstandingCpp_PartA.docx)
- [Part B: Review Research using C++](Week4_Cpp_InResearch_PartB.docx)
