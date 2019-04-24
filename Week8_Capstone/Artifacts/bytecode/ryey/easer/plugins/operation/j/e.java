public class ryey.easer.plugins.operation.j.e extends ryey.easer.plugins.c<ryey.easer.plugins.operation.j.b> {
  public ryey.easer.plugins.operation.j.e();
    Code:
       0: aload_0
       1: invokespecial #11                 // Method ryey/easer/plugins/c."<init>":()V
       4: return

  public ryey.easer.commons.local_plugin.f a();
    Code:
       0: aload_0
       1: invokevirtual #17                 // Method b:()Lryey/easer/plugins/operation/j/b;
       4: areturn

  protected void a(ryey.easer.plugins.operation.j.b);
    Code:
       0: aload_0
       1: getfield      #20                 // Field a:Landroid/widget/EditText;
       4: aload_1
       5: getfield      #25                 // Field ryey/easer/plugins/operation/j/b.a:Ljava/lang/String;
       8: invokevirtual #31                 // Method android/widget/EditText.setText:(Ljava/lang/CharSequence;)V
      11: return

  public ryey.easer.plugins.operation.j.b b();
    Code:
       0: new           #22                 // class ryey/easer/plugins/operation/j/b
       3: dup
       4: aload_0
       5: getfield      #20                 // Field a:Landroid/widget/EditText;
       8: invokevirtual #35                 // Method android/widget/EditText.getText:()Landroid/text/Editable;
      11: invokevirtual #41                 // Method java/lang/Object.toString:()Ljava/lang/String;
      14: invokespecial #44                 // Method ryey/easer/plugins/operation/j/b."<init>":(Ljava/lang/String;)V
      17: areturn

  protected void b(ryey.easer.commons.local_plugin.f);
    Code:
       0: aload_0
       1: aload_1
       2: checkcast     #22                 // class ryey/easer/plugins/operation/j/b
       5: invokevirtual #47                 // Method a:(Lryey/easer/plugins/operation/j/b;)V
       8: return

  public android.view.View onCreateView(android.view.LayoutInflater, android.view.ViewGroup, android.os.Bundle);
    Code:
       0: aload_1
       1: ldc           #50                 // int 2131427451
       3: aload_2
       4: iconst_0
       5: invokevirtual #56                 // Method android/view/LayoutInflater.inflate:(ILandroid/view/ViewGroup;Z)Landroid/view/View;
       8: astore_1
       9: aload_0
      10: aload_1
      11: ldc           #57                 // int 2131296384
      13: invokevirtual #63                 // Method android/view/View.findViewById:(I)Landroid/view/View;
      16: checkcast     #27                 // class android/widget/EditText
      19: putfield      #20                 // Field a:Landroid/widget/EditText;
      22: aload_1
      23: areturn
}
