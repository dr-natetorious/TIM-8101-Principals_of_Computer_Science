public abstract class ryey.easer.plugins.operation.e<T extends ryey.easer.commons.local_plugin.c.b> extends ryey.easer.plugins.c<T> {
  public ryey.easer.plugins.operation.e();
    Code:
       0: aload_0
       1: invokespecial #11                 // Method ryey/easer/plugins/c."<init>":()V
       4: return

  protected void a(T);
    Code:
       0: aload_1
       1: instanceof    #27                 // class ryey/easer/plugins/operation/a
       4: ifeq          26
       7: aload_1
       8: checkcast     #27                 // class ryey/easer/plugins/operation/a
      11: invokevirtual #31                 // Method ryey/easer/plugins/operation/a.c:()Ljava/lang/Boolean;
      14: astore_1
      15: aload_0
      16: getfield      #33                 // Field a:Landroid/widget/Switch;
      19: aload_1
      20: invokevirtual #38                 // Method java/lang/Boolean.booleanValue:()Z
      23: invokestatic  #40                 // Method a:(Landroid/widget/Switch;Z)V
      26: return

  protected java.lang.Boolean b();
    Code:
       0: aload_0
       1: getfield      #33                 // Field a:Landroid/widget/Switch;
       4: invokestatic  #45                 // Method a:(Landroid/widget/Switch;)Z
       7: invokestatic  #49                 // Method java/lang/Boolean.valueOf:(Z)Ljava/lang/Boolean;
      10: areturn

  protected void b(ryey.easer.commons.local_plugin.f);
    Code:
       0: aload_0
       1: aload_1
       2: checkcast     #52                 // class ryey/easer/commons/local_plugin/c/b
       5: invokevirtual #54                 // Method a:(Lryey/easer/commons/local_plugin/c/b;)V
       8: return

  public android.view.View onCreateView(android.view.LayoutInflater, android.view.ViewGroup, android.os.Bundle);
    Code:
       0: aload_1
       1: ldc           #57                 // int 2131427458
       3: aload_2
       4: iconst_0
       5: invokevirtual #63                 // Method android/view/LayoutInflater.inflate:(ILandroid/view/ViewGroup;Z)Landroid/view/View;
       8: astore_1
       9: aload_0
      10: aload_1
      11: ldc           #64                 // int 2131296515
      13: invokevirtual #70                 // Method android/view/View.findViewById:(I)Landroid/view/View;
      16: checkcast     #15                 // class android/widget/Switch
      19: putfield      #33                 // Field a:Landroid/widget/Switch;
      22: aload_1
      23: areturn
}
