class android.support.v7.app.r$1 extends android.support.v4.view.z {
  final android.support.v7.app.r a;

  android.support.v7.app.r$1(android.support.v7.app.r);
    Code:
       0: aload_0
       1: aload_1
       2: putfield      #12                 // Field a:Landroid/support/v7/app/r;
       5: aload_0
       6: invokespecial #15                 // Method android/support/v4/view/z."<init>":()V
       9: return

  public void b(android.view.View);
    Code:
       0: aload_0
       1: getfield      #12                 // Field a:Landroid/support/v7/app/r;
       4: getfield      #22                 // Field android/support/v7/app/r.k:Z
       7: ifeq          42
      10: aload_0
      11: getfield      #12                 // Field a:Landroid/support/v7/app/r;
      14: getfield      #26                 // Field android/support/v7/app/r.f:Landroid/view/View;
      17: ifnull        42
      20: aload_0
      21: getfield      #12                 // Field a:Landroid/support/v7/app/r;
      24: getfield      #26                 // Field android/support/v7/app/r.f:Landroid/view/View;
      27: fconst_0
      28: invokevirtual #32                 // Method android/view/View.setTranslationY:(F)V
      31: aload_0
      32: getfield      #12                 // Field a:Landroid/support/v7/app/r;
      35: getfield      #36                 // Field android/support/v7/app/r.c:Landroid/support/v7/widget/ActionBarContainer;
      38: fconst_0
      39: invokevirtual #39                 // Method android/support/v7/widget/ActionBarContainer.setTranslationY:(F)V
      42: aload_0
      43: getfield      #12                 // Field a:Landroid/support/v7/app/r;
      46: getfield      #36                 // Field android/support/v7/app/r.c:Landroid/support/v7/widget/ActionBarContainer;
      49: bipush        8
      51: invokevirtual #43                 // Method android/support/v7/widget/ActionBarContainer.setVisibility:(I)V
      54: aload_0
      55: getfield      #12                 // Field a:Landroid/support/v7/app/r;
      58: getfield      #36                 // Field android/support/v7/app/r.c:Landroid/support/v7/widget/ActionBarContainer;
      61: iconst_0
      62: invokevirtual #47                 // Method android/support/v7/widget/ActionBarContainer.setTransitioning:(Z)V
      65: aload_0
      66: getfield      #12                 // Field a:Landroid/support/v7/app/r;
      69: aconst_null
      70: putfield      #51                 // Field android/support/v7/app/r.n:Landroid/support/v7/view/h;
      73: aload_0
      74: getfield      #12                 // Field a:Landroid/support/v7/app/r;
      77: invokevirtual #54                 // Method android/support/v7/app/r.h:()V
      80: aload_0
      81: getfield      #12                 // Field a:Landroid/support/v7/app/r;
      84: getfield      #57                 // Field android/support/v7/app/r.b:Landroid/support/v7/widget/ActionBarOverlayLayout;
      87: ifnull        100
      90: aload_0
      91: getfield      #12                 // Field a:Landroid/support/v7/app/r;
      94: getfield      #57                 // Field android/support/v7/app/r.b:Landroid/support/v7/widget/ActionBarOverlayLayout;
      97: invokestatic  #62                 // Method android/support/v4/view/s.o:(Landroid/view/View;)V
     100: return
}
