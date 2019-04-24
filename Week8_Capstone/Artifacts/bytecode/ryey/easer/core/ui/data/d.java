public final class ryey.easer.core.ui.data.d extends android.support.v4.app.i implements ryey.easer.core.ui.data.e {
  static final boolean a;

  static {};
    Code:
       0: return

  public ryey.easer.core.ui.data.d();
    Code:
       0: aload_0
       1: invokespecial #25                 // Method android/support/v4/app/i."<init>":()V
       4: return

  public static ryey.easer.core.ui.data.d a(ryey.easer.core.ui.data.e$a);
    Code:
       0: new           #2                  // class ryey/easer/core/ui/data/d
       3: dup
       4: invokespecial #27                 // Method "<init>":()V
       7: astore_1
       8: new           #29                 // class android/os/Bundle
      11: dup
      12: invokespecial #30                 // Method android/os/Bundle."<init>":()V
      15: astore_2
      16: aload_2
      17: ldc           #32                 // String list_type
      19: aload_0
      20: invokevirtual #36                 // Method android/os/Bundle.putSerializable:(Ljava/lang/String;Ljava/io/Serializable;)V
      23: aload_1
      24: aload_2
      25: invokevirtual #40                 // Method setArguments:(Landroid/os/Bundle;)V
      28: aload_1
      29: areturn

  public void a();
    Code:
       0: aload_0
       1: getfield      #42                 // Field d:Lryey/easer/core/ui/data/f;
       4: invokeinterface #48,  1           // InterfaceMethod ryey/easer/core/ui/data/f.b_:()Landroid/content/Intent;
       9: astore_1
      10: aload_1
      11: ldc           #50                 // String ryey.easer.PURPOSE
      13: getstatic     #55                 // Field ryey/easer/core/ui/data/g$a.a:Lryey/easer/core/ui/data/g$a;
      16: invokevirtual #61                 // Method android/content/Intent.putExtra:(Ljava/lang/String;Ljava/io/Serializable;)Landroid/content/Intent;
      19: pop
      20: aload_0
      21: aload_1
      22: bipush        10
      24: invokevirtual #65                 // Method startActivityForResult:(Landroid/content/Intent;I)V
      27: return

  public void a(java.lang.String);
    Code:
       0: aload_0
       1: getfield      #42                 // Field d:Lryey/easer/core/ui/data/f;
       4: invokeinterface #48,  1           // InterfaceMethod ryey/easer/core/ui/data/f.b_:()Landroid/content/Intent;
       9: astore_2
      10: aload_2
      11: ldc           #50                 // String ryey.easer.PURPOSE
      13: getstatic     #68                 // Field ryey/easer/core/ui/data/g$a.b:Lryey/easer/core/ui/data/g$a;
      16: invokevirtual #61                 // Method android/content/Intent.putExtra:(Ljava/lang/String;Ljava/io/Serializable;)Landroid/content/Intent;
      19: pop
      20: aload_2
      21: ldc           #70                 // String ryey.easer.EVENT.NAME
      23: aload_1
      24: invokevirtual #73                 // Method android/content/Intent.putExtra:(Ljava/lang/String;Ljava/lang/String;)Landroid/content/Intent;
      27: pop
      28: aload_0
      29: aload_2
      30: bipush        10
      32: invokevirtual #65                 // Method startActivityForResult:(Landroid/content/Intent;I)V
      35: return

  public void a(boolean);
    Code:
       0: iload_1
       1: ifeq          29
       4: aload_0
       5: getfield      #76                 // Field b:Landroid/widget/TextView;
       8: iconst_0
       9: invokevirtual #82                 // Method android/widget/TextView.setVisibility:(I)V
      12: aload_0
      13: getfield      #76                 // Field b:Landroid/widget/TextView;
      16: aload_0
      17: getfield      #42                 // Field d:Lryey/easer/core/ui/data/f;
      20: invokeinterface #86,  1           // InterfaceMethod ryey/easer/core/ui/data/f.a_:()I
      25: invokevirtual #89                 // Method android/widget/TextView.setText:(I)V
      28: return
      29: aload_0
      30: getfield      #76                 // Field b:Landroid/widget/TextView;
      33: bipush        8
      35: invokevirtual #82                 // Method android/widget/TextView.setVisibility:(I)V
      38: return

  public void b(java.lang.String);
    Code:
       0: aload_0
       1: getfield      #42                 // Field d:Lryey/easer/core/ui/data/f;
       4: invokeinterface #48,  1           // InterfaceMethod ryey/easer/core/ui/data/f.b_:()Landroid/content/Intent;
       9: astore_2
      10: aload_2
      11: ldc           #50                 // String ryey.easer.PURPOSE
      13: getstatic     #91                 // Field ryey/easer/core/ui/data/g$a.c:Lryey/easer/core/ui/data/g$a;
      16: invokevirtual #61                 // Method android/content/Intent.putExtra:(Ljava/lang/String;Ljava/io/Serializable;)Landroid/content/Intent;
      19: pop
      20: aload_2
      21: ldc           #70                 // String ryey.easer.EVENT.NAME
      23: aload_1
      24: invokevirtual #73                 // Method android/content/Intent.putExtra:(Ljava/lang/String;Ljava/lang/String;)Landroid/content/Intent;
      27: pop
      28: aload_0
      29: aload_2
      30: bipush        10
      32: invokevirtual #65                 // Method startActivityForResult:(Landroid/content/Intent;I)V
      35: return

  public void b(ryey.easer.core.ui.data.e$a);
    Code:
       0: getstatic     #95                 // Field ryey/easer/core/ui/data/d$2.a:[I
       3: aload_1
       4: invokevirtual #100                // Method ryey/easer/core/ui/data/e$a.ordinal:()I
       7: iaload
       8: tableswitch   { // 1 to 5
                     1: 98
                     2: 87
                     3: 76
                     4: 65
                     5: 54
               default: 44
          }
      44: new           #102                // class java/lang/IllegalStateException
      47: dup
      48: ldc           #104                // String Unexpected List Fragment type
      50: invokespecial #106                // Method java/lang/IllegalStateException."<init>":(Ljava/lang/String;)V
      53: athrow
      54: new           #108                // class ryey/easer/core/ui/data/profile/c
      57: dup
      58: invokespecial #109                // Method ryey/easer/core/ui/data/profile/c."<init>":()V
      61: astore_1
      62: goto          106
      65: new           #111                // class ryey/easer/core/ui/data/condition/a
      68: dup
      69: invokespecial #112                // Method ryey/easer/core/ui/data/condition/a."<init>":()V
      72: astore_1
      73: goto          106
      76: new           #114                // class ryey/easer/core/ui/data/event/a
      79: dup
      80: invokespecial #115                // Method ryey/easer/core/ui/data/event/a."<init>":()V
      83: astore_1
      84: goto          106
      87: new           #117                // class ryey/easer/core/ui/data/script/script_tree_list/b
      90: dup
      91: invokespecial #118                // Method ryey/easer/core/ui/data/script/script_tree_list/b."<init>":()V
      94: astore_1
      95: goto          106
      98: new           #120                // class ryey/easer/core/ui/data/script/a
     101: dup
     102: invokespecial #121                // Method ryey/easer/core/ui/data/script/a."<init>":()V
     105: astore_1
     106: aload_0
     107: aload_1
     108: putfield      #123                // Field c:Landroid/support/v4/app/i;
     111: aload_0
     112: aload_0
     113: getfield      #123                // Field c:Landroid/support/v4/app/i;
     116: checkcast     #44                 // class ryey/easer/core/ui/data/f
     119: putfield      #42                 // Field d:Lryey/easer/core/ui/data/f;
     122: aload_0
     123: getfield      #42                 // Field d:Lryey/easer/core/ui/data/f;
     126: aload_0
     127: invokeinterface #126,  2          // InterfaceMethod ryey/easer/core/ui/data/f.a:(Lryey/easer/core/ui/data/e;)V
     132: aload_0
     133: invokevirtual #130                // Method getChildFragmentManager:()Landroid/support/v4/app/n;
     136: invokevirtual #135                // Method android/support/v4/app/n.a:()Landroid/support/v4/app/u;
     139: ldc           #136                // int 2131296359
     141: aload_0
     142: getfield      #123                // Field c:Landroid/support/v4/app/i;
     145: invokevirtual #141                // Method android/support/v4/app/u.b:(ILandroid/support/v4/app/i;)Landroid/support/v4/app/u;
     148: invokevirtual #143                // Method android/support/v4/app/u.c:()I
     151: pop
     152: return

  public void onActivityCreated(android.os.Bundle);
    Code:
       0: aload_0
       1: aload_1
       2: invokespecial #146                // Method android/support/v4/app/i.onActivityCreated:(Landroid/os/Bundle;)V
       5: aload_0
       6: iconst_1
       7: invokevirtual #149                // Method setHasOptionsMenu:(Z)V
      10: return

  public void onActivityResult(int, int, android.content.Intent);
    Code:
       0: iload_1
       1: bipush        10
       3: if_icmpne     33
       6: aload_0
       7: getfield      #42                 // Field d:Lryey/easer/core/ui/data/f;
      10: astore_3
      11: iload_2
      12: iconst_m1
      13: if_icmpne     22
      16: iconst_1
      17: istore        4
      19: goto          25
      22: iconst_0
      23: istore        4
      25: aload_3
      26: iload         4
      28: invokeinterface #153,  2          // InterfaceMethod ryey/easer/core/ui/data/f.a:(Z)V
      33: return

  public void onCreateOptionsMenu(android.view.Menu, android.view.MenuInflater);
    Code:
       0: aload_2
       1: ldc           #156                // int 2131492869
       3: aload_1
       4: invokevirtual #162                // Method android/view/MenuInflater.inflate:(ILandroid/view/Menu;)V
       7: return

  public android.view.View onCreateView(android.view.LayoutInflater, android.view.ViewGroup, android.os.Bundle);
    Code:
       0: aload_1
       1: ldc           #165                // int 2131427383
       3: aload_2
       4: iconst_0
       5: invokevirtual #170                // Method android/view/LayoutInflater.inflate:(ILandroid/view/ViewGroup;Z)Landroid/view/View;
       8: astore_1
       9: aload_0
      10: aload_1
      11: ldc           #171                // int 2131296439
      13: invokevirtual #177                // Method android/view/View.findViewById:(I)Landroid/view/View;
      16: checkcast     #78                 // class android/widget/TextView
      19: putfield      #76                 // Field b:Landroid/widget/TextView;
      22: aload_1
      23: ldc           #178                // int 2131296412
      25: invokevirtual #177                // Method android/view/View.findViewById:(I)Landroid/view/View;
      28: checkcast     #180                // class android/support/design/widget/FloatingActionButton
      31: new           #8                  // class ryey/easer/core/ui/data/d$1
      34: dup
      35: aload_0
      36: invokespecial #183                // Method ryey/easer/core/ui/data/d$1."<init>":(Lryey/easer/core/ui/data/d;)V
      39: invokevirtual #187                // Method android/support/design/widget/FloatingActionButton.setOnClickListener:(Landroid/view/View$OnClickListener;)V
      42: aload_0
      43: getfield      #123                // Field c:Landroid/support/v4/app/i;
      46: ifnonnull     105
      49: aload_0
      50: invokevirtual #191                // Method getArguments:()Landroid/os/Bundle;
      53: astore_2
      54: getstatic     #193                // Field a:Z
      57: ifne          72
      60: aload_2
      61: ifnonnull     72
      64: new           #195                // class java/lang/AssertionError
      67: dup
      68: invokespecial #196                // Method java/lang/AssertionError."<init>":()V
      71: athrow
      72: aload_2
      73: ldc           #32                 // String list_type
      75: invokevirtual #200                // Method android/os/Bundle.getSerializable:(Ljava/lang/String;)Ljava/io/Serializable;
      78: checkcast     #97                 // class ryey/easer/core/ui/data/e$a
      81: astore_2
      82: getstatic     #193                // Field a:Z
      85: ifne          100
      88: aload_2
      89: ifnonnull     100
      92: new           #195                // class java/lang/AssertionError
      95: dup
      96: invokespecial #196                // Method java/lang/AssertionError."<init>":()V
      99: athrow
     100: aload_0
     101: aload_2
     102: invokevirtual #202                // Method b:(Lryey/easer/core/ui/data/e$a;)V
     105: aload_1
     106: areturn

  public boolean onOptionsItemSelected(android.view.MenuItem);
    Code:
       0: aload_1
       1: invokeinterface #209,  1          // InterfaceMethod android/view/MenuItem.getItemId:()I
       6: ldc           #210                // int 2131296276
       8: if_icmpne     65
      11: new           #212                // class android/support/v7/app/d$a
      14: dup
      15: aload_0
      16: invokevirtual #216                // Method getContext:()Landroid/content/Context;
      19: invokespecial #219                // Method android/support/v7/app/d$a."<init>":(Landroid/content/Context;)V
      22: ldc           #220                // int 2131623989
      24: aconst_null
      25: invokevirtual #223                // Method android/support/v7/app/d$a.c:(ILandroid/content/DialogInterface$OnClickListener;)Landroid/support/v7/app/d$a;
      28: aload_0
      29: getfield      #42                 // Field d:Lryey/easer/core/ui/data/f;
      32: invokeinterface #86,  1           // InterfaceMethod ryey/easer/core/ui/data/f.a_:()I
      37: invokevirtual #226                // Method android/support/v7/app/d$a.a:(I)Landroid/support/v7/app/d$a;
      40: invokevirtual #229                // Method android/support/v7/app/d$a.b:()Landroid/support/v7/app/d;
      43: astore_1
      44: aload_1
      45: invokevirtual #234                // Method android/app/Dialog.show:()V
      48: aload_1
      49: ldc           #235                // int 16908299
      51: invokevirtual #236                // Method android/app/Dialog.findViewById:(I)Landroid/view/View;
      54: checkcast     #78                 // class android/widget/TextView
      57: invokestatic  #242                // Method android/text/method/LinkMovementMethod.getInstance:()Landroid/text/method/MovementMethod;
      60: invokevirtual #246                // Method android/widget/TextView.setMovementMethod:(Landroid/text/method/MovementMethod;)V
      63: iconst_1
      64: ireturn
      65: iconst_0
      66: ireturn
}
