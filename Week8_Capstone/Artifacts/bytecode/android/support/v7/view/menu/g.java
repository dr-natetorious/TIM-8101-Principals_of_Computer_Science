public class android.support.v7.view.menu.g extends android.widget.BaseAdapter {
  static final int a;

  android.support.v7.view.menu.h b;

  static {};
    Code:
       0: getstatic     #21                 // Field android/support/v7/a/a$g.abc_popup_menu_item_layout:I
       3: putstatic     #23                 // Field a:I
       6: return

  public android.support.v7.view.menu.g(android.support.v7.view.menu.h, android.view.LayoutInflater, boolean);
    Code:
       0: aload_0
       1: invokespecial #28                 // Method android/widget/BaseAdapter."<init>":()V
       4: aload_0
       5: iconst_m1
       6: putfield      #30                 // Field c:I
       9: aload_0
      10: iload_3
      11: putfield      #32                 // Field e:Z
      14: aload_0
      15: aload_2
      16: putfield      #34                 // Field f:Landroid/view/LayoutInflater;
      19: aload_0
      20: aload_1
      21: putfield      #36                 // Field b:Landroid/support/v7/view/menu/h;
      24: aload_0
      25: invokevirtual #38                 // Method b:()V
      28: return

  public android.support.v7.view.menu.h a();
    Code:
       0: aload_0
       1: getfield      #36                 // Field b:Landroid/support/v7/view/menu/h;
       4: areturn

  public android.support.v7.view.menu.j a(int);
    Code:
       0: aload_0
       1: getfield      #32                 // Field e:Z
       4: ifeq          18
       7: aload_0
       8: getfield      #36                 // Field b:Landroid/support/v7/view/menu/h;
      11: invokevirtual #46                 // Method android/support/v7/view/menu/h.l:()Ljava/util/ArrayList;
      14: astore_3
      15: goto          26
      18: aload_0
      19: getfield      #36                 // Field b:Landroid/support/v7/view/menu/h;
      22: invokevirtual #49                 // Method android/support/v7/view/menu/h.i:()Ljava/util/ArrayList;
      25: astore_3
      26: iload_1
      27: istore_2
      28: aload_0
      29: getfield      #30                 // Field c:I
      32: iflt          49
      35: iload_1
      36: istore_2
      37: iload_1
      38: aload_0
      39: getfield      #30                 // Field c:I
      42: if_icmplt     49
      45: iload_1
      46: iconst_1
      47: iadd
      48: istore_2
      49: aload_3
      50: iload_2
      51: invokevirtual #55                 // Method java/util/ArrayList.get:(I)Ljava/lang/Object;
      54: checkcast     #57                 // class android/support/v7/view/menu/j
      57: areturn

  public void a(boolean);
    Code:
       0: aload_0
       1: iload_1
       2: putfield      #60                 // Field d:Z
       5: return

  void b();
    Code:
       0: aload_0
       1: getfield      #36                 // Field b:Landroid/support/v7/view/menu/h;
       4: invokevirtual #64                 // Method android/support/v7/view/menu/h.r:()Landroid/support/v7/view/menu/j;
       7: astore_3
       8: aload_3
       9: ifnull        60
      12: aload_0
      13: getfield      #36                 // Field b:Landroid/support/v7/view/menu/h;
      16: invokevirtual #46                 // Method android/support/v7/view/menu/h.l:()Ljava/util/ArrayList;
      19: astore        4
      21: aload         4
      23: invokevirtual #68                 // Method java/util/ArrayList.size:()I
      26: istore_2
      27: iconst_0
      28: istore_1
      29: iload_1
      30: iload_2
      31: if_icmpge     60
      34: aload         4
      36: iload_1
      37: invokevirtual #55                 // Method java/util/ArrayList.get:(I)Ljava/lang/Object;
      40: checkcast     #57                 // class android/support/v7/view/menu/j
      43: aload_3
      44: if_acmpne     53
      47: aload_0
      48: iload_1
      49: putfield      #30                 // Field c:I
      52: return
      53: iload_1
      54: iconst_1
      55: iadd
      56: istore_1
      57: goto          29
      60: aload_0
      61: iconst_m1
      62: putfield      #30                 // Field c:I
      65: return

  public int getCount();
    Code:
       0: aload_0
       1: getfield      #32                 // Field e:Z
       4: ifeq          18
       7: aload_0
       8: getfield      #36                 // Field b:Landroid/support/v7/view/menu/h;
      11: invokevirtual #46                 // Method android/support/v7/view/menu/h.l:()Ljava/util/ArrayList;
      14: astore_1
      15: goto          26
      18: aload_0
      19: getfield      #36                 // Field b:Landroid/support/v7/view/menu/h;
      22: invokevirtual #49                 // Method android/support/v7/view/menu/h.i:()Ljava/util/ArrayList;
      25: astore_1
      26: aload_0
      27: getfield      #30                 // Field c:I
      30: ifge          38
      33: aload_1
      34: invokevirtual #68                 // Method java/util/ArrayList.size:()I
      37: ireturn
      38: aload_1
      39: invokevirtual #68                 // Method java/util/ArrayList.size:()I
      42: iconst_1
      43: isub
      44: ireturn

  public java.lang.Object getItem(int);
    Code:
       0: aload_0
       1: iload_1
       2: invokevirtual #72                 // Method a:(I)Landroid/support/v7/view/menu/j;
       5: areturn

  public long getItemId(int);
    Code:
       0: iload_1
       1: i2l
       2: lreturn

  public android.view.View getView(int, android.view.View, android.view.ViewGroup);
    Code:
       0: aload_2
       1: astore        4
       3: aload_2
       4: ifnonnull     21
       7: aload_0
       8: getfield      #34                 // Field f:Landroid/view/LayoutInflater;
      11: getstatic     #23                 // Field a:I
      14: aload_3
      15: iconst_0
      16: invokevirtual #82                 // Method android/view/LayoutInflater.inflate:(ILandroid/view/ViewGroup;Z)Landroid/view/View;
      19: astore        4
      21: aload         4
      23: checkcast     #84                 // class android/support/v7/view/menu/p$a
      26: astore_2
      27: aload_0
      28: getfield      #60                 // Field d:Z
      31: ifeq          43
      34: aload         4
      36: checkcast     #86                 // class android/support/v7/view/menu/ListMenuItemView
      39: iconst_1
      40: invokevirtual #89                 // Method android/support/v7/view/menu/ListMenuItemView.setForceShowIcon:(Z)V
      43: aload_2
      44: aload_0
      45: iload_1
      46: invokevirtual #72                 // Method a:(I)Landroid/support/v7/view/menu/j;
      49: iconst_0
      50: invokeinterface #92,  3           // InterfaceMethod android/support/v7/view/menu/p$a.a:(Landroid/support/v7/view/menu/j;I)V
      55: aload         4
      57: areturn

  public void notifyDataSetChanged();
    Code:
       0: aload_0
       1: invokevirtual #38                 // Method b:()V
       4: aload_0
       5: invokespecial #95                 // Method android/widget/BaseAdapter.notifyDataSetChanged:()V
       8: return
}
