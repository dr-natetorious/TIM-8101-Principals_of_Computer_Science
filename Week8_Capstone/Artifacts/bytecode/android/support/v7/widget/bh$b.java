class android.support.v7.widget.bh$b implements android.view.View$OnClickListener {
  final android.support.v7.widget.bh a;

  android.support.v7.widget.bh$b(android.support.v7.widget.bh);
    Code:
       0: aload_0
       1: aload_1
       2: putfield      #15                 // Field a:Landroid/support/v7/widget/bh;
       5: aload_0
       6: invokespecial #18                 // Method java/lang/Object."<init>":()V
       9: return

  public void onClick(android.view.View);
    Code:
       0: aload_1
       1: checkcast     #23                 // class android/support/v7/widget/bh$c
       4: invokevirtual #26                 // Method android/support/v7/widget/bh$c.b:()Landroid/support/v7/app/a$c;
       7: invokevirtual #31                 // Method android/support/v7/app/a$c.d:()V
      10: aload_0
      11: getfield      #15                 // Field a:Landroid/support/v7/widget/bh;
      14: getfield      #34                 // Field android/support/v7/widget/bh.b:Landroid/support/v7/widget/av;
      17: invokevirtual #40                 // Method android/support/v7/widget/av.getChildCount:()I
      20: istore_3
      21: iconst_0
      22: istore_2
      23: iload_2
      24: iload_3
      25: if_icmpge     70
      28: aload_0
      29: getfield      #15                 // Field a:Landroid/support/v7/widget/bh;
      32: getfield      #34                 // Field android/support/v7/widget/bh.b:Landroid/support/v7/widget/av;
      35: iload_2
      36: invokevirtual #44                 // Method android/support/v7/widget/av.getChildAt:(I)Landroid/view/View;
      39: astore        5
      41: aload         5
      43: aload_1
      44: if_acmpne     53
      47: iconst_1
      48: istore        4
      50: goto          56
      53: iconst_0
      54: istore        4
      56: aload         5
      58: iload         4
      60: invokevirtual #50                 // Method android/view/View.setSelected:(Z)V
      63: iload_2
      64: iconst_1
      65: iadd
      66: istore_2
      67: goto          23
      70: return
}
