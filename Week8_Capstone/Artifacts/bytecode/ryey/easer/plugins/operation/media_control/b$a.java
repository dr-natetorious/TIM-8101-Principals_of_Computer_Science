final class ryey.easer.plugins.operation.media_control.b$a extends java.lang.Enum<ryey.easer.plugins.operation.media_control.b$a> {
  public static final ryey.easer.plugins.operation.media_control.b$a a;

  public static final ryey.easer.plugins.operation.media_control.b$a b;

  public static final ryey.easer.plugins.operation.media_control.b$a c;

  public static final ryey.easer.plugins.operation.media_control.b$a d;

  public static final ryey.easer.plugins.operation.media_control.b$a e;

  static {};
    Code:
       0: new           #2                  // class ryey/easer/plugins/operation/media_control/b$a
       3: dup
       4: ldc           #19                 // String play_pause
       6: iconst_0
       7: invokespecial #23                 // Method "<init>":(Ljava/lang/String;I)V
      10: putstatic     #25                 // Field a:Lryey/easer/plugins/operation/media_control/b$a;
      13: new           #2                  // class ryey/easer/plugins/operation/media_control/b$a
      16: dup
      17: ldc           #27                 // String play
      19: iconst_1
      20: invokespecial #23                 // Method "<init>":(Ljava/lang/String;I)V
      23: putstatic     #29                 // Field b:Lryey/easer/plugins/operation/media_control/b$a;
      26: new           #2                  // class ryey/easer/plugins/operation/media_control/b$a
      29: dup
      30: ldc           #31                 // String pause
      32: iconst_2
      33: invokespecial #23                 // Method "<init>":(Ljava/lang/String;I)V
      36: putstatic     #33                 // Field c:Lryey/easer/plugins/operation/media_control/b$a;
      39: new           #2                  // class ryey/easer/plugins/operation/media_control/b$a
      42: dup
      43: ldc           #35                 // String previous
      45: iconst_3
      46: invokespecial #23                 // Method "<init>":(Ljava/lang/String;I)V
      49: putstatic     #37                 // Field d:Lryey/easer/plugins/operation/media_control/b$a;
      52: new           #2                  // class ryey/easer/plugins/operation/media_control/b$a
      55: dup
      56: ldc           #39                 // String next
      58: iconst_4
      59: invokespecial #23                 // Method "<init>":(Ljava/lang/String;I)V
      62: putstatic     #41                 // Field e:Lryey/easer/plugins/operation/media_control/b$a;
      65: iconst_5
      66: anewarray     #2                  // class ryey/easer/plugins/operation/media_control/b$a
      69: dup
      70: iconst_0
      71: getstatic     #25                 // Field a:Lryey/easer/plugins/operation/media_control/b$a;
      74: aastore
      75: dup
      76: iconst_1
      77: getstatic     #29                 // Field b:Lryey/easer/plugins/operation/media_control/b$a;
      80: aastore
      81: dup
      82: iconst_2
      83: getstatic     #33                 // Field c:Lryey/easer/plugins/operation/media_control/b$a;
      86: aastore
      87: dup
      88: iconst_3
      89: getstatic     #37                 // Field d:Lryey/easer/plugins/operation/media_control/b$a;
      92: aastore
      93: dup
      94: iconst_4
      95: getstatic     #41                 // Field e:Lryey/easer/plugins/operation/media_control/b$a;
      98: aastore
      99: putstatic     #43                 // Field f:[Lryey/easer/plugins/operation/media_control/b$a;
     102: return

  public static ryey.easer.plugins.operation.media_control.b$a valueOf(java.lang.String);
    Code:
       0: ldc           #2                  // class ryey/easer/plugins/operation/media_control/b$a
       2: aload_0
       3: invokestatic  #51                 // Method java/lang/Enum.valueOf:(Ljava/lang/Class;Ljava/lang/String;)Ljava/lang/Enum;
       6: checkcast     #2                  // class ryey/easer/plugins/operation/media_control/b$a
       9: areturn

  public static ryey.easer.plugins.operation.media_control.b$a[] values();
    Code:
       0: getstatic     #43                 // Field f:[Lryey/easer/plugins/operation/media_control/b$a;
       3: invokevirtual #58                 // Method "[Lryey/easer/plugins/operation/media_control/b$a;".clone:()Ljava/lang/Object;
       6: checkcast     #54                 // class "[Lryey/easer/plugins/operation/media_control/b$a;"
       9: areturn
}
