public final class android.arch.lifecycle.c$b extends java.lang.Enum<android.arch.lifecycle.c$b> {
  public static final android.arch.lifecycle.c$b a;

  public static final android.arch.lifecycle.c$b b;

  public static final android.arch.lifecycle.c$b c;

  public static final android.arch.lifecycle.c$b d;

  public static final android.arch.lifecycle.c$b e;

  static {};
    Code:
       0: new           #2                  // class android/arch/lifecycle/c$b
       3: dup
       4: ldc           #19                 // String DESTROYED
       6: iconst_0
       7: invokespecial #23                 // Method "<init>":(Ljava/lang/String;I)V
      10: putstatic     #25                 // Field a:Landroid/arch/lifecycle/c$b;
      13: new           #2                  // class android/arch/lifecycle/c$b
      16: dup
      17: ldc           #27                 // String INITIALIZED
      19: iconst_1
      20: invokespecial #23                 // Method "<init>":(Ljava/lang/String;I)V
      23: putstatic     #29                 // Field b:Landroid/arch/lifecycle/c$b;
      26: new           #2                  // class android/arch/lifecycle/c$b
      29: dup
      30: ldc           #31                 // String CREATED
      32: iconst_2
      33: invokespecial #23                 // Method "<init>":(Ljava/lang/String;I)V
      36: putstatic     #33                 // Field c:Landroid/arch/lifecycle/c$b;
      39: new           #2                  // class android/arch/lifecycle/c$b
      42: dup
      43: ldc           #35                 // String STARTED
      45: iconst_3
      46: invokespecial #23                 // Method "<init>":(Ljava/lang/String;I)V
      49: putstatic     #37                 // Field d:Landroid/arch/lifecycle/c$b;
      52: new           #2                  // class android/arch/lifecycle/c$b
      55: dup
      56: ldc           #39                 // String RESUMED
      58: iconst_4
      59: invokespecial #23                 // Method "<init>":(Ljava/lang/String;I)V
      62: putstatic     #41                 // Field e:Landroid/arch/lifecycle/c$b;
      65: iconst_5
      66: anewarray     #2                  // class android/arch/lifecycle/c$b
      69: dup
      70: iconst_0
      71: getstatic     #25                 // Field a:Landroid/arch/lifecycle/c$b;
      74: aastore
      75: dup
      76: iconst_1
      77: getstatic     #29                 // Field b:Landroid/arch/lifecycle/c$b;
      80: aastore
      81: dup
      82: iconst_2
      83: getstatic     #33                 // Field c:Landroid/arch/lifecycle/c$b;
      86: aastore
      87: dup
      88: iconst_3
      89: getstatic     #37                 // Field d:Landroid/arch/lifecycle/c$b;
      92: aastore
      93: dup
      94: iconst_4
      95: getstatic     #41                 // Field e:Landroid/arch/lifecycle/c$b;
      98: aastore
      99: putstatic     #43                 // Field f:[Landroid/arch/lifecycle/c$b;
     102: return

  public static android.arch.lifecycle.c$b valueOf(java.lang.String);
    Code:
       0: ldc           #2                  // class android/arch/lifecycle/c$b
       2: aload_0
       3: invokestatic  #51                 // Method java/lang/Enum.valueOf:(Ljava/lang/Class;Ljava/lang/String;)Ljava/lang/Enum;
       6: checkcast     #2                  // class android/arch/lifecycle/c$b
       9: areturn

  public static android.arch.lifecycle.c$b[] values();
    Code:
       0: getstatic     #43                 // Field f:[Landroid/arch/lifecycle/c$b;
       3: invokevirtual #58                 // Method "[Landroid/arch/lifecycle/c$b;".clone:()Ljava/lang/Object;
       6: checkcast     #54                 // class "[Landroid/arch/lifecycle/c$b;"
       9: areturn

  public boolean a(android.arch.lifecycle.c$b);
    Code:
       0: aload_0
       1: aload_1
       2: invokevirtual #63                 // Method compareTo:(Ljava/lang/Enum;)I
       5: iflt          10
       8: iconst_1
       9: ireturn
      10: iconst_0
      11: ireturn
}
