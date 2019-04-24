public class ryey.easer.plugins.operation.n.e extends ryey.easer.plugins.c<ryey.easer.plugins.operation.n.c> {
  public ryey.easer.plugins.operation.n.e();
    Code:
       0: aload_0
       1: invokespecial #11                 // Method ryey/easer/plugins/c."<init>":()V
       4: return

  public ryey.easer.commons.local_plugin.f a();
    Code:
       0: aload_0
       1: invokevirtual #17                 // Method b:()Lryey/easer/plugins/operation/n/c;
       4: areturn

  protected void a(ryey.easer.plugins.operation.n.c);
    Code:
       0: aload_0
       1: getfield      #20                 // Field a:Lryey/easer/commons/a/a;
       4: aload_1
       5: getfield      #25                 // Field ryey/easer/plugins/operation/n/c.a:Ljava/lang/String;
       8: invokevirtual #30                 // Method ryey/easer/commons/a/a.a:(Ljava/lang/String;)V
      11: return

  public ryey.easer.plugins.operation.n.c b();
    Code:
       0: new           #22                 // class ryey/easer/plugins/operation/n/c
       3: dup
       4: aload_0
       5: getfield      #20                 // Field a:Lryey/easer/commons/a/a;
       8: invokevirtual #34                 // Method ryey/easer/commons/a/a.c:()Ljava/lang/String;
      11: iconst_0
      12: invokespecial #37                 // Method ryey/easer/plugins/operation/n/c."<init>":(Ljava/lang/String;Z)V
      15: areturn

  protected void b(ryey.easer.commons.local_plugin.f);
    Code:
       0: aload_0
       1: aload_1
       2: checkcast     #22                 // class ryey/easer/plugins/operation/n/c
       5: invokevirtual #40                 // Method a:(Lryey/easer/plugins/operation/n/c;)V
       8: return

  public android.view.View onCreateView(android.view.LayoutInflater, android.view.ViewGroup, android.os.Bundle);
    Code:
       0: aload_1
       1: ldc           #43                 // int 2131427447
       3: aload_2
       4: iconst_0
       5: invokevirtual #49                 // Method android/view/LayoutInflater.inflate:(ILandroid/view/ViewGroup;Z)Landroid/view/View;
       8: astore_1
       9: aload_0
      10: new           #27                 // class ryey/easer/commons/a/a
      13: dup
      14: aload_0
      15: invokevirtual #53                 // Method getContext:()Landroid/content/Context;
      18: aload_1
      19: ldc           #54                 // int 2131296626
      21: invokevirtual #60                 // Method android/view/View.findViewById:(I)Landroid/view/View;
      24: checkcast     #62                 // class android/widget/Spinner
      27: invokespecial #65                 // Method ryey/easer/commons/a/a."<init>":(Landroid/content/Context;Landroid/widget/Spinner;)V
      30: putfield      #20                 // Field a:Lryey/easer/commons/a/a;
      33: aload_0
      34: getfield      #20                 // Field a:Lryey/easer/commons/a/a;
      37: invokevirtual #68                 // Method ryey/easer/commons/a/a.a:()Lryey/easer/commons/a/a;
      40: iconst_0
      41: invokevirtual #71                 // Method ryey/easer/commons/a/a.a:(Z)Lryey/easer/commons/a/a;
      44: new           #73                 // class ryey/easer/core/a/a/e
      47: dup
      48: aload_0
      49: invokevirtual #53                 // Method getContext:()Landroid/content/Context;
      52: invokespecial #76                 // Method ryey/easer/core/a/a/e."<init>":(Landroid/content/Context;)V
      55: invokevirtual #79                 // Method ryey/easer/core/a/a/e.a:()Ljava/util/List;
      58: invokevirtual #82                 // Method ryey/easer/commons/a/a.a:(Ljava/util/List;)Lryey/easer/commons/a/a;
      61: invokevirtual #84                 // Method ryey/easer/commons/a/a.b:()V
      64: aload_1
      65: areturn
}
