public class ryey.easer.plugins.event.l.f extends ryey.easer.plugins.c<ryey.easer.plugins.event.l.b> {
  public ryey.easer.plugins.event.l.f();
    Code:
       0: aload_0
       1: invokespecial #12                 // Method ryey/easer/plugins/c."<init>":()V
       4: return

  public ryey.easer.commons.local_plugin.f a();
    Code:
       0: aload_0
       1: invokevirtual #17                 // Method b:()Lryey/easer/plugins/event/l/b;
       4: areturn

  protected void a(ryey.easer.plugins.event.l.b);
    Code:
       0: aload_1
       1: getfield      #23                 // Field ryey/easer/plugins/event/l/b.a:Lryey/easer/plugins/event/l/e;
       4: astore_1
       5: aload_0
       6: getfield      #25                 // Field a:Landroid/widget/EditText;
       9: aload_1
      10: getfield      #30                 // Field ryey/easer/plugins/event/l/e.a:Ljava/lang/String;
      13: invokevirtual #36                 // Method android/widget/EditText.setText:(Ljava/lang/CharSequence;)V
      16: aload_0
      17: getfield      #38                 // Field b:Landroid/widget/EditText;
      20: aload_1
      21: getfield      #40                 // Field ryey/easer/plugins/event/l/e.b:Ljava/lang/String;
      24: invokevirtual #36                 // Method android/widget/EditText.setText:(Ljava/lang/CharSequence;)V
      27: return

  public ryey.easer.plugins.event.l.b b();
    Code:
       0: new           #27                 // class ryey/easer/plugins/event/l/e
       3: dup
       4: invokespecial #41                 // Method ryey/easer/plugins/event/l/e."<init>":()V
       7: astore_1
       8: aload_1
       9: aload_0
      10: getfield      #25                 // Field a:Landroid/widget/EditText;
      13: invokevirtual #45                 // Method android/widget/EditText.getText:()Landroid/text/Editable;
      16: invokevirtual #51                 // Method java/lang/Object.toString:()Ljava/lang/String;
      19: putfield      #30                 // Field ryey/easer/plugins/event/l/e.a:Ljava/lang/String;
      22: aload_1
      23: aload_0
      24: getfield      #38                 // Field b:Landroid/widget/EditText;
      27: invokevirtual #45                 // Method android/widget/EditText.getText:()Landroid/text/Editable;
      30: invokevirtual #51                 // Method java/lang/Object.toString:()Ljava/lang/String;
      33: putfield      #40                 // Field ryey/easer/plugins/event/l/e.b:Ljava/lang/String;
      36: new           #20                 // class ryey/easer/plugins/event/l/b
      39: dup
      40: aload_1
      41: invokespecial #54                 // Method ryey/easer/plugins/event/l/b."<init>":(Lryey/easer/plugins/event/l/e;)V
      44: areturn

  protected void b(ryey.easer.commons.local_plugin.f);
    Code:
       0: aload_0
       1: aload_1
       2: checkcast     #20                 // class ryey/easer/plugins/event/l/b
       5: invokevirtual #57                 // Method a:(Lryey/easer/plugins/event/l/b;)V
       8: return

  public android.view.View onCreateView(android.view.LayoutInflater, android.view.ViewGroup, android.os.Bundle);
    Code:
       0: aload_1
       1: ldc           #60                 // int 2131427440
       3: aload_2
       4: iconst_0
       5: invokevirtual #66                 // Method android/view/LayoutInflater.inflate:(ILandroid/view/ViewGroup;Z)Landroid/view/View;
       8: astore_1
       9: aload_0
      10: aload_1
      11: ldc           #67                 // int 2131296398
      13: invokevirtual #73                 // Method android/view/View.findViewById:(I)Landroid/view/View;
      16: checkcast     #32                 // class android/widget/EditText
      19: putfield      #25                 // Field a:Landroid/widget/EditText;
      22: aload_0
      23: aload_1
      24: ldc           #74                 // int 2131296381
      26: invokevirtual #73                 // Method android/view/View.findViewById:(I)Landroid/view/View;
      29: checkcast     #32                 // class android/widget/EditText
      32: putfield      #38                 // Field b:Landroid/widget/EditText;
      35: aload_1
      36: areturn
}
