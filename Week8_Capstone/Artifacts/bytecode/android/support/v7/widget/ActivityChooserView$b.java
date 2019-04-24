class android.support.v7.widget.ActivityChooserView$b implements android.view.View$OnClickListener,android.view.View$OnLongClickListener,android.widget.AdapterView$OnItemClickListener,android.widget.PopupWindow$OnDismissListener {
  final android.support.v7.widget.ActivityChooserView a;

  public void onClick(android.view.View);
    Code:
       0: aload_1
       1: aload_0
       2: getfield      #20                 // Field a:Landroid/support/v7/widget/ActivityChooserView;
       5: getfield      #34                 // Field android/support/v7/widget/ActivityChooserView.c:Landroid/widget/FrameLayout;
       8: if_acmpne     83
      11: aload_0
      12: getfield      #20                 // Field a:Landroid/support/v7/widget/ActivityChooserView;
      15: invokevirtual #37                 // Method android/support/v7/widget/ActivityChooserView.b:()Z
      18: pop
      19: aload_0
      20: getfield      #20                 // Field a:Landroid/support/v7/widget/ActivityChooserView;
      23: getfield      #40                 // Field android/support/v7/widget/ActivityChooserView.a:Landroid/support/v7/widget/ActivityChooserView$a;
      26: invokevirtual #45                 // Method android/support/v7/widget/ActivityChooserView$a.b:()Landroid/content/pm/ResolveInfo;
      29: astore_1
      30: aload_0
      31: getfield      #20                 // Field a:Landroid/support/v7/widget/ActivityChooserView;
      34: getfield      #40                 // Field android/support/v7/widget/ActivityChooserView.a:Landroid/support/v7/widget/ActivityChooserView$a;
      37: invokevirtual #49                 // Method android/support/v7/widget/ActivityChooserView$a.d:()Landroid/support/v7/widget/e;
      40: aload_1
      41: invokevirtual #54                 // Method android/support/v7/widget/e.a:(Landroid/content/pm/ResolveInfo;)I
      44: istore_2
      45: aload_0
      46: getfield      #20                 // Field a:Landroid/support/v7/widget/ActivityChooserView;
      49: getfield      #40                 // Field android/support/v7/widget/ActivityChooserView.a:Landroid/support/v7/widget/ActivityChooserView$a;
      52: invokevirtual #49                 // Method android/support/v7/widget/ActivityChooserView$a.d:()Landroid/support/v7/widget/e;
      55: iload_2
      56: invokevirtual #57                 // Method android/support/v7/widget/e.b:(I)Landroid/content/Intent;
      59: astore_1
      60: aload_1
      61: ifnull        116
      64: aload_1
      65: ldc           #58                 // int 524288
      67: invokevirtual #63                 // Method android/content/Intent.addFlags:(I)Landroid/content/Intent;
      70: pop
      71: aload_0
      72: getfield      #20                 // Field a:Landroid/support/v7/widget/ActivityChooserView;
      75: invokevirtual #67                 // Method android/support/v7/widget/ActivityChooserView.getContext:()Landroid/content/Context;
      78: aload_1
      79: invokevirtual #73                 // Method android/content/Context.startActivity:(Landroid/content/Intent;)V
      82: return
      83: aload_1
      84: aload_0
      85: getfield      #20                 // Field a:Landroid/support/v7/widget/ActivityChooserView;
      88: getfield      #75                 // Field android/support/v7/widget/ActivityChooserView.b:Landroid/widget/FrameLayout;
      91: if_acmpne     117
      94: aload_0
      95: getfield      #20                 // Field a:Landroid/support/v7/widget/ActivityChooserView;
      98: iconst_0
      99: putfield      #79                 // Field android/support/v7/widget/ActivityChooserView.g:Z
     102: aload_0
     103: getfield      #20                 // Field a:Landroid/support/v7/widget/ActivityChooserView;
     106: aload_0
     107: getfield      #20                 // Field a:Landroid/support/v7/widget/ActivityChooserView;
     110: getfield      #83                 // Field android/support/v7/widget/ActivityChooserView.h:I
     113: invokevirtual #86                 // Method android/support/v7/widget/ActivityChooserView.a:(I)V
     116: return
     117: new           #88                 // class java/lang/IllegalArgumentException
     120: dup
     121: invokespecial #91                 // Method java/lang/IllegalArgumentException."<init>":()V
     124: athrow

  public void onDismiss();
    Code:
       0: aload_0
       1: invokespecial #93                 // Method a:()V
       4: aload_0
       5: getfield      #20                 // Field a:Landroid/support/v7/widget/ActivityChooserView;
       8: getfield      #96                 // Field android/support/v7/widget/ActivityChooserView.d:Landroid/support/v4/view/c;
      11: ifnull        25
      14: aload_0
      15: getfield      #20                 // Field a:Landroid/support/v7/widget/ActivityChooserView;
      18: getfield      #96                 // Field android/support/v7/widget/ActivityChooserView.d:Landroid/support/v4/view/c;
      21: iconst_0
      22: invokevirtual #101                // Method android/support/v4/view/c.a:(Z)V
      25: return

  public void onItemClick(android.widget.AdapterView<?>, android.view.View, int, long);
    Code:
       0: aload_1
       1: invokevirtual #109                // Method android/widget/AdapterView.getAdapter:()Landroid/widget/Adapter;
       4: checkcast     #42                 // class android/support/v7/widget/ActivityChooserView$a
       7: iload_3
       8: invokevirtual #113                // Method android/support/v7/widget/ActivityChooserView$a.getItemViewType:(I)I
      11: tableswitch   { // 0 to 1
                     0: 50
                     1: 40
               default: 32
          }
      32: new           #88                 // class java/lang/IllegalArgumentException
      35: dup
      36: invokespecial #91                 // Method java/lang/IllegalArgumentException."<init>":()V
      39: athrow
      40: aload_0
      41: getfield      #20                 // Field a:Landroid/support/v7/widget/ActivityChooserView;
      44: ldc           #114                // int 2147483647
      46: invokevirtual #86                 // Method android/support/v7/widget/ActivityChooserView.a:(I)V
      49: return
      50: aload_0
      51: getfield      #20                 // Field a:Landroid/support/v7/widget/ActivityChooserView;
      54: invokevirtual #37                 // Method android/support/v7/widget/ActivityChooserView.b:()Z
      57: pop
      58: aload_0
      59: getfield      #20                 // Field a:Landroid/support/v7/widget/ActivityChooserView;
      62: getfield      #79                 // Field android/support/v7/widget/ActivityChooserView.g:Z
      65: ifeq          87
      68: iload_3
      69: ifle          144
      72: aload_0
      73: getfield      #20                 // Field a:Landroid/support/v7/widget/ActivityChooserView;
      76: getfield      #40                 // Field android/support/v7/widget/ActivityChooserView.a:Landroid/support/v7/widget/ActivityChooserView$a;
      79: invokevirtual #49                 // Method android/support/v7/widget/ActivityChooserView$a.d:()Landroid/support/v7/widget/e;
      82: iload_3
      83: invokevirtual #116                // Method android/support/v7/widget/e.c:(I)V
      86: return
      87: aload_0
      88: getfield      #20                 // Field a:Landroid/support/v7/widget/ActivityChooserView;
      91: getfield      #40                 // Field android/support/v7/widget/ActivityChooserView.a:Landroid/support/v7/widget/ActivityChooserView$a;
      94: invokevirtual #119                // Method android/support/v7/widget/ActivityChooserView$a.e:()Z
      97: ifeq          103
     100: goto          107
     103: iload_3
     104: iconst_1
     105: iadd
     106: istore_3
     107: aload_0
     108: getfield      #20                 // Field a:Landroid/support/v7/widget/ActivityChooserView;
     111: getfield      #40                 // Field android/support/v7/widget/ActivityChooserView.a:Landroid/support/v7/widget/ActivityChooserView$a;
     114: invokevirtual #49                 // Method android/support/v7/widget/ActivityChooserView$a.d:()Landroid/support/v7/widget/e;
     117: iload_3
     118: invokevirtual #57                 // Method android/support/v7/widget/e.b:(I)Landroid/content/Intent;
     121: astore_1
     122: aload_1
     123: ifnull        144
     126: aload_1
     127: ldc           #58                 // int 524288
     129: invokevirtual #63                 // Method android/content/Intent.addFlags:(I)Landroid/content/Intent;
     132: pop
     133: aload_0
     134: getfield      #20                 // Field a:Landroid/support/v7/widget/ActivityChooserView;
     137: invokevirtual #67                 // Method android/support/v7/widget/ActivityChooserView.getContext:()Landroid/content/Context;
     140: aload_1
     141: invokevirtual #73                 // Method android/content/Context.startActivity:(Landroid/content/Intent;)V
     144: return

  public boolean onLongClick(android.view.View);
    Code:
       0: aload_1
       1: aload_0
       2: getfield      #20                 // Field a:Landroid/support/v7/widget/ActivityChooserView;
       5: getfield      #34                 // Field android/support/v7/widget/ActivityChooserView.c:Landroid/widget/FrameLayout;
       8: if_acmpne     48
      11: aload_0
      12: getfield      #20                 // Field a:Landroid/support/v7/widget/ActivityChooserView;
      15: getfield      #40                 // Field android/support/v7/widget/ActivityChooserView.a:Landroid/support/v7/widget/ActivityChooserView$a;
      18: invokevirtual #127                // Method android/support/v7/widget/ActivityChooserView$a.getCount:()I
      21: ifle          46
      24: aload_0
      25: getfield      #20                 // Field a:Landroid/support/v7/widget/ActivityChooserView;
      28: iconst_1
      29: putfield      #79                 // Field android/support/v7/widget/ActivityChooserView.g:Z
      32: aload_0
      33: getfield      #20                 // Field a:Landroid/support/v7/widget/ActivityChooserView;
      36: aload_0
      37: getfield      #20                 // Field a:Landroid/support/v7/widget/ActivityChooserView;
      40: getfield      #83                 // Field android/support/v7/widget/ActivityChooserView.h:I
      43: invokevirtual #86                 // Method android/support/v7/widget/ActivityChooserView.a:(I)V
      46: iconst_1
      47: ireturn
      48: new           #88                 // class java/lang/IllegalArgumentException
      51: dup
      52: invokespecial #91                 // Method java/lang/IllegalArgumentException."<init>":()V
      55: athrow
}
