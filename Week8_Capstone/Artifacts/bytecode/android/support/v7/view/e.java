public class android.support.v7.view.e extends android.support.v7.view.b implements android.support.v7.view.menu.h$a {
  public android.support.v7.view.e(android.content.Context, android.support.v7.widget.ActionBarContextView, android.support.v7.view.b$a, boolean);
    Code:
       0: aload_0
       1: invokespecial #25                 // Method android/support/v7/view/b."<init>":()V
       4: aload_0
       5: aload_1
       6: putfield      #27                 // Field a:Landroid/content/Context;
       9: aload_0
      10: aload_2
      11: putfield      #29                 // Field b:Landroid/support/v7/widget/ActionBarContextView;
      14: aload_0
      15: aload_3
      16: putfield      #31                 // Field c:Landroid/support/v7/view/b$a;
      19: aload_0
      20: new           #33                 // class android/support/v7/view/menu/h
      23: dup
      24: aload_2
      25: invokevirtual #39                 // Method android/support/v7/widget/ActionBarContextView.getContext:()Landroid/content/Context;
      28: invokespecial #42                 // Method android/support/v7/view/menu/h."<init>":(Landroid/content/Context;)V
      31: iconst_1
      32: invokevirtual #45                 // Method android/support/v7/view/menu/h.a:(I)Landroid/support/v7/view/menu/h;
      35: putfield      #47                 // Field g:Landroid/support/v7/view/menu/h;
      38: aload_0
      39: getfield      #47                 // Field g:Landroid/support/v7/view/menu/h;
      42: aload_0
      43: invokevirtual #50                 // Method android/support/v7/view/menu/h.a:(Landroid/support/v7/view/menu/h$a;)V
      46: aload_0
      47: iload         4
      49: putfield      #52                 // Field f:Z
      52: return

  public android.view.MenuInflater a();
    Code:
       0: new           #56                 // class android/support/v7/view/g
       3: dup
       4: aload_0
       5: getfield      #29                 // Field b:Landroid/support/v7/widget/ActionBarContextView;
       8: invokevirtual #39                 // Method android/support/v7/widget/ActionBarContextView.getContext:()Landroid/content/Context;
      11: invokespecial #57                 // Method android/support/v7/view/g."<init>":(Landroid/content/Context;)V
      14: areturn

  public void a(int);
    Code:
       0: aload_0
       1: aload_0
       2: getfield      #27                 // Field a:Landroid/content/Context;
       5: iload_1
       6: invokevirtual #64                 // Method android/content/Context.getString:(I)Ljava/lang/String;
       9: invokevirtual #67                 // Method b:(Ljava/lang/CharSequence;)V
      12: return

  public void a(android.support.v7.view.menu.h);
    Code:
       0: aload_0
       1: invokevirtual #70                 // Method d:()V
       4: aload_0
       5: getfield      #29                 // Field b:Landroid/support/v7/widget/ActionBarContextView;
       8: invokevirtual #73                 // Method android/support/v7/widget/ActionBarContextView.a:()Z
      11: pop
      12: return

  public void a(android.view.View);
    Code:
       0: aload_0
       1: getfield      #29                 // Field b:Landroid/support/v7/widget/ActionBarContextView;
       4: aload_1
       5: invokevirtual #77                 // Method android/support/v7/widget/ActionBarContextView.setCustomView:(Landroid/view/View;)V
       8: aload_1
       9: ifnull        24
      12: new           #79                 // class java/lang/ref/WeakReference
      15: dup
      16: aload_1
      17: invokespecial #82                 // Method java/lang/ref/WeakReference."<init>":(Ljava/lang/Object;)V
      20: astore_1
      21: goto          26
      24: aconst_null
      25: astore_1
      26: aload_0
      27: aload_1
      28: putfield      #84                 // Field d:Ljava/lang/ref/WeakReference;
      31: return

  public void a(java.lang.CharSequence);
    Code:
       0: aload_0
       1: getfield      #29                 // Field b:Landroid/support/v7/widget/ActionBarContextView;
       4: aload_1
       5: invokevirtual #87                 // Method android/support/v7/widget/ActionBarContextView.setSubtitle:(Ljava/lang/CharSequence;)V
       8: return

  public void a(boolean);
    Code:
       0: aload_0
       1: iload_1
       2: invokespecial #90                 // Method android/support/v7/view/b.a:(Z)V
       5: aload_0
       6: getfield      #29                 // Field b:Landroid/support/v7/widget/ActionBarContextView;
       9: iload_1
      10: invokevirtual #93                 // Method android/support/v7/widget/ActionBarContextView.setTitleOptional:(Z)V
      13: return

  public boolean a(android.support.v7.view.menu.h, android.view.MenuItem);
    Code:
       0: aload_0
       1: getfield      #31                 // Field c:Landroid/support/v7/view/b$a;
       4: aload_0
       5: aload_2
       6: invokeinterface #99,  3           // InterfaceMethod android/support/v7/view/b$a.a:(Landroid/support/v7/view/b;Landroid/view/MenuItem;)Z
      11: ireturn

  public android.view.Menu b();
    Code:
       0: aload_0
       1: getfield      #47                 // Field g:Landroid/support/v7/view/menu/h;
       4: areturn

  public void b(int);
    Code:
       0: aload_0
       1: aload_0
       2: getfield      #27                 // Field a:Landroid/content/Context;
       5: iload_1
       6: invokevirtual #64                 // Method android/content/Context.getString:(I)Ljava/lang/String;
       9: invokevirtual #102                // Method a:(Ljava/lang/CharSequence;)V
      12: return

  public void b(java.lang.CharSequence);
    Code:
       0: aload_0
       1: getfield      #29                 // Field b:Landroid/support/v7/widget/ActionBarContextView;
       4: aload_1
       5: invokevirtual #105                // Method android/support/v7/widget/ActionBarContextView.setTitle:(Ljava/lang/CharSequence;)V
       8: return

  public void c();
    Code:
       0: aload_0
       1: getfield      #107                // Field e:Z
       4: ifeq          8
       7: return
       8: aload_0
       9: iconst_1
      10: putfield      #107                // Field e:Z
      13: aload_0
      14: getfield      #29                 // Field b:Landroid/support/v7/widget/ActionBarContextView;
      17: bipush        32
      19: invokevirtual #110                // Method android/support/v7/widget/ActionBarContextView.sendAccessibilityEvent:(I)V
      22: aload_0
      23: getfield      #31                 // Field c:Landroid/support/v7/view/b$a;
      26: aload_0
      27: invokeinterface #113,  2          // InterfaceMethod android/support/v7/view/b$a.a:(Landroid/support/v7/view/b;)V
      32: return

  public void d();
    Code:
       0: aload_0
       1: getfield      #31                 // Field c:Landroid/support/v7/view/b$a;
       4: aload_0
       5: aload_0
       6: getfield      #47                 // Field g:Landroid/support/v7/view/menu/h;
       9: invokeinterface #116,  3          // InterfaceMethod android/support/v7/view/b$a.b:(Landroid/support/v7/view/b;Landroid/view/Menu;)Z
      14: pop
      15: return

  public java.lang.CharSequence f();
    Code:
       0: aload_0
       1: getfield      #29                 // Field b:Landroid/support/v7/widget/ActionBarContextView;
       4: invokevirtual #120                // Method android/support/v7/widget/ActionBarContextView.getTitle:()Ljava/lang/CharSequence;
       7: areturn

  public java.lang.CharSequence g();
    Code:
       0: aload_0
       1: getfield      #29                 // Field b:Landroid/support/v7/widget/ActionBarContextView;
       4: invokevirtual #123                // Method android/support/v7/widget/ActionBarContextView.getSubtitle:()Ljava/lang/CharSequence;
       7: areturn

  public boolean h();
    Code:
       0: aload_0
       1: getfield      #29                 // Field b:Landroid/support/v7/widget/ActionBarContextView;
       4: invokevirtual #126                // Method android/support/v7/widget/ActionBarContextView.d:()Z
       7: ireturn

  public android.view.View i();
    Code:
       0: aload_0
       1: getfield      #84                 // Field d:Ljava/lang/ref/WeakReference;
       4: ifnull        18
       7: aload_0
       8: getfield      #84                 // Field d:Ljava/lang/ref/WeakReference;
      11: invokevirtual #132                // Method java/lang/ref/WeakReference.get:()Ljava/lang/Object;
      14: checkcast     #134                // class android/view/View
      17: areturn
      18: aconst_null
      19: areturn
}
