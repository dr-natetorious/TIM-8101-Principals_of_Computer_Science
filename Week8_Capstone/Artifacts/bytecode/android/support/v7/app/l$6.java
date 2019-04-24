class android.support.v7.app.l$6 extends android.support.v4.view.z {
  final android.support.v7.app.l a;

  android.support.v7.app.l$6(android.support.v7.app.l);
    Code:
       0: aload_0
       1: aload_1
       2: putfield      #15                 // Field a:Landroid/support/v7/app/l;
       5: aload_0
       6: invokespecial #18                 // Method android/support/v4/view/z."<init>":()V
       9: return

  public void a(android.view.View);
    Code:
       0: aload_0
       1: getfield      #15                 // Field a:Landroid/support/v7/app/l;
       4: getfield      #24                 // Field android/support/v7/app/l.n:Landroid/support/v7/widget/ActionBarContextView;
       7: iconst_0
       8: invokevirtual #30                 // Method android/support/v7/widget/ActionBarContextView.setVisibility:(I)V
      11: aload_0
      12: getfield      #15                 // Field a:Landroid/support/v7/app/l;
      15: getfield      #24                 // Field android/support/v7/app/l.n:Landroid/support/v7/widget/ActionBarContextView;
      18: bipush        32
      20: invokevirtual #33                 // Method android/support/v7/widget/ActionBarContextView.sendAccessibilityEvent:(I)V
      23: aload_0
      24: getfield      #15                 // Field a:Landroid/support/v7/app/l;
      27: getfield      #24                 // Field android/support/v7/app/l.n:Landroid/support/v7/widget/ActionBarContextView;
      30: invokevirtual #37                 // Method android/support/v7/widget/ActionBarContextView.getParent:()Landroid/view/ViewParent;
      33: instanceof    #39                 // class android/view/View
      36: ifeq          55
      39: aload_0
      40: getfield      #15                 // Field a:Landroid/support/v7/app/l;
      43: getfield      #24                 // Field android/support/v7/app/l.n:Landroid/support/v7/widget/ActionBarContextView;
      46: invokevirtual #37                 // Method android/support/v7/widget/ActionBarContextView.getParent:()Landroid/view/ViewParent;
      49: checkcast     #39                 // class android/view/View
      52: invokestatic  #44                 // Method android/support/v4/view/s.o:(Landroid/view/View;)V
      55: return

  public void b(android.view.View);
    Code:
       0: aload_0
       1: getfield      #15                 // Field a:Landroid/support/v7/app/l;
       4: getfield      #24                 // Field android/support/v7/app/l.n:Landroid/support/v7/widget/ActionBarContextView;
       7: fconst_1
       8: invokevirtual #48                 // Method android/support/v7/widget/ActionBarContextView.setAlpha:(F)V
      11: aload_0
      12: getfield      #15                 // Field a:Landroid/support/v7/app/l;
      15: getfield      #52                 // Field android/support/v7/app/l.q:Landroid/support/v4/view/x;
      18: aconst_null
      19: invokevirtual #57                 // Method android/support/v4/view/x.a:(Landroid/support/v4/view/y;)Landroid/support/v4/view/x;
      22: pop
      23: aload_0
      24: getfield      #15                 // Field a:Landroid/support/v7/app/l;
      27: aconst_null
      28: putfield      #52                 // Field android/support/v7/app/l.q:Landroid/support/v4/view/x;
      31: return
}
