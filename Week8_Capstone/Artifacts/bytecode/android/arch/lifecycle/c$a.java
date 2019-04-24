public final class android.arch.lifecycle.c$a extends java.lang.Enum<android.arch.lifecycle.c$a> {
  public static final android.arch.lifecycle.c$a ON_ANY;

  public static final android.arch.lifecycle.c$a ON_CREATE;

  public static final android.arch.lifecycle.c$a ON_DESTROY;

  public static final android.arch.lifecycle.c$a ON_PAUSE;

  public static final android.arch.lifecycle.c$a ON_RESUME;

  public static final android.arch.lifecycle.c$a ON_START;

  public static final android.arch.lifecycle.c$a ON_STOP;

  static {};
    Code:
       0: new           #2                  // class android/arch/lifecycle/c$a
       3: dup
       4: ldc           #21                 // String ON_CREATE
       6: iconst_0
       7: invokespecial #25                 // Method "<init>":(Ljava/lang/String;I)V
      10: putstatic     #27                 // Field ON_CREATE:Landroid/arch/lifecycle/c$a;
      13: new           #2                  // class android/arch/lifecycle/c$a
      16: dup
      17: ldc           #28                 // String ON_START
      19: iconst_1
      20: invokespecial #25                 // Method "<init>":(Ljava/lang/String;I)V
      23: putstatic     #30                 // Field ON_START:Landroid/arch/lifecycle/c$a;
      26: new           #2                  // class android/arch/lifecycle/c$a
      29: dup
      30: ldc           #31                 // String ON_RESUME
      32: iconst_2
      33: invokespecial #25                 // Method "<init>":(Ljava/lang/String;I)V
      36: putstatic     #33                 // Field ON_RESUME:Landroid/arch/lifecycle/c$a;
      39: new           #2                  // class android/arch/lifecycle/c$a
      42: dup
      43: ldc           #34                 // String ON_PAUSE
      45: iconst_3
      46: invokespecial #25                 // Method "<init>":(Ljava/lang/String;I)V
      49: putstatic     #36                 // Field ON_PAUSE:Landroid/arch/lifecycle/c$a;
      52: new           #2                  // class android/arch/lifecycle/c$a
      55: dup
      56: ldc           #37                 // String ON_STOP
      58: iconst_4
      59: invokespecial #25                 // Method "<init>":(Ljava/lang/String;I)V
      62: putstatic     #39                 // Field ON_STOP:Landroid/arch/lifecycle/c$a;
      65: new           #2                  // class android/arch/lifecycle/c$a
      68: dup
      69: ldc           #40                 // String ON_DESTROY
      71: iconst_5
      72: invokespecial #25                 // Method "<init>":(Ljava/lang/String;I)V
      75: putstatic     #42                 // Field ON_DESTROY:Landroid/arch/lifecycle/c$a;
      78: new           #2                  // class android/arch/lifecycle/c$a
      81: dup
      82: ldc           #43                 // String ON_ANY
      84: bipush        6
      86: invokespecial #25                 // Method "<init>":(Ljava/lang/String;I)V
      89: putstatic     #45                 // Field ON_ANY:Landroid/arch/lifecycle/c$a;
      92: bipush        7
      94: anewarray     #2                  // class android/arch/lifecycle/c$a
      97: dup
      98: iconst_0
      99: getstatic     #27                 // Field ON_CREATE:Landroid/arch/lifecycle/c$a;
     102: aastore
     103: dup
     104: iconst_1
     105: getstatic     #30                 // Field ON_START:Landroid/arch/lifecycle/c$a;
     108: aastore
     109: dup
     110: iconst_2
     111: getstatic     #33                 // Field ON_RESUME:Landroid/arch/lifecycle/c$a;
     114: aastore
     115: dup
     116: iconst_3
     117: getstatic     #36                 // Field ON_PAUSE:Landroid/arch/lifecycle/c$a;
     120: aastore
     121: dup
     122: iconst_4
     123: getstatic     #39                 // Field ON_STOP:Landroid/arch/lifecycle/c$a;
     126: aastore
     127: dup
     128: iconst_5
     129: getstatic     #42                 // Field ON_DESTROY:Landroid/arch/lifecycle/c$a;
     132: aastore
     133: dup
     134: bipush        6
     136: getstatic     #45                 // Field ON_ANY:Landroid/arch/lifecycle/c$a;
     139: aastore
     140: putstatic     #47                 // Field $VALUES:[Landroid/arch/lifecycle/c$a;
     143: return

  public static android.arch.lifecycle.c$a valueOf(java.lang.String);
    Code:
       0: ldc           #2                  // class android/arch/lifecycle/c$a
       2: aload_0
       3: invokestatic  #55                 // Method java/lang/Enum.valueOf:(Ljava/lang/Class;Ljava/lang/String;)Ljava/lang/Enum;
       6: checkcast     #2                  // class android/arch/lifecycle/c$a
       9: areturn

  public static android.arch.lifecycle.c$a[] values();
    Code:
       0: getstatic     #47                 // Field $VALUES:[Landroid/arch/lifecycle/c$a;
       3: invokevirtual #62                 // Method "[Landroid/arch/lifecycle/c$a;".clone:()Ljava/lang/Object;
       6: checkcast     #58                 // class "[Landroid/arch/lifecycle/c$a;"
       9: areturn
}
