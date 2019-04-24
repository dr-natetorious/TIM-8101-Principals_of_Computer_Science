public final class com.c.a.a {
  public com.c.a.a();
    Code:
       0: aload_0
       1: fconst_0
       2: fconst_0
       3: iconst_3
       4: aconst_null
       5: invokespecial #12                 // Method "<init>":(FFILa/b/b/a;)V
       8: return

  public com.c.a.a(float, float);
    Code:
       0: aload_0
       1: invokespecial #16                 // Method java/lang/Object."<init>":()V
       4: aload_0
       5: fload_1
       6: putfield      #18                 // Field a:F
       9: aload_0
      10: fload_2
      11: putfield      #20                 // Field b:F
      14: return

  public com.c.a.a(float, float, int, a.b.b.a);
    Code:
       0: iload_3
       1: iconst_1
       2: iand
       3: ifeq          8
       6: fconst_0
       7: fstore_1
       8: iload_3
       9: iconst_2
      10: iand
      11: ifeq          16
      14: fconst_0
      15: fstore_2
      16: aload_0
      17: fload_1
      18: fload_2
      19: invokespecial #22                 // Method "<init>":(FF)V
      22: return

  public com.c.a.a(com.c.a.a);
    Code:
       0: aload_1
       1: ldc           #25                 // String point
       3: invokestatic  #30                 // Method a/b/b/c.b:(Ljava/lang/Object;Ljava/lang/String;)V
       6: aload_0
       7: aload_1
       8: getfield      #18                 // Field a:F
      11: aload_1
      12: getfield      #20                 // Field b:F
      15: invokespecial #22                 // Method "<init>":(FF)V
      18: return

  public final float a();
    Code:
       0: aload_0
       1: getfield      #18                 // Field a:F
       4: freturn

  public final com.c.a.a a(java.lang.Number);
    Code:
       0: aload_1
       1: ldc           #34                 // String factor
       3: invokestatic  #30                 // Method a/b/b/c.b:(Ljava/lang/Object;Ljava/lang/String;)V
       6: new           #2                  // class com/c/a/a
       9: dup
      10: aload_1
      11: invokevirtual #39                 // Method java/lang/Number.floatValue:()F
      14: aload_0
      15: getfield      #18                 // Field a:F
      18: fmul
      19: aload_1
      20: invokevirtual #39                 // Method java/lang/Number.floatValue:()F
      23: aload_0
      24: getfield      #20                 // Field b:F
      27: fmul
      28: invokespecial #22                 // Method "<init>":(FF)V
      31: areturn

  public final void a(float);
    Code:
       0: aload_0
       1: fload_1
       2: putfield      #18                 // Field a:F
       5: return

  public final void a(com.c.a.a);
    Code:
       0: aload_1
       1: ldc           #42                 // String p
       3: invokestatic  #30                 // Method a/b/b/c.b:(Ljava/lang/Object;Ljava/lang/String;)V
       6: aload_0
       7: aload_1
       8: getfield      #18                 // Field a:F
      11: invokestatic  #48                 // Method java/lang/Float.valueOf:(F)Ljava/lang/Float;
      14: checkcast     #36                 // class java/lang/Number
      17: aload_1
      18: getfield      #20                 // Field b:F
      21: invokestatic  #48                 // Method java/lang/Float.valueOf:(F)Ljava/lang/Float;
      24: checkcast     #36                 // class java/lang/Number
      27: invokevirtual #51                 // Method a:(Ljava/lang/Number;Ljava/lang/Number;)V
      30: return

  public final void a(java.lang.Number, java.lang.Number);
    Code:
       0: aload_1
       1: ldc           #53                 // String x
       3: invokestatic  #30                 // Method a/b/b/c.b:(Ljava/lang/Object;Ljava/lang/String;)V
       6: aload_2
       7: ldc           #55                 // String y
       9: invokestatic  #30                 // Method a/b/b/c.b:(Ljava/lang/Object;Ljava/lang/String;)V
      12: aload_0
      13: aload_1
      14: invokevirtual #39                 // Method java/lang/Number.floatValue:()F
      17: putfield      #18                 // Field a:F
      20: aload_0
      21: aload_2
      22: invokevirtual #39                 // Method java/lang/Number.floatValue:()F
      25: putfield      #20                 // Field b:F
      28: return

  public final float b();
    Code:
       0: aload_0
       1: getfield      #20                 // Field b:F
       4: freturn

  public final com.c.a.a b(com.c.a.a);
    Code:
       0: aload_1
       1: ldc           #58                 // String absolutePoint
       3: invokestatic  #30                 // Method a/b/b/c.b:(Ljava/lang/Object;Ljava/lang/String;)V
       6: new           #2                  // class com/c/a/a
       9: dup
      10: aload_0
      11: getfield      #18                 // Field a:F
      14: aload_1
      15: getfield      #18                 // Field a:F
      18: fsub
      19: aload_0
      20: getfield      #20                 // Field b:F
      23: aload_1
      24: getfield      #20                 // Field b:F
      27: fsub
      28: invokespecial #22                 // Method "<init>":(FF)V
      31: areturn

  public final void b(float);
    Code:
       0: aload_0
       1: fload_1
       2: putfield      #20                 // Field b:F
       5: return

  public final com.c.a.a c(com.c.a.a);
    Code:
       0: aload_1
       1: ldc           #58                 // String absolutePoint
       3: invokestatic  #30                 // Method a/b/b/c.b:(Ljava/lang/Object;Ljava/lang/String;)V
       6: new           #2                  // class com/c/a/a
       9: dup
      10: aload_0
      11: getfield      #18                 // Field a:F
      14: aload_1
      15: getfield      #18                 // Field a:F
      18: fadd
      19: aload_0
      20: getfield      #20                 // Field b:F
      23: aload_1
      24: getfield      #20                 // Field b:F
      27: fadd
      28: invokespecial #22                 // Method "<init>":(FF)V
      31: areturn

  public boolean equals(java.lang.Object);
    Code:
       0: aload_0
       1: aload_1
       2: if_acmpeq     50
       5: aload_1
       6: instanceof    #2                  // class com/c/a/a
       9: ifeq          48
      12: aload_1
      13: checkcast     #2                  // class com/c/a/a
      16: astore_1
      17: aload_0
      18: getfield      #18                 // Field a:F
      21: aload_1
      22: getfield      #18                 // Field a:F
      25: invokestatic  #65                 // Method java/lang/Float.compare:(FF)I
      28: ifne          48
      31: aload_0
      32: getfield      #20                 // Field b:F
      35: aload_1
      36: getfield      #20                 // Field b:F
      39: invokestatic  #65                 // Method java/lang/Float.compare:(FF)I
      42: ifne          48
      45: goto          50
      48: iconst_0
      49: ireturn
      50: iconst_1
      51: ireturn

  public int hashCode();
    Code:
       0: aload_0
       1: getfield      #18                 // Field a:F
       4: invokestatic  #71                 // Method java/lang/Float.floatToIntBits:(F)I
       7: bipush        31
       9: imul
      10: aload_0
      11: getfield      #20                 // Field b:F
      14: invokestatic  #71                 // Method java/lang/Float.floatToIntBits:(F)I
      17: iadd
      18: ireturn

  public java.lang.String toString();
    Code:
       0: new           #75                 // class java/lang/StringBuilder
       3: dup
       4: invokespecial #76                 // Method java/lang/StringBuilder."<init>":()V
       7: astore_1
       8: aload_1
       9: ldc           #78                 // String AbsolutePoint(x=
      11: invokevirtual #82                 // Method java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
      14: pop
      15: aload_1
      16: aload_0
      17: getfield      #18                 // Field a:F
      20: invokevirtual #85                 // Method java/lang/StringBuilder.append:(F)Ljava/lang/StringBuilder;
      23: pop
      24: aload_1
      25: ldc           #87                 // String , y=
      27: invokevirtual #82                 // Method java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
      30: pop
      31: aload_1
      32: aload_0
      33: getfield      #20                 // Field b:F
      36: invokevirtual #85                 // Method java/lang/StringBuilder.append:(F)Ljava/lang/StringBuilder;
      39: pop
      40: aload_1
      41: ldc           #89                 // String )
      43: invokevirtual #82                 // Method java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
      46: pop
      47: aload_1
      48: invokevirtual #91                 // Method java/lang/StringBuilder.toString:()Ljava/lang/String;
      51: areturn
}
