class android.support.v7.widget.Toolbar$a implements android.support.v7.view.menu.o {
  android.support.v7.view.menu.h a;

  android.support.v7.view.menu.j b;

  final android.support.v7.widget.Toolbar c;

  android.support.v7.widget.Toolbar$a(android.support.v7.widget.Toolbar);
    Code:
       0: aload_0
       1: aload_1
       2: putfield      #18                 // Field c:Landroid/support/v7/widget/Toolbar;
       5: aload_0
       6: invokespecial #21                 // Method java/lang/Object."<init>":()V
       9: return

  public void a(android.content.Context, android.support.v7.view.menu.h);
    Code:
       0: aload_0
       1: getfield      #25                 // Field a:Landroid/support/v7/view/menu/h;
       4: ifnull        26
       7: aload_0
       8: getfield      #27                 // Field b:Landroid/support/v7/view/menu/j;
      11: ifnull        26
      14: aload_0
      15: getfield      #25                 // Field a:Landroid/support/v7/view/menu/h;
      18: aload_0
      19: getfield      #27                 // Field b:Landroid/support/v7/view/menu/j;
      22: invokevirtual #33                 // Method android/support/v7/view/menu/h.d:(Landroid/support/v7/view/menu/j;)Z
      25: pop
      26: aload_0
      27: aload_2
      28: putfield      #25                 // Field a:Landroid/support/v7/view/menu/h;
      31: return

  public void a(android.os.Parcelable);
    Code:
       0: return

  public void a(android.support.v7.view.menu.h, boolean);
    Code:
       0: return

  public void a(android.support.v7.view.menu.o$a);
    Code:
       0: return

  public void a(boolean);
    Code:
       0: aload_0
       1: getfield      #27                 // Field b:Landroid/support/v7/view/menu/j;
       4: ifnull        88
       7: aload_0
       8: getfield      #25                 // Field a:Landroid/support/v7/view/menu/h;
      11: astore        6
      13: iconst_0
      14: istore        4
      16: iload         4
      18: istore_3
      19: aload         6
      21: ifnull        71
      24: aload_0
      25: getfield      #25                 // Field a:Landroid/support/v7/view/menu/h;
      28: invokevirtual #41                 // Method android/support/v7/view/menu/h.size:()I
      31: istore        5
      33: iconst_0
      34: istore_2
      35: iload         4
      37: istore_3
      38: iload_2
      39: iload         5
      41: if_icmpge     71
      44: aload_0
      45: getfield      #25                 // Field a:Landroid/support/v7/view/menu/h;
      48: iload_2
      49: invokevirtual #45                 // Method android/support/v7/view/menu/h.getItem:(I)Landroid/view/MenuItem;
      52: aload_0
      53: getfield      #27                 // Field b:Landroid/support/v7/view/menu/j;
      56: if_acmpne     64
      59: iconst_1
      60: istore_3
      61: goto          71
      64: iload_2
      65: iconst_1
      66: iadd
      67: istore_2
      68: goto          35
      71: iload_3
      72: ifne          88
      75: aload_0
      76: aload_0
      77: getfield      #25                 // Field a:Landroid/support/v7/view/menu/h;
      80: aload_0
      81: getfield      #27                 // Field b:Landroid/support/v7/view/menu/j;
      84: invokevirtual #48                 // Method b:(Landroid/support/v7/view/menu/h;Landroid/support/v7/view/menu/j;)Z
      87: pop
      88: return

  public boolean a();
    Code:
       0: iconst_0
       1: ireturn

