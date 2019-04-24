public class de.blox.graphview.k {
  public de.blox.graphview.k(int, int);
    Code:
       0: aload_0
       1: invokespecial #12                 // Method java/lang/Object."<init>":()V
       4: aload_0
       5: iload_1
       6: putfield      #14                 // Field a:I
       9: aload_0
      10: iload_2
      11: putfield      #16                 // Field b:I
      14: return

  public int a();
    Code:
       0: aload_0
       1: getfield      #14                 // Field a:I
       4: ireturn

  public int b();
    Code:
       0: aload_0
       1: getfield      #16                 // Field b:I
       4: ireturn

  public java.lang.String toString();
    Code:
       0: new           #22                 // class java/lang/StringBuilder
       3: dup
       4: invokespecial #23                 // Method java/lang/StringBuilder."<init>":()V
       7: astore_1
       8: aload_1
       9: ldc           #25                 // String Size{width=
      11: invokevirtual #29                 // Method java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
      14: pop
      15: aload_1
      16: aload_0
      17: getfield      #14                 // Field a:I
      20: invokevirtual #32                 // Method java/lang/StringBuilder.append:(I)Ljava/lang/StringBuilder;
      23: pop
      24: aload_1
      25: ldc           #34                 // String , height=
      27: invokevirtual #29                 // Method java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
      30: pop
      31: aload_1
      32: aload_0
      33: getfield      #16                 // Field b:I
      36: invokevirtual #32                 // Method java/lang/StringBuilder.append:(I)Ljava/lang/StringBuilder;
      39: pop
      40: aload_1
      41: bipush        125
      43: invokevirtual #37                 // Method java/lang/StringBuilder.append:(C)Ljava/lang/StringBuilder;
      46: pop
      47: aload_1
      48: invokevirtual #39                 // Method java/lang/StringBuilder.toString:()Ljava/lang/String;
      51: areturn
}
