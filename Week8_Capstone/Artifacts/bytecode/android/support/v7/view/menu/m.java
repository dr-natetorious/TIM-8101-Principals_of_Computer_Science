abstract class android.support.v7.view.menu.m implements android.support.v7.view.menu.o,android.support.v7.view.menu.s,android.widget.AdapterView$OnItemClickListener {
  android.support.v7.view.menu.m();
    Code:
       0: aload_0
       1: invokespecial #16                 // Method java/lang/Object."<init>":()V
       4: return

  protected static int a(android.widget.ListAdapter, android.view.ViewGroup, android.content.Context, int);
    Code:
       0: iconst_0
       1: istore        4
       3: iconst_0
       4: iconst_0
       5: invokestatic  #24                 // Method android/view/View$MeasureSpec.makeMeasureSpec:(II)I
       8: istore        9
      10: iconst_0
      11: iconst_0
      12: invokestatic  #24                 // Method android/view/View$MeasureSpec.makeMeasureSpec:(II)I
      15: istore        10
      17: aload_0
      18: invokeinterface #30,  1           // InterfaceMethod android/widget/ListAdapter.getCount:()I
      23: istore        11
      25: aload_1
      26: astore        12
      28: aconst_null
      29: astore_1
      30: iconst_0
      31: istore        7
      33: iconst_0
      34: istore        5
      36: iload         4
      38: iload         11
      40: if_icmpge     159
      43: aload_0
      44: iload         4
      46: invokeinterface #34,  2           // InterfaceMethod android/widget/ListAdapter.getItemViewType:(I)I
      51: istore        8
      53: iload         7
      55: istore        6
      57: iload         8
      59: iload         7
      61: if_icmpeq     70
      64: aconst_null
      65: astore_1
      66: iload         8
      68: istore        6
      70: aload         12
      72: astore        13
      74: aload         12
      76: ifnonnull     89
      79: new           #36                 // class android/widget/FrameLayout
      82: dup
      83: aload_2
      84: invokespecial #39                 // Method android/widget/FrameLayout."<init>":(Landroid/content/Context;)V
      87: astore        13
      89: aload_0
      90: iload         4
      92: aload_1
      93: aload         13
      95: invokeinterface #43,  4           // InterfaceMethod android/widget/ListAdapter.getView:(ILandroid/view/View;Landroid/view/ViewGroup;)Landroid/view/View;
     100: astore_1
     101: aload_1
     102: iload         9
     104: iload         10
     106: invokevirtual #49                 // Method android/view/View.measure:(II)V
     109: aload_1
     110: invokevirtual #52                 // Method android/view/View.getMeasuredWidth:()I
     113: istore        8
     115: iload         8
     117: iload_3
     118: if_icmplt     123
     121: iload_3
     122: ireturn
     123: iload         5
     125: istore        7
     127: iload         8
     129: iload         5
     131: if_icmple     138
     134: iload         8
     136: istore        7
     138: iload         4
     140: iconst_1
     141: iadd
     142: istore        4
     144: iload         7
     146: istore        5
     148: aload         13
     150: astore        12
     152: iload         6
     154: istore        7
     156: goto          36
     159: iload         5
     161: ireturn

  protected static android.support.v7.view.menu.g a(android.widget.ListAdapter);
    Code:
       0: aload_0
       1: instanceof    #55                 // class android/widget/HeaderViewListAdapter
       4: ifeq          18
       7: aload_0
       8: checkcast     #55                 // class android/widget/HeaderViewListAdapter
      11: invokevirtual #59                 // Method android/widget/HeaderViewListAdapter.getWrappedAdapter:()Landroid/widget/ListAdapter;
      14: checkcast     #61                 // class android/support/v7/view/menu/g
      17: areturn
      18: aload_0
      19: checkcast     #61                 // class android/support/v7/view/menu/g
      22: areturn

  protected static boolean b(android.support.v7.view.menu.h);
    Code:
       0: aload_0
       1: invokevirtual #68                 // Method android/support/v7/view/menu/h.size:()I
       4: istore_2
       5: iconst_0
       6: istore_1
       7: iload_1
       8: iload_2
       9: if_icmpge     45
      12: aload_0
      13: iload_1
      14: invokevirtual #72                 // Method android/support/v7/view/menu/h.getItem:(I)Landroid/view/MenuItem;
      17: astore_3
      18: aload_3
      19: invokeinterface #78,  1           // InterfaceMethod android/view/MenuItem.isVisible:()Z
      24: ifeq          38
      27: aload_3
      28: invokeinterface #82,  1           // InterfaceMethod android/view/MenuItem.getIcon:()Landroid/graphics/drawable/Drawable;
      33: ifnull        38
      36: iconst_1
      37: ireturn
      38: iload_1
      39: iconst_1
      40: iadd
      41: istore_1
      42: goto          7
      45: iconst_0
      46: ireturn

  public abstract void a(int);

  public void a(android.content.Context, android.support.v7.view.menu.h);
    Code:
       0: return

  public void a(android.graphics.Rect);
    Code:
       0: aload_0
       1: aload_1
       2: putfield      #87                 // Field a:Landroid/graphics/Rect;
       5: return

  public abstract void a(android.support.v7.view.menu.h);

  public abstract void a(android.view.View);

  public abstract void a(android.widget.PopupWindow$OnDismissListener);

  public boolean a(android.support.v7.view.menu.h, android.support.v7.view.menu.j);
    Code:
       0: iconst_0
       1: ireturn

  public int b();
    Code:
       0: iconst_0
       1: ireturn

  public abstract void b(int);

  public abstract void b(boolean);

  public boolean b(android.support.v7.view.menu.h, android.support.v7.view.menu.j);
    Code:
       0: iconst_0
       1: ireturn

  public abstract void c(int);

  public abstract void c(boolean);

  protected boolean h();
    Code:
       0: iconst_1
       1: ireturn

  public android.graphics.Rect i();
    Code:
       0: aload_0
       1: getfield      #87                 // Field a:Landroid/graphics/Rect;
       4: areturn

  public void onItemClick(android.widget.AdapterView<?>, android.view.View, int, long);
    Code:
       0: aload_1
       1: invokevirtual #104                // Method android/widget/AdapterView.getAdapter:()Landroid/widget/Adapter;
       4: checkcast     #26                 // class android/widget/ListAdapter
       7: astore_2
       8: aload_2
       9: invokestatic  #106                // Method a:(Landroid/widget/ListAdapter;)Landroid/support/v7/view/menu/g;
      12: getfield      #109                // Field android/support/v7/view/menu/g.b:Landroid/support/v7/view/menu/h;
      15: astore_1
      16: aload_2
      17: iload_3
      18: invokeinterface #112,  2          // InterfaceMethod android/widget/ListAdapter.getItem:(I)Ljava/lang/Object;
      23: checkcast     #74                 // class android/view/MenuItem
      26: astore_2
      27: aload_0
      28: invokevirtual #114                // Method h:()Z
      31: ifeq          39
      34: iconst_0
      35: istore_3
      36: goto          41
      39: iconst_4
      40: istore_3
      41: aload_1
      42: aload_2
      43: aload_0
      44: iload_3
      45: invokevirtual #117                // Method android/support/v7/view/menu/h.a:(Landroid/view/MenuItem;Landroid/support/v7/view/menu/o;I)Z
      48: pop
      49: return
}