  public boolean a(android.support.v7.view.menu.h, android.support.v7.view.menu.j);
    Code:
       0: aload_0
       1: getfield      #18                 // Field c:Landroid/support/v7/widget/Toolbar;
       4: invokevirtual #52                 // Method android/support/v7/widget/Toolbar.i:()V
       7: aload_0
       8: getfield      #18                 // Field c:Landroid/support/v7/widget/Toolbar;
      11: getfield      #55                 // Field android/support/v7/widget/Toolbar.a:Landroid/widget/ImageButton;
      14: invokevirtual #61                 // Method android/widget/ImageButton.getParent:()Landroid/view/ViewParent;
      17: astore_1
      18: aload_1
      19: aload_0
      20: getfield      #18                 // Field c:Landroid/support/v7/widget/Toolbar;
      23: if_acmpeq     61
      26: aload_1
      27: instanceof    #63                 // class android/view/ViewGroup
      30: ifeq          47
      33: aload_1
      34: checkcast     #63                 // class android/view/ViewGroup
      37: aload_0
      38: getfield      #18                 // Field c:Landroid/support/v7/widget/Toolbar;
      41: getfield      #55                 // Field android/support/v7/widget/Toolbar.a:Landroid/widget/ImageButton;
      44: invokevirtual #67                 // Method android/view/ViewGroup.removeView:(Landroid/view/View;)V
      47: aload_0
      48: getfield      #18                 // Field c:Landroid/support/v7/widget/Toolbar;
      51: aload_0
      52: getfield      #18                 // Field c:Landroid/support/v7/widget/Toolbar;
      55: getfield      #55                 // Field android/support/v7/widget/Toolbar.a:Landroid/widget/ImageButton;
      58: invokevirtual #70                 // Method android/support/v7/widget/Toolbar.addView:(Landroid/view/View;)V
      61: aload_0
      62: getfield      #18                 // Field c:Landroid/support/v7/widget/Toolbar;
      65: aload_2
      66: invokevirtual #76                 // Method android/support/v7/view/menu/j.getActionView:()Landroid/view/View;
      69: putfield      #79                 // Field android/support/v7/widget/Toolbar.b:Landroid/view/View;
      72: aload_0
      73: aload_2
      74: putfield      #27                 // Field b:Landroid/support/v7/view/menu/j;
      77: aload_0
      78: getfield      #18                 // Field c:Landroid/support/v7/widget/Toolbar;
      81: getfield      #79                 // Field android/support/v7/widget/Toolbar.b:Landroid/view/View;
      84: invokevirtual #82                 // Method android/view/View.getParent:()Landroid/view/ViewParent;
      87: astore_1
      88: aload_1
      89: aload_0
      90: getfield      #18                 // Field c:Landroid/support/v7/widget/Toolbar;
      93: if_acmpeq     172
      96: aload_1
      97: instanceof    #63                 // class android/view/ViewGroup
     100: ifeq          117
     103: aload_1
     104: checkcast     #63                 // class android/view/ViewGroup
     107: aload_0
     108: getfield      #18                 // Field c:Landroid/support/v7/widget/Toolbar;
     111: getfield      #79                 // Field android/support/v7/widget/Toolbar.b:Landroid/view/View;
     114: invokevirtual #67                 // Method android/view/ViewGroup.removeView:(Landroid/view/View;)V
     117: aload_0
     118: getfield      #18                 // Field c:Landroid/support/v7/widget/Toolbar;
     121: invokevirtual #86                 // Method android/support/v7/widget/Toolbar.j:()Landroid/support/v7/widget/Toolbar$b;
     124: astore_1
     125: aload_1
     126: ldc           #87                 // int 8388611
     128: aload_0
     129: getfield      #18                 // Field c:Landroid/support/v7/widget/Toolbar;
     132: getfield      #90                 // Field android/support/v7/widget/Toolbar.c:I
     135: bipush        112
     137: iand
     138: ior
     139: putfield      #94                 // Field android/support/v7/widget/Toolbar$b.a:I
     142: aload_1
     143: iconst_2
     144: putfield      #96                 // Field android/support/v7/widget/Toolbar$b.b:I
     147: aload_0
     148: getfield      #18                 // Field c:Landroid/support/v7/widget/Toolbar;
     151: getfield      #79                 // Field android/support/v7/widget/Toolbar.b:Landroid/view/View;
     154: aload_1
     155: invokevirtual #100                // Method android/view/View.setLayoutParams:(Landroid/view/ViewGroup$LayoutParams;)V
     158: aload_0
     159: getfield      #18                 // Field c:Landroid/support/v7/widget/Toolbar;
     162: aload_0
     163: getfield      #18                 // Field c:Landroid/support/v7/widget/Toolbar;
     166: getfield      #79                 // Field android/support/v7/widget/Toolbar.b:Landroid/view/View;
     169: invokevirtual #70                 // Method android/support/v7/widget/Toolbar.addView:(Landroid/view/View;)V
     172: aload_0
     173: getfield      #18                 // Field c:Landroid/support/v7/widget/Toolbar;
     176: invokevirtual #103                // Method android/support/v7/widget/Toolbar.k:()V
     179: aload_0
     180: getfield      #18                 // Field c:Landroid/support/v7/widget/Toolbar;
     183: invokevirtual #106                // Method android/support/v7/widget/Toolbar.requestLayout:()V
     186: aload_2
     187: iconst_1
     188: invokevirtual #109                // Method android/support/v7/view/menu/j.e:(Z)V
     191: aload_0
     192: getfield      #18                 // Field c:Landroid/support/v7/widget/Toolbar;
     195: getfield      #79                 // Field android/support/v7/widget/Toolbar.b:Landroid/view/View;
     198: instanceof    #111                // class android/support/v7/view/c
     201: ifeq          219
     204: aload_0
     205: getfield      #18                 // Field c:Landroid/support/v7/widget/Toolbar;
     208: getfield      #79                 // Field android/support/v7/widget/Toolbar.b:Landroid/view/View;
     211: checkcast     #111                // class android/support/v7/view/c
     214: invokeinterface #113,  1          // InterfaceMethod android/support/v7/view/c.a:()V
     219: iconst_1
     220: ireturn

