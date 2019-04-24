public class ryey.easer.core.ui.data.condition.b<T extends ryey.easer.commons.local_plugin.a.a> extends ryey.easer.core.ui.data.h<T> {
  public ryey.easer.core.ui.data.condition.b();
    Code:
       0: aload_0
       1: invokespecial #9                  // Method ryey/easer/core/ui/data/h."<init>":()V
       4: return

  static <T extends ryey.easer.commons.local_plugin.a.a> ryey.easer.core.ui.data.condition.b<T> a(ryey.easer.commons.local_plugin.a.c<T>);
    Code:
       0: new           #14                 // class android/os/Bundle
       3: dup
       4: invokespecial #15                 // Method android/os/Bundle."<init>":()V
       7: astore_1
       8: aload_1
       9: ldc           #17                 // String plugin
      11: aload_0
      12: invokeinterface #22,  1           // InterfaceMethod ryey/easer/commons/local_plugin/a/c.a:()Ljava/lang/String;
      17: invokevirtual #26                 // Method android/os/Bundle.putString:(Ljava/lang/String;Ljava/lang/String;)V
      20: new           #2                  // class ryey/easer/core/ui/data/condition/b
      23: dup
      24: invokespecial #27                 // Method "<init>":()V
      27: astore_0
      28: aload_0
      29: aload_1
      30: invokevirtual #31                 // Method setArguments:(Landroid/os/Bundle;)V
      33: aload_0
      34: areturn

  public ryey.easer.commons.local_plugin.f a();
    Code:
       0: aload_0
       1: invokevirtual #46                 // Method b:()Lryey/easer/commons/local_plugin/a/a;
       4: areturn

  public T b();
    Code:
       0: aload_0
       1: invokespecial #48                 // Method ryey/easer/core/ui/data/h.a:()Lryey/easer/commons/local_plugin/f;
       4: checkcast     #50                 // class ryey/easer/commons/local_plugin/a/a
       7: areturn

  public void onCreate(android.os.Bundle);
    Code:
       0: aload_0
       1: aload_1
       2: invokespecial #54                 // Method ryey/easer/core/ui/data/h.onCreate:(Landroid/os/Bundle;)V
       5: aload_0
       6: invokevirtual #58                 // Method getArguments:()Landroid/os/Bundle;
       9: ldc           #17                 // String plugin
      11: invokevirtual #62                 // Method android/os/Bundle.getString:(Ljava/lang/String;)Ljava/lang/String;
      14: astore_1
      15: aload_0
      16: invokestatic  #67                 // Method ryey/easer/plugins/b.a:()Lryey/easer/plugins/b;
      19: invokevirtual #71                 // Method ryey/easer/plugins/b.d:()Lryey/easer/plugins/b$c;
      22: aload_1
      23: invokevirtual #76                 // Method ryey/easer/plugins/b$c.b:(Ljava/lang/String;)Lryey/easer/commons/local_plugin/d;
      26: checkcast     #19                 // class ryey/easer/commons/local_plugin/a/c
      29: invokeinterface #79,  1           // InterfaceMethod ryey/easer/commons/local_plugin/a/c.d:()Lryey/easer/commons/local_plugin/e;
      34: putfield      #38                 // Field b:Lryey/easer/commons/local_plugin/e;
      37: return

  public android.view.View onCreateView(android.view.LayoutInflater, android.view.ViewGroup, android.os.Bundle);
    Code:
       0: aload_1
       1: ldc           #82                 // int 2131427393
       3: aload_2
       4: iconst_0
       5: invokevirtual #88                 // Method android/view/LayoutInflater.inflate:(ILandroid/view/ViewGroup;Z)Landroid/view/View;
       8: astore_1
       9: aload_0
      10: invokevirtual #92                 // Method getChildFragmentManager:()Landroid/support/v4/app/n;
      13: invokevirtual #97                 // Method android/support/v4/app/n.a:()Landroid/support/v4/app/u;
      16: ldc           #98                 // int 2131296354
      18: aload_0
      19: getfield      #38                 // Field b:Lryey/easer/commons/local_plugin/e;
      22: invokevirtual #103                // Method android/support/v4/app/u.b:(ILandroid/support/v4/app/i;)Landroid/support/v4/app/u;
      25: invokevirtual #107                // Method android/support/v4/app/u.c:()I
      28: pop
      29: aload_1
      30: areturn

  public void onRequestPermissionsResult(int, java.lang.String[], int[]);
    Code:
       0: iload_1
       1: iconst_1
       2: if_icmpne     32
       5: iconst_0
       6: istore_1
       7: iload_1
       8: aload_3
       9: arraylength
      10: if_icmpge     27
      13: aload_3
      14: iload_1
      15: iaload
      16: ifeq          20
      19: return
      20: iload_1
      21: iconst_1
      22: iadd
      23: istore_1
      24: goto          7
      27: aload_0
      28: iconst_1
      29: invokespecial #111                // Method b:(Z)V
      32: return

  public void onStart();
    Code:
       0: aload_0
       1: invokespecial #114                // Method ryey/easer/core/ui/data/h.onStart:()V
       4: invokestatic  #67                 // Method ryey/easer/plugins/b.a:()Lryey/easer/plugins/b;
       7: invokevirtual #71                 // Method ryey/easer/plugins/b.d:()Lryey/easer/plugins/b$c;
      10: aload_0
      11: getfield      #38                 // Field b:Lryey/easer/commons/local_plugin/e;
      14: invokevirtual #117                // Method ryey/easer/plugins/b$c.a:(Lryey/easer/commons/local_plugin/e;)Lryey/easer/commons/local_plugin/d;
      17: checkcast     #19                 // class ryey/easer/commons/local_plugin/a/c
      20: astore_1
      21: aload_1
      22: aload_0
      23: invokevirtual #121                // Method getContext:()Landroid/content/Context;
      26: invokeinterface #124,  2          // InterfaceMethod ryey/easer/commons/local_plugin/a/c.b:(Landroid/content/Context;)Z
      31: ifne          50
      34: aload_0
      35: iconst_0
      36: invokespecial #111                // Method b:(Z)V
      39: aload_1
      40: aload_0
      41: invokevirtual #128                // Method getActivity:()Landroid/support/v4/app/j;
      44: iconst_1
      45: invokeinterface #131,  3          // InterfaceMethod ryey/easer/commons/local_plugin/a/c.a:(Landroid/app/Activity;I)V
      50: return
}
