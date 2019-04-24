class android.support.v7.view.menu.f$a extends android.widget.BaseAdapter {
  final android.support.v7.view.menu.f a;

  public android.support.v7.view.menu.f$a(android.support.v7.view.menu.f);
    Code:
       0: aload_0
       1: aload_1
       2: putfield      #14                 // Field a:Landroid/support/v7/view/menu/f;
       5: aload_0
       6: invokespecial #17                 // Method android/widget/BaseAdapter."<init>":()V
       9: aload_0
      10: iconst_m1
      11: putfield      #19                 // Field b:I
      14: aload_0
      15: invokevirtual #21                 // Method a:()V
      18: return

  public android.support.v7.view.menu.j a(int);
    Code:
       0: aload_0
       1: getfield      #14                 // Field a:Landroid/support/v7/view/menu/f;
       4: getfield      #27                 // Field android/support/v7/view/menu/f.c:Landroid/support/v7/view/menu/h;
       7: invokevirtual #33                 // Method android/support/v7/view/menu/h.l:()Ljava/util/ArrayList;
      10: astore_3
      11: iload_1
      12: aload_0
      13: getfield      #14                 // Field a:Landroid/support/v7/view/menu/f;
      16: getfield      #36                 // Field android/support/v7/view/menu/f.e:I
      19: iadd
      20: istore_2
      21: iload_2
      22: istore_1
      23: aload_0
      24: getfield      #19                 // Field b:I
      27: iflt          44
      30: iload_2
      31: istore_1
      32: iload_2
      33: aload_0
      34: getfield      #19                 // Field b:I
      37: if_icmplt     44
      40: iload_2
      41: iconst_1
      42: iadd
      43: istore_1
      44: aload_3
      45: iload_1
      46: invokevirtual #42                 // Method java/util/ArrayList.get:(I)Ljava/lang/Object;
      49: checkcast     #44                 // class android/support/v7/view/menu/j
      52: areturn

  void a();
    Code:
       0: aload_0
       1: getfield      #14                 // Field a:Landroid/support/v7/view/menu/f;
       4: getfield      #27                 // Field android/support/v7/view/menu/f.c:Landroid/support/v7/view/menu/h;
       7: invokevirtual #48                 // Method android/support/v7/view/menu/h.r:()Landroid/support/v7/view/menu/j;
      10: astore_3
      11: aload_3
      12: ifnull        66
      15: aload_0
      16: getfield      #14                 // Field a:Landroid/support/v7/view/menu/f;
      19: getfield      #27                 // Field android/support/v7/view/menu/f.c:Landroid/support/v7/view/menu/h;
      22: invokevirtual #33                 // Method android/support/v7/view/menu/h.l:()Ljava/util/ArrayList;
      25: astore        4
      27: aload         4
      29: invokevirtual #52                 // Method java/util/ArrayList.size:()I
      32: istore_2
      33: iconst_0
      34: istore_1
      35: iload_1
      36: iload_2
      37: if_icmpge     66
      40: aload         4
      42: iload_1
      43: invokevirtual #42                 // Method java/util/ArrayList.get:(I)Ljava/lang/Object;
      46: checkcast     #44                 // class android/support/v7/view/menu/j
      49: aload_3
      50: if_acmpne     59
      53: aload_0
      54: iload_1
      55: putfield      #19                 // Field b:I
      58: return
      59: iload_1
      60: iconst_1
      61: iadd
      62: istore_1
      63: goto          35
      66: aload_0
      67: iconst_m1
      68: putfield      #19                 // Field b:I
      71: return

  public int getCount();
    Code:
       0: aload_0
       1: getfield      #14                 // Field a:Landroid/support/v7/view/menu/f;
       4: getfield      #27                 // Field android/support/v7/view/menu/f.c:Landroid/support/v7/view/menu/h;
       7: invokevirtual #33                 // Method android/support/v7/view/menu/h.l:()Ljava/util/ArrayList;
      10: invokevirtual #52                 // Method java/util/ArrayList.size:()I
      13: aload_0
      14: getfield      #14                 // Field a:Landroid/support/v7/view/menu/f;
      17: getfield      #36                 // Field android/support/v7/view/menu/f.e:I
      20: isub
      21: istore_1
      22: aload_0
      23: getfield      #19                 // Field b:I
      26: ifge          31
      29: iload_1
      30: ireturn
      31: iload_1
      32: iconst_1
      33: isub
      34: ireturn

  public java.lang.Object getItem(int);
    Code:
       0: aload_0
       1: iload_1
       2: invokevirtual #56                 // Method a:(I)Landroid/support/v7/view/menu/j;
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
       4: ifnonnull     28
       7: aload_0
       8: getfield      #14                 // Field a:Landroid/support/v7/view/menu/f;
      11: getfield      #63                 // Field android/support/v7/view/menu/f.b:Landroid/view/LayoutInflater;
      14: aload_0
      15: getfield      #14                 // Field a:Landroid/support/v7/view/menu/f;
      18: getfield      #66                 // Field android/support/v7/view/menu/f.g:I
      21: aload_3
      22: iconst_0
      23: invokevirtual #72                 // Method android/view/LayoutInflater.inflate:(ILandroid/view/ViewGroup;Z)Landroid/view/View;
      26: astore        4
      28: aload         4
      30: checkcast     #74                 // class android/support/v7/view/menu/p$a
      33: aload_0
      34: iload_1
      35: invokevirtual #56                 // Method a:(I)Landroid/support/v7/view/menu/j;
      38: iconst_0
      39: invokeinterface #77,  3           // InterfaceMethod android/support/v7/view/menu/p$a.a:(Landroid/support/v7/view/menu/j;I)V
      44: aload         4
      46: areturn

  public void notifyDataSetChanged();
    Code:
       0: aload_0
       1: invokevirtual #21                 // Method a:()V
       4: aload_0
       5: invokespecial #80                 // Method android/widget/BaseAdapter.notifyDataSetChanged:()V
       8: return
}
