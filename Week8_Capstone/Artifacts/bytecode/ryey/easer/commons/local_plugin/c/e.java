public final class ryey.easer.commons.local_plugin.c.e extends java.lang.Enum<ryey.easer.commons.local_plugin.c.e> {
  public static final ryey.easer.commons.local_plugin.c.e a;

  public static final ryey.easer.commons.local_plugin.c.e b;

  public static final ryey.easer.commons.local_plugin.c.e c;

  static {};
    Code:
       0: new           #2                  // class ryey/easer/commons/local_plugin/c/e
       3: dup
       4: ldc           #15                 // String no_root
       6: iconst_0
       7: invokespecial #19                 // Method "<init>":(Ljava/lang/String;I)V
      10: putstatic     #21                 // Field a:Lryey/easer/commons/local_plugin/c/e;
      13: new           #2                  // class ryey/easer/commons/local_plugin/c/e
      16: dup
      17: ldc           #23                 // String prefer_root
      19: iconst_1
      20: invokespecial #19                 // Method "<init>":(Ljava/lang/String;I)V
      23: putstatic     #25                 // Field b:Lryey/easer/commons/local_plugin/c/e;
      26: new           #2                  // class ryey/easer/commons/local_plugin/c/e
      29: dup
      30: ldc           #27                 // String root_only
      32: iconst_2
      33: invokespecial #19                 // Method "<init>":(Ljava/lang/String;I)V
      36: putstatic     #29                 // Field c:Lryey/easer/commons/local_plugin/c/e;
      39: iconst_3
      40: anewarray     #2                  // class ryey/easer/commons/local_plugin/c/e
      43: dup
      44: iconst_0
      45: getstatic     #21                 // Field a:Lryey/easer/commons/local_plugin/c/e;
      48: aastore
      49: dup
      50: iconst_1
      51: getstatic     #25                 // Field b:Lryey/easer/commons/local_plugin/c/e;
      54: aastore
      55: dup
      56: iconst_2
      57: getstatic     #29                 // Field c:Lryey/easer/commons/local_plugin/c/e;
      60: aastore
      61: putstatic     #31                 // Field d:[Lryey/easer/commons/local_plugin/c/e;
      64: return

  public static ryey.easer.commons.local_plugin.c.e valueOf(java.lang.String);
    Code:
       0: ldc           #2                  // class ryey/easer/commons/local_plugin/c/e
       2: aload_0
       3: invokestatic  #39                 // Method java/lang/Enum.valueOf:(Ljava/lang/Class;Ljava/lang/String;)Ljava/lang/Enum;
       6: checkcast     #2                  // class ryey/easer/commons/local_plugin/c/e
       9: areturn

  public static ryey.easer.commons.local_plugin.c.e[] values();
    Code:
       0: getstatic     #31                 // Field d:[Lryey/easer/commons/local_plugin/c/e;
       3: invokevirtual #46                 // Method "[Lryey/easer/commons/local_plugin/c/e;".clone:()Ljava/lang/Object;
       6: checkcast     #42                 // class "[Lryey/easer/commons/local_plugin/c/e;"
       9: areturn
}
