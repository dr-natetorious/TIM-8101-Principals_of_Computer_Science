class android.support.v7.widget.e extends android.database.DataSetObservable {
  static final java.lang.String a;

  final android.content.Context b;

  final java.lang.String c;

  boolean d;

  static {};
    Code:
       0: new           #48                 // class java/lang/Object
       3: dup
       4: invokespecial #51                 // Method java/lang/Object."<init>":()V
       7: putstatic     #53                 // Field e:Ljava/lang/Object;
      10: new           #55                 // class java/util/HashMap
      13: dup
      14: invokespecial #56                 // Method java/util/HashMap."<init>":()V
      17: putstatic     #58                 // Field f:Ljava/util/Map;
      20: return

  public int a();
    Code:
       0: aload_0
       1: getfield      #273                // Field g:Ljava/lang/Object;
       4: astore_2
       5: aload_2
       6: monitorenter
       7: aload_0
       8: invokespecial #275                // Method d:()V
      11: aload_0
      12: getfield      #125                // Field h:Ljava/util/List;
      15: invokeinterface #159,  1          // InterfaceMethod java/util/List.size:()I
      20: istore_1
      21: aload_2
      22: monitorexit
      23: iload_1
      24: ireturn
      25: astore_3
      26: aload_2
      27: monitorexit
      28: aload_3
      29: athrow
    Exception table:
       from    to  target type
           7    23    25   any
          26    28    25   any

  public int a(android.content.pm.ResolveInfo);
    Code:
       0: aload_0
       1: getfield      #273                // Field g:Ljava/lang/Object;
       4: astore        4
       6: aload         4
       8: monitorenter
       9: aload_0
      10: invokespecial #275                // Method d:()V
      13: aload_0
      14: getfield      #125                // Field h:Ljava/util/List;
      17: astore        5
      19: aload         5
      21: invokeinterface #159,  1          // InterfaceMethod java/util/List.size:()I
      26: istore_3
      27: iconst_0
      28: istore_2
      29: iload_2
      30: iload_3
      31: if_icmpge     57
      34: aload         5
      36: iload_2
      37: invokeinterface #163,  2          // InterfaceMethod java/util/List.get:(I)Ljava/lang/Object;
      42: checkcast     #6                  // class android/support/v7/widget/e$a
      45: getfield      #279                // Field android/support/v7/widget/e$a.a:Landroid/content/pm/ResolveInfo;
      48: aload_1
      49: if_acmpne     68
      52: aload         4
      54: monitorexit
      55: iload_2
      56: ireturn
      57: aload         4
      59: monitorexit
      60: iconst_m1
      61: ireturn
      62: astore_1
      63: aload         4
      65: monitorexit
      66: aload_1
      67: athrow
      68: iload_2
      69: iconst_1
      70: iadd
      71: istore_2
      72: goto          29
    Exception table:
       from    to  target type
           9    27    62   any
          34    55    62   any
          57    60    62   any
          63    66    62   any

  public android.content.pm.ResolveInfo a(int);
    Code:
       0: aload_0
       1: getfield      #273                // Field g:Ljava/lang/Object;
       4: astore_2
       5: aload_2
       6: monitorenter
       7: aload_0
       8: invokespecial #275                // Method d:()V
      11: aload_0
      12: getfield      #125                // Field h:Ljava/util/List;
      15: iload_1
      16: invokeinterface #163,  2          // InterfaceMethod java/util/List.get:(I)Ljava/lang/Object;
      21: checkcast     #6                  // class android/support/v7/widget/e$a
      24: getfield      #279                // Field android/support/v7/widget/e$a.a:Landroid/content/pm/ResolveInfo;
      27: astore_3
      28: aload_2
      29: monitorexit
      30: aload_3
      31: areturn
      32: astore_3
      33: aload_2
      34: monitorexit
      35: aload_3
      36: athrow
    Exception table:
       from    to  target type
           7    30    32   any
          33    35    32   any

  public android.content.Intent b(int);
    Code:
       0: aload_0
       1: getfield      #273                // Field g:Ljava/lang/Object;
       4: astore_2
       5: aload_2
       6: monitorenter
       7: aload_0
       8: getfield      #123                // Field j:Landroid/content/Intent;
      11: ifnonnull     18
      14: aload_2
      15: monitorexit
      16: aconst_null
      17: areturn
      18: aload_0
      19: invokespecial #275                // Method d:()V
      22: aload_0
      23: getfield      #125                // Field h:Ljava/util/List;
      26: iload_1
      27: invokeinterface #163,  2          // InterfaceMethod java/util/List.get:(I)Ljava/lang/Object;
      32: checkcast     #6                  // class android/support/v7/widget/e$a
      35: astore_3
      36: new           #283                // class android/content/ComponentName
      39: dup
      40: aload_3
      41: getfield      #279                // Field android/support/v7/widget/e$a.a:Landroid/content/pm/ResolveInfo;
      44: getfield      #287                // Field android/content/pm/ResolveInfo.activityInfo:Landroid/content/pm/ActivityInfo;
      47: getfield      #292                // Field android/content/pm/ActivityInfo.packageName:Ljava/lang/String;
      50: aload_3
      51: getfield      #279                // Field android/support/v7/widget/e$a.a:Landroid/content/pm/ResolveInfo;
      54: getfield      #287                // Field android/content/pm/ResolveInfo.activityInfo:Landroid/content/pm/ActivityInfo;
      57: getfield      #295                // Field android/content/pm/ActivityInfo.name:Ljava/lang/String;
      60: invokespecial #298                // Method android/content/ComponentName."<init>":(Ljava/lang/String;Ljava/lang/String;)V
      63: astore_3
      64: new           #300                // class android/content/Intent
      67: dup
      68: aload_0
      69: getfield      #123                // Field j:Landroid/content/Intent;
      72: invokespecial #303                // Method android/content/Intent."<init>":(Landroid/content/Intent;)V
      75: astore        4
      77: aload         4
      79: aload_3
      80: invokevirtual #307                // Method android/content/Intent.setComponent:(Landroid/content/ComponentName;)Landroid/content/Intent;
      83: pop
      84: aload_0
      85: getfield      #309                // Field p:Landroid/support/v7/widget/e$d;
      88: ifnull        121
      91: new           #300                // class android/content/Intent
      94: dup
      95: aload         4
      97: invokespecial #303                // Method android/content/Intent."<init>":(Landroid/content/Intent;)V
     100: astore        5
     102: aload_0
     103: getfield      #309                // Field p:Landroid/support/v7/widget/e$d;
     106: aload_0
     107: aload         5
     109: invokeinterface #312,  3          // InterfaceMethod android/support/v7/widget/e$d.a:(Landroid/support/v7/widget/e;Landroid/content/Intent;)Z
     114: ifeq          121
     117: aload_2
     118: monitorexit
     119: aconst_null
     120: areturn
     121: aload_0
     122: new           #12                 // class android/support/v7/widget/e$c
     125: dup
     126: aload_3
     127: invokestatic  #318                // Method java/lang/System.currentTimeMillis:()J
     130: fconst_1
     131: invokespecial #321                // Method android/support/v7/widget/e$c."<init>":(Landroid/content/ComponentName;JF)V
     134: invokespecial #323                // Method a:(Landroid/support/v7/widget/e$c;)Z
     137: pop
     138: aload_2
     139: monitorexit
     140: aload         4
     142: areturn
     143: astore_3
     144: aload_2
     145: monitorexit
     146: aload_3
     147: athrow
    Exception table:
       from    to  target type
           7    16   143   any
          18   119   143   any
         121   140   143   any
         144   146   143   any

  public android.content.pm.ResolveInfo b();
    Code:
       0: aload_0
       1: getfield      #273                // Field g:Ljava/lang/Object;
       4: astore_1
       5: aload_1
       6: monitorenter
       7: aload_0
       8: invokespecial #275                // Method d:()V
      11: aload_0
      12: getfield      #125                // Field h:Ljava/util/List;
      15: invokeinterface #127,  1          // InterfaceMethod java/util/List.isEmpty:()Z
      20: ifne          44
      23: aload_0
      24: getfield      #125                // Field h:Ljava/util/List;
      27: iconst_0
      28: invokeinterface #163,  2          // InterfaceMethod java/util/List.get:(I)Ljava/lang/Object;
      33: checkcast     #6                  // class android/support/v7/widget/e$a
      36: getfield      #279                // Field android/support/v7/widget/e$a.a:Landroid/content/pm/ResolveInfo;
      39: astore_2
      40: aload_1
      41: monitorexit
      42: aload_2
      43: areturn
      44: aload_1
      45: monitorexit
      46: aconst_null
      47: areturn
      48: astore_2
      49: aload_1
      50: monitorexit
      51: aload_2
      52: athrow
    Exception table:
       from    to  target type
           7    42    48   any
          44    46    48   any
          49    51    48   any

  public void c(int);
    Code:
       0: aload_0
       1: getfield      #273                // Field g:Ljava/lang/Object;
       4: astore_3
       5: aload_3
       6: monitorenter
       7: aload_0
       8: invokespecial #275                // Method d:()V
      11: aload_0
      12: getfield      #125                // Field h:Ljava/util/List;
      15: iload_1
      16: invokeinterface #163,  2          // InterfaceMethod java/util/List.get:(I)Ljava/lang/Object;
      21: checkcast     #6                  // class android/support/v7/widget/e$a
      24: astore        4
      26: aload_0
      27: getfield      #125                // Field h:Ljava/util/List;
      30: iconst_0
      31: invokeinterface #163,  2          // InterfaceMethod java/util/List.get:(I)Ljava/lang/Object;
      36: checkcast     #6                  // class android/support/v7/widget/e$a
      39: astore        5
      41: aload         5
      43: ifnull        120
      46: aload         5
      48: getfield      #328                // Field android/support/v7/widget/e$a.b:F
      51: aload         4
      53: getfield      #328                // Field android/support/v7/widget/e$a.b:F
      56: fsub
      57: ldc_w         #329                // float 5.0f
      60: fadd
      61: fstore_2
      62: goto          65
      65: aload_0
      66: new           #12                 // class android/support/v7/widget/e$c
      69: dup
      70: new           #283                // class android/content/ComponentName
      73: dup
      74: aload         4
      76: getfield      #279                // Field android/support/v7/widget/e$a.a:Landroid/content/pm/ResolveInfo;
      79: getfield      #287                // Field android/content/pm/ResolveInfo.activityInfo:Landroid/content/pm/ActivityInfo;
      82: getfield      #292                // Field android/content/pm/ActivityInfo.packageName:Ljava/lang/String;
      85: aload         4
      87: getfield      #279                // Field android/support/v7/widget/e$a.a:Landroid/content/pm/ResolveInfo;
      90: getfield      #287                // Field android/content/pm/ResolveInfo.activityInfo:Landroid/content/pm/ActivityInfo;
      93: getfield      #295                // Field android/content/pm/ActivityInfo.name:Ljava/lang/String;
      96: invokespecial #298                // Method android/content/ComponentName."<init>":(Ljava/lang/String;Ljava/lang/String;)V
      99: invokestatic  #318                // Method java/lang/System.currentTimeMillis:()J
     102: fload_2
     103: invokespecial #321                // Method android/support/v7/widget/e$c."<init>":(Landroid/content/ComponentName;JF)V
     106: invokespecial #323                // Method a:(Landroid/support/v7/widget/e$c;)Z
     109: pop
     110: aload_3
     111: monitorexit
     112: return
     113: astore        4
     115: aload_3
     116: monitorexit
     117: aload         4
     119: athrow
     120: fconst_1
     121: fstore_2
     122: goto          65
    Exception table:
       from    to  target type
           7    41   113   any
          46    62   113   any
          65   112   113   any
         115   117   113   any
}
