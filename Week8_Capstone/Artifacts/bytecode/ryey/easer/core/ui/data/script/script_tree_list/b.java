public class ryey.easer.core.ui.data.script.script_tree_list.b extends android.support.v4.app.i implements ryey.easer.core.ui.data.f {
  java.lang.ref.WeakReference<ryey.easer.core.ui.data.e> a;

  ryey.easer.core.a.a.e b;

  ryey.easer.core.ui.data.script.script_tree_list.RecyclerViewWithContext c;

  ryey.easer.core.ui.data.script.script_tree_list.c d;

  java.util.List<b.a.a.b> e;

  public ryey.easer.core.ui.data.script.script_tree_list.b();
    Code:
       0: aload_0
       1: invokespecial #30                 // Method android/support/v4/app/i."<init>":()V
       4: return

  static ryey.easer.core.ui.data.script.script_tree_list.a a(ryey.easer.core.ui.data.script.script_tree_list.b, ryey.easer.core.ui.data.script.script_tree_list.a);
    Code:
       0: aload_0
       1: aload_1
       2: putfield      #104                // Field f:Lryey/easer/core/ui/data/script/script_tree_list/a;
       5: aload_1
       6: areturn

  public void a(ryey.easer.core.ui.data.e);
    Code:
       0: aload_0
       1: new           #139                // class java/lang/ref/WeakReference
       4: dup
       5: aload_1
       6: invokespecial #153                // Method java/lang/ref/WeakReference."<init>":(Ljava/lang/Object;)V
       9: putfield      #137                // Field a:Ljava/lang/ref/WeakReference;
      12: return

  public void a(boolean);
    Code:
       0: iload_1
       1: ifeq          8
       4: aload_0
       5: invokevirtual #155                // Method d:()V
       8: return

  public int a_();
    Code:
       0: ldc           #157                // int 2131624095
       2: ireturn

  public android.content.Intent b_();
    Code:
       0: new           #161                // class android/content/Intent
       3: dup
       4: aload_0
       5: invokevirtual #165                // Method getContext:()Landroid/content/Context;
       8: ldc           #167                // class ryey/easer/core/ui/data/script/EditScriptActivity
      10: invokespecial #170                // Method android/content/Intent."<init>":(Landroid/content/Context;Ljava/lang/Class;)V
      13: areturn

  public java.lang.String c();
    Code:
       0: aload_0
       1: ldc           #171                // int 2131624312
       3: invokevirtual #175                // Method getString:(I)Ljava/lang/String;
       6: areturn

  protected void d();
    Code:
       0: aload_0
       1: invokespecial #177                // Method e:()V
       4: return

  public void onAttach(android.content.Context);
    Code:
       0: aload_0
       1: aload_1
       2: invokespecial #181                // Method android/support/v4/app/i.onAttach:(Landroid/content/Context;)V
       5: aload_0
       6: new           #113                // class ryey/easer/core/a/a/e
       9: dup
      10: aload_0
      11: invokevirtual #165                // Method getContext:()Landroid/content/Context;
      14: invokespecial #183                // Method ryey/easer/core/a/a/e."<init>":(Landroid/content/Context;)V
      17: putfield      #111                // Field b:Lryey/easer/core/a/a/e;
      20: return

  public boolean onContextItemSelected(android.view.MenuItem);
    Code:
       0: aload_0
       1: getfield      #104                // Field f:Lryey/easer/core/ui/data/script/script_tree_list/a;
       4: getfield      #188                // Field ryey/easer/core/ui/data/script/script_tree_list/a.a:Ljava/lang/String;
       7: astore_3
       8: aload_1
       9: invokeinterface #193,  1          // InterfaceMethod android/view/MenuItem.getItemId:()I
      14: istore_2
      15: iload_2
      16: ldc           #194                // int 2131296273
      18: if_icmpeq     51
      21: iload_2
      22: ldc           #195                // int 2131296275
      24: if_icmpeq     33
      27: aload_0
      28: aload_1
      29: invokespecial #197                // Method android/support/v4/app/i.onContextItemSelected:(Landroid/view/MenuItem;)Z
      32: ireturn
      33: aload_0
      34: getfield      #137                // Field a:Ljava/lang/ref/WeakReference;
      37: invokevirtual #142                // Method java/lang/ref/WeakReference.get:()Ljava/lang/Object;
      40: checkcast     #144                // class ryey/easer/core/ui/data/e
      43: aload_3
      44: invokeinterface #200,  2          // InterfaceMethod ryey/easer/core/ui/data/e.a:(Ljava/lang/String;)V
      49: iconst_1
      50: ireturn
      51: aload_0
      52: getfield      #137                // Field a:Ljava/lang/ref/WeakReference;
      55: invokevirtual #142                // Method java/lang/ref/WeakReference.get:()Ljava/lang/Object;
      58: checkcast     #144                // class ryey/easer/core/ui/data/e
      61: aload_3
      62: invokeinterface #202,  2          // InterfaceMethod ryey/easer/core/ui/data/e.b:(Ljava/lang/String;)V
      67: iconst_1
      68: ireturn

  public void onCreateOptionsMenu(android.view.Menu, android.view.MenuInflater);
    Code:
       0: aload_2
       1: ldc           #205                // int 2131492872
       3: aload_1
       4: invokevirtual #211                // Method android/view/MenuInflater.inflate:(ILandroid/view/Menu;)V
       7: return

  public android.view.View onCreateView(android.view.LayoutInflater, android.view.ViewGroup, android.os.Bundle);
    Code:
       0: aload_1
       1: ldc           #214                // int 2131427398
       3: aload_2
       4: iconst_0
       5: invokevirtual #219                // Method android/view/LayoutInflater.inflate:(ILandroid/view/ViewGroup;Z)Landroid/view/View;
       8: astore_1
       9: aload_0
      10: invokevirtual #223                // Method getActivity:()Landroid/support/v4/app/j;
      13: aload_0
      14: invokevirtual #225                // Method c:()Ljava/lang/String;
      17: invokevirtual #231                // Method android/support/v4/app/j.setTitle:(Ljava/lang/CharSequence;)V
      20: aload_0
      21: iconst_1
      22: invokevirtual #234                // Method setHasOptionsMenu:(Z)V
      25: aload_0
      26: aload_1
      27: ldc           #235                // int 2131296576
      29: invokevirtual #241                // Method android/view/View.findViewById:(I)Landroid/view/View;
      32: checkcast     #243                // class ryey/easer/core/ui/data/script/script_tree_list/RecyclerViewWithContext
      35: putfield      #245                // Field c:Lryey/easer/core/ui/data/script/script_tree_list/RecyclerViewWithContext;
      38: aload_0
      39: getfield      #245                // Field c:Lryey/easer/core/ui/data/script/script_tree_list/RecyclerViewWithContext;
      42: new           #247                // class android/support/v7/widget/LinearLayoutManager
      45: dup
      46: aload_0
      47: invokevirtual #165                // Method getContext:()Landroid/content/Context;
      50: invokespecial #248                // Method android/support/v7/widget/LinearLayoutManager."<init>":(Landroid/content/Context;)V
      53: invokevirtual #252                // Method ryey/easer/core/ui/data/script/script_tree_list/RecyclerViewWithContext.setLayoutManager:(Landroid/support/v7/widget/RecyclerView$i;)V
      56: aload_0
      57: aload_0
      58: getfield      #245                // Field c:Lryey/easer/core/ui/data/script/script_tree_list/RecyclerViewWithContext;
      61: invokevirtual #256                // Method registerForContextMenu:(Landroid/view/View;)V
      64: aload_0
      65: getfield      #245                // Field c:Lryey/easer/core/ui/data/script/script_tree_list/RecyclerViewWithContext;
      68: new           #8                  // class ryey/easer/core/ui/data/script/script_tree_list/b$1
      71: dup
      72: aload_0
      73: invokespecial #259                // Method ryey/easer/core/ui/data/script/script_tree_list/b$1."<init>":(Lryey/easer/core/ui/data/script/script_tree_list/b;)V
      76: invokevirtual #263                // Method ryey/easer/core/ui/data/script/script_tree_list/RecyclerViewWithContext.setOnCreateContextMenuListener:(Landroid/view/View$OnCreateContextMenuListener;)V
      79: aload_0
      80: aload_0
      81: getfield      #111                // Field b:Lryey/easer/core/a/a/e;
      84: invokevirtual #115                // Method ryey/easer/core/a/a/e.b:()Ljava/util/List;
      87: invokestatic  #117                // Method a:(Ljava/util/List;)Ljava/util/List;
      90: putfield      #106                // Field e:Ljava/util/List;
      93: aload_0
      94: new           #121                // class ryey/easer/core/ui/data/script/script_tree_list/c
      97: dup
      98: aload_0
      99: getfield      #106                // Field e:Ljava/util/List;
     102: aload_0
     103: invokevirtual #165                // Method getContext:()Landroid/content/Context;
     106: invokespecial #266                // Method ryey/easer/core/ui/data/script/script_tree_list/c."<init>":(Ljava/util/List;Landroid/content/Context;)V
     109: putfield      #119                // Field d:Lryey/easer/core/ui/data/script/script_tree_list/c;
     112: aload_0
     113: getfield      #245                // Field c:Lryey/easer/core/ui/data/script/script_tree_list/RecyclerViewWithContext;
     116: aload_0
     117: getfield      #119                // Field d:Lryey/easer/core/ui/data/script/script_tree_list/c;
     120: invokevirtual #270                // Method ryey/easer/core/ui/data/script/script_tree_list/RecyclerViewWithContext.setAdapter:(Landroid/support/v7/widget/RecyclerView$a;)V
     123: aload_0
     124: getfield      #119                // Field d:Lryey/easer/core/ui/data/script/script_tree_list/c;
     127: new           #10                 // class ryey/easer/core/ui/data/script/script_tree_list/b$2
     130: dup
     131: aload_0
     132: invokespecial #271                // Method ryey/easer/core/ui/data/script/script_tree_list/b$2."<init>":(Lryey/easer/core/ui/data/script/script_tree_list/b;)V
     135: invokevirtual #274                // Method ryey/easer/core/ui/data/script/script_tree_list/c.a:(Lryey/easer/core/ui/data/script/script_tree_list/c$c;)V
     138: aload_0
     139: getfield      #119                // Field d:Lryey/easer/core/ui/data/script/script_tree_list/c;
     142: new           #12                 // class ryey/easer/core/ui/data/script/script_tree_list/b$3
     145: dup
     146: aload_0
     147: invokespecial #275                // Method ryey/easer/core/ui/data/script/script_tree_list/b$3."<init>":(Lryey/easer/core/ui/data/script/script_tree_list/b;)V
     150: invokevirtual #278                // Method ryey/easer/core/ui/data/script/script_tree_list/c.a:(Lb/a/a/c$a;)V
     153: aload_1
     154: areturn

  public void onDetach();
    Code:
       0: aload_0
       1: invokespecial #281                // Method android/support/v4/app/i.onDetach:()V
       4: aload_0
       5: aconst_null
       6: putfield      #111                // Field b:Lryey/easer/core/a/a/e;
       9: return

  public boolean onOptionsItemSelected(android.view.MenuItem);
    Code:
       0: aload_1
       1: invokeinterface #193,  1          // InterfaceMethod android/view/MenuItem.getItemId:()I
       6: ldc_w         #283                // int 2131296283
       9: if_icmpne     32
      12: aload_0
      13: getfield      #137                // Field a:Ljava/lang/ref/WeakReference;
      16: invokevirtual #142                // Method java/lang/ref/WeakReference.get:()Ljava/lang/Object;
      19: checkcast     #144                // class ryey/easer/core/ui/data/e
      22: getstatic     #288                // Field ryey/easer/core/ui/data/e$a.a:Lryey/easer/core/ui/data/e$a;
      25: invokeinterface #291,  2          // InterfaceMethod ryey/easer/core/ui/data/e.b:(Lryey/easer/core/ui/data/e$a;)V
      30: iconst_1
      31: ireturn
      32: iconst_0
      33: ireturn
}
