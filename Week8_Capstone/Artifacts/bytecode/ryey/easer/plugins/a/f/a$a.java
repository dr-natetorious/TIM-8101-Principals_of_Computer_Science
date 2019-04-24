final class ryey.easer.plugins.a.f.a$a extends java.lang.Enum<ryey.easer.plugins.a.f.a$a> {
  public static final ryey.easer.plugins.a.f.a$a a;

  static {};
    Code:
       0: new           #2                  // class ryey/easer/plugins/a/f/a$a
       3: dup
       4: ldc           #15                 // String after
       6: iconst_0
       7: invokespecial #19                 // Method "<init>":(Ljava/lang/String;I)V
      10: putstatic     #21                 // Field a:Lryey/easer/plugins/a/f/a$a;
      13: iconst_1
      14: anewarray     #2                  // class ryey/easer/plugins/a/f/a$a
      17: dup
      18: iconst_0
      19: getstatic     #21                 // Field a:Lryey/easer/plugins/a/f/a$a;
      22: aastore
      23: putstatic     #23                 // Field b:[Lryey/easer/plugins/a/f/a$a;
      26: return

  public static ryey.easer.plugins.a.f.a$a valueOf(java.lang.String);
    Code:
       0: ldc           #2                  // class ryey/easer/plugins/a/f/a$a
       2: aload_0
       3: invokestatic  #31                 // Method java/lang/Enum.valueOf:(Ljava/lang/Class;Ljava/lang/String;)Ljava/lang/Enum;
       6: checkcast     #2                  // class ryey/easer/plugins/a/f/a$a
       9: areturn

  public static ryey.easer.plugins.a.f.a$a[] values();
    Code:
       0: getstatic     #23                 // Field b:[Lryey/easer/plugins/a/f/a$a;
       3: invokevirtual #38                 // Method "[Lryey/easer/plugins/a/f/a$a;".clone:()Ljava/lang/Object;
       6: checkcast     #34                 // class "[Lryey/easer/plugins/a/f/a$a;"
       9: areturn
}
