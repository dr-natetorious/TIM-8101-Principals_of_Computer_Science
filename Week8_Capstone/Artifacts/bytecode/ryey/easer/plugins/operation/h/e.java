public class ryey.easer.plugins.operation.h.e extends ryey.easer.plugins.c<ryey.easer.plugins.operation.h.b> {
  android.widget.EditText a;

  android.widget.EditText b;

  public ryey.easer.plugins.operation.h.e();
    Code:
       0: aload_0
       1: invokespecial #12                 // Method ryey/easer/plugins/c."<init>":()V
       4: return

  public ryey.easer.commons.local_plugin.f a();
    Code:
       0: aload_0
       1: invokevirtual #17                 // Method b:()Lryey/easer/plugins/operation/h/b;
       4: areturn

  protected void a(ryey.easer.plugins.operation.h.b);
    Code:
       0: aload_0
       1: getfield      #20                 // Field a:Landroid/widget/EditText;
       4: aload_1
       5: getfield      #25                 // Field ryey/easer/plugins/operation/h/b.a:Ljava/lang/String;
       8: invokevirtual #31                 // Method android/widget/EditText.setText:(Ljava/lang/CharSequence;)V
      11: aload_0
      12: getfield      #33                 // Field b:Landroid/widget/EditText;
      15: aload_1
      16: getfield      #35                 // Field ryey/easer/plugins/operation/h/b.b:Ljava/lang/String;
      19: invokevirtual #31                 // Method android/widget/EditText.setText:(Ljava/lang/CharSequence;)V
      22: return

  public ryey.easer.plugins.operation.h.b b();
    Code:
       0: new           #22                 // class ryey/easer/plugins/operation/h/b
       3: dup
       4: aload_0
       5: getfield      #20                 // Field a:Landroid/widget/EditText;
       8: invokevirtual #39                 // Method android/widget/EditText.getText:()Landroid/text/Editable;
      11: invokevirtual #45                 // Method java/lang/Object.toString:()Ljava/lang/String;
      14: aload_0
      15: getfield      #33                 // Field b:Landroid/widget/EditText;
      18: invokevirtual #39                 // Method android/widget/EditText.getText:()Landroid/text/Editable;
      21: invokevirtual #45                 // Method java/lang/Object.toString:()Ljava/lang/String;
      24: invokespecial #48                 // Method ryey/easer/plugins/operation/h/b."<init>":(Ljava/lang/String;Ljava/lang/String;)V
      27: areturn

  protected void b(ryey.easer.commons.local_plugin.f);
    Code:
       0: aload_0
       1: aload_1
       2: checkcast     #22                 // class ryey/easer/plugins/operation/h/b
       5: invokevirtual #51                 // Method a:(Lryey/easer/plugins/operation/h/b;)V
       8: return

  public android.view.View onCreateView(android.view.LayoutInflater, android.view.ViewGroup, android.os.Bundle);
    Code:
       0: aload_1
       1: ldc           #54                 // int 2131427448
       3: aload_2
       4: iconst_0
       5: invokevirtual #60                 // Method android/view/LayoutInflater.inflate:(ILandroid/view/ViewGroup;Z)Landroid/view/View;
       8: astore_1
       9: aload_0
      10: aload_1
      11: ldc           #61                 // int 2131296378
      13: invokevirtual #67                 // Method android/view/View.findViewById:(I)Landroid/view/View;
      16: checkcast     #27                 // class android/widget/EditText
      19: putfield      #20                 // Field a:Landroid/widget/EditText;
      22: aload_0
      23: aload_1
      24: ldc           #68                 // int 2131296377
      26: invokevirtual #67                 // Method android/view/View.findViewById:(I)Landroid/view/View;
      29: checkcast     #27                 // class android/widget/EditText
      32: putfield      #33                 // Field b:Landroid/widget/EditText;
      35: aload_1
      36: areturn
}