  public boolean a(android.support.v7.view.menu.u);
    Code:
       0: iconst_0
       1: ireturn

  public int b();
    Code:
       0: iconst_0
       1: ireturn

  public boolean b(android.support.v7.view.menu.h, android.support.v7.view.menu.j);
    Code:
       0: aload_0
       1: getfield      #18                 // Field c:Landroid/support/v7/widget/Toolbar;
       4: getfield      #79                 // Field android/support/v7/widget/Toolbar.b:Landroid/view/View;
       7: instanceof    #111                // class android/support/v7/view/c
      10: ifeq          28
      13: aload_0
      14: getfield      #18                 // Field c:Landroid/support/v7/widget/Toolbar;
      17: getfield      #79                 // Field android/support/v7/widget/Toolbar.b:Landroid/view/View;
      20: checkcast     #111                // class android/support/v7/view/c
      23: invokeinterface #116,  1          // InterfaceMethod android/support/v7/view/c.b:()V
      28: aload_0
      29: getfield      #18                 // Field c:Landroid/support/v7/widget/Toolbar;
      32: aload_0
      33: getfield      #18                 // Field c:Landroid/support/v7/widget/Toolbar;
      36: getfield      #79                 // Field android/support/v7/widget/Toolbar.b:Landroid/view/View;
      39: invokevirtual #117                // Method android/support/v7/widget/Toolbar.removeView:(Landroid/view/View;)V
      42: aload_0
      43: getfield      #18                 // Field c:Landroid/support/v7/widget/Toolbar;
      46: aload_0
      47: getfield      #18                 // Field c:Landroid/support/v7/widget/Toolbar;
      50: getfield      #55                 // Field android/support/v7/widget/Toolbar.a:Landroid/widget/ImageButton;
      53: invokevirtual #117                // Method android/support/v7/widget/Toolbar.removeView:(Landroid/view/View;)V
      56: aload_0
      57: getfield      #18                 // Field c:Landroid/support/v7/widget/Toolbar;
      60: aconst_null
      61: putfield      #79                 // Field android/support/v7/widget/Toolbar.b:Landroid/view/View;
      64: aload_0
      65: getfield      #18                 // Field c:Landroid/support/v7/widget/Toolbar;
      68: invokevirtual #120                // Method android/support/v7/widget/Toolbar.l:()V
      71: aload_0
      72: aconst_null
      73: putfield      #27                 // Field b:Landroid/support/v7/view/menu/j;
      76: aload_0
      77: getfield      #18                 // Field c:Landroid/support/v7/widget/Toolbar;
      80: invokevirtual #106                // Method android/support/v7/widget/Toolbar.requestLayout:()V
      83: aload_2
      84: iconst_0
      85: invokevirtual #109                // Method android/support/v7/view/menu/j.e:(Z)V
      88: iconst_1
      89: ireturn

  public android.os.Parcelable c();
    Code:
       0: aconst_null
       1: areturn
}
