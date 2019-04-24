public class ryey.easer.core.ui.data.script.a extends ryey.easer.core.ui.data.a {
  static {};
    Code:
       0: ldc           #8                  // String [ScriptListFragment]
       2: putstatic     #12                 // Field i:Ljava/lang/String;
       5: return

  public ryey.easer.core.ui.data.script.a();
    Code:
       0: aload_0
       1: invokespecial #16                 // Method ryey/easer/core/ui/data/a."<init>":()V
       4: return

  public int a_();
    Code:
       0: ldc           #19                 // int 2131624095
       2: ireturn

  public android.content.Intent b_();
    Code:
       0: new           #23                 // class android/content/Intent
       3: dup
       4: aload_0
       5: invokevirtual #27                 // Method getActivity:()Landroid/support/v4/app/j;
       8: ldc           #29                 // class ryey/easer/core/ui/data/script/EditScriptActivity
      10: invokespecial #32                 // Method android/content/Intent."<init>":(Landroid/content/Context;Ljava/lang/Class;)V
      13: areturn

  public java.lang.String c();
    Code:
       0: aload_0
       1: ldc           #35                 // int 2131624312
       3: invokevirtual #39                 // Method getString:(I)Ljava/lang/String;
       6: areturn

  protected java.util.List<ryey.easer.core.ui.data.a$b> d();
    Code:
       0: new           #43                 // class ryey/easer/core/a/a/e
       3: dup
       4: aload_0
       5: invokevirtual #47                 // Method getContext:()Landroid/content/Context;
       8: invokespecial #50                 // Method ryey/easer/core/a/a/e."<init>":(Landroid/content/Context;)V
      11: astore_2
      12: new           #52                 // class java/util/ArrayList
      15: dup
      16: invokespecial #53                 // Method java/util/ArrayList."<init>":()V
      19: astore_3
      20: aload_2
      21: invokevirtual #56                 // Method ryey/easer/core/a/a/e.a:()Ljava/util/List;
      24: invokeinterface #62,  1           // InterfaceMethod java/util/List.iterator:()Ljava/util/Iterator;
      29: astore        4
      31: aload         4
      33: invokeinterface #68,  1           // InterfaceMethod java/util/Iterator.hasNext:()Z
      38: ifeq          126
      41: aload         4
      43: invokeinterface #72,  1           // InterfaceMethod java/util/Iterator.next:()Ljava/lang/Object;
      48: checkcast     #74                 // class java/lang/String
      51: astore_1
      52: aload_2
      53: aload_1
      54: invokevirtual #77                 // Method ryey/easer/core/a/a/e.a:(Ljava/lang/String;)Lryey/easer/core/a/f;
      57: checkcast     #79                 // class ryey/easer/core/a/j
      60: astore        5
      62: aload         5
      64: invokevirtual #82                 // Method ryey/easer/core/a/j.h:()Z
      67: ifeq          104
      70: aload         5
      72: invokevirtual #85                 // Method ryey/easer/core/a/j.b:()Z
      75: ifeq          90
      78: new           #87                 // class ryey/easer/core/ui/data/a$b
      81: dup
      82: aload_1
      83: invokespecial #90                 // Method ryey/easer/core/ui/data/a$b."<init>":(Ljava/lang/String;)V
      86: astore_1
      87: goto          115
      90: new           #87                 // class ryey/easer/core/ui/data/a$b
      93: dup
      94: aload_1
      95: ldc           #91                 // int 2131099699
      97: invokespecial #94                 // Method ryey/easer/core/ui/data/a$b."<init>":(Ljava/lang/String;I)V
     100: astore_1
     101: goto          115
     104: new           #87                 // class ryey/easer/core/ui/data/a$b
     107: dup
     108: aload_1
     109: ldc           #95                 // int 2131099700
     111: invokespecial #94                 // Method ryey/easer/core/ui/data/a$b."<init>":(Ljava/lang/String;I)V
     114: astore_1
     115: aload_3
     116: aload_1
     117: invokeinterface #99,  2           // InterfaceMethod java/util/List.add:(Ljava/lang/Object;)Z
     122: pop
     123: goto          31
     126: aload_3
     127: areturn

  protected void f();
    Code:
       0: aload_0
       1: invokespecial #104                // Method ryey/easer/core/ui/data/a.f:()V
       4: aload_0
       5: invokevirtual #47                 // Method getContext:()Landroid/content/Context;
       8: invokestatic  #108                // Method ryey/easer/core/EHService.c:(Landroid/content/Context;)V
      11: return

  public void onCreateOptionsMenu(android.view.Menu, android.view.MenuInflater);
    Code:
       0: aload_2
       1: ldc           #111                // int 2131492871
       3: aload_1
       4: invokevirtual #117                // Method android/view/MenuInflater.inflate:(ILandroid/view/Menu;)V
       7: return

  public boolean onOptionsItemSelected(android.view.MenuItem);
    Code:
       0: aload_1
       1: invokeinterface #124,  1          // InterfaceMethod android/view/MenuItem.getItemId:()I
       6: ldc           #125                // int 2131296289
       8: if_icmpne     31
      11: aload_0
      12: getfield      #129                // Field j:Ljava/lang/ref/WeakReference;
      15: invokevirtual #134                // Method java/lang/ref/WeakReference.get:()Ljava/lang/Object;
      18: checkcast     #136                // class ryey/easer/core/ui/data/e
      21: getstatic     #141                // Field ryey/easer/core/ui/data/e$a.b:Lryey/easer/core/ui/data/e$a;
      24: invokeinterface #144,  2          // InterfaceMethod ryey/easer/core/ui/data/e.b:(Lryey/easer/core/ui/data/e$a;)V
      29: iconst_1
      30: ireturn
      31: iconst_0
      32: ireturn
}
