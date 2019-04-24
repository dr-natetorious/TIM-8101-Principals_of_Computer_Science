class android.support.v7.app.l$5$1 extends android.support.v4.view.z {
  final android.support.v7.app.l$5 a;

  android.support.v7.app.l$5$1(android.support.v7.app.l$5);
    Code:
       0: aload_0
       1: aload_1
       2: putfield      #15                 // Field a:Landroid/support/v7/app/l$5;
       5: aload_0
       6: invokespecial #17                 // Method android/support/v4/view/z."<init>":()V
       9: return

  public void a(android.view.View);
    Code:
       0: aload_0
       1: getfield      #15                 // Field a:Landroid/support/v7/app/l$5;
       4: getfield      #22                 // Field android/support/v7/app/l$5.a:Landroid/support/v7/app/l;
       7: getfield      #28                 // Field android/support/v7/app/l.n:Landroid/support/v7/widget/ActionBarContextView;
      10: iconst_0
      11: invokevirtual #34                 // Method android/support/v7/widget/ActionBarContextView.setVisibility:(I)V
      14: return

  public void b(android.view.View);
    Code:
       0: aload_0
       1: getfield      #15                 // Field a:Landroid/support/v7/app/l$5;
       4: getfield      #22                 // Field android/support/v7/app/l$5.a:Landroid/support/v7/app/l;
       7: getfield      #28                 // Field android/support/v7/app/l.n:Landroid/support/v7/widget/ActionBarContextView;
      10: fconst_1
      11: invokevirtual #39                 // Method android/support/v7/widget/ActionBarContextView.setAlpha:(F)V
      14: aload_0
      15: getfield      #15                 // Field a:Landroid/support/v7/app/l$5;
      18: getfield      #22                 // Field android/support/v7/app/l$5.a:Landroid/support/v7/app/l;
      21: getfield      #43                 // Field android/support/v7/app/l.q:Landroid/support/v4/view/x;
      24: aconst_null
      25: invokevirtual #48                 // Method android/support/v4/view/x.a:(Landroid/support/v4/view/y;)Landroid/support/v4/view/x;
      28: pop
      29: aload_0
      30: getfield      #15                 // Field a:Landroid/support/v7/app/l$5;
      33: getfield      #22                 // Field android/support/v7/app/l$5.a:Landroid/support/v7/app/l;
      36: aconst_null
      37: putfield      #43                 // Field android/support/v7/app/l.q:Landroid/support/v4/view/x;
      40: return
}
