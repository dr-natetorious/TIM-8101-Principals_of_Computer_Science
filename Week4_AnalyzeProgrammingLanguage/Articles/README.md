# What is LLVM

LLVM is a compiler collection which is designed be modular in design.

This is in contrast to `gcc` which is monolithic in design.

By being modular the expectation is that developers can extend only the subset of functionality they require.

https://youtu.be/a5-WaD8VV38

## What is KLEE

KLEE is a test case generator that is driven by LLVM IR byte code.

It can be used to determine the minimum set of cases to gain the maximum coverage.

https://klee.github.io/tutorials/testing-function/

https://youtu.be/T46n8rQapm8

## Porting to .net

LLVM is capable for consuming and producing dotnet core.

The project is open sourced by the official dotnet team.

https://dotnetfoundation.org/blog/2015/04/14/announcing-llilc-llvm-for-dotnet

https://github.com/dotnet/llilc


# What is Coppelia 

The researchers translated Verilog HDL into C++ then connected it into LLVM + KLEE

This provided a mechanism for symbolic execution across open source processor designs.

https://ieeexplore-ieee-org.proxy1.ncu.edu/stamp/stamp.jsp?tp=&arnumber=8574588

# What is SEcube

The researchers described code generation for C-Integrated Management Eventing.

They had some interesting ideas on generating code for hardware encryption.

https://ieeexplore-ieee-org.proxy1.ncu.edu/document/7930157/?arnumber=7930157&SID=EBSCO:edseee

# ROPSentory

The author describes a pattern where hardware performance counters are used to determine if the application has been exploited.

This is accomplished as the branch predictor will be wildly off, which can reliably tell something has happened.

https://www-sciencedirect-com.proxy1.ncu.edu/science/article/pii/S0167404817302481

# C++ and Programming Information

Programming with C++ is syntax guide for the language
https://ebookcentral.proquest.com/lib/ncent-ebooks/reader.action?docID=437715

Programming Language Pragmatics is more than you care to know about language design
https://ebookcentral.proquest.com/lib/ncent-ebooks/detail.action?docID=649018#