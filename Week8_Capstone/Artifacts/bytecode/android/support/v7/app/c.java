class android.support.v7.app.c {
  static {};
    Code:
       0: iconst_1
       1: newarray       int
       3: dup
       4: iconst_0
       5: ldc           #11                 // int 16843531
       7: iastore
       8: putstatic     #13                 // Field a:[I
      11: return

  public static android.graphics.drawable.Drawable a(android.app.Activity);
    Code:
       0: aload_0
       1: getstatic     #13                 // Field a:[I
       4: invokevirtual #21                 // Method android/app/Activity.obtainStyledAttributes:([I)Landroid/content/res/TypedArray;
       7: astore_0
       8: aload_0
       9: iconst_0
      10: invokevirtual #27                 // Method android/content/res/TypedArray.getDrawable:(I)Landroid/graphics/drawable/Drawable;
      13: astore_1
      14: aload_0
      15: invokevirtual #30                 // Method android/content/res/TypedArray.recycle:()V
      18: aload_1
      19: areturn

  public static android.support.v7.app.c$a a(android.support.v7.app.c$a, android.app.Activity, int);
    Code:
       0: aload_0
       1: astore_3
       2: aload_0
       3: ifnonnull     15
       6: new           #6                  // class android/support/v7/app/c$a
       9: dup
      10: aload_1
      11: invokespecial #37                 // Method android/support/v7/app/c$a."<init>":(Landroid/app/Activity;)V
      14: astore_3
      15: aload_3
      16: getfield      #40                 // Field android/support/v7/app/c$a.a:Ljava/lang/reflect/Method;
      19: ifnull        75
      22: aload_1
      23: invokevirtual #44                 // Method android/app/Activity.getActionBar:()Landroid/app/ActionBar;
      26: astore_0
      27: aload_3
      28: getfield      #47                 // Field android/support/v7/app/c$a.b:Ljava/lang/reflect/Method;
      31: aload_0
      32: iconst_1
      33: anewarray     #4                  // class java/lang/Object
      36: dup
      37: iconst_0
      38: iload_2
      39: invokestatic  #53                 // Method java/lang/Integer.valueOf:(I)Ljava/lang/Integer;
      42: aastore
      43: invokevirtual #59                 // Method java/lang/reflect/Method.invoke:(Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;
      46: pop
      47: getstatic     #65                 // Field android/os/Build$VERSION.SDK_INT:I
      50: bipush        19
      52: if_icmpgt     75
      55: aload_0
      56: aload_0
      57: invokevirtual #71                 // Method android/app/ActionBar.getSubtitle:()Ljava/lang/CharSequence;
      60: invokevirtual #75                 // Method android/app/ActionBar.setSubtitle:(Ljava/lang/CharSequence;)V
      63: aload_3
      64: areturn
      65: astore_0
      66: ldc           #77                 // String ActionBarDrawerToggleHC
      68: ldc           #79                 // String Couldn't set content description via JB-MR2 API
      70: aload_0
      71: invokestatic  #85                 // Method android/util/Log.w:(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)I
      74: pop
      75: aload_3
      76: areturn
    Exception table:
       from    to  target type
          22    63    65   Class java/lang/Exception

  public static android.support.v7.app.c$a a(android.support.v7.app.c$a, android.app.Activity, android.graphics.drawable.Drawable, int);
    Code:
       0: new           #6                  // class android/support/v7/app/c$a
       3: dup
       4: aload_1
       5: invokespecial #37                 // Method android/support/v7/app/c$a."<init>":(Landroid/app/Activity;)V
       8: astore_0
       9: aload_0
      10: getfield      #40                 // Field android/support/v7/app/c$a.a:Ljava/lang/reflect/Method;
      13: ifnull        72
      16: aload_1
      17: invokevirtual #44                 // Method android/app/Activity.getActionBar:()Landroid/app/ActionBar;
      20: astore_1
      21: aload_0
      22: getfield      #40                 // Field android/support/v7/app/c$a.a:Ljava/lang/reflect/Method;
      25: aload_1
      26: iconst_1
      27: anewarray     #4                  // class java/lang/Object
      30: dup
      31: iconst_0
      32: aload_2
      33: aastore
      34: invokevirtual #59                 // Method java/lang/reflect/Method.invoke:(Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;
      37: pop
      38: aload_0
      39: getfield      #47                 // Field android/support/v7/app/c$a.b:Ljava/lang/reflect/Method;
      42: aload_1
      43: iconst_1
      44: anewarray     #4                  // class java/lang/Object
      47: dup
      48: iconst_0
      49: iload_3
      50: invokestatic  #53                 // Method java/lang/Integer.valueOf:(I)Ljava/lang/Integer;
      53: aastore
      54: invokevirtual #59                 // Method java/lang/reflect/Method.invoke:(Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;
      57: pop
      58: aload_0
      59: areturn
      60: astore_1
      61: ldc           #77                 // String ActionBarDrawerToggleHC
      63: ldc           #88                 // String Couldn't set home-as-up indicator via JB-MR2 API
      65: aload_1
      66: invokestatic  #85                 // Method android/util/Log.w:(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)I
      69: pop
      70: aload_0
      71: areturn
      72: aload_0
      73: getfield      #92                 // Field android/support/v7/app/c$a.c:Landroid/widget/ImageView;
      76: ifnull        89
      79: aload_0
      80: getfield      #92                 // Field android/support/v7/app/c$a.c:Landroid/widget/ImageView;
      83: aload_2
      84: invokevirtual #98                 // Method android/widget/ImageView.setImageDrawable:(Landroid/graphics/drawable/Drawable;)V
      87: aload_0
      88: areturn
      89: ldc           #77                 // String ActionBarDrawerToggleHC
      91: ldc           #100                // String Couldn't set home-as-up indicator
      93: invokestatic  #103                // Method android/util/Log.w:(Ljava/lang/String;Ljava/lang/String;)I
      96: pop
      97: aload_0
      98: areturn
    Exception table:
       from    to  target type
          16    58    60   Class java/lang/Exception
}
