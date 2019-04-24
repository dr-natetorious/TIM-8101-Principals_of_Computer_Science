public class android.support.v7.app.r$a extends android.support.v7.view.b implements android.support.v7.view.menu.h$a {
  final android.support.v7.app.r a;

  public android.support.v7.app.r$a(android.support.v7.app.r, android.content.Context, android.support.v7.view.b$a);
    Code:
       0: aload_0
       1: aload_1
       2: putfield      #23                 // Field a:Landroid/support/v7/app/r;
       5: aload_0
       6: invokespecial #26                 // Method android/support/v7/view/b."<init>":()V
       9: aload_0
      10: aload_2
      11: putfield      #28                 // Field b:Landroid/content/Context;
      14: aload_0
      15: aload_3
      16: putfield      #30                 // Field d:Landroid/support/v7/view/b$a;
      19: aload_0
      20: new           #32                 // class android/support/v7/view/menu/h
      23: dup
      24: aload_2
      25: invokespecial #35                 // Method android/support/v7/view/menu/h."<init>":(Landroid/content/Context;)V
      28: iconst_1
      29: invokevirtual #38                 // Method android/support/v7/view/menu/h.a:(I)Landroid/support/v7/view/menu/h;
      32: putfield      #40                 // Field c:Landroid/support/v7/view/menu/h;
      35: aload_0
      36: getfield      #40                 // Field c:Landroid/support/v7/view/menu/h;
      39: aload_0
      40: invokevirtual #43                 // Method android/support/v7/view/menu/h.a:(Landroid/support/v7/view/menu/h$a;)V
      43: return

  public android.view.MenuInflater a();
    Code:
       0: new           #47                 // class android/support/v7/view/g
       3: dup
       4: aload_0
       5: getfield      #28                 // Field b:Landroid/content/Context;
       8: invokespecial #48                 // Method android/support/v7/view/g."<init>":(Landroid/content/Context;)V
      11: areturn

  public void a(int);
    Code:
       0: aload_0
       1: aload_0
       2: getfield      #23                 // Field a:Landroid/support/v7/app/r;
       5: getfield      #51                 // Field android/support/v7/app/r.a:Landroid/content/Context;
       8: invokevirtual #57                 // Method android/content/Context.getResources:()Landroid/content/res/Resources;
      11: iload_1
      12: invokevirtual #63                 // Method android/content/res/Resources.getString:(I)Ljava/lang/String;
      15: invokevirtual #66                 // Method b:(Ljava/lang/CharSequence;)V
      18: return

  public void a(android.support.v7.view.menu.h);
    Code:
       0: aload_0
       1: getfield      #30                 // Field d:Landroid/support/v7/view/b$a;
       4: ifnonnull     8
       7: return
       8: aload_0
       9: invokevirtual #69                 // Method d:()V
      12: aload_0
      13: getfield      #23                 // Field a:Landroid/support/v7/app/r;
      16: getfield      #72                 // Field android/support/v7/app/r.e:Landroid/support/v7/widget/ActionBarContextView;
      19: invokevirtual #77                 // Method android/support/v7/widget/ActionBarContextView.a:()Z
      22: pop
      23: return

  public void a(android.view.View);
    Code:
       0: aload_0
       1: getfield      #23                 // Field a:Landroid/support/v7/app/r;
       4: getfield      #72                 // Field android/support/v7/app/r.e:Landroid/support/v7/widget/ActionBarContextView;
       7: aload_1
       8: invokevirtual #81                 // Method android/support/v7/widget/ActionBarContextView.setCustomView:(Landroid/view/View;)V
      11: aload_0
      12: new           #83                 // class java/lang/ref/WeakReference
      15: dup
      16: aload_1
      17: invokespecial #86                 // Method java/lang/ref/WeakReference."<init>":(Ljava/lang/Object;)V
      20: putfield      #88                 // Field e:Ljava/lang/ref/WeakReference;
      23: return

  public void a(java.lang.CharSequence);
    Code:
       0: aload_0
       1: getfield      #23                 // Field a:Landroid/support/v7/app/r;
       4: getfield      #72                 // Field android/support/v7/app/r.e:Landroid/support/v7/widget/ActionBarContextView;
       7: aload_1
       8: invokevirtual #91                 // Method android/support/v7/widget/ActionBarContextView.setSubtitle:(Ljava/lang/CharSequence;)V
      11: return

  public void a(boolean);
    Code:
       0: aload_0
       1: iload_1
       2: invokespecial #94                 // Method android/support/v7/view/b.a:(Z)V
       5: aload_0
       6: getfield      #23                 // Field a:Landroid/support/v7/app/r;
       9: getfield      #72                 // Field android/support/v7/app/r.e:Landroid/support/v7/widget/ActionBarContextView;
      12: iload_1
      13: invokevirtual #97                 // Method android/support/v7/widget/ActionBarContextView.setTitleOptional:(Z)V
      16: return

  public boolean a(android.support.v7.view.menu.h, android.view.MenuItem);
    Code:
       0: aload_0
       1: getfield      #30                 // Field d:Landroid/support/v7/view/b$a;
       4: ifnull        19
       7: aload_0
       8: getfield      #30                 // Field d:Landroid/support/v7/view/b$a;
      11: aload_0
      12: aload_2
      13: invokeinterface #103,  3          // InterfaceMethod android/support/v7/view/b$a.a:(Landroid/support/v7/view/b;Landroid/view/MenuItem;)Z
      18: ireturn
      19: iconst_0
      20: ireturn

  public android.view.Menu b();
    Code:
       0: aload_0
       1: getfield      #40                 // Field c:Landroid/support/v7/view/menu/h;
       4: areturn

  public void b(int);
    Code:
       0: aload_0
       1: aload_0
       2: getfield      #23                 // Field a:Landroid/support/v7/app/r;
       5: getfield      #51                 // Field android/support/v7/app/r.a:Landroid/content/Context;
       8: invokevirtual #57                 // Method android/content/Context.getResources:()Landroid/content/res/Resources;
      11: iload_1
      12: invokevirtual #63                 // Method android/content/res/Resources.getString:(I)Ljava/lang/String;
      15: invokevirtual #106                // Method a:(Ljava/lang/CharSequence;)V
      18: return

  public void b(java.lang.CharSequence);
    Code:
       0: aload_0
       1: getfield      #23                 // Field a:Landroid/support/v7/app/r;
       4: getfield      #72                 // Field android/support/v7/app/r.e:Landroid/support/v7/widget/ActionBarContextView;
       7: aload_1
       8: invokevirtual #109                // Method android/support/v7/widget/ActionBarContextView.setTitle:(Ljava/lang/CharSequence;)V
      11: return

  public void c();
    Code:
       0: aload_0
       1: getfield      #23                 // Field a:Landroid/support/v7/app/r;
       4: getfield      #113                // Field android/support/v7/app/r.h:Landroid/support/v7/app/r$a;
       7: aload_0
       8: if_acmpeq     12
      11: return
      12: aload_0
      13: getfield      #23                 // Field a:Landroid/support/v7/app/r;
      16: getfield      #117                // Field android/support/v7/app/r.l:Z
      19: aload_0
      20: getfield      #23                 // Field a:Landroid/support/v7/app/r;
      23: getfield      #120                // Field android/support/v7/app/r.m:Z
      26: iconst_0
      27: invokestatic  #123                // Method android/support/v7/app/r.a:(ZZZ)Z
      30: ifne          55
      33: aload_0
      34: getfield      #23                 // Field a:Landroid/support/v7/app/r;
      37: aload_0
      38: putfield      #127                // Field android/support/v7/app/r.i:Landroid/support/v7/view/b;
      41: aload_0
      42: getfield      #23                 // Field a:Landroid/support/v7/app/r;
      45: aload_0
      46: getfield      #30                 // Field d:Landroid/support/v7/view/b$a;
      49: putfield      #130                // Field android/support/v7/app/r.j:Landroid/support/v7/view/b$a;
      52: goto          65
      55: aload_0
      56: getfield      #30                 // Field d:Landroid/support/v7/view/b$a;
      59: aload_0
      60: invokeinterface #133,  2          // InterfaceMethod android/support/v7/view/b$a.a:(Landroid/support/v7/view/b;)V
      65: aload_0
      66: aconst_null
      67: putfield      #30                 // Field d:Landroid/support/v7/view/b$a;
      70: aload_0
      71: getfield      #23                 // Field a:Landroid/support/v7/app/r;
      74: iconst_0
      75: invokevirtual #136                // Method android/support/v7/app/r.k:(Z)V
      78: aload_0
      79: getfield      #23                 // Field a:Landroid/support/v7/app/r;
      82: getfield      #72                 // Field android/support/v7/app/r.e:Landroid/support/v7/widget/ActionBarContextView;
      85: invokevirtual #138                // Method android/support/v7/widget/ActionBarContextView.b:()V
      88: aload_0
      89: getfield      #23                 // Field a:Landroid/support/v7/app/r;
      92: getfield      #141                // Field android/support/v7/app/r.d:Landroid/support/v7/widget/al;
      95: invokeinterface #146,  1          // InterfaceMethod android/support/v7/widget/al.a:()Landroid/view/ViewGroup;
     100: bipush        32
     102: invokevirtual #151                // Method android/view/ViewGroup.sendAccessibilityEvent:(I)V
     105: aload_0
     106: getfield      #23                 // Field a:Landroid/support/v7/app/r;
     109: getfield      #154                // Field android/support/v7/app/r.b:Landroid/support/v7/widget/ActionBarOverlayLayout;
     112: aload_0
     113: getfield      #23                 // Field a:Landroid/support/v7/app/r;
     116: getfield      #157                // Field android/support/v7/app/r.o:Z
     119: invokevirtual #162                // Method android/support/v7/widget/ActionBarOverlayLayout.setHideOnContentScrollEnabled:(Z)V
     122: aload_0
     123: getfield      #23                 // Field a:Landroid/support/v7/app/r;
     126: aconst_null
     127: putfield      #113                // Field android/support/v7/app/r.h:Landroid/support/v7/app/r$a;
     130: return

  public void d();
    Code:
       0: aload_0
       1: getfield      #23                 // Field a:Landroid/support/v7/app/r;
       4: getfield      #113                // Field android/support/v7/app/r.h:Landroid/support/v7/app/r$a;
       7: aload_0
       8: if_acmpeq     12
      11: return
      12: aload_0
      13: getfield      #40                 // Field c:Landroid/support/v7/view/menu/h;
      16: invokevirtual #165                // Method android/support/v7/view/menu/h.g:()V
      19: aload_0
      20: getfield      #30                 // Field d:Landroid/support/v7/view/b$a;
      23: aload_0
      24: aload_0
      25: getfield      #40                 // Field c:Landroid/support/v7/view/menu/h;
      28: invokeinterface #168,  3          // InterfaceMethod android/support/v7/view/b$a.b:(Landroid/support/v7/view/b;Landroid/view/Menu;)Z
      33: pop
      34: aload_0
      35: getfield      #40                 // Field c:Landroid/support/v7/view/menu/h;
      38: invokevirtual #170                // Method android/support/v7/view/menu/h.h:()V
      41: return
      42: astore_1
      43: aload_0
      44: getfield      #40                 // Field c:Landroid/support/v7/view/menu/h;
      47: invokevirtual #170                // Method android/support/v7/view/menu/h.h:()V
      50: aload_1
      51: athrow
    Exception table:
       from    to  target type
          19    34    42   any

  public boolean e();
    Code:
       0: aload_0
       1: getfield      #40                 // Field c:Landroid/support/v7/view/menu/h;
       4: invokevirtual #165                // Method android/support/v7/view/menu/h.g:()V
       7: aload_0
       8: getfield      #30                 // Field d:Landroid/support/v7/view/b$a;
      11: aload_0
      12: aload_0
      13: getfield      #40                 // Field c:Landroid/support/v7/view/menu/h;
      16: invokeinterface #172,  3          // InterfaceMethod android/support/v7/view/b$a.a:(Landroid/support/v7/view/b;Landroid/view/Menu;)Z
      21: istore_1
      22: aload_0
      23: getfield      #40                 // Field c:Landroid/support/v7/view/menu/h;
      26: invokevirtual #170                // Method android/support/v7/view/menu/h.h:()V
      29: iload_1
      30: ireturn
      31: astore_2
      32: aload_0
      33: getfield      #40                 // Field c:Landroid/support/v7/view/menu/h;
      36: invokevirtual #170                // Method android/support/v7/view/menu/h.h:()V
      39: aload_2
      40: athrow
    Exception table:
       from    to  target type
           7    22    31   any

  public java.lang.CharSequence f();
    Code:
       0: aload_0
       1: getfield      #23                 // Field a:Landroid/support/v7/app/r;
       4: getfield      #72                 // Field android/support/v7/app/r.e:Landroid/support/v7/widget/ActionBarContextView;
       7: invokevirtual #177                // Method android/support/v7/widget/ActionBarContextView.getTitle:()Ljava/lang/CharSequence;
      10: areturn

  public java.lang.CharSequence g();
    Code:
       0: aload_0
       1: getfield      #23                 // Field a:Landroid/support/v7/app/r;
       4: getfield      #72                 // Field android/support/v7/app/r.e:Landroid/support/v7/widget/ActionBarContextView;
       7: invokevirtual #180                // Method android/support/v7/widget/ActionBarContextView.getSubtitle:()Ljava/lang/CharSequence;
      10: areturn

  public boolean h();
    Code:
       0: aload_0
       1: getfield      #23                 // Field a:Landroid/support/v7/app/r;
       4: getfield      #72                 // Field android/support/v7/app/r.e:Landroid/support/v7/widget/ActionBarContextView;
       7: invokevirtual #182                // Method android/support/v7/widget/ActionBarContextView.d:()Z
      10: ireturn

  public android.view.View i();
    Code:
       0: aload_0
       1: getfield      #88                 // Field e:Ljava/lang/ref/WeakReference;
       4: ifnull        18
       7: aload_0
       8: getfield      #88                 // Field e:Ljava/lang/ref/WeakReference;
      11: invokevirtual #187                // Method java/lang/ref/WeakReference.get:()Ljava/lang/Object;
      14: checkcast     #189                // class android/view/View
      17: areturn
      18: aconst_null
      19: areturn
}
