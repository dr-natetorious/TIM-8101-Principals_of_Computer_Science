final class ryey.easer.plugins.operation.p.b$a extends java.lang.Enum<ryey.easer.plugins.operation.p.b$a> {
  public static final ryey.easer.plugins.operation.p.b$a a;

  public static final ryey.easer.plugins.operation.p.b$a b;

  static {};
    Code:
       0: new           #2                  // class ryey/easer/plugins/operation/p/b$a
       3: dup
       4: ldc           #16                 // String car
       6: iconst_0
       7: invokespecial #20                 // Method "<init>":(Ljava/lang/String;I)V
      10: putstatic     #22                 // Field a:Lryey/easer/plugins/operation/p/b$a;
      13: new           #2                  // class ryey/easer/plugins/operation/p/b$a
      16: dup
      17: ldc           #24                 // String normal
      19: iconst_1
      20: invokespecial #20                 // Method "<init>":(Ljava/lang/String;I)V
      23: putstatic     #26                 // Field b:Lryey/easer/plugins/operation/p/b$a;
      26: iconst_2
      27: anewarray     #2                  // class ryey/easer/plugins/operation/p/b$a
      30: dup
      31: iconst_0
      32: getstatic     #22                 // Field a:Lryey/easer/plugins/operation/p/b$a;
      35: aastore
      36: dup
      37: iconst_1
      38: getstatic     #26                 // Field b:Lryey/easer/plugins/operation/p/b$a;
      41: aastore
      42: putstatic     #28                 // Field c:[Lryey/easer/plugins/operation/p/b$a;
      45: return

  public static ryey.easer.plugins.operation.p.b$a valueOf(java.lang.String);
    Code:
       0: ldc           #2                  // class ryey/easer/plugins/operation/p/b$a
       2: aload_0
       3: invokestatic  #36                 // Method java/lang/Enum.valueOf:(Ljava/lang/Class;Ljava/lang/String;)Ljava/lang/Enum;
       6: checkcast     #2                  // class ryey/easer/plugins/operation/p/b$a
       9: areturn

  public static ryey.easer.plugins.operation.p.b$a[] values();
    Code:
       0: getstatic     #28                 // Field c:[Lryey/easer/plugins/operation/p/b$a;
       3: invokevirtual #43                 // Method "[Lryey/easer/plugins/operation/p/b$a;".clone:()Ljava/lang/Object;
       6: checkcast     #39                 // class "[Lryey/easer/plugins/operation/p/b$a;"
       9: areturn
}
