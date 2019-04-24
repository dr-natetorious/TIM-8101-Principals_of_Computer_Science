public final class ryey.easer.b.a.a extends java.lang.Enum<ryey.easer.b.a.a> {
  public static final ryey.easer.b.a.a a;

  public static final ryey.easer.b.a.a b;

  public static final ryey.easer.b.a.a c;

  public static final ryey.easer.b.a.a d;

  public static final ryey.easer.b.a.a e;

  static {};
    Code:
       0: new           #2                  // class ryey/easer/b/a/a
       3: dup
       4: ldc           #19                 // String android
       6: iconst_0
       7: invokespecial #23                 // Method "<init>":(Ljava/lang/String;I)V
      10: putstatic     #25                 // Field a:Lryey/easer/b/a/a;
      13: new           #2                  // class ryey/easer/b/a/a
      16: dup
      17: ldc           #27                 // String system_config
      19: iconst_1
      20: invokespecial #23                 // Method "<init>":(Ljava/lang/String;I)V
      23: putstatic     #29                 // Field b:Lryey/easer/b/a/a;
      26: new           #2                  // class ryey/easer/b/a/a
      29: dup
      30: ldc           #31                 // String easer
      32: iconst_2
      33: invokespecial #23                 // Method "<init>":(Ljava/lang/String;I)V
      36: putstatic     #33                 // Field c:Lryey/easer/b/a/a;
      39: new           #2                  // class ryey/easer/b/a/a
      42: dup
      43: ldc           #35                 // String misc
      45: iconst_3
      46: invokespecial #23                 // Method "<init>":(Ljava/lang/String;I)V
      49: putstatic     #37                 // Field d:Lryey/easer/b/a/a;
      52: new           #2                  // class ryey/easer/b/a/a
      55: dup
      56: ldc           #39                 // String unknown
      58: iconst_4
      59: invokespecial #23                 // Method "<init>":(Ljava/lang/String;I)V
      62: putstatic     #41                 // Field e:Lryey/easer/b/a/a;
      65: iconst_5
      66: anewarray     #2                  // class ryey/easer/b/a/a
      69: dup
      70: iconst_0
      71: getstatic     #25                 // Field a:Lryey/easer/b/a/a;
      74: aastore
      75: dup
      76: iconst_1
      77: getstatic     #29                 // Field b:Lryey/easer/b/a/a;
      80: aastore
      81: dup
      82: iconst_2
      83: getstatic     #33                 // Field c:Lryey/easer/b/a/a;
      86: aastore
      87: dup
      88: iconst_3
      89: getstatic     #37                 // Field d:Lryey/easer/b/a/a;
      92: aastore
      93: dup
      94: iconst_4
      95: getstatic     #41                 // Field e:Lryey/easer/b/a/a;
      98: aastore
      99: putstatic     #43                 // Field f:[Lryey/easer/b/a/a;
     102: return

  public static ryey.easer.b.a.a valueOf(java.lang.String);
    Code:
       0: ldc           #2                  // class ryey/easer/b/a/a
       2: aload_0
       3: invokestatic  #51                 // Method java/lang/Enum.valueOf:(Ljava/lang/Class;Ljava/lang/String;)Ljava/lang/Enum;
       6: checkcast     #2                  // class ryey/easer/b/a/a
       9: areturn

  public static ryey.easer.b.a.a[] values();
    Code:
       0: getstatic     #43                 // Field f:[Lryey/easer/b/a/a;
       3: invokevirtual #58                 // Method "[Lryey/easer/b/a/a;".clone:()Ljava/lang/Object;
       6: checkcast     #54                 // class "[Lryey/easer/b/a/a;"
       9: areturn

  public java.lang.String a(android.content.res.Resources);
    Code:
       0: getstatic     #62                 // Field ryey/easer/b/a/a$1.a:[I
       3: aload_0
       4: invokevirtual #66                 // Method ordinal:()I
       7: iaload
       8: tableswitch   { // 1 to 5
                     1: 85
                     2: 78
                     3: 71
                     4: 64
                     5: 54
               default: 44
          }
      44: new           #68                 // class java/lang/IllegalStateException
      47: dup
      48: ldc           #70                 // String Category isn't caught in switch statement
      50: invokespecial #73                 // Method java/lang/IllegalStateException."<init>":(Ljava/lang/String;)V
      53: athrow
      54: getstatic     #79                 // Field ryey/easer/b/b$a.category_operation_unknown:I
      57: istore_2
      58: aload_1
      59: iload_2
      60: invokevirtual #85                 // Method android/content/res/Resources.getString:(I)Ljava/lang/String;
      63: areturn
      64: getstatic     #88                 // Field ryey/easer/b/b$a.category_operation_misc:I
      67: istore_2
      68: goto          58
      71: getstatic     #91                 // Field ryey/easer/b/b$a.category_operation_easer:I
      74: istore_2
      75: goto          58
      78: getstatic     #94                 // Field ryey/easer/b/b$a.category_operation_system_config:I
      81: istore_2
      82: goto          58
      85: getstatic     #97                 // Field ryey/easer/b/b$a.category_operation_android:I
      88: istore_2
      89: goto          58
}
