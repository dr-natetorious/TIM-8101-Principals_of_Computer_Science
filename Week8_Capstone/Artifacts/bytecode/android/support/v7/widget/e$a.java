public final class android.support.v7.widget.e$a implements java.lang.Comparable<android.support.v7.widget.e$a> {
  public final android.content.pm.ResolveInfo a;

  public float b;

  public android.support.v7.widget.e$a(android.content.pm.ResolveInfo);
    Code:
       0: aload_0
       1: invokespecial #18                 // Method java/lang/Object."<init>":()V
       4: aload_0
       5: aload_1
       6: putfield      #20                 // Field a:Landroid/content/pm/ResolveInfo;
       9: return

  public int a(android.support.v7.widget.e$a);
    Code:
       0: aload_1
       1: getfield      #24                 // Field b:F
       4: invokestatic  #30                 // Method java/lang/Float.floatToIntBits:(F)I
       7: aload_0
       8: getfield      #24                 // Field b:F
      11: invokestatic  #30                 // Method java/lang/Float.floatToIntBits:(F)I
      14: isub
      15: ireturn

  public int compareTo(java.lang.Object);
    Code:
       0: aload_0
       1: aload_1
       2: checkcast     #2                  // class android/support/v7/widget/e$a
       5: invokevirtual #34                 // Method a:(Landroid/support/v7/widget/e$a;)I
       8: ireturn

  public boolean equals(java.lang.Object);
    Code:
       0: aload_0
       1: aload_1
       2: if_acmpne     7
       5: iconst_1
       6: ireturn
       7: aload_1
       8: ifnonnull     13
      11: iconst_0
      12: ireturn
      13: aload_0
      14: invokevirtual #40                 // Method java/lang/Object.getClass:()Ljava/lang/Class;
      17: aload_1
      18: invokevirtual #40                 // Method java/lang/Object.getClass:()Ljava/lang/Class;
      21: if_acmpeq     26
      24: iconst_0
      25: ireturn
      26: aload_1
      27: checkcast     #2                  // class android/support/v7/widget/e$a
      30: astore_1
      31: aload_0
      32: getfield      #24                 // Field b:F
      35: invokestatic  #30                 // Method java/lang/Float.floatToIntBits:(F)I
      38: aload_1
      39: getfield      #24                 // Field b:F
      42: invokestatic  #30                 // Method java/lang/Float.floatToIntBits:(F)I
      45: if_icmpeq     50
      48: iconst_0
      49: ireturn
      50: iconst_1
      51: ireturn

  public int hashCode();
    Code:
       0: aload_0
       1: getfield      #24                 // Field b:F
       4: invokestatic  #30                 // Method java/lang/Float.floatToIntBits:(F)I
       7: bipush        31
       9: iadd
      10: ireturn

  public java.lang.String toString();
    Code:
       0: new           #46                 // class java/lang/StringBuilder
       3: dup
       4: invokespecial #47                 // Method java/lang/StringBuilder."<init>":()V
       7: astore_1
       8: aload_1
       9: ldc           #49                 // String [
      11: invokevirtual #53                 // Method java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
      14: pop
      15: aload_1
      16: ldc           #55                 // String resolveInfo:
      18: invokevirtual #53                 // Method java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
      21: pop
      22: aload_1
      23: aload_0
      24: getfield      #20                 // Field a:Landroid/content/pm/ResolveInfo;
      27: invokevirtual #59                 // Method android/content/pm/ResolveInfo.toString:()Ljava/lang/String;
      30: invokevirtual #53                 // Method java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
      33: pop
      34: aload_1
      35: ldc           #61                 // String ; weight:
      37: invokevirtual #53                 // Method java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
      40: pop
      41: aload_1
      42: new           #63                 // class java/math/BigDecimal
      45: dup
      46: aload_0
      47: getfield      #24                 // Field b:F
      50: f2d
      51: invokespecial #66                 // Method java/math/BigDecimal."<init>":(D)V
      54: invokevirtual #69                 // Method java/lang/StringBuilder.append:(Ljava/lang/Object;)Ljava/lang/StringBuilder;
      57: pop
      58: aload_1
      59: ldc           #71                 // String ]
      61: invokevirtual #53                 // Method java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
      64: pop
      65: aload_1
      66: invokevirtual #72                 // Method java/lang/StringBuilder.toString:()Ljava/lang/String;
      69: areturn
}
