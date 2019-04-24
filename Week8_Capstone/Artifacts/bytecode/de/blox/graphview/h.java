public class de.blox.graphview.h {
  public de.blox.graphview.h(java.lang.Object);
    Code:
       0: aload_0
       1: invokespecial #15                 // Method java/lang/Object."<init>":()V
       4: aload_0
       5: aload_1
       6: putfield      #17                 // Field b:Ljava/lang/Object;
       9: aload_0
      10: new           #19                 // class de/blox/graphview/l
      13: dup
      14: invokespecial #20                 // Method de/blox/graphview/l."<init>":()V
      17: invokevirtual #23                 // Method a:(Lde/blox/graphview/l;)V
      20: aload_0
      21: new           #25                 // class de/blox/graphview/k
      24: dup
      25: iconst_0
      26: iconst_0
      27: invokespecial #28                 // Method de/blox/graphview/k."<init>":(II)V
      30: putfield      #30                 // Field c:Lde/blox/graphview/k;
      33: return

  public de.blox.graphview.l a();
    Code:
       0: aload_0
       1: getfield      #34                 // Field a:Lde/blox/graphview/l;
       4: areturn

  public void a(int, int);
    Code:
       0: aload_0
       1: new           #25                 // class de/blox/graphview/k
       4: dup
       5: iload_1
       6: iload_2
       7: invokespecial #28                 // Method de/blox/graphview/k."<init>":(II)V
      10: putfield      #30                 // Field c:Lde/blox/graphview/k;
      13: return

  public void a(de.blox.graphview.l);
    Code:
       0: aload_0
       1: aload_1
       2: putfield      #34                 // Field a:Lde/blox/graphview/l;
       5: return

  public float b();
    Code:
       0: aload_0
       1: getfield      #34                 // Field a:Lde/blox/graphview/l;
       4: invokevirtual #37                 // Method de/blox/graphview/l.a:()F
       7: freturn

  public float c();
    Code:
       0: aload_0
       1: getfield      #34                 // Field a:Lde/blox/graphview/l;
       4: invokevirtual #39                 // Method de/blox/graphview/l.b:()F
       7: freturn

  public java.lang.Object d();
    Code:
       0: aload_0
       1: getfield      #17                 // Field b:Ljava/lang/Object;
       4: areturn

  public int e();
    Code:
       0: aload_0
       1: getfield      #30                 // Field c:Lde/blox/graphview/k;
       4: invokevirtual #45                 // Method de/blox/graphview/k.a:()I
       7: ireturn

  public boolean equals(java.lang.Object);
    Code:
       0: aload_0
       1: aload_1
       2: if_acmpne     7
       5: iconst_1
       6: ireturn
       7: aload_1
       8: ifnull        42
      11: aload_0
      12: invokevirtual #51                 // Method java/lang/Object.getClass:()Ljava/lang/Class;
      15: aload_1
      16: invokevirtual #51                 // Method java/lang/Object.getClass:()Ljava/lang/Class;
      19: if_acmpeq     25
      22: goto          42
      25: aload_1
      26: checkcast     #2                  // class de/blox/graphview/h
      29: astore_1
      30: aload_0
      31: getfield      #17                 // Field b:Ljava/lang/Object;
      34: aload_1
      35: getfield      #17                 // Field b:Ljava/lang/Object;
      38: invokevirtual #53                 // Method java/lang/Object.equals:(Ljava/lang/Object;)Z
      41: ireturn
      42: iconst_0
      43: ireturn

  public int f();
    Code:
       0: aload_0
       1: getfield      #30                 // Field c:Lde/blox/graphview/k;
       4: invokevirtual #56                 // Method de/blox/graphview/k.b:()I
       7: ireturn

  public int hashCode();
    Code:
       0: aload_0
       1: getfield      #17                 // Field b:Ljava/lang/Object;
       4: invokevirtual #59                 // Method java/lang/Object.hashCode:()I
       7: ireturn

  public java.lang.String toString();
    Code:
       0: new           #63                 // class java/lang/StringBuilder
       3: dup
       4: invokespecial #64                 // Method java/lang/StringBuilder."<init>":()V
       7: astore_1
       8: aload_1
       9: ldc           #66                 // String Node{pos=
      11: invokevirtual #70                 // Method java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
      14: pop
      15: aload_1
      16: aload_0
      17: getfield      #34                 // Field a:Lde/blox/graphview/l;
      20: invokevirtual #73                 // Method java/lang/StringBuilder.append:(Ljava/lang/Object;)Ljava/lang/StringBuilder;
      23: pop
      24: aload_1
      25: ldc           #75                 // String , data=
      27: invokevirtual #70                 // Method java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
      30: pop
      31: aload_1
      32: aload_0
      33: getfield      #17                 // Field b:Ljava/lang/Object;
      36: invokevirtual #73                 // Method java/lang/StringBuilder.append:(Ljava/lang/Object;)Ljava/lang/StringBuilder;
      39: pop
      40: aload_1
      41: ldc           #77                 // String , size=
      43: invokevirtual #70                 // Method java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
      46: pop
      47: aload_1
      48: aload_0
      49: getfield      #30                 // Field c:Lde/blox/graphview/k;
      52: invokevirtual #73                 // Method java/lang/StringBuilder.append:(Ljava/lang/Object;)Ljava/lang/StringBuilder;
      55: pop
      56: aload_1
      57: bipush        125
      59: invokevirtual #80                 // Method java/lang/StringBuilder.append:(C)Ljava/lang/StringBuilder;
      62: pop
      63: aload_1
      64: invokevirtual #82                 // Method java/lang/StringBuilder.toString:()Ljava/lang/String;
      67: areturn
}
