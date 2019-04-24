public class ryey.easer.core.ui.a$a extends android.support.v7.e.a.c<ryey.easer.core.log.a, ryey.easer.core.ui.a$b> {
  static final android.support.v7.g.c$c<ryey.easer.core.log.a> a;

  static {};
    Code:
       0: new           #10                 // class ryey/easer/core/ui/a$a$1
       3: dup
       4: invokespecial #17                 // Method ryey/easer/core/ui/a$a$1."<init>":()V
       7: putstatic     #19                 // Field a:Landroid/support/v7/g/c$c;
      10: return

  ryey.easer.core.ui.a$a();
    Code:
       0: aload_0
       1: getstatic     #19                 // Field a:Landroid/support/v7/g/c$c;
       4: invokespecial #23                 // Method android/support/v7/e/a/c."<init>":(Landroid/support/v7/g/c$c;)V
       7: aload_0
       8: getstatic     #28                 // Field ryey/easer/core/log/ActivityLogService.a:Lryey/easer/core/log/ActivityLogService$b;
      11: invokevirtual #34                 // Method ryey/easer/core/log/ActivityLogService$b.b:()Ljava/util/List;
      14: invokevirtual #37                 // Method a:(Ljava/util/List;)V
      17: return

  public ryey.easer.core.ui.a$b a(android.view.ViewGroup, int);
    Code:
       0: new           #40                 // class ryey/easer/core/ui/a$b
       3: dup
       4: aload_1
       5: invokevirtual #46                 // Method android/view/ViewGroup.getContext:()Landroid/content/Context;
       8: invokestatic  #52                 // Method android/view/LayoutInflater.from:(Landroid/content/Context;)Landroid/view/LayoutInflater;
      11: ldc           #53                 // int 2131427402
      13: aload_1
      14: iconst_0
      15: invokevirtual #57                 // Method android/view/LayoutInflater.inflate:(ILandroid/view/ViewGroup;Z)Landroid/view/View;
      18: new           #59                 // class java/lang/ref/WeakReference
      21: dup
      22: aload_1
      23: invokevirtual #46                 // Method android/view/ViewGroup.getContext:()Landroid/content/Context;
      26: invokespecial #62                 // Method java/lang/ref/WeakReference."<init>":(Ljava/lang/Object;)V
      29: invokespecial #65                 // Method ryey/easer/core/ui/a$b."<init>":(Landroid/view/View;Ljava/lang/ref/WeakReference;)V
      32: areturn

  public void a(android.support.v7.widget.RecyclerView$x, int);
    Code:
       0: aload_0
       1: aload_1
       2: checkcast     #40                 // class ryey/easer/core/ui/a$b
       5: iload_2
       6: invokevirtual #69                 // Method a:(Lryey/easer/core/ui/a$b;I)V
       9: return

  public void a(ryey.easer.core.ui.a$b, int);
    Code:
       0: aload_1
       1: aload_0
       2: iload_2
       3: invokevirtual #73                 // Method c:(I)Ljava/lang/Object;
       6: checkcast     #75                 // class ryey/easer/core/log/a
       9: invokevirtual #78                 // Method ryey/easer/core/ui/a$b.a:(Lryey/easer/core/log/a;)V
      12: return

  public android.support.v7.widget.RecyclerView$x b(android.view.ViewGroup, int);
    Code:
       0: aload_0
       1: aload_1
       2: iload_2
       3: invokevirtual #81                 // Method a:(Landroid/view/ViewGroup;I)Lryey/easer/core/ui/a$b;
       6: areturn
}
