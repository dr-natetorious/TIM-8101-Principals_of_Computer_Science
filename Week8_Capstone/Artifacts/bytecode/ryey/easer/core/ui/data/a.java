public abstract class ryey.easer.core.ui.data.a extends android.support.v4.app.y implements ryey.easer.core.ui.data.f {
  protected static java.lang.String i;

  protected java.lang.ref.WeakReference<ryey.easer.core.ui.data.e> j;

  static {};
    Code:
       0: return

  public ryey.easer.core.ui.data.a();
    Code:
       0: aload_0
       1: invokespecial #25                 // Method android/support/v4/app/y."<init>":()V
       4: return

  public void a(android.widget.ListView, android.view.View, int, long);
    Code:
       0: aload_0
       1: aload_1
       2: aload_2
       3: iload_3
       4: lload         4
       6: invokespecial #28                 // Method android/support/v4/app/y.a:(Landroid/widget/ListView;Landroid/view/View;IJ)V
       9: aload_1
      10: iload_3
      11: invokevirtual #34                 // Method android/widget/ListView.getItemAtPosition:(I)Ljava/lang/Object;
      14: checkcast     #11                 // class ryey/easer/core/ui/data/a$b
      17: astore_1
      18: aload_0
      19: getfield      #36                 // Field j:Ljava/lang/ref/WeakReference;
      22: invokevirtual #42                 // Method java/lang/ref/WeakReference.get:()Ljava/lang/Object;
      25: checkcast     #44                 // class ryey/easer/core/ui/data/e
      28: aload_1
      29: getfield      #46                 // Field ryey/easer/core/ui/data/a$b.a:Ljava/lang/String;
      32: invokeinterface #49,  2           // InterfaceMethod ryey/easer/core/ui/data/e.a:(Ljava/lang/String;)V
      37: return

  public void a(ryey.easer.core.ui.data.e);
    Code:
       0: aload_0
       1: new           #38                 // class java/lang/ref/WeakReference
       4: dup
       5: aload_1
       6: invokespecial #53                 // Method java/lang/ref/WeakReference."<init>":(Ljava/lang/Object;)V
       9: putfield      #36                 // Field j:Ljava/lang/ref/WeakReference;
      12: return

  public void a(boolean);
    Code:
       0: iload_1
       1: ifeq          8
       4: aload_0
       5: invokevirtual #57                 // Method f:()V
       8: return

  public abstract java.lang.String c();

  protected abstract java.util.List<ryey.easer.core.ui.data.a$b> d();

  protected void e();
    Code:
       0: new           #64                 // class java/lang/StringBuilder
       3: dup
       4: invokespecial #65                 // Method java/lang/StringBuilder."<init>":()V
       7: astore_1
       8: aload_1
       9: getstatic     #67                 // Field i:Ljava/lang/String;
      12: invokevirtual #71                 // Method java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
      15: pop
      16: aload_1
      17: ldc           #73                 // String reloadList()
      19: invokevirtual #71                 // Method java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
      22: pop
      23: aload_1
      24: invokevirtual #76                 // Method java/lang/StringBuilder.toString:()Ljava/lang/String;
      27: invokestatic  #80                 // Method com/b/a/i.a:(Ljava/lang/Object;)V
      30: aload_0
      31: invokevirtual #82                 // Method d:()Ljava/util/List;
      34: astore_1
      35: new           #64                 // class java/lang/StringBuilder
      38: dup
      39: invokespecial #65                 // Method java/lang/StringBuilder."<init>":()V
      42: astore_2
      43: aload_2
      44: getstatic     #67                 // Field i:Ljava/lang/String;
      47: invokevirtual #71                 // Method java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
      50: pop
      51: aload_2
      52: ldc           #84                 // String All item: %s
      54: invokevirtual #71                 // Method java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
      57: pop
      58: aload_2
      59: invokevirtual #76                 // Method java/lang/StringBuilder.toString:()Ljava/lang/String;
      62: iconst_1
      63: anewarray     #86                 // class java/lang/Object
      66: dup
      67: iconst_0
      68: aload_1
      69: aastore
      70: invokestatic  #89                 // Method com/b/a/i.d:(Ljava/lang/String;[Ljava/lang/Object;)V
      73: aload_0
      74: invokevirtual #92                 // Method b:()Landroid/widget/ListAdapter;
      77: checkcast     #8                  // class ryey/easer/core/ui/data/a$a
      80: astore_2
      81: aload_2
      82: invokevirtual #95                 // Method ryey/easer/core/ui/data/a$a.clear:()V
      85: aload_2
      86: aload_1
      87: invokevirtual #99                 // Method ryey/easer/core/ui/data/a$a.addAll:(Ljava/util/Collection;)V
      90: aload_2
      91: invokevirtual #102                // Method ryey/easer/core/ui/data/a$a.notifyDataSetChanged:()V
      94: aload_0
      95: invokevirtual #92                 // Method b:()Landroid/widget/ListAdapter;
      98: invokeinterface #108,  1          // InterfaceMethod android/widget/ListAdapter.getCount:()I
     103: ifne          138
     106: ldc           #110                // String %s: no item
     108: iconst_1
     109: anewarray     #86                 // class java/lang/Object
     112: dup
     113: iconst_0
     114: getstatic     #67                 // Field i:Ljava/lang/String;
     117: aastore
     118: invokestatic  #112                // Method com/b/a/i.a:(Ljava/lang/String;[Ljava/lang/Object;)V
     121: aload_0
     122: getfield      #36                 // Field j:Ljava/lang/ref/WeakReference;
     125: invokevirtual #42                 // Method java/lang/ref/WeakReference.get:()Ljava/lang/Object;
     128: checkcast     #44                 // class ryey/easer/core/ui/data/e
     131: iconst_1
     132: invokeinterface #114,  2          // InterfaceMethod ryey/easer/core/ui/data/e.a:(Z)V
     137: return
     138: ldc           #116                // String %s: has item
     140: iconst_1
     141: anewarray     #86                 // class java/lang/Object
     144: dup
     145: iconst_0
     146: getstatic     #67                 // Field i:Ljava/lang/String;
     149: aastore
     150: invokestatic  #112                // Method com/b/a/i.a:(Ljava/lang/String;[Ljava/lang/Object;)V
     153: aload_0
     154: getfield      #36                 // Field j:Ljava/lang/ref/WeakReference;
     157: invokevirtual #42                 // Method java/lang/ref/WeakReference.get:()Ljava/lang/Object;
     160: checkcast     #44                 // class ryey/easer/core/ui/data/e
     163: iconst_0
     164: invokeinterface #114,  2          // InterfaceMethod ryey/easer/core/ui/data/e.a:(Z)V
     169: return

  protected void f();
    Code:
       0: aload_0
       1: invokevirtual #118                // Method e:()V
       4: return

  public void onActivityCreated(android.os.Bundle);
    Code:
       0: aload_0
       1: aload_1
       2: invokespecial #122                // Method android/support/v4/app/y.onActivityCreated:(Landroid/os/Bundle;)V
       5: aload_0
       6: aload_0
       7: invokevirtual #125                // Method a:()Landroid/widget/ListView;
      10: invokevirtual #129                // Method registerForContextMenu:(Landroid/view/View;)V
      13: return

  public void onAttach(android.content.Context);
    Code:
       0: aload_0
       1: aload_1
       2: invokespecial #133                // Method android/support/v4/app/y.onAttach:(Landroid/content/Context;)V
       5: aload_0
       6: new           #8                  // class ryey/easer/core/ui/data/a$a
       9: dup
      10: aload_0
      11: invokevirtual #137                // Method getActivity:()Landroid/support/v4/app/j;
      14: new           #139                // class java/util/ArrayList
      17: dup
      18: invokespecial #140                // Method java/util/ArrayList."<init>":()V
      21: invokespecial #143                // Method ryey/easer/core/ui/data/a$a."<init>":(Landroid/content/Context;Ljava/util/List;)V
      24: invokevirtual #146                // Method a:(Landroid/widget/ListAdapter;)V
      27: return

  public boolean onContextItemSelected(android.view.MenuItem);
    Code:
       0: aload_1
       1: invokeinterface #154,  1          // InterfaceMethod android/view/MenuItem.getMenuInfo:()Landroid/view/ContextMenu$ContextMenuInfo;
       6: checkcast     #156                // class android/widget/AdapterView$AdapterContextMenuInfo
       9: astore_3
      10: aload_0
      11: invokevirtual #125                // Method a:()Landroid/widget/ListView;
      14: aload_3
      15: getfield      #160                // Field android/widget/AdapterView$AdapterContextMenuInfo.position:I
      18: invokevirtual #34                 // Method android/widget/ListView.getItemAtPosition:(I)Ljava/lang/Object;
      21: checkcast     #11                 // class ryey/easer/core/ui/data/a$b
      24: getfield      #46                 // Field ryey/easer/core/ui/data/a$b.a:Ljava/lang/String;
      27: astore_3
      28: aload_1
      29: invokeinterface #163,  1          // InterfaceMethod android/view/MenuItem.getItemId:()I
      34: istore_2
      35: iload_2
      36: ldc           #164                // int 2131296273
      38: if_icmpeq     71
      41: iload_2
      42: ldc           #165                // int 2131296275
      44: if_icmpeq     53
      47: aload_0
      48: aload_1
      49: invokespecial #167                // Method android/support/v4/app/y.onContextItemSelected:(Landroid/view/MenuItem;)Z
      52: ireturn
      53: aload_0
      54: getfield      #36                 // Field j:Ljava/lang/ref/WeakReference;
      57: invokevirtual #42                 // Method java/lang/ref/WeakReference.get:()Ljava/lang/Object;
      60: checkcast     #44                 // class ryey/easer/core/ui/data/e
      63: aload_3
      64: invokeinterface #49,  2           // InterfaceMethod ryey/easer/core/ui/data/e.a:(Ljava/lang/String;)V
      69: iconst_1
      70: ireturn
      71: aload_0
      72: getfield      #36                 // Field j:Ljava/lang/ref/WeakReference;
      75: invokevirtual #42                 // Method java/lang/ref/WeakReference.get:()Ljava/lang/Object;
      78: checkcast     #44                 // class ryey/easer/core/ui/data/e
      81: aload_3
      82: invokeinterface #169,  2          // InterfaceMethod ryey/easer/core/ui/data/e.b:(Ljava/lang/String;)V
      87: iconst_1
      88: ireturn

  public void onCreateContextMenu(android.view.ContextMenu, android.view.View, android.view.ContextMenu$ContextMenuInfo);
    Code:
       0: aload_0
       1: aload_1
       2: aload_2
       3: aload_3
       4: invokespecial #173                // Method android/support/v4/app/y.onCreateContextMenu:(Landroid/view/ContextMenu;Landroid/view/View;Landroid/view/ContextMenu$ContextMenuInfo;)V
       7: aload_0
       8: invokevirtual #137                // Method getActivity:()Landroid/support/v4/app/j;
      11: invokevirtual #179                // Method android/support/v4/app/j.getMenuInflater:()Landroid/view/MenuInflater;
      14: ldc           #180                // int 2131492868
      16: aload_1
      17: invokevirtual #186                // Method android/view/MenuInflater.inflate:(ILandroid/view/Menu;)V
      20: return

  public android.view.View onCreateView(android.view.LayoutInflater, android.view.ViewGroup, android.os.Bundle);
    Code:
       0: aload_1
       1: ldc           #189                // int 2131427385
       3: aload_2
       4: iconst_0
       5: invokevirtual #194                // Method android/view/LayoutInflater.inflate:(ILandroid/view/ViewGroup;Z)Landroid/view/View;
       8: astore_1
       9: aload_0
      10: invokevirtual #137                // Method getActivity:()Landroid/support/v4/app/j;
      13: aload_0
      14: invokevirtual #196                // Method c:()Ljava/lang/String;
      17: invokevirtual #200                // Method android/support/v4/app/j.setTitle:(Ljava/lang/CharSequence;)V
      20: aload_0
      21: iconst_1
      22: invokevirtual #203                // Method setHasOptionsMenu:(Z)V
      25: aload_1
      26: areturn

  public void onResume();
    Code:
       0: aload_0
       1: invokespecial #206                // Method android/support/v4/app/y.onResume:()V
       4: aload_0
       5: invokevirtual #118                // Method e:()V
       8: return
}
