class android.support.v7.widget.bh$a extends android.widget.BaseAdapter {
  final android.support.v7.widget.bh a;

  android.support.v7.widget.bh$a(android.support.v7.widget.bh);
    Code:
       0: aload_0
       1: aload_1
       2: putfield      #12                 // Field a:Landroid/support/v7/widget/bh;
       5: aload_0
       6: invokespecial #15                 // Method android/widget/BaseAdapter."<init>":()V
       9: return

  public int getCount();
    Code:
       0: aload_0
       1: getfield      #12                 // Field a:Landroid/support/v7/widget/bh;
       4: getfield      #22                 // Field android/support/v7/widget/bh.b:Landroid/support/v7/widget/av;
       7: invokevirtual #27                 // Method android/support/v7/widget/av.getChildCount:()I
      10: ireturn

  public java.lang.Object getItem(int);
    Code:
       0: aload_0
       1: getfield      #12                 // Field a:Landroid/support/v7/widget/bh;
       4: getfield      #22                 // Field android/support/v7/widget/bh.b:Landroid/support/v7/widget/av;
       7: iload_1
       8: invokevirtual #33                 // Method android/support/v7/widget/av.getChildAt:(I)Landroid/view/View;
      11: checkcast     #35                 // class android/support/v7/widget/bh$c
      14: invokevirtual #38                 // Method android/support/v7/widget/bh$c.b:()Landroid/support/v7/app/a$c;
      17: areturn

  public long getItemId(int);
    Code:
       0: iload_1
       1: i2l
       2: lreturn

  public android.view.View getView(int, android.view.View, android.view.ViewGroup);
    Code:
       0: aload_2
       1: ifnonnull     21
       4: aload_0
       5: getfield      #12                 // Field a:Landroid/support/v7/widget/bh;
       8: aload_0
       9: iload_1
      10: invokevirtual #44                 // Method getItem:(I)Ljava/lang/Object;
      13: checkcast     #46                 // class android/support/v7/app/a$c
      16: iconst_1
      17: invokevirtual #49                 // Method android/support/v7/widget/bh.a:(Landroid/support/v7/app/a$c;Z)Landroid/support/v7/widget/bh$c;
      20: areturn
      21: aload_2
      22: checkcast     #35                 // class android/support/v7/widget/bh$c
      25: aload_0
      26: iload_1
      27: invokevirtual #44                 // Method getItem:(I)Ljava/lang/Object;
      30: checkcast     #46                 // class android/support/v7/app/a$c
      33: invokevirtual #52                 // Method android/support/v7/widget/bh$c.a:(Landroid/support/v7/app/a$c;)V
      36: aload_2
      37: areturn
}
