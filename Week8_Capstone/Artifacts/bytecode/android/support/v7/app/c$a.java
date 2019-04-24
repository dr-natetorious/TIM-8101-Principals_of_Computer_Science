class android.support.v7.app.c$a {
  public java.lang.reflect.Method a;

  public java.lang.reflect.Method b;

  public android.widget.ImageView c;

  android.support.v7.app.c$a(android.app.Activity);
    Code:
       0: aload_0
       1: invokespecial #18                 // Method java/lang/Object."<init>":()V
       4: aload_0
       5: ldc           #20                 // class android/app/ActionBar
       7: ldc           #22                 // String setHomeAsUpIndicator
       9: iconst_1
      10: anewarray     #24                 // class java/lang/Class
      13: dup
      14: iconst_0
      15: ldc           #26                 // class android/graphics/drawable/Drawable
      17: aastore
      18: invokevirtual #30                 // Method java/lang/Class.getDeclaredMethod:(Ljava/lang/String;[Ljava/lang/Class;)Ljava/lang/reflect/Method;
      21: putfield      #32                 // Field a:Ljava/lang/reflect/Method;
      24: aload_0
      25: ldc           #20                 // class android/app/ActionBar
      27: ldc           #34                 // String setHomeActionContentDescription
      29: iconst_1
      30: anewarray     #24                 // class java/lang/Class
      33: dup
      34: iconst_0
      35: getstatic     #40                 // Field java/lang/Integer.TYPE:Ljava/lang/Class;
      38: aastore
      39: invokevirtual #30                 // Method java/lang/Class.getDeclaredMethod:(Ljava/lang/String;[Ljava/lang/Class;)Ljava/lang/reflect/Method;
      42: putfield      #42                 // Field b:Ljava/lang/reflect/Method;
      45: return
      46: aload_1
      47: ldc           #43                 // int 16908332
      49: invokevirtual #49                 // Method android/app/Activity.findViewById:(I)Landroid/view/View;
      52: astore_1
      53: aload_1
      54: ifnonnull     58
      57: return
      58: aload_1
      59: invokevirtual #55                 // Method android/view/View.getParent:()Landroid/view/ViewParent;
      62: checkcast     #57                 // class android/view/ViewGroup
      65: astore_2
      66: aload_2
      67: invokevirtual #61                 // Method android/view/ViewGroup.getChildCount:()I
      70: iconst_2
      71: if_icmpeq     75
      74: return
      75: aload_2
      76: iconst_0
      77: invokevirtual #64                 // Method android/view/ViewGroup.getChildAt:(I)Landroid/view/View;
      80: astore_1
      81: aload_2
      82: iconst_1
      83: invokevirtual #64                 // Method android/view/ViewGroup.getChildAt:(I)Landroid/view/View;
      86: astore_2
      87: aload_1
      88: invokevirtual #67                 // Method android/view/View.getId:()I
      91: ldc           #43                 // int 16908332
      93: if_icmpne     101
      96: aload_2
      97: astore_1
      98: goto          101
     101: aload_1
     102: instanceof    #69                 // class android/widget/ImageView
     105: ifeq          116
     108: aload_0
     109: aload_1
     110: checkcast     #69                 // class android/widget/ImageView
     113: putfield      #71                 // Field c:Landroid/widget/ImageView;
     116: return
     117: astore_2
     118: goto          46
    Exception table:
       from    to  target type
           4    45   117   Class java/lang/NoSuchMethodException
}
