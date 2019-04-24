public class de.blox.graphview.l {
  public de.blox.graphview.l();
    Code:
       0: aload_0
       1: fconst_0
       2: fconst_0
       3: invokespecial #12                 // Method "<init>":(FF)V
       6: return

  public de.blox.graphview.l(float, float);
    Code:
       0: aload_0
       1: invokespecial #15                 // Method java/lang/Object."<init>":()V
       4: aload_0
       5: fload_1
       6: putfield      #17                 // Field a:F
       9: aload_0
      10: fload_2
      11: putfield      #19                 // Field b:F
      14: return

  public float a();
    Code:
       0: aload_0
       1: getfield      #17                 // Field a:F
       4: freturn

  public de.blox.graphview.l a(de.blox.graphview.l);
    Code:
       0: new           #2                  // class de/blox/graphview/l
       3: dup
       4: aload_0
       5: getfield      #17                 // Field a:F
       8: aload_1
       9: getfield      #17                 // Field a:F
      12: fsub
      13: aload_0
      14: getfield      #19                 // Field b:F
      17: aload_1
      18: getfield      #19                 // Field b:F
      21: fsub
      22: invokespecial #12                 // Method "<init>":(FF)V
      25: areturn

  public float b();
    Code:
       0: aload_0
       1: getfield      #19                 // Field b:F
       4: freturn

  public java.lang.String toString();
    Code:
       0: new           #25                 // class java/lang/StringBuilder
       3: dup
       4: invokespecial #26                 // Method java/lang/StringBuilder."<init>":()V
       7: astore_1
       8: aload_1
       9: ldc           #28                 // String Vector{x=
      11: invokevirtual #32                 // Method java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
      14: pop
      15: aload_1
      16: aload_0
      17: getfield      #17                 // Field a:F
      20: invokevirtual #35                 // Method java/lang/StringBuilder.append:(F)Ljava/lang/StringBuilder;
      23: pop
      24: aload_1
      25: ldc           #37                 // String , y=
      27: invokevirtual #32                 // Method java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
      30: pop
      31: aload_1
      32: aload_0
      33: getfield      #19                 // Field b:F
      36: invokevirtual #35                 // Method java/lang/StringBuilder.append:(F)Ljava/lang/StringBuilder;
      39: pop
      40: aload_1
      41: bipush        125
      43: invokevirtual #40                 // Method java/lang/StringBuilder.append:(C)Ljava/lang/StringBuilder;
      46: pop
      47: aload_1
      48: invokevirtual #42                 // Method java/lang/StringBuilder.toString:()Ljava/lang/String;
      51: areturn
}
