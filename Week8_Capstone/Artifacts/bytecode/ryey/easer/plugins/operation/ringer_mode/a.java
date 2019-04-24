final class ryey.easer.plugins.operation.ringer_mode.a extends java.lang.Enum<ryey.easer.plugins.operation.ringer_mode.a> {
  public static final ryey.easer.plugins.operation.ringer_mode.a a;

  public static final ryey.easer.plugins.operation.ringer_mode.a b;

  public static final ryey.easer.plugins.operation.ringer_mode.a c;

  public static final ryey.easer.plugins.operation.ringer_mode.a d;

  public static final ryey.easer.plugins.operation.ringer_mode.a e;

  public static final ryey.easer.plugins.operation.ringer_mode.a f;

  public static final ryey.easer.plugins.operation.ringer_mode.a g;

  static {};
    Code:
       0: new           #2                  // class ryey/easer/plugins/operation/ringer_mode/a
       3: dup
       4: ldc           #21                 // String normal
       6: iconst_0
       7: invokespecial #25                 // Method "<init>":(Ljava/lang/String;I)V
      10: putstatic     #27                 // Field a:Lryey/easer/plugins/operation/ringer_mode/a;
      13: new           #2                  // class ryey/easer/plugins/operation/ringer_mode/a
      16: dup
      17: ldc           #29                 // String vibrate
      19: iconst_1
      20: invokespecial #25                 // Method "<init>":(Ljava/lang/String;I)V
      23: putstatic     #31                 // Field b:Lryey/easer/plugins/operation/ringer_mode/a;
      26: new           #2                  // class ryey/easer/plugins/operation/ringer_mode/a
      29: dup
      30: ldc           #33                 // String silent
      32: iconst_2
      33: invokespecial #25                 // Method "<init>":(Ljava/lang/String;I)V
      36: putstatic     #35                 // Field c:Lryey/easer/plugins/operation/ringer_mode/a;
      39: new           #2                  // class ryey/easer/plugins/operation/ringer_mode/a
      42: dup
      43: ldc           #37                 // String dnd_all
      45: iconst_3
      46: invokespecial #25                 // Method "<init>":(Ljava/lang/String;I)V
      49: putstatic     #39                 // Field d:Lryey/easer/plugins/operation/ringer_mode/a;
      52: new           #2                  // class ryey/easer/plugins/operation/ringer_mode/a
      55: dup
      56: ldc           #41                 // String dnd_priority
      58: iconst_4
      59: invokespecial #25                 // Method "<init>":(Ljava/lang/String;I)V
      62: putstatic     #43                 // Field e:Lryey/easer/plugins/operation/ringer_mode/a;
      65: new           #2                  // class ryey/easer/plugins/operation/ringer_mode/a
      68: dup
      69: ldc           #45                 // String dnd_none
      71: iconst_5
      72: invokespecial #25                 // Method "<init>":(Ljava/lang/String;I)V
      75: putstatic     #47                 // Field f:Lryey/easer/plugins/operation/ringer_mode/a;
      78: new           #2                  // class ryey/easer/plugins/operation/ringer_mode/a
      81: dup
      82: ldc           #49                 // String dnd_alarms
      84: bipush        6
      86: invokespecial #25                 // Method "<init>":(Ljava/lang/String;I)V
      89: putstatic     #51                 // Field g:Lryey/easer/plugins/operation/ringer_mode/a;
      92: bipush        7
      94: anewarray     #2                  // class ryey/easer/plugins/operation/ringer_mode/a
      97: dup
      98: iconst_0
      99: getstatic     #27                 // Field a:Lryey/easer/plugins/operation/ringer_mode/a;
     102: aastore
     103: dup
     104: iconst_1
     105: getstatic     #31                 // Field b:Lryey/easer/plugins/operation/ringer_mode/a;
     108: aastore
     109: dup
     110: iconst_2
     111: getstatic     #35                 // Field c:Lryey/easer/plugins/operation/ringer_mode/a;
     114: aastore
     115: dup
     116: iconst_3
     117: getstatic     #39                 // Field d:Lryey/easer/plugins/operation/ringer_mode/a;
     120: aastore
     121: dup
     122: iconst_4
     123: getstatic     #43                 // Field e:Lryey/easer/plugins/operation/ringer_mode/a;
     126: aastore
     127: dup
     128: iconst_5
     129: getstatic     #47                 // Field f:Lryey/easer/plugins/operation/ringer_mode/a;
     132: aastore
     133: dup
     134: bipush        6
     136: getstatic     #51                 // Field g:Lryey/easer/plugins/operation/ringer_mode/a;
     139: aastore
     140: putstatic     #53                 // Field h:[Lryey/easer/plugins/operation/ringer_mode/a;
     143: return

  static ryey.easer.plugins.operation.ringer_mode.a a(ryey.easer.plugins.operation.ringer_mode.a);
    Code:
       0: getstatic     #63                 // Field android/os/Build$VERSION.SDK_INT:I
       3: bipush        21
       5: if_icmpge     54
       8: getstatic     #66                 // Field ryey/easer/plugins/operation/ringer_mode/a$1.a:[I
      11: aload_0
      12: invokevirtual #70                 // Method ordinal:()I
      15: iaload
      16: tableswitch   { // 1 to 4
                     1: 50
                     2: 50
                     3: 50
                     4: 50
               default: 48
          }
      48: aload_0
      49: areturn
      50: getstatic     #35                 // Field c:Lryey/easer/plugins/operation/ringer_mode/a;
      53: areturn
      54: aload_0
      55: getstatic     #35                 // Field c:Lryey/easer/plugins/operation/ringer_mode/a;
      58: if_acmpne     65
      61: getstatic     #43                 // Field e:Lryey/easer/plugins/operation/ringer_mode/a;
      64: areturn
      65: getstatic     #63                 // Field android/os/Build$VERSION.SDK_INT:I
      68: bipush        23
      70: if_icmpge     83
      73: aload_0
      74: getstatic     #51                 // Field g:Lryey/easer/plugins/operation/ringer_mode/a;
      77: if_acmpne     83
      80: goto          61
      83: aload_0
      84: areturn

  public static ryey.easer.plugins.operation.ringer_mode.a valueOf(java.lang.String);
    Code:
       0: ldc           #2                  // class ryey/easer/plugins/operation/ringer_mode/a
       2: aload_0
       3: invokestatic  #75                 // Method java/lang/Enum.valueOf:(Ljava/lang/Class;Ljava/lang/String;)Ljava/lang/Enum;
       6: checkcast     #2                  // class ryey/easer/plugins/operation/ringer_mode/a
       9: areturn

  public static ryey.easer.plugins.operation.ringer_mode.a[] values();
    Code:
       0: getstatic     #53                 // Field h:[Lryey/easer/plugins/operation/ringer_mode/a;
       3: invokevirtual #82                 // Method "[Lryey/easer/plugins/operation/ringer_mode/a;".clone:()Ljava/lang/Object;
       6: checkcast     #78                 // class "[Lryey/easer/plugins/operation/ringer_mode/a;"
       9: areturn
}
