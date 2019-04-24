class android.support.v7.app.l$b implements android.support.v7.view.b$a {
  final android.support.v7.app.l a;

  public android.support.v7.app.l$b(android.support.v7.app.l, android.support.v7.view.b$a);
    Code:
       0: aload_0
       1: aload_1
       2: putfield      #18                 // Field a:Landroid/support/v7/app/l;
       5: aload_0
       6: invokespecial #21                 // Method java/lang/Object."<init>":()V
       9: aload_0
      10: aload_2
      11: putfield      #23                 // Field b:Landroid/support/v7/view/b$a;
      14: return

  public void a(android.support.v7.view.b);
    Code:
       0: aload_0
       1: getfield      #23                 // Field b:Landroid/support/v7/view/b$a;
       4: aload_1
       5: invokeinterface #27,  2           // InterfaceMethod android/support/v7/view/b$a.a:(Landroid/support/v7/view/b;)V
      10: aload_0
      11: getfield      #18                 // Field a:Landroid/support/v7/app/l;
      14: getfield      #31                 // Field android/support/v7/app/l.o:Landroid/widget/PopupWindow;
      17: ifnull        41
      20: aload_0
      21: getfield      #18                 // Field a:Landroid/support/v7/app/l;
      24: getfield      #34                 // Field android/support/v7/app/l.b:Landroid/view/Window;
      27: invokevirtual #40                 // Method android/view/Window.getDecorView:()Landroid/view/View;
      30: aload_0
      31: getfield      #18                 // Field a:Landroid/support/v7/app/l;
      34: getfield      #44                 // Field android/support/v7/app/l.p:Ljava/lang/Runnable;
      37: invokevirtual #50                 // Method android/view/View.removeCallbacks:(Ljava/lang/Runnable;)Z
      40: pop
      41: aload_0
      42: getfield      #18                 // Field a:Landroid/support/v7/app/l;
      45: getfield      #54                 // Field android/support/v7/app/l.n:Landroid/support/v7/widget/ActionBarContextView;
      48: ifnull        98
      51: aload_0
      52: getfield      #18                 // Field a:Landroid/support/v7/app/l;
      55: invokevirtual #57                 // Method android/support/v7/app/l.u:()V
      58: aload_0
      59: getfield      #18                 // Field a:Landroid/support/v7/app/l;
      62: aload_0
      63: getfield      #18                 // Field a:Landroid/support/v7/app/l;
      66: getfield      #54                 // Field android/support/v7/app/l.n:Landroid/support/v7/widget/ActionBarContextView;
      69: invokestatic  #63                 // Method android/support/v4/view/s.k:(Landroid/view/View;)Landroid/support/v4/view/x;
      72: fconst_0
      73: invokevirtual #68                 // Method android/support/v4/view/x.a:(F)Landroid/support/v4/view/x;
      76: putfield      #72                 // Field android/support/v7/app/l.q:Landroid/support/v4/view/x;
      79: aload_0
      80: getfield      #18                 // Field a:Landroid/support/v7/app/l;
      83: getfield      #72                 // Field android/support/v7/app/l.q:Landroid/support/v4/view/x;
      86: new           #11                 // class android/support/v7/app/l$b$1
      89: dup
      90: aload_0
      91: invokespecial #75                 // Method android/support/v7/app/l$b$1."<init>":(Landroid/support/v7/app/l$b;)V
      94: invokevirtual #78                 // Method android/support/v4/view/x.a:(Landroid/support/v4/view/y;)Landroid/support/v4/view/x;
      97: pop
      98: aload_0
      99: getfield      #18                 // Field a:Landroid/support/v7/app/l;
     102: getfield      #82                 // Field android/support/v7/app/l.e:Landroid/support/v7/app/f;
     105: ifnull        127
     108: aload_0
     109: getfield      #18                 // Field a:Landroid/support/v7/app/l;
     112: getfield      #82                 // Field android/support/v7/app/l.e:Landroid/support/v7/app/f;
     115: aload_0
     116: getfield      #18                 // Field a:Landroid/support/v7/app/l;
     119: getfield      #86                 // Field android/support/v7/app/l.m:Landroid/support/v7/view/b;
     122: invokeinterface #91,  2           // InterfaceMethod android/support/v7/app/f.onSupportActionModeFinished:(Landroid/support/v7/view/b;)V
     127: aload_0
     128: getfield      #18                 // Field a:Landroid/support/v7/app/l;
     131: aconst_null
     132: putfield      #86                 // Field android/support/v7/app/l.m:Landroid/support/v7/view/b;
     135: return

  public boolean a(android.support.v7.view.b, android.view.Menu);
    Code:
       0: aload_0
       1: getfield      #23                 // Field b:Landroid/support/v7/view/b$a;
       4: aload_1
       5: aload_2
       6: invokeinterface #94,  3           // InterfaceMethod android/support/v7/view/b$a.a:(Landroid/support/v7/view/b;Landroid/view/Menu;)Z
      11: ireturn

  public boolean a(android.support.v7.view.b, android.view.MenuItem);
    Code:
       0: aload_0
       1: getfield      #23                 // Field b:Landroid/support/v7/view/b$a;
       4: aload_1
       5: aload_2
       6: invokeinterface #97,  3           // InterfaceMethod android/support/v7/view/b$a.a:(Landroid/support/v7/view/b;Landroid/view/MenuItem;)Z
      11: ireturn

  public boolean b(android.support.v7.view.b, android.view.Menu);
    Code:
       0: aload_0
       1: getfield      #23                 // Field b:Landroid/support/v7/view/b$a;
       4: aload_1
       5: aload_2
       6: invokeinterface #99,  3           // InterfaceMethod android/support/v7/view/b$a.b:(Landroid/support/v7/view/b;Landroid/view/Menu;)Z
      11: ireturn
}
