public class ryey.easer.core.ui.data.event.a extends ryey.easer.core.ui.data.a {
  static {};
    Code:
       0: ldc           #8                  // String [EventListFragment]
       2: putstatic     #12                 // Field i:Ljava/lang/String;
       5: return

  public ryey.easer.core.ui.data.event.a();
    Code:
       0: aload_0
       1: invokespecial #16                 // Method ryey/easer/core/ui/data/a."<init>":()V
       4: return

  public int a_();
    Code:
       0: ldc           #19                 // int 2131624093
       2: ireturn

  public android.content.Intent b_();
    Code:
       0: new           #23                 // class android/content/Intent
       3: dup
       4: aload_0
       5: invokevirtual #27                 // Method getContext:()Landroid/content/Context;
       8: ldc           #29                 // class ryey/easer/core/ui/data/event/EditEventActivity
      10: invokespecial #32                 // Method android/content/Intent."<init>":(Landroid/content/Context;Ljava/lang/Class;)V
      13: areturn

  public java.lang.String c();
    Code:
       0: aload_0
       1: ldc           #35                 // int 2131624304
       3: invokevirtual #39                 // Method getString:(I)Ljava/lang/String;
       6: areturn

  protected java.util.List<ryey.easer.core.ui.data.a$b> d();
    Code:
       0: new           #43                 // class ryey/easer/core/a/a/c
       3: dup
       4: aload_0
       5: invokevirtual #27                 // Method getContext:()Landroid/content/Context;
       8: invokespecial #46                 // Method ryey/easer/core/a/a/c."<init>":(Landroid/content/Context;)V
      11: astore_2
      12: new           #48                 // class java/util/ArrayList
      15: dup
      16: invokespecial #49                 // Method java/util/ArrayList."<init>":()V
      19: astore_3
      20: aload_2
      21: invokevirtual #52                 // Method ryey/easer/core/a/a/c.a:()Ljava/util/List;
      24: invokeinterface #58,  1           // InterfaceMethod java/util/List.iterator:()Ljava/util/Iterator;
      29: astore        4
      31: aload         4
      33: invokeinterface #64,  1           // InterfaceMethod java/util/Iterator.hasNext:()Z
      38: ifeq          100
      41: aload         4
      43: invokeinterface #68,  1           // InterfaceMethod java/util/Iterator.next:()Ljava/lang/Object;
      48: checkcast     #70                 // class java/lang/String
      51: astore_1
      52: aload_2
      53: aload_1
      54: invokevirtual #73                 // Method ryey/easer/core/a/a/c.a:(Ljava/lang/String;)Lryey/easer/core/a/f;
      57: checkcast     #75                 // class ryey/easer/core/a/c
      60: invokevirtual #78                 // Method ryey/easer/core/a/c.b:()Z
      63: ifeq          86
      66: new           #80                 // class ryey/easer/core/ui/data/a$b
      69: dup
      70: aload_1
      71: invokespecial #83                 // Method ryey/easer/core/ui/data/a$b."<init>":(Ljava/lang/String;)V
      74: astore_1
      75: aload_3
      76: aload_1
      77: invokeinterface #87,  2           // InterfaceMethod java/util/List.add:(Ljava/lang/Object;)Z
      82: pop
      83: goto          31
      86: new           #80                 // class ryey/easer/core/ui/data/a$b
      89: dup
      90: aload_1
      91: ldc           #88                 // int 2131099699
      93: invokespecial #91                 // Method ryey/easer/core/ui/data/a$b."<init>":(Ljava/lang/String;I)V
      96: astore_1
      97: goto          75
     100: aload_3
     101: areturn

  protected void f();
    Code:
       0: aload_0
       1: invokespecial #96                 // Method ryey/easer/core/ui/data/a.f:()V
       4: aload_0
       5: invokevirtual #27                 // Method getContext:()Landroid/content/Context;
       8: invokestatic  #100                // Method ryey/easer/core/EHService.c:(Landroid/content/Context;)V
      11: return

  public void onViewCreated(android.view.View, android.os.Bundle);
    Code:
       0: invokestatic  #107                // Method ryey/easer/plugins/b.a:()Lryey/easer/plugins/b;
       3: invokevirtual #110                // Method ryey/easer/plugins/b.b:()Lryey/easer/plugins/b$c;
       6: aload_0
       7: invokevirtual #27                 // Method getContext:()Landroid/content/Context;
      10: invokevirtual #115                // Method ryey/easer/plugins/b$c.a:(Landroid/content/Context;)Ljava/util/List;
      13: invokeinterface #118,  1          // InterfaceMethod java/util/List.size:()I
      18: ifne          33
      21: aload_1
      22: ldc           #119                // int 2131296412
      24: invokevirtual #125                // Method android/view/View.findViewById:(I)Landroid/view/View;
      27: checkcast     #127                // class android/support/design/widget/FloatingActionButton
      30: invokevirtual #129                // Method android/support/design/widget/FloatingActionButton.a:()V
      33: return
}
