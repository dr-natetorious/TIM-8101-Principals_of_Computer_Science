class android.support.v4.widget.k$d {
  android.support.v4.widget.k$d();
    Code:
       0: aload_0
       1: invokespecial #15                 // Method java/lang/Object."<init>":()V
       4: return

  public void a(android.widget.PopupWindow, int);
    Code:
       0: getstatic     #21                 // Field b:Z
       3: ifne          37
       6: ldc           #23                 // class android/widget/PopupWindow
       8: ldc           #25                 // String setWindowLayoutType
      10: iconst_1
      11: anewarray     #27                 // class java/lang/Class
      14: dup
      15: iconst_0
      16: getstatic     #33                 // Field java/lang/Integer.TYPE:Ljava/lang/Class;
      19: aastore
      20: invokevirtual #37                 // Method java/lang/Class.getDeclaredMethod:(Ljava/lang/String;[Ljava/lang/Class;)Ljava/lang/reflect/Method;
      23: putstatic     #39                 // Field a:Ljava/lang/reflect/Method;
      26: getstatic     #39                 // Field a:Ljava/lang/reflect/Method;
      29: iconst_1
      30: invokevirtual #45                 // Method java/lang/reflect/Method.setAccessible:(Z)V
      33: iconst_1
      34: putstatic     #21                 // Field b:Z
      37: getstatic     #39                 // Field a:Ljava/lang/reflect/Method;
      40: ifnull        62
      43: getstatic     #39                 // Field a:Ljava/lang/reflect/Method;
      46: aload_1
      47: iconst_1
      48: anewarray     #4                  // class java/lang/Object
      51: dup
      52: iconst_0
      53: iload_2
      54: invokestatic  #49                 // Method java/lang/Integer.valueOf:(I)Ljava/lang/Integer;
      57: aastore
      58: invokevirtual #53                 // Method java/lang/reflect/Method.invoke:(Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;
      61: pop
      62: return
      63: astore_3
      64: goto          33
      67: astore_1
      68: return
    Exception table:
       from    to  target type
           6    33    63   Class java/lang/Exception
          43    62    67   Class java/lang/Exception

  public void a(android.widget.PopupWindow, android.view.View, int, int, int);
    Code:
       0: iload_3
       1: istore        6
       3: iload         5
       5: aload_2
       6: invokestatic  #60                 // Method android/support/v4/view/s.e:(Landroid/view/View;)I
       9: invokestatic  #65                 // Method android/support/v4/view/e.a:(II)I
      12: bipush        7
      14: iand
      15: iconst_5
      16: if_icmpne     32
      19: iload_3
      20: aload_1
      21: invokevirtual #69                 // Method android/widget/PopupWindow.getWidth:()I
      24: aload_2
      25: invokevirtual #72                 // Method android/view/View.getWidth:()I
      28: isub
      29: isub
      30: istore        6
      32: aload_1
      33: aload_2
      34: iload         6
      36: iload         4
      38: invokevirtual #76                 // Method android/widget/PopupWindow.showAsDropDown:(Landroid/view/View;II)V
      41: return

  public void a(android.widget.PopupWindow, boolean);
    Code:
       0: return
}
