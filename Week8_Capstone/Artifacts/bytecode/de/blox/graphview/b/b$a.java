public class de.blox.graphview.b.b$a {
  public de.blox.graphview.b.b$a();
    Code:
       0: aload_0
       1: invokespecial #15                 // Method java/lang/Object."<init>":()V
       4: aload_0
       5: bipush        100
       7: putfield      #17                 // Field a:I
      10: aload_0
      11: bipush        100
      13: putfield      #19                 // Field b:I
      16: aload_0
      17: bipush        100
      19: putfield      #21                 // Field c:I
      22: aload_0
      23: iconst_1
      24: putfield      #23                 // Field d:I
      27: return

  static int a(de.blox.graphview.b.b$a);
    Code:
       0: aload_0
       1: getfield      #17                 // Field a:I
       4: ireturn

  static int b(de.blox.graphview.b.b$a);
    Code:
       0: aload_0
       1: getfield      #19                 // Field b:I
       4: ireturn

  static int c(de.blox.graphview.b.b$a);
    Code:
       0: aload_0
       1: getfield      #21                 // Field c:I
       4: ireturn

  static int d(de.blox.graphview.b.b$a);
    Code:
       0: aload_0
       1: getfield      #23                 // Field d:I
       4: ireturn

  public de.blox.graphview.b.b$a a(int);
    Code:
       0: aload_0
       1: iload_1
       2: putfield      #17                 // Field a:I
       5: aload_0
       6: areturn

  public de.blox.graphview.b.b a();
    Code:
       0: new           #6                  // class de/blox/graphview/b/b
       3: dup
       4: aload_0
       5: aconst_null
       6: invokespecial #30                 // Method de/blox/graphview/b/b."<init>":(Lde/blox/graphview/b/b$a;Lde/blox/graphview/b/b$1;)V
       9: areturn

  public de.blox.graphview.b.b$a b(int);
    Code:
       0: aload_0
       1: iload_1
       2: putfield      #19                 // Field b:I
       5: aload_0
       6: areturn

  public de.blox.graphview.b.b$a c(int);
    Code:
       0: aload_0
       1: iload_1
       2: putfield      #21                 // Field c:I
       5: aload_0
       6: areturn

  public de.blox.graphview.b.b$a d(int);
    Code:
       0: aload_0
       1: iload_1
       2: putfield      #23                 // Field d:I
       5: aload_0
       6: areturn
}
