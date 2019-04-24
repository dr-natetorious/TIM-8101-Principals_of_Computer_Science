public final class android.support.v7.widget.e$c {
  public final android.content.ComponentName a;

  public final long b;

  public final float c;

  public android.support.v7.widget.e$c(android.content.ComponentName, long, float);
    Code:
       0: aload_0
       1: invokespecial #17                 // Method java/lang/Object."<init>":()V
       4: aload_0
       5: aload_1
       6: putfield      #19                 // Field a:Landroid/content/ComponentName;
       9: aload_0
      10: lload_2
      11: putfield      #21                 // Field b:J
      14: aload_0
      15: fload         4
      17: putfield      #23                 // Field c:F
      20: return

  public android.support.v7.widget.e$c(java.lang.String, long, float);
    Code:
       0: aload_0
       1: aload_1
       2: invokestatic  #31                 // Method android/content/ComponentName.unflattenFromString:(Ljava/lang/String;)Landroid/content/ComponentName;
       5: lload_2
       6: fload         4
       8: invokespecial #33                 // Method "<init>":(Landroid/content/ComponentName;JF)V
      11: return

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
      14: invokevirtual #39                 // Method java/lang/Object.getClass:()Ljava/lang/Class;
      17: aload_1
      18: invokevirtual #39                 // Method java/lang/Object.getClass:()Ljava/lang/Class;
      21: if_acmpeq     26
      24: iconst_0
      25: ireturn
      26: aload_1
      27: checkcast     #2                  // class android/support/v7/widget/e$c
      30: astore_1
      31: aload_0
      32: getfield      #19                 // Field a:Landroid/content/ComponentName;
      35: ifnonnull     47
      38: aload_1
      39: getfield      #19                 // Field a:Landroid/content/ComponentName;
      42: ifnull        63
      45: iconst_0
      46: ireturn
      47: aload_0
      48: getfield      #19                 // Field a:Landroid/content/ComponentName;
      51: aload_1
      52: getfield      #19                 // Field a:Landroid/content/ComponentName;
      55: invokevirtual #41                 // Method android/content/ComponentName.equals:(Ljava/lang/Object;)Z
      58: ifne          63
      61: iconst_0
      62: ireturn
      63: aload_0
      64: getfield      #21                 // Field b:J
      67: aload_1
      68: getfield      #21                 // Field b:J
      71: lcmp
      72: ifeq          77
      75: iconst_0
      76: ireturn
      77: aload_0
      78: getfield      #23                 // Field c:F
      81: invokestatic  #47                 // Method java/lang/Float.floatToIntBits:(F)I
      84: aload_1
      85: getfield      #23                 // Field c:F
      88: invokestatic  #47                 // Method java/lang/Float.floatToIntBits:(F)I
      91: if_icmpeq     96
      94: iconst_0
      95: ireturn
      96: iconst_1
      97: ireturn

  public int hashCode();
    Code:
       0: aload_0
       1: getfield      #19                 // Field a:Landroid/content/ComponentName;
       4: ifnonnull     12
       7: iconst_0
       8: istore_1
       9: goto          20
      12: aload_0
      13: getfield      #19                 // Field a:Landroid/content/ComponentName;
      16: invokevirtual #51                 // Method android/content/ComponentName.hashCode:()I
      19: istore_1
      20: iload_1
      21: bipush        31
      23: iadd
      24: bipush        31
      26: imul
      27: aload_0
      28: getfield      #21                 // Field b:J
      31: aload_0
      32: getfield      #21                 // Field b:J
      35: bipush        32
      37: lushr
      38: lxor
      39: l2i
      40: iadd
      41: bipush        31
      43: imul
      44: aload_0
      45: getfield      #23                 // Field c:F
      48: invokestatic  #47                 // Method java/lang/Float.floatToIntBits:(F)I
      51: iadd
      52: ireturn

  public java.lang.String toString();
    Code:
       0: new           #55                 // class java/lang/StringBuilder
       3: dup
       4: invokespecial #56                 // Method java/lang/StringBuilder."<init>":()V
       7: astore_1
       8: aload_1
       9: ldc           #58                 // String [
      11: invokevirtual #62                 // Method java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
      14: pop
      15: aload_1
      16: ldc           #64                 // String ; activity:
      18: invokevirtual #62                 // Method java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
      21: pop
      22: aload_1
      23: aload_0
      24: getfield      #19                 // Field a:Landroid/content/ComponentName;
      27: invokevirtual #67                 // Method java/lang/StringBuilder.append:(Ljava/lang/Object;)Ljava/lang/StringBuilder;
      30: pop
      31: aload_1
      32: ldc           #69                 // String ; time:
      34: invokevirtual #62                 // Method java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
      37: pop
      38: aload_1
      39: aload_0
      40: getfield      #21                 // Field b:J
      43: invokevirtual #72                 // Method java/lang/StringBuilder.append:(J)Ljava/lang/StringBuilder;
      46: pop
      47: aload_1
      48: ldc           #74                 // String ; weight:
      50: invokevirtual #62                 // Method java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
      53: pop
      54: aload_1
      55: new           #76                 // class java/math/BigDecimal
      58: dup
      59: aload_0
      60: getfield      #23                 // Field c:F
      63: f2d
      64: invokespecial #79                 // Method java/math/BigDecimal."<init>":(D)V
      67: invokevirtual #67                 // Method java/lang/StringBuilder.append:(Ljava/lang/Object;)Ljava/lang/StringBuilder;
      70: pop
      71: aload_1
      72: ldc           #81                 // String ]
      74: invokevirtual #62                 // Method java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
      77: pop
      78: aload_1
      79: invokevirtual #83                 // Method java/lang/StringBuilder.toString:()Ljava/lang/String;
      82: areturn
}
