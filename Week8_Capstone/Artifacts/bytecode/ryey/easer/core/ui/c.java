public final class ryey.easer.core.ui.c extends android.support.v4.app.i {
  public static final ryey.easer.core.ui.c$a a;

  static {};
    Code:
       0: new           #6                  // class ryey/easer/core/ui/c$a
       3: dup
       4: aconst_null
       5: invokespecial #26                 // Method ryey/easer/core/ui/c$a."<init>":(La/b/b/a;)V
       8: putstatic     #28                 // Field a:Lryey/easer/core/ui/c$a;
      11: return

  public ryey.easer.core.ui.c();
    Code:
       0: aload_0
       1: invokespecial #31                 // Method android/support/v4/app/i."<init>":()V
       4: return

  public void a();
    Code:
       0: aload_0
       1: getfield      #33                 // Field b:Ljava/util/HashMap;
       4: ifnull        14
       7: aload_0
       8: getfield      #33                 // Field b:Ljava/util/HashMap;
      11: invokevirtual #38                 // Method java/util/HashMap.clear:()V
      14: return

  public android.view.View onCreateView(android.view.LayoutInflater, android.view.ViewGroup, android.os.Bundle);
    Code:
       0: aload_1
       1: ldc           #42                 // String inflater
       3: invokestatic  #47                 // Method a/b/b/c.b:(Ljava/lang/Object;Ljava/lang/String;)V
       6: aload_0
       7: invokevirtual #51                 // Method getActivity:()Landroid/support/v4/app/j;
      10: astore_3
      11: aload_3
      12: ifnull        28
      15: aload_3
      16: aload_0
      17: ldc           #52                 // int 2131624309
      19: invokevirtual #56                 // Method getString:(I)Ljava/lang/String;
      22: checkcast     #58                 // class java/lang/CharSequence
      25: invokevirtual #64                 // Method android/support/v4/app/j.setTitle:(Ljava/lang/CharSequence;)V
      28: aload_1
      29: ldc           #65                 // int 2131427392
      31: aload_2
      32: iconst_0
      33: invokevirtual #71                 // Method android/view/LayoutInflater.inflate:(ILandroid/view/ViewGroup;Z)Landroid/view/View;
      36: astore_1
      37: aload_1
      38: ldc           #73                 // String inflater.inflate(R.layou?_pivot, container, false)
      40: invokestatic  #75                 // Method a/b/b/c.a:(Ljava/lang/Object;Ljava/lang/String;)V
      43: aload_1
      44: ldc           #76                 // int 2131296423
      46: invokevirtual #82                 // Method android/view/View.findViewById:(I)Landroid/view/View;
      49: checkcast     #84                 // class de/blox/graphview/GraphView
      52: astore_2
      53: new           #86                 // class ryey/easer/core/a/a/e
      56: dup
      57: aload_0
      58: invokevirtual #90                 // Method getContext:()Landroid/content/Context;
      61: invokespecial #93                 // Method ryey/easer/core/a/a/e."<init>":(Landroid/content/Context;)V
      64: invokevirtual #96                 // Method ryey/easer/core/a/a/e.b:()Ljava/util/List;
      67: astore        5
      69: new           #98                 // class de/blox/graphview/h
      72: dup
      73: new           #12                 // class ryey/easer/core/ui/c$c
      76: dup
      77: invokespecial #99                 // Method ryey/easer/core/ui/c$c."<init>":()V
      80: invokespecial #102                // Method de/blox/graphview/h."<init>":(Ljava/lang/Object;)V
      83: astore_3
      84: new           #104                // class de/blox/graphview/e
      87: dup
      88: invokespecial #105                // Method de/blox/graphview/e."<init>":()V
      91: astore        4
      93: aload         4
      95: aload_3
      96: invokevirtual #108                // Method de/blox/graphview/e.a:(Lde/blox/graphview/h;)V
      99: aload         5
     101: invokeinterface #114,  1          // InterfaceMethod java/util/List.iterator:()Ljava/util/Iterator;
     106: astore        5
     108: aload         5
     110: invokeinterface #120,  1          // InterfaceMethod java/util/Iterator.hasNext:()Z
     115: ifeq          155
     118: aload         5
     120: invokeinterface #124,  1          // InterfaceMethod java/util/Iterator.next:()Ljava/lang/Object;
     125: checkcast     #126                // class ryey/easer/core/a/k
     128: astore        6
     130: getstatic     #28                 // Field a:Lryey/easer/core/ui/c$a;
     133: astore        7
     135: aload         6
     137: ldc           #128                // String scriptTree
     139: invokestatic  #75                 // Method a/b/b/c.a:(Ljava/lang/Object;Ljava/lang/String;)V
     142: aload         7
     144: aload         6
     146: aload         4
     148: aload_3
     149: invokevirtual #131                // Method ryey/easer/core/ui/c$a.a:(Lryey/easer/core/a/k;Lde/blox/graphview/e;Lde/blox/graphview/h;)V
     152: goto          108
     155: new           #18                 // class ryey/easer/core/ui/c$e
     158: dup
     159: aload_0
     160: aload         4
     162: aload         4
     164: invokespecial #134                // Method ryey/easer/core/ui/c$e."<init>":(Lryey/easer/core/ui/c;Lde/blox/graphview/e;Lde/blox/graphview/e;)V
     167: astore_3
     168: aload_2
     169: ldc           #136                // String graphView
     171: invokestatic  #75                 // Method a/b/b/c.a:(Ljava/lang/Object;Ljava/lang/String;)V
     174: aload_2
     175: aload_3
     176: checkcast     #138                // class de/blox/graphview/f
     179: invokevirtual #142                // Method de/blox/graphview/GraphView.setAdapter:(Lde/blox/graphview/f;)V
     182: aload_3
     183: new           #144                // class de/blox/graphview/b/a
     186: dup
     187: new           #146                // class de/blox/graphview/b/b$a
     190: dup
     191: invokespecial #147                // Method de/blox/graphview/b/b$a."<init>":()V
     194: bipush        100
     196: invokevirtual #150                // Method de/blox/graphview/b/b$a.a:(I)Lde/blox/graphview/b/b$a;
     199: sipush        300
     202: invokevirtual #152                // Method de/blox/graphview/b/b$a.b:(I)Lde/blox/graphview/b/b$a;
     205: sipush        300
     208: invokevirtual #154                // Method de/blox/graphview/b/b$a.c:(I)Lde/blox/graphview/b/b$a;
     211: iconst_1
     212: invokevirtual #156                // Method de/blox/graphview/b/b$a.d:(I)Lde/blox/graphview/b/b$a;
     215: invokevirtual #159                // Method de/blox/graphview/b/b$a.a:()Lde/blox/graphview/b/b;
     218: invokespecial #162                // Method de/blox/graphview/b/a."<init>":(Lde/blox/graphview/b/b;)V
     221: checkcast     #164                // class de/blox/graphview/a
     224: invokevirtual #167                // Method ryey/easer/core/ui/c$e.a:(Lde/blox/graphview/a;)V
     227: aload_1
     228: areturn

  public void onDestroyView();
    Code:
       0: aload_0
       1: invokespecial #170                // Method android/support/v4/app/i.onDestroyView:()V
       4: aload_0
       5: invokevirtual #172                // Method a:()V
       8: return
}
