public final class android.support.constraint.a.h$a extends java.lang.Enum<android.support.constraint.a.h$a> {
  public static final android.support.constraint.a.h$a a;

  public static final android.support.constraint.a.h$a b;

  public static final android.support.constraint.a.h$a c;

  public static final android.support.constraint.a.h$a d;

  public static final android.support.constraint.a.h$a e;

  static {};
    Code:
       0: new           #2                  // class android/support/constraint/a/h$a
       3: dup
       4: ldc           #19                 // String UNRESTRICTED
       6: iconst_0
       7: invokespecial #23                 // Method "<init>":(Ljava/lang/String;I)V
      10: putstatic     #25                 // Field a:Landroid/support/constraint/a/h$a;
      13: new           #2                  // class android/support/constraint/a/h$a
      16: dup
      17: ldc           #27                 // String CONSTANT
      19: iconst_1
      20: invokespecial #23                 // Method "<init>":(Ljava/lang/String;I)V
      23: putstatic     #29                 // Field b:Landroid/support/constraint/a/h$a;
      26: new           #2                  // class android/support/constraint/a/h$a
      29: dup
      30: ldc           #31                 // String SLACK
      32: iconst_2
      33: invokespecial #23                 // Method "<init>":(Ljava/lang/String;I)V
      36: putstatic     #33                 // Field c:Landroid/support/constraint/a/h$a;
      39: new           #2                  // class android/support/constraint/a/h$a
      42: dup
      43: ldc           #35                 // String ERROR
      45: iconst_3
      46: invokespecial #23                 // Method "<init>":(Ljava/lang/String;I)V
      49: putstatic     #37                 // Field d:Landroid/support/constraint/a/h$a;
      52: new           #2                  // class android/support/constraint/a/h$a
      55: dup
      56: ldc           #39                 // String UNKNOWN
      58: iconst_4
      59: invokespecial #23                 // Method "<init>":(Ljava/lang/String;I)V
      62: putstatic     #41                 // Field e:Landroid/support/constraint/a/h$a;
      65: iconst_5
      66: anewarray     #2                  // class android/support/constraint/a/h$a
      69: dup
      70: iconst_0
      71: getstatic     #25                 // Field a:Landroid/support/constraint/a/h$a;
      74: aastore
      75: dup
      76: iconst_1
      77: getstatic     #29                 // Field b:Landroid/support/constraint/a/h$a;
      80: aastore
      81: dup
      82: iconst_2
      83: getstatic     #33                 // Field c:Landroid/support/constraint/a/h$a;
      86: aastore
      87: dup
      88: iconst_3
      89: getstatic     #37                 // Field d:Landroid/support/constraint/a/h$a;
      92: aastore
      93: dup
      94: iconst_4
      95: getstatic     #41                 // Field e:Landroid/support/constraint/a/h$a;
      98: aastore
      99: putstatic     #43                 // Field f:[Landroid/support/constraint/a/h$a;
     102: return

  public static android.support.constraint.a.h$a valueOf(java.lang.String);
    Code:
       0: ldc           #2                  // class android/support/constraint/a/h$a
       2: aload_0
       3: invokestatic  #51                 // Method java/lang/Enum.valueOf:(Ljava/lang/Class;Ljava/lang/String;)Ljava/lang/Enum;
       6: checkcast     #2                  // class android/support/constraint/a/h$a
       9: areturn

  public static android.support.constraint.a.h$a[] values();
    Code:
       0: getstatic     #43                 // Field f:[Landroid/support/constraint/a/h$a;
       3: invokevirtual #58                 // Method "[Landroid/support/constraint/a/h$a;".clone:()Ljava/lang/Object;
       6: checkcast     #54                 // class "[Landroid/support/constraint/a/h$a;"
       9: areturn
}
