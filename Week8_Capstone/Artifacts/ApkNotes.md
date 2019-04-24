# Abstract

This tutorial describes the steps required to analyze the byte code from an Android package.

## How to Get the Java Class files

1. Download the APK from fdroid

2. Rename the APK to ZIP

3. Extract classes.dex

4. Use [dex2jar](https://sourceforge.net/projects/dex2jar/) to convert the dex to jar file

5. s:\tools\dex2jar-2.0\d2j-dex2jar.bat -f -o classes.jar classes.dex

6. The JAR file is ZIP file of .class definitions

## How to Get the byte code

1. https://docs.oracle.com/javase/7/docs/technotes/tools/windows/javap.html

2. 
