final class ryey.easer.plugins.a.i.a$a extends java.lang.Enum<ryey.easer.plugins.a.i.a$a> {
  public static final ryey.easer.plugins.a.i.a$a a;

  public static final ryey.easer.plugins.a.i.a$a b;

  public static final ryey.easer.plugins.a.i.a$a c;

  static {};
    Code:
       0: new           #2                  // class ryey/easer/plugins/a/i/a$a
       3: dup
       4: ldc           #17                 // String on
       6: iconst_0
       7: invokespecial #21                 // Method "<init>":(Ljava/lang/String;I)V
      10: putstatic     #23                 // Field a:Lryey/easer/plugins/a/i/a$a;
      13: new           #2                  // class ryey/easer/plugins/a/i/a$a
      16: dup
      17: ldc           #25                 // String off
      19: iconst_1
      20: invokespecial #21                 // Method "<init>":(Ljava/lang/String;I)V
      23: putstatic     #27                 // Field b:Lryey/easer/plugins/a/i/a$a;
      26: new           #2                  // class ryey/easer/plugins/a/i/a$a
      29: dup
      30: ldc           #29                 // String unlocked
      32: iconst_2
      33: invokespecial #21                 // Method "<init>":(Ljava/lang/String;I)V
      36: putstatic     #31                 // Field c:Lryey/easer/plugins/a/i/a$a;
      39: iconst_3
      40: anewarray     #2                  // class ryey/easer/plugins/a/i/a$a
      43: dup
      44: iconst_0
      45: getstatic     #23                 // Field a:Lryey/easer/plugins/a/i/a$a;
      48: aastore
      49: dup
      50: iconst_1
      51: getstatic     #27                 // Field b:Lryey/easer/plugins/a/i/a$a;
      54: aastore
      55: dup
      56: iconst_2
      57: getstatic     #31                 // Field c:Lryey/easer/plugins/a/i/a$a;
      60: aastore
      61: putstatic     #33                 // Field d:[Lryey/easer/plugins/a/i/a$a;
      64: return

  public static ryey.easer.plugins.a.i.a$a valueOf(java.lang.String);
    Code:
       0: ldc           #2                  // class ryey/easer/plugins/a/i/a$a
       2: aload_0
       3: invokestatic  #41                 // Method java/lang/Enum.valueOf:(Ljava/lang/Class;Ljava/lang/String;)Ljava/lang/Enum;
       6: checkcast     #2                  // class ryey/easer/plugins/a/i/a$a
       9: areturn

  public static ryey.easer.plugins.a.i.a$a[] values();
    Code:
       0: getstatic     #33                 // Field d:[Lryey/easer/plugins/a/i/a$a;
       3: invokevirtual #48                 // Method "[Lryey/easer/plugins/a/i/a$a;".clone:()Ljava/lang/Object;
       6: checkcast     #44                 // class "[Lryey/easer/plugins/a/i/a$a;"
       9: areturn
}
