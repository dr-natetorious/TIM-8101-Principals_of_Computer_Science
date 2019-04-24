class android.support.c.a.e$a implements android.animation.TypeEvaluator<android.support.v4.b.b$b[]> {
  android.support.c.a.e$a(android.support.c.a.e$1);
    Code:
       0: aload_0
       1: invokespecial #18                 // Method "<init>":()V
       4: return

  public android.support.v4.b.b$b[] a(float, android.support.v4.b.b$b[], android.support.v4.b.b$b[]);
    Code:
       0: aload_2
       1: aload_3
       2: invokestatic  #24                 // Method android/support/v4/b/b.a:([Landroid/support/v4/b/b$b;[Landroid/support/v4/b/b$b;)Z
       5: ifne          18
       8: new           #26                 // class java/lang/IllegalArgumentException
      11: dup
      12: ldc           #28                 // String Can't interpolate between two incompatible pathData
      14: invokespecial #31                 // Method java/lang/IllegalArgumentException."<init>":(Ljava/lang/String;)V
      17: athrow
      18: aload_0
      19: getfield      #33                 // Field a:[Landroid/support/v4/b/b$b;
      22: ifnull        36
      25: aload_0
      26: getfield      #33                 // Field a:[Landroid/support/v4/b/b$b;
      29: aload_2
      30: invokestatic  #24                 // Method android/support/v4/b/b.a:([Landroid/support/v4/b/b$b;[Landroid/support/v4/b/b$b;)Z
      33: ifne          44
      36: aload_0
      37: aload_2
      38: invokestatic  #36                 // Method android/support/v4/b/b.a:([Landroid/support/v4/b/b$b;)[Landroid/support/v4/b/b$b;
      41: putfield      #33                 // Field a:[Landroid/support/v4/b/b$b;
      44: iconst_0
      45: istore        4
      47: iload         4
      49: aload_2
      50: arraylength
      51: if_icmpge     82
      54: aload_0
      55: getfield      #33                 // Field a:[Landroid/support/v4/b/b$b;
      58: iload         4
      60: aaload
      61: aload_2
      62: iload         4
      64: aaload
      65: aload_3
      66: iload         4
      68: aaload
      69: fload_1
      70: invokevirtual #41                 // Method android/support/v4/b/b$b.a:(Landroid/support/v4/b/b$b;Landroid/support/v4/b/b$b;F)V
      73: iload         4
      75: iconst_1
      76: iadd
      77: istore        4
      79: goto          47
      82: aload_0
      83: getfield      #33                 // Field a:[Landroid/support/v4/b/b$b;
      86: areturn

  public java.lang.Object evaluate(float, java.lang.Object, java.lang.Object);
    Code:
       0: aload_0
       1: fload_1
       2: aload_2
       3: checkcast     #44                 // class "[Landroid/support/v4/b/b$b;"
       6: aload_3
       7: checkcast     #44                 // class "[Landroid/support/v4/b/b$b;"
      10: invokevirtual #46                 // Method a:(F[Landroid/support/v4/b/b$b;[Landroid/support/v4/b/b$b;)[Landroid/support/v4/b/b$b;
      13: areturn
}
