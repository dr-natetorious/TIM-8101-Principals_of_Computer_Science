class de.blox.graphview.b.a$1 implements java.util.Comparator<de.blox.graphview.h> {
  final de.blox.graphview.b.a a;

  de.blox.graphview.b.a$1(de.blox.graphview.b.a);
    Code:
       0: aload_0
       1: aload_1
       2: putfield      #17                 // Field a:Lde/blox/graphview/b/a;
       5: aload_0
       6: invokespecial #20                 // Method java/lang/Object."<init>":()V
       9: return

  public int a(de.blox.graphview.h, de.blox.graphview.h);
    Code:
       0: aload_0
       1: getfield      #17                 // Field a:Lde/blox/graphview/b/a;
       4: aload_1
       5: invokestatic  #25                 // Method de/blox/graphview/b/a.a:(Lde/blox/graphview/b/a;Lde/blox/graphview/h;)Lde/blox/graphview/b/c;
       8: astore_1
       9: aload_0
      10: getfield      #17                 // Field a:Lde/blox/graphview/b/a;
      13: aload_2
      14: invokestatic  #25                 // Method de/blox/graphview/b/a.a:(Lde/blox/graphview/b/a;Lde/blox/graphview/h;)Lde/blox/graphview/b/c;
      17: astore_2
      18: aload_1
      19: invokevirtual #31                 // Method de/blox/graphview/b/c.d:()I
      22: aload_2
      23: invokevirtual #31                 // Method de/blox/graphview/b/c.d:()I
      26: invokestatic  #34                 // Method de/blox/graphview/b/a.a:(II)I
      29: ireturn

  public int compare(java.lang.Object, java.lang.Object);
    Code:
       0: aload_0
       1: aload_1
       2: checkcast     #38                 // class de/blox/graphview/h
       5: aload_2
       6: checkcast     #38                 // class de/blox/graphview/h
       9: invokevirtual #40                 // Method a:(Lde/blox/graphview/h;Lde/blox/graphview/h;)I
      12: ireturn
}
