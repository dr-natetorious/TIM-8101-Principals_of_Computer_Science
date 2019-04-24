public class android.support.v7.view.a {
  public static android.support.v7.view.a a(android.content.Context);
    Code:
       0: new           #2                  // class android/support/v7/view/a
       3: dup
       4: aload_0
       5: invokespecial #17                 // Method "<init>":(Landroid/content/Context;)V
       8: areturn

  public int a();
    Code:
       0: aload_0
       1: getfield      #13                 // Field a:Landroid/content/Context;
       4: invokevirtual #24                 // Method android/content/Context.getResources:()Landroid/content/res/Resources;
       7: invokevirtual #30                 // Method android/content/res/Resources.getConfiguration:()Landroid/content/res/Configuration;
      10: astore_3
      11: aload_3
      12: getfield      #36                 // Field android/content/res/Configuration.screenWidthDp:I
      15: istore_1
      16: aload_3
      17: getfield      #39                 // Field android/content/res/Configuration.screenHeightDp:I
      20: istore_2
      21: aload_3
      22: getfield      #42                 // Field android/content/res/Configuration.smallestScreenWidthDp:I
      25: sipush        600
      28: if_icmpgt     120
      31: iload_1
      32: sipush        600
      35: if_icmpgt     120
      38: iload_1
      39: sipush        960
      42: if_icmple     52
      45: iload_2
      46: sipush        720
      49: if_icmpgt     120
      52: iload_1
      53: sipush        720
      56: if_icmple     69
      59: iload_2
      60: sipush        960
      63: if_icmple     69
      66: goto          120
      69: iload_1
      70: sipush        500
      73: if_icmpge     118
      76: iload_1
      77: sipush        640
      80: if_icmple     90
      83: iload_2
      84: sipush        480
      87: if_icmpgt     118
      90: iload_1
      91: sipush        480
      94: if_icmple     107
      97: iload_2
      98: sipush        640
     101: if_icmple     107
     104: goto          118
     107: iload_1
     108: sipush        360
     111: if_icmplt     116
     114: iconst_3
     115: ireturn
     116: iconst_2
     117: ireturn
     118: iconst_4
     119: ireturn
     120: iconst_5
     121: ireturn

  public boolean b();
    Code:
       0: getstatic     #49                 // Field android/os/Build$VERSION.SDK_INT:I
       3: bipush        19
       5: if_icmplt     10
       8: iconst_1
       9: ireturn
      10: aload_0
      11: getfield      #13                 // Field a:Landroid/content/Context;
      14: invokestatic  #55                 // Method android/view/ViewConfiguration.get:(Landroid/content/Context;)Landroid/view/ViewConfiguration;
      17: invokevirtual #58                 // Method android/view/ViewConfiguration.hasPermanentMenuKey:()Z
      20: iconst_1
      21: ixor
      22: ireturn

  public int c();
    Code:
       0: aload_0
       1: getfield      #13                 // Field a:Landroid/content/Context;
       4: invokevirtual #24                 // Method android/content/Context.getResources:()Landroid/content/res/Resources;
       7: invokevirtual #63                 // Method android/content/res/Resources.getDisplayMetrics:()Landroid/util/DisplayMetrics;
      10: getfield      #68                 // Field android/util/DisplayMetrics.widthPixels:I
      13: iconst_2
      14: idiv
      15: ireturn

  public boolean d();
    Code:
       0: aload_0
       1: getfield      #13                 // Field a:Landroid/content/Context;
       4: invokevirtual #24                 // Method android/content/Context.getResources:()Landroid/content/res/Resources;
       7: getstatic     #74                 // Field android/support/v7/a/a$b.abc_action_bar_embed_tabs:I
      10: invokevirtual #78                 // Method android/content/res/Resources.getBoolean:(I)Z
      13: ireturn

  public int e();
    Code:
       0: aload_0
       1: getfield      #13                 // Field a:Landroid/content/Context;
       4: aconst_null
       5: getstatic     #85                 // Field android/support/v7/a/a$j.ActionBar:[I
       8: getstatic     #90                 // Field android/support/v7/a/a$a.actionBarStyle:I
      11: iconst_0
      12: invokevirtual #94                 // Method android/content/Context.obtainStyledAttributes:(Landroid/util/AttributeSet;[III)Landroid/content/res/TypedArray;
      15: astore_3
      16: aload_3
      17: getstatic     #97                 // Field android/support/v7/a/a$j.ActionBar_height:I
      20: iconst_0
      21: invokevirtual #103                // Method android/content/res/TypedArray.getLayoutDimension:(II)I
      24: istore_2
      25: aload_0
      26: getfield      #13                 // Field a:Landroid/content/Context;
      29: invokevirtual #24                 // Method android/content/Context.getResources:()Landroid/content/res/Resources;
      32: astore        4
      34: iload_2
      35: istore_1
      36: aload_0
      37: invokevirtual #105                // Method d:()Z
      40: ifne          56
      43: iload_2
      44: aload         4
      46: getstatic     #110                // Field android/support/v7/a/a$d.abc_action_bar_stacked_max_height:I
      49: invokevirtual #114                // Method android/content/res/Resources.getDimensionPixelSize:(I)I
      52: invokestatic  #119                // Method java/lang/Math.min:(II)I
      55: istore_1
      56: aload_3
      57: invokevirtual #122                // Method android/content/res/TypedArray.recycle:()V
      60: iload_1
      61: ireturn

  public boolean f();
    Code:
       0: aload_0
       1: getfield      #13                 // Field a:Landroid/content/Context;
       4: invokevirtual #127                // Method android/content/Context.getApplicationInfo:()Landroid/content/pm/ApplicationInfo;
       7: getfield      #132                // Field android/content/pm/ApplicationInfo.targetSdkVersion:I
      10: bipush        14
      12: if_icmpge     17
      15: iconst_1
      16: ireturn
      17: iconst_0
      18: ireturn

  public int g();
    Code:
       0: aload_0
       1: getfield      #13                 // Field a:Landroid/content/Context;
       4: invokevirtual #24                 // Method android/content/Context.getResources:()Landroid/content/res/Resources;
       7: getstatic     #136                // Field android/support/v7/a/a$d.abc_action_bar_stacked_tab_max_width:I
      10: invokevirtual #114                // Method android/content/res/Resources.getDimensionPixelSize:(I)I
      13: ireturn
}
