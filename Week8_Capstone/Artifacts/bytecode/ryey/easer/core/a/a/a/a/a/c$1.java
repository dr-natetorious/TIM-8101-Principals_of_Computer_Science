class ryey.easer.core.a.a.a.a.a.c$1 implements java.io.FileFilter {
  final ryey.easer.core.a.a.a.a.a.c a;

  ryey.easer.core.a.a.a.a.a.c$1(ryey.easer.core.a.a.a.a.a.c);
    Code:
       0: aload_0
       1: aload_1
       2: putfield      #17                 // Field a:Lryey/easer/core/a/a/a/a/a/c;
       5: aload_0
       6: invokespecial #20                 // Method java/lang/Object."<init>":()V
       9: return

  public boolean accept(java.io.File);
    Code:
       0: aload_1
       1: invokevirtual #29                 // Method java/io/File.isFile:()Z
       4: ifeq          21
       7: aload_1
       8: invokevirtual #33                 // Method java/io/File.getName:()Ljava/lang/String;
      11: ldc           #35                 // String .json
      13: invokevirtual #41                 // Method java/lang/String.endsWith:(Ljava/lang/String;)Z
      16: ifeq          21
      19: iconst_1
      20: ireturn
      21: iconst_0
      22: ireturn
}
