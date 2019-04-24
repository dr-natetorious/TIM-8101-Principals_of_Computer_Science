public class ryey.easer.core.ui.data.profile.c extends ryey.easer.core.ui.data.a {
  static final boolean l;

  ryey.easer.core.a$b k;

  static {};
    Code:
       0: ldc           #13                 // String [ProfileListFragment]
       2: putstatic     #17                 // Field i:Ljava/lang/String;
       5: return

  public ryey.easer.core.ui.data.profile.c();
    Code:
       0: aload_0
       1: invokespecial #21                 // Method ryey/easer/core/ui/data/a."<init>":()V
       4: aload_0
       5: new           #23                 // class ryey/easer/core/a$b
       8: dup
       9: invokespecial #24                 // Method ryey/easer/core/a$b."<init>":()V
      12: putfield      #26                 // Field k:Lryey/easer/core/a$b;
      15: return

  public int a_();
    Code:
       0: ldc           #29                 // int 2131624094
       2: ireturn

  public android.content.Intent b_();
    Code:
       0: new           #33                 // class android/content/Intent
       3: dup
       4: aload_0
       5: invokevirtual #37                 // Method getActivity:()Landroid/support/v4/app/j;
       8: ldc           #39                 // class ryey/easer/core/ui/data/profile/EditProfileActivity
      10: invokespecial #42                 // Method android/content/Intent."<init>":(Landroid/content/Context;Ljava/lang/Class;)V
      13: areturn

  public java.lang.String c();
    Code:
       0: aload_0
       1: ldc           #45                 // int 2131624310
       3: invokevirtual #49                 // Method getString:(I)Ljava/lang/String;
       6: areturn

  protected java.util.List<ryey.easer.core.ui.data.a$b> d();
    Code:
       0: new           #53                 // class ryey/easer/core/a/a/d
       3: dup
       4: aload_0
       5: invokevirtual #57                 // Method getContext:()Landroid/content/Context;
       8: invokespecial #60                 // Method ryey/easer/core/a/a/d."<init>":(Landroid/content/Context;)V
      11: astore        4
      13: new           #62                 // class java/util/ArrayList
      16: dup
      17: invokespecial #63                 // Method java/util/ArrayList."<init>":()V
      20: astore        5
      22: aload         4
      24: invokevirtual #66                 // Method ryey/easer/core/a/a/d.a:()Ljava/util/List;
      27: invokeinterface #72,  1           // InterfaceMethod java/util/List.iterator:()Ljava/util/Iterator;
      32: astore        6
      34: aload         6
      36: invokeinterface #78,  1           // InterfaceMethod java/util/Iterator.hasNext:()Z
      41: ifeq          221
      44: aload         6
      46: invokeinterface #82,  1           // InterfaceMethod java/util/Iterator.next:()Ljava/lang/Object;
      51: checkcast     #84                 // class java/lang/String
      54: astore_3
      55: aload         4
      57: aload_3
      58: invokevirtual #87                 // Method ryey/easer/core/a/a/d.a:(Ljava/lang/String;)Lryey/easer/core/a/f;
      61: checkcast     #89                 // class ryey/easer/core/a/g
      64: astore        7
      66: aload         7
      68: invokevirtual #92                 // Method ryey/easer/core/a/g.b:()Z
      71: istore_1
      72: iload_1
      73: istore_2
      74: iload_1
      75: ifeq          182
      78: aload         7
      80: new           #94                 // class ryey/easer/plugins/operation/n/d
      83: dup
      84: invokespecial #95                 // Method ryey/easer/plugins/operation/n/d."<init>":()V
      87: invokevirtual #97                 // Method ryey/easer/plugins/operation/n/d.a:()Ljava/lang/String;
      90: invokevirtual #100                // Method ryey/easer/core/a/g.b:(Ljava/lang/String;)Ljava/util/Collection;
      93: astore        7
      95: iload_1
      96: istore_2
      97: aload         7
      99: invokeinterface #105,  1          // InterfaceMethod java/util/Collection.size:()I
     104: ifle          182
     107: aload         7
     109: invokeinterface #106,  1          // InterfaceMethod java/util/Collection.iterator:()Ljava/util/Iterator;
     114: astore        7
     116: iload_1
     117: istore_2
     118: aload         7
     120: invokeinterface #78,  1           // InterfaceMethod java/util/Iterator.hasNext:()Z
     125: ifeq          182
     128: aload         7
     130: invokeinterface #82,  1           // InterfaceMethod java/util/Iterator.next:()Ljava/lang/Object;
     135: checkcast     #108                // class ryey/easer/core/a/h
     138: getfield      #111                // Field ryey/easer/core/a/h.a:Lryey/easer/commons/local_plugin/c/b;
     141: checkcast     #113                // class ryey/easer/plugins/operation/n/c
     144: astore        8
     146: getstatic     #115                // Field l:Z
     149: ifne          165
     152: aload         8
     154: ifnonnull     165
     157: new           #117                // class java/lang/AssertionError
     160: dup
     161: invokespecial #118                // Method java/lang/AssertionError."<init>":()V
     164: athrow
     165: aload         8
     167: aload_0
     168: invokevirtual #57                 // Method getContext:()Landroid/content/Context;
     171: invokevirtual #121                // Method ryey/easer/plugins/operation/n/c.a:(Landroid/content/Context;)Z
     174: ifne          116
     177: iconst_0
     178: istore_1
     179: goto          116
     182: iload_2
     183: ifeq          207
     186: new           #123                // class ryey/easer/core/ui/data/a$b
     189: dup
     190: aload_3
     191: invokespecial #126                // Method ryey/easer/core/ui/data/a$b."<init>":(Ljava/lang/String;)V
     194: astore_3
     195: aload         5
     197: aload_3
     198: invokeinterface #130,  2          // InterfaceMethod java/util/List.add:(Ljava/lang/Object;)Z
     203: pop
     204: goto          34
     207: new           #123                // class ryey/easer/core/ui/data/a$b
     210: dup
     211: aload_3
     212: ldc           #131                // int 2131099699
     214: invokespecial #134                // Method ryey/easer/core/ui/data/a$b."<init>":(Ljava/lang/String;I)V
     217: astore_3
     218: goto          195
     221: aload         5
     223: areturn

  public boolean onContextItemSelected(android.view.MenuItem);
    Code:
       0: aload_1
       1: invokeinterface #144,  1          // InterfaceMethod android/view/MenuItem.getMenuInfo:()Landroid/view/ContextMenu$ContextMenuInfo;
       6: checkcast     #146                // class android/widget/AdapterView$AdapterContextMenuInfo
       9: astore_2
      10: aload_0
      11: invokevirtual #149                // Method a:()Landroid/widget/ListView;
      14: aload_2
      15: getfield      #153                // Field android/widget/AdapterView$AdapterContextMenuInfo.position:I
      18: invokevirtual #159                // Method android/widget/ListView.getItemAtPosition:(I)Ljava/lang/Object;
      21: checkcast     #123                // class ryey/easer/core/ui/data/a$b
      24: getfield      #161                // Field ryey/easer/core/ui/data/a$b.a:Ljava/lang/String;
      27: astore_2
      28: aload_1
      29: invokeinterface #164,  1          // InterfaceMethod android/view/MenuItem.getItemId:()I
      34: ldc           #165                // int 2131296290
      36: if_icmpne     49
      39: aload_0
      40: getfield      #26                 // Field k:Lryey/easer/core/a$b;
      43: aload_2
      44: invokevirtual #167                // Method ryey/easer/core/a$b.a:(Ljava/lang/String;)V
      47: iconst_1
      48: ireturn
      49: aload_0
      50: aload_1
      51: invokespecial #169                // Method ryey/easer/core/ui/data/a.onContextItemSelected:(Landroid/view/MenuItem;)Z
      54: ireturn

  public void onCreateContextMenu(android.view.ContextMenu, android.view.View, android.view.ContextMenu$ContextMenuInfo);
    Code:
       0: aload_0
       1: invokevirtual #37                 // Method getActivity:()Landroid/support/v4/app/j;
       4: invokevirtual #177                // Method android/support/v4/app/j.getMenuInflater:()Landroid/view/MenuInflater;
       7: ldc           #178                // int 2131492870
       9: aload_1
      10: invokevirtual #184                // Method android/view/MenuInflater.inflate:(ILandroid/view/Menu;)V
      13: return

  public void onPause();
    Code:
       0: aload_0
       1: invokespecial #187                // Method ryey/easer/core/ui/data/a.onPause:()V
       4: aload_0
       5: getfield      #26                 // Field k:Lryey/easer/core/a$b;
       8: aload_0
       9: invokevirtual #57                 // Method getContext:()Landroid/content/Context;
      12: invokevirtual #189                // Method ryey/easer/core/a$b.b:(Landroid/content/Context;)V
      15: return

  public void onResume();
    Code:
       0: aload_0
       1: invokespecial #192                // Method ryey/easer/core/ui/data/a.onResume:()V
       4: aload_0
       5: getfield      #26                 // Field k:Lryey/easer/core/a$b;
       8: aload_0
       9: invokevirtual #57                 // Method getContext:()Landroid/content/Context;
      12: invokevirtual #194                // Method ryey/easer/core/a$b.a:(Landroid/content/Context;)V
      15: return

  public void onViewCreated(android.view.View, android.os.Bundle);
    Code:
       0: invokestatic  #201                // Method ryey/easer/plugins/b.a:()Lryey/easer/plugins/b;
       3: invokevirtual #204                // Method ryey/easer/plugins/b.c:()Lryey/easer/plugins/b$c;
       6: aload_0
       7: invokevirtual #57                 // Method getContext:()Landroid/content/Context;
      10: invokevirtual #209                // Method ryey/easer/plugins/b$c.a:(Landroid/content/Context;)Ljava/util/List;
      13: invokeinterface #210,  1          // InterfaceMethod java/util/List.size:()I
      18: ifne          33
      21: aload_1
      22: ldc           #211                // int 2131296412
      24: invokevirtual #217                // Method android/view/View.findViewById:(I)Landroid/view/View;
      27: checkcast     #219                // class android/support/design/widget/FloatingActionButton
      30: invokevirtual #221                // Method android/support/design/widget/FloatingActionButton.a:()V
      33: return
}
