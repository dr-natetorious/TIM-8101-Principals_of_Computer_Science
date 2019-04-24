class se.emilsjolander.stickylistheaders.g extends android.widget.ListView {
  public se.emilsjolander.stickylistheaders.g(android.content.Context);
    Code:
       0: aload_0
       1: aload_1
       2: invokespecial #30                 // Method android/widget/ListView."<init>":(Landroid/content/Context;)V
       5: aload_0
       6: new           #32                 // class android/graphics/Rect
       9: dup
      10: invokespecial #35                 // Method android/graphics/Rect."<init>":()V
      13: putfield      #37                 // Field d:Landroid/graphics/Rect;
      16: aload_0
      17: iconst_1
      18: putfield      #39                 // Field f:Z
      21: aload_0
      22: iconst_0
      23: putfield      #41                 // Field g:Z
      26: ldc           #43                 // class android/widget/AbsListView
      28: ldc           #45                 // String mSelectorRect
      30: invokevirtual #51                 // Method java/lang/Class.getDeclaredField:(Ljava/lang/String;)Ljava/lang/reflect/Field;
      33: astore_1
      34: aload_1
      35: iconst_1
      36: invokevirtual #57                 // Method java/lang/reflect/Field.setAccessible:(Z)V
      39: aload_0
      40: aload_1
      41: aload_0
      42: invokevirtual #61                 // Method java/lang/reflect/Field.get:(Ljava/lang/Object;)Ljava/lang/Object;
      45: checkcast     #32                 // class android/graphics/Rect
      48: putfield      #37                 // Field d:Landroid/graphics/Rect;
      51: getstatic     #66                 // Field android/os/Build$VERSION.SDK_INT:I
      54: bipush        14
      56: if_icmplt     84
      59: aload_0
      60: ldc           #43                 // class android/widget/AbsListView
      62: ldc           #68                 // String mSelectorPosition
      64: invokevirtual #51                 // Method java/lang/Class.getDeclaredField:(Ljava/lang/String;)Ljava/lang/reflect/Field;
      67: putfield      #70                 // Field e:Ljava/lang/reflect/Field;
      70: aload_0
      71: getfield      #70                 // Field e:Ljava/lang/reflect/Field;
      74: iconst_1
      75: invokevirtual #57                 // Method java/lang/reflect/Field.setAccessible:(Z)V
      78: return
      79: astore_1
      80: aload_1
      81: invokestatic  #75                 // Method com/google/a/a/a/a/a/a.a:(Ljava/lang/Throwable;)V
      84: return
    Exception table:
       from    to  target type
          26    78    79   Class java/lang/NoSuchFieldException
          26    78    79   Class java/lang/IllegalArgumentException
          26    78    79   Class java/lang/IllegalAccessException

  int a();
    Code:
       0: aload_0
       1: invokevirtual #129                // Method getFirstVisiblePosition:()I
       4: istore_3
       5: getstatic     #66                 // Field android/os/Build$VERSION.SDK_INT:I
       8: bipush        11
      10: if_icmplt     15
      13: iload_3
      14: ireturn
      15: iconst_0
      16: istore_2
      17: iload_3
      18: istore_1
      19: iload_2
      20: aload_0
      21: invokevirtual #114                // Method getChildCount:()I
      24: if_icmpge     52
      27: aload_0
      28: iload_2
      29: invokevirtual #89                 // Method getChildAt:(I)Landroid/view/View;
      32: invokevirtual #119                // Method android/view/View.getBottom:()I
      35: iflt          45
      38: iload_3
      39: iload_2
      40: iadd
      41: istore_1
      42: goto          52
      45: iload_2
      46: iconst_1
      47: iadd
      48: istore_2
      49: goto          17
      52: iload_1
      53: istore_2
      54: aload_0
      55: getfield      #39                 // Field f:Z
      58: ifne          93
      61: iload_1
      62: istore_2
      63: aload_0
      64: invokevirtual #132                // Method getPaddingTop:()I
      67: ifle          93
      70: iload_1
      71: istore_2
      72: iload_1
      73: ifle          93
      76: iload_1
      77: istore_2
      78: aload_0
      79: iconst_0
      80: invokevirtual #89                 // Method getChildAt:(I)Landroid/view/View;
      83: invokevirtual #133                // Method android/view/View.getTop:()I
      86: ifle          93
      89: iload_1
      90: iconst_1
      91: isub
      92: istore_2
      93: iload_2
      94: ireturn

  void a(int);
    Code:
       0: aload_0
       1: iload_1
       2: putfield      #136                // Field c:I
       5: return

  void a(se.emilsjolander.stickylistheaders.g$a);
    Code:
       0: aload_0
       1: aload_1
       2: putfield      #139                // Field a:Lse/emilsjolander/stickylistheaders/g$a;
       5: return

  public void a(boolean);
    Code:
       0: aload_0
       1: iload_1
       2: putfield      #41                 // Field g:Z
       5: return

  boolean a(android.view.View);
    Code:
       0: aload_0
       1: getfield      #102                // Field b:Ljava/util/List;
       4: ifnonnull     9
       7: iconst_0
       8: ireturn
       9: aload_0
      10: getfield      #102                // Field b:Ljava/util/List;
      13: aload_1
      14: invokeinterface #143,  2          // InterfaceMethod java/util/List.contains:(Ljava/lang/Object;)Z
      19: ireturn

  public void addFooterView(android.view.View);
    Code:
       0: aload_0
       1: aload_1
       2: invokespecial #146                // Method android/widget/ListView.addFooterView:(Landroid/view/View;)V
       5: aload_0
       6: aload_1
       7: invokespecial #148                // Method b:(Landroid/view/View;)V
      10: return

  public void addFooterView(android.view.View, java.lang.Object, boolean);
    Code:
       0: aload_0
       1: aload_1
       2: aload_2
       3: iload_3
       4: invokespecial #151                // Method android/widget/ListView.addFooterView:(Landroid/view/View;Ljava/lang/Object;Z)V
       7: aload_0
       8: aload_1
       9: invokespecial #148                // Method b:(Landroid/view/View;)V
      12: return

  protected void dispatchDraw(android.graphics.Canvas);
    Code:
       0: aload_0
       1: invokespecial #155                // Method b:()V
       4: aload_0
       5: getfield      #136                // Field c:I
       8: ifeq          47
      11: aload_1
      12: invokevirtual #160                // Method android/graphics/Canvas.save:()I
      15: pop
      16: aload_1
      17: invokevirtual #164                // Method android/graphics/Canvas.getClipBounds:()Landroid/graphics/Rect;
      20: astore_2
      21: aload_2
      22: aload_0
      23: getfield      #136                // Field c:I
      26: putfield      #99                 // Field android/graphics/Rect.top:I
      29: aload_1
      30: aload_2
      31: invokevirtual #168                // Method android/graphics/Canvas.clipRect:(Landroid/graphics/Rect;)Z
      34: pop
      35: aload_0
      36: aload_1
      37: invokespecial #170                // Method android/widget/ListView.dispatchDraw:(Landroid/graphics/Canvas;)V
      40: aload_1
      41: invokevirtual #173                // Method android/graphics/Canvas.restore:()V
      44: goto          52
      47: aload_0
      48: aload_1
      49: invokespecial #170                // Method android/widget/ListView.dispatchDraw:(Landroid/graphics/Canvas;)V
      52: aload_0
      53: getfield      #139                // Field a:Lse/emilsjolander/stickylistheaders/g$a;
      56: aload_1
      57: invokeinterface #175,  2          // InterfaceMethod se/emilsjolander/stickylistheaders/g$a.a:(Landroid/graphics/Canvas;)V
      62: return

  protected void layoutChildren();
    Code:
       0: aload_0
       1: getfield      #41                 // Field g:Z
       4: ifne          11
       7: aload_0
       8: invokespecial #178                // Method android/widget/ListView.layoutChildren:()V
      11: return

  public boolean performItemClick(android.view.View, int, long);
    Code:
       0: aload_1
       1: astore        5
       3: aload_1
       4: instanceof    #91                 // class se/emilsjolander/stickylistheaders/f
       7: ifeq          19
      10: aload_1
      11: checkcast     #91                 // class se/emilsjolander/stickylistheaders/f
      14: getfield      #183                // Field se/emilsjolander/stickylistheaders/f.a:Landroid/view/View;
      17: astore        5
      19: aload_0
      20: aload         5
      22: iload_2
      23: lload_3
      24: invokespecial #185                // Method android/widget/ListView.performItemClick:(Landroid/view/View;IJ)Z
      27: ireturn

  public boolean removeFooterView(android.view.View);
    Code:
       0: aload_0
       1: aload_1
       2: invokespecial #188                // Method android/widget/ListView.removeFooterView:(Landroid/view/View;)Z
       5: ifeq          21
       8: aload_0
       9: getfield      #102                // Field b:Ljava/util/List;
      12: aload_1
      13: invokeinterface #191,  2          // InterfaceMethod java/util/List.remove:(Ljava/lang/Object;)Z
      18: pop
      19: iconst_1
      20: ireturn
      21: iconst_0
      22: ireturn

  public void setClipToPadding(boolean);
    Code:
       0: aload_0
       1: iload_1
       2: putfield      #39                 // Field f:Z
       5: aload_0
       6: iload_1
       7: invokespecial #194                // Method android/widget/ListView.setClipToPadding:(Z)V
      10: return
}
