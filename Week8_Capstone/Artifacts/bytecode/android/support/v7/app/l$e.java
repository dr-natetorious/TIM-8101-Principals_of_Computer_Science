final class android.support.v7.app.l$e implements android.support.v7.view.menu.o$a {
  final android.support.v7.app.l a;

  android.support.v7.app.l$e(android.support.v7.app.l);
    Code:
       0: aload_0
       1: aload_1
       2: putfield      #15                 // Field a:Landroid/support/v7/app/l;
       5: aload_0
       6: invokespecial #18                 // Method java/lang/Object."<init>":()V
       9: return

  public void a(android.support.v7.view.menu.h, boolean);
    Code:
       0: aload_1
       1: invokevirtual #26                 // Method android/support/v7/view/menu/h.p:()Landroid/support/v7/view/menu/h;
       4: astore        4
       6: aload         4
       8: aload_1
       9: if_acmpeq     17
      12: iconst_1
      13: istore_3
      14: goto          19
      17: iconst_0
      18: istore_3
      19: aload_0
      20: getfield      #15                 // Field a:Landroid/support/v7/app/l;
      23: astore        5
      25: iload_3
      26: ifeq          32
      29: aload         4
      31: astore_1
      32: aload         5
      34: aload_1
      35: invokevirtual #29                 // Method android/support/v7/app/l.a:(Landroid/view/Menu;)Landroid/support/v7/app/l$d;
      38: astore_1
      39: aload_1
      40: ifnull        80
      43: iload_3
      44: ifeq          71
      47: aload_0
      48: getfield      #15                 // Field a:Landroid/support/v7/app/l;
      51: aload_1
      52: getfield      #34                 // Field android/support/v7/app/l$d.a:I
      55: aload_1
      56: aload         4
      58: invokevirtual #37                 // Method android/support/v7/app/l.a:(ILandroid/support/v7/app/l$d;Landroid/view/Menu;)V
      61: aload_0
      62: getfield      #15                 // Field a:Landroid/support/v7/app/l;
      65: aload_1
      66: iconst_1
      67: invokevirtual #40                 // Method android/support/v7/app/l.a:(Landroid/support/v7/app/l$d;Z)V
      70: return
      71: aload_0
      72: getfield      #15                 // Field a:Landroid/support/v7/app/l;
      75: aload_1
      76: iload_2
      77: invokevirtual #40                 // Method android/support/v7/app/l.a:(Landroid/support/v7/app/l$d;Z)V
      80: return

  public boolean a(android.support.v7.view.menu.h);
    Code:
       0: aload_1
       1: ifnonnull     46
       4: aload_0
       5: getfield      #15                 // Field a:Landroid/support/v7/app/l;
       8: getfield      #45                 // Field android/support/v7/app/l.h:Z
      11: ifeq          46
      14: aload_0
      15: getfield      #15                 // Field a:Landroid/support/v7/app/l;
      18: invokevirtual #49                 // Method android/support/v7/app/l.r:()Landroid/view/Window$Callback;
      21: astore_2
      22: aload_2
      23: ifnull        46
      26: aload_0
      27: getfield      #15                 // Field a:Landroid/support/v7/app/l;
      30: invokevirtual #53                 // Method android/support/v7/app/l.q:()Z
      33: ifne          46
      36: aload_2
      37: bipush        108
      39: aload_1
      40: invokeinterface #59,  3           // InterfaceMethod android/view/Window$Callback.onMenuOpened:(ILandroid/view/Menu;)Z
      45: pop
      46: iconst_1
      47: ireturn
}
