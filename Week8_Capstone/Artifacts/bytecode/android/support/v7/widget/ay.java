public class android.support.v7.widget.ay extends android.support.v7.widget.aw implements android.support.v7.widget.ax {
  static {};
    Code:
       0: ldc           #18                 // class android/widget/PopupWindow
       2: ldc           #20                 // String setTouchModal
       4: iconst_1
       5: anewarray     #22                 // class java/lang/Class
       8: dup
       9: iconst_0
      10: getstatic     #28                 // Field java/lang/Boolean.TYPE:Ljava/lang/Class;
      13: aastore
      14: invokevirtual #32                 // Method java/lang/Class.getDeclaredMethod:(Ljava/lang/String;[Ljava/lang/Class;)Ljava/lang/reflect/Method;
      17: putstatic     #34                 // Field a:Ljava/lang/reflect/Method;
      20: return
      21: ldc           #36                 // String MenuPopupWindow
      23: ldc           #38                 // String Could not find method setTouchModal() on PopupWindow. Oh well.
      25: invokestatic  #44                 // Method android/util/Log.i:(Ljava/lang/String;Ljava/lang/String;)I
      28: pop
      29: return
      30: astore_0
      31: goto          21
    Exception table:
       from    to  target type
           0    20    30   Class java/lang/NoSuchMethodException

  public android.support.v7.widget.ay(android.content.Context, android.util.AttributeSet, int, int);
    Code:
       0: aload_0
       1: aload_1
       2: aload_2
       3: iload_3
       4: iload         4
       6: invokespecial #49                 // Method android/support/v7/widget/aw."<init>":(Landroid/content/Context;Landroid/util/AttributeSet;II)V
       9: return

  android.support.v7.widget.ap a(android.content.Context, boolean);
    Code:
       0: new           #8                  // class android/support/v7/widget/ay$a
       3: dup
       4: aload_1
       5: iload_2
       6: invokespecial #53                 // Method android/support/v7/widget/ay$a."<init>":(Landroid/content/Context;Z)V
       9: astore_1
      10: aload_1
      11: aload_0
      12: invokevirtual #57                 // Method android/support/v7/widget/ay$a.setHoverListener:(Landroid/support/v7/widget/ax;)V
      15: aload_1
      16: areturn

  public void a(android.support.v7.view.menu.h, android.view.MenuItem);
    Code:
       0: aload_0
       1: getfield      #60                 // Field b:Landroid/support/v7/widget/ax;
       4: ifnull        18
       7: aload_0
       8: getfield      #60                 // Field b:Landroid/support/v7/widget/ax;
      11: aload_1
      12: aload_2
      13: invokeinterface #62,  3           // InterfaceMethod android/support/v7/widget/ax.a:(Landroid/support/v7/view/menu/h;Landroid/view/MenuItem;)V
      18: return

  public void a(android.support.v7.widget.ax);
    Code:
       0: aload_0
       1: aload_1
       2: putfield      #60                 // Field b:Landroid/support/v7/widget/ax;
       5: return

  public void a(java.lang.Object);
    Code:
       0: getstatic     #69                 // Field android/os/Build$VERSION.SDK_INT:I
       3: bipush        23
       5: if_icmplt     19
       8: aload_0
       9: getfield      #73                 // Field g:Landroid/widget/PopupWindow;
      12: aload_1
      13: checkcast     #75                 // class android/transition/Transition
      16: invokevirtual #79                 // Method android/widget/PopupWindow.setEnterTransition:(Landroid/transition/Transition;)V
      19: return

  public void b(android.support.v7.view.menu.h, android.view.MenuItem);
    Code:
       0: aload_0
       1: getfield      #60                 // Field b:Landroid/support/v7/widget/ax;
       4: ifnull        18
       7: aload_0
       8: getfield      #60                 // Field b:Landroid/support/v7/widget/ax;
      11: aload_1
      12: aload_2
      13: invokeinterface #81,  3           // InterfaceMethod android/support/v7/widget/ax.b:(Landroid/support/v7/view/menu/h;Landroid/view/MenuItem;)V
      18: return

  public void b(java.lang.Object);
    Code:
       0: getstatic     #69                 // Field android/os/Build$VERSION.SDK_INT:I
       3: bipush        23
       5: if_icmplt     19
       8: aload_0
       9: getfield      #73                 // Field g:Landroid/widget/PopupWindow;
      12: aload_1
      13: checkcast     #75                 // class android/transition/Transition
      16: invokevirtual #84                 // Method android/widget/PopupWindow.setExitTransition:(Landroid/transition/Transition;)V
      19: return

  public void c(boolean);
    Code:
       0: getstatic     #34                 // Field a:Ljava/lang/reflect/Method;
       3: ifnull        37
       6: getstatic     #34                 // Field a:Ljava/lang/reflect/Method;
       9: aload_0
      10: getfield      #73                 // Field g:Landroid/widget/PopupWindow;
      13: iconst_1
      14: anewarray     #90                 // class java/lang/Object
      17: dup
      18: iconst_0
      19: iload_1
      20: invokestatic  #94                 // Method java/lang/Boolean.valueOf:(Z)Ljava/lang/Boolean;
      23: aastore
      24: invokevirtual #100                // Method java/lang/reflect/Method.invoke:(Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;
      27: pop
      28: return
      29: ldc           #36                 // String MenuPopupWindow
      31: ldc           #102                // String Could not invoke setTouchModal() on PopupWindow. Oh well.
      33: invokestatic  #44                 // Method android/util/Log.i:(Ljava/lang/String;Ljava/lang/String;)I
      36: pop
      37: return
      38: astore_2
      39: goto          29
    Exception table:
       from    to  target type
           6    28    38   Class java/lang/Exception
}
