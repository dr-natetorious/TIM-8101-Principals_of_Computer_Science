final class android.support.v7.view.menu.t extends android.support.v7.view.menu.m implements android.support.v7.view.menu.o,android.view.View$OnKeyListener,android.widget.AdapterView$OnItemClickListener,android.widget.PopupWindow$OnDismissListener {
  final android.support.v7.widget.ay a;

  android.view.View b;

  public android.support.v7.view.menu.t(android.content.Context, android.support.v7.view.menu.h, android.view.View, int, int, boolean);
    Code:
       0: aload_0
       1: invokespecial #53                 // Method android/support/v7/view/menu/m."<init>":()V
       4: aload_0
       5: new           #14                 // class android/support/v7/view/menu/t$1
       8: dup
       9: aload_0
      10: invokespecial #56                 // Method android/support/v7/view/menu/t$1."<init>":(Landroid/support/v7/view/menu/t;)V
      13: putfield      #58                 // Field j:Landroid/view/ViewTreeObserver$OnGlobalLayoutListener;
      16: aload_0
      17: new           #16                 // class android/support/v7/view/menu/t$2
      20: dup
      21: aload_0
      22: invokespecial #59                 // Method android/support/v7/view/menu/t$2."<init>":(Landroid/support/v7/view/menu/t;)V
      25: putfield      #61                 // Field k:Landroid/view/View$OnAttachStateChangeListener;
      28: aload_0
      29: iconst_0
      30: putfield      #63                 // Field s:I
      33: aload_0
      34: aload_1
      35: putfield      #65                 // Field c:Landroid/content/Context;
      38: aload_0
      39: aload_2
      40: putfield      #67                 // Field d:Landroid/support/v7/view/menu/h;
      43: aload_0
      44: iload         6
      46: putfield      #69                 // Field f:Z
      49: aload_0
      50: new           #71                 // class android/support/v7/view/menu/g
      53: dup
      54: aload_2
      55: aload_1
      56: invokestatic  #77                 // Method android/view/LayoutInflater.from:(Landroid/content/Context;)Landroid/view/LayoutInflater;
      59: aload_0
      60: getfield      #69                 // Field f:Z
      63: invokespecial #80                 // Method android/support/v7/view/menu/g."<init>":(Landroid/support/v7/view/menu/h;Landroid/view/LayoutInflater;Z)V
      66: putfield      #82                 // Field e:Landroid/support/v7/view/menu/g;
      69: aload_0
      70: iload         4
      72: putfield      #84                 // Field h:I
      75: aload_0
      76: iload         5
      78: putfield      #86                 // Field i:I
      81: aload_1
      82: invokevirtual #92                 // Method android/content/Context.getResources:()Landroid/content/res/Resources;
      85: astore        7
      87: aload_0
      88: aload         7
      90: invokevirtual #98                 // Method android/content/res/Resources.getDisplayMetrics:()Landroid/util/DisplayMetrics;
      93: getfield      #103                // Field android/util/DisplayMetrics.widthPixels:I
      96: iconst_2
      97: idiv
      98: aload         7
     100: getstatic     #108                // Field android/support/v7/a/a$d.abc_config_prefDialogWidth:I
     103: invokevirtual #112                // Method android/content/res/Resources.getDimensionPixelSize:(I)I
     106: invokestatic  #118                // Method java/lang/Math.max:(II)I
     109: putfield      #120                // Field g:I
     112: aload_0
     113: aload_3
     114: putfield      #122                // Field m:Landroid/view/View;
     117: aload_0
     118: new           #124                // class android/support/v7/widget/ay
     121: dup
     122: aload_0
     123: getfield      #65                 // Field c:Landroid/content/Context;
     126: aconst_null
     127: aload_0
     128: getfield      #84                 // Field h:I
     131: aload_0
     132: getfield      #86                 // Field i:I
     135: invokespecial #127                // Method android/support/v7/widget/ay."<init>":(Landroid/content/Context;Landroid/util/AttributeSet;II)V
     138: putfield      #129                // Field a:Landroid/support/v7/widget/ay;
     141: aload_2
     142: aload_0
     143: aload_1
     144: invokevirtual #134                // Method android/support/v7/view/menu/h.a:(Landroid/support/v7/view/menu/o;Landroid/content/Context;)V
     147: return

  static android.view.ViewTreeObserver a(android.support.v7.view.menu.t);
    Code:
       0: aload_0
       1: getfield      #138                // Field o:Landroid/view/ViewTreeObserver;
       4: areturn

  static android.view.ViewTreeObserver a(android.support.v7.view.menu.t, android.view.ViewTreeObserver);
    Code:
       0: aload_0
       1: aload_1
       2: putfield      #138                // Field o:Landroid/view/ViewTreeObserver;
       5: aload_1
       6: areturn

  static android.view.ViewTreeObserver$OnGlobalLayoutListener b(android.support.v7.view.menu.t);
    Code:
       0: aload_0
       1: getfield      #58                 // Field j:Landroid/view/ViewTreeObserver$OnGlobalLayoutListener;
       4: areturn

  public void a(int);
    Code:
       0: aload_0
       1: iload_1
       2: putfield      #63                 // Field s:I
       5: return

  public void a(android.os.Parcelable);
    Code:
       0: return

  public void a(android.support.v7.view.menu.h);
    Code:
       0: return

  public void a(android.support.v7.view.menu.h, boolean);
    Code:
       0: aload_1
       1: aload_0
       2: getfield      #67                 // Field d:Landroid/support/v7/view/menu/h;
       5: if_acmpeq     9
       8: return
       9: aload_0
      10: invokevirtual #248                // Method e:()V
      13: aload_0
      14: getfield      #250                // Field n:Landroid/support/v7/view/menu/o$a;
      17: ifnull        31
      20: aload_0
      21: getfield      #250                // Field n:Landroid/support/v7/view/menu/o$a;
      24: aload_1
      25: iload_2
      26: invokeinterface #254,  3          // InterfaceMethod android/support/v7/view/menu/o$a.a:(Landroid/support/v7/view/menu/h;Z)V
      31: return

  public void a(android.support.v7.view.menu.o$a);
    Code:
       0: aload_0
       1: aload_1
       2: putfield      #250                // Field n:Landroid/support/v7/view/menu/o$a;
       5: return

  public void a(android.view.View);
    Code:
       0: aload_0
       1: aload_1
       2: putfield      #122                // Field m:Landroid/view/View;
       5: return

  public void a(android.widget.PopupWindow$OnDismissListener);
    Code:
       0: aload_0
       1: aload_1
       2: putfield      #257                // Field l:Landroid/widget/PopupWindow$OnDismissListener;
       5: return

  public void a(boolean);
    Code:
       0: aload_0
       1: iconst_0
       2: putfield      #180                // Field q:Z
       5: aload_0
       6: getfield      #82                 // Field e:Landroid/support/v7/view/menu/g;
       9: ifnull        19
      12: aload_0
      13: getfield      #82                 // Field e:Landroid/support/v7/view/menu/g;
      16: invokevirtual #260                // Method android/support/v7/view/menu/g.notifyDataSetChanged:()V
      19: return

  public boolean a();
    Code:
       0: iconst_0
       1: ireturn

  public boolean a(android.support.v7.view.menu.u);
    Code:
       0: aload_1
       1: invokevirtual #266                // Method android/support/v7/view/menu/u.hasVisibleItems:()Z
       4: ifeq          122
       7: new           #268                // class android/support/v7/view/menu/n
      10: dup
      11: aload_0
      12: getfield      #65                 // Field c:Landroid/content/Context;
      15: aload_1
      16: aload_0
      17: getfield      #147                // Field b:Landroid/view/View;
      20: aload_0
      21: getfield      #69                 // Field f:Z
      24: aload_0
      25: getfield      #84                 // Field h:I
      28: aload_0
      29: getfield      #86                 // Field i:I
      32: invokespecial #271                // Method android/support/v7/view/menu/n."<init>":(Landroid/content/Context;Landroid/support/v7/view/menu/h;Landroid/view/View;ZII)V
      35: astore_2
      36: aload_2
      37: aload_0
      38: getfield      #250                // Field n:Landroid/support/v7/view/menu/o$a;
      41: invokevirtual #273                // Method android/support/v7/view/menu/n.a:(Landroid/support/v7/view/menu/o$a;)V
      44: aload_2
      45: aload_1
      46: invokestatic  #276                // Method android/support/v7/view/menu/m.b:(Landroid/support/v7/view/menu/h;)Z
      49: invokevirtual #277                // Method android/support/v7/view/menu/n.a:(Z)V
      52: aload_2
      53: aload_0
      54: getfield      #63                 // Field s:I
      57: invokevirtual #279                // Method android/support/v7/view/menu/n.a:(I)V
      60: aload_2
      61: aload_0
      62: getfield      #257                // Field l:Landroid/widget/PopupWindow$OnDismissListener;
      65: invokevirtual #280                // Method android/support/v7/view/menu/n.a:(Landroid/widget/PopupWindow$OnDismissListener;)V
      68: aload_0
      69: aconst_null
      70: putfield      #257                // Field l:Landroid/widget/PopupWindow$OnDismissListener;
      73: aload_0
      74: getfield      #67                 // Field d:Landroid/support/v7/view/menu/h;
      77: iconst_0
      78: invokevirtual #282                // Method android/support/v7/view/menu/h.b:(Z)V
      81: aload_2
      82: aload_0
      83: getfield      #129                // Field a:Landroid/support/v7/widget/ay;
      86: invokevirtual #285                // Method android/support/v7/widget/ay.j:()I
      89: aload_0
      90: getfield      #129                // Field a:Landroid/support/v7/widget/ay;
      93: invokevirtual #287                // Method android/support/v7/widget/ay.k:()I
      96: invokevirtual #290                // Method android/support/v7/view/menu/n.a:(II)Z
      99: ifeq          122
     102: aload_0
     103: getfield      #250                // Field n:Landroid/support/v7/view/menu/o$a;
     106: ifnull        120
     109: aload_0
     110: getfield      #250                // Field n:Landroid/support/v7/view/menu/o$a;
     113: aload_1
     114: invokeinterface #292,  2          // InterfaceMethod android/support/v7/view/menu/o$a.a:(Landroid/support/v7/view/menu/h;)Z
     119: pop
     120: iconst_1
     121: ireturn
     122: iconst_0
     123: ireturn

  public void b(int);
    Code:
       0: aload_0
       1: getfield      #129                // Field a:Landroid/support/v7/widget/ay;
       4: iload_1
       5: invokevirtual #294                // Method android/support/v7/widget/ay.c:(I)V
       8: return

  public void b(boolean);
    Code:
       0: aload_0
       1: getfield      #82                 // Field e:Landroid/support/v7/view/menu/g;
       4: iload_1
       5: invokevirtual #295                // Method android/support/v7/view/menu/g.a:(Z)V
       8: return

  public android.os.Parcelable c();
    Code:
       0: aconst_null
       1: areturn

  public void c(int);
    Code:
       0: aload_0
       1: getfield      #129                // Field a:Landroid/support/v7/widget/ay;
       4: iload_1
       5: invokevirtual #298                // Method android/support/v7/widget/ay.d:(I)V
       8: return

  public void c(boolean);
    Code:
       0: aload_0
       1: iload_1
       2: putfield      #208                // Field t:Z
       5: return

  public void d();
    Code:
       0: aload_0
       1: invokespecial #300                // Method j:()Z
       4: ifne          18
       7: new           #302                // class java/lang/IllegalStateException
      10: dup
      11: ldc_w         #304                // String StandardMenuPopup cannot be used without an anchor
      14: invokespecial #307                // Method java/lang/IllegalStateException."<init>":(Ljava/lang/String;)V
      17: athrow
      18: return

  public void e();
    Code:
       0: aload_0
       1: invokevirtual #143                // Method f:()Z
       4: ifeq          14
       7: aload_0
       8: getfield      #129                // Field a:Landroid/support/v7/widget/ay;
      11: invokevirtual #308                // Method android/support/v7/widget/ay.e:()V
      14: return

  public boolean f();
    Code:
       0: aload_0
       1: getfield      #145                // Field p:Z
       4: ifne          19
       7: aload_0
       8: getfield      #129                // Field a:Landroid/support/v7/widget/ay;
      11: invokevirtual #309                // Method android/support/v7/widget/ay.f:()Z
      14: ifeq          19
      17: iconst_1
      18: ireturn
      19: iconst_0
      20: ireturn

  public android.widget.ListView g();
    Code:
       0: aload_0
       1: getfield      #129                // Field a:Landroid/support/v7/widget/ay;
       4: invokevirtual #200                // Method android/support/v7/widget/ay.g:()Landroid/widget/ListView;
       7: areturn

  public void onDismiss();
    Code:
       0: aload_0
       1: iconst_1
       2: putfield      #145                // Field p:Z
       5: aload_0
       6: getfield      #67                 // Field d:Landroid/support/v7/view/menu/h;
       9: invokevirtual #313                // Method android/support/v7/view/menu/h.close:()V
      12: aload_0
      13: getfield      #138                // Field o:Landroid/view/ViewTreeObserver;
      16: ifnull        56
      19: aload_0
      20: getfield      #138                // Field o:Landroid/view/ViewTreeObserver;
      23: invokevirtual #316                // Method android/view/ViewTreeObserver.isAlive:()Z
      26: ifne          40
      29: aload_0
      30: aload_0
      31: getfield      #147                // Field b:Landroid/view/View;
      34: invokevirtual #162                // Method android/view/View.getViewTreeObserver:()Landroid/view/ViewTreeObserver;
      37: putfield      #138                // Field o:Landroid/view/ViewTreeObserver;
      40: aload_0
      41: getfield      #138                // Field o:Landroid/view/ViewTreeObserver;
      44: aload_0
      45: getfield      #58                 // Field j:Landroid/view/ViewTreeObserver$OnGlobalLayoutListener;
      48: invokevirtual #319                // Method android/view/ViewTreeObserver.removeGlobalOnLayoutListener:(Landroid/view/ViewTreeObserver$OnGlobalLayoutListener;)V
      51: aload_0
      52: aconst_null
      53: putfield      #138                // Field o:Landroid/view/ViewTreeObserver;
      56: aload_0
      57: getfield      #147                // Field b:Landroid/view/View;
      60: aload_0
      61: getfield      #61                 // Field k:Landroid/view/View$OnAttachStateChangeListener;
      64: invokevirtual #322                // Method android/view/View.removeOnAttachStateChangeListener:(Landroid/view/View$OnAttachStateChangeListener;)V
      67: aload_0
      68: getfield      #257                // Field l:Landroid/widget/PopupWindow$OnDismissListener;
      71: ifnull        83
      74: aload_0
      75: getfield      #257                // Field l:Landroid/widget/PopupWindow$OnDismissListener;
      78: invokeinterface #324,  1          // InterfaceMethod android/widget/PopupWindow$OnDismissListener.onDismiss:()V
      83: return

  public boolean onKey(android.view.View, int, android.view.KeyEvent);
    Code:
       0: aload_3
       1: invokevirtual #331                // Method android/view/KeyEvent.getAction:()I
       4: iconst_1
       5: if_icmpne     20
       8: iload_2
       9: bipush        82
      11: if_icmpne     20
      14: aload_0
      15: invokevirtual #248                // Method e:()V
      18: iconst_1
      19: ireturn
      20: iconst_0
      21: ireturn
}
