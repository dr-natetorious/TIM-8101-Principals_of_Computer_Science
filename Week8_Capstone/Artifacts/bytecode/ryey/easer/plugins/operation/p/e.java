public class ryey.easer.plugins.operation.p.e extends ryey.easer.plugins.c<ryey.easer.plugins.operation.p.b> {
  android.widget.RadioButton a;

  android.widget.RadioButton b;

  public ryey.easer.plugins.operation.p.e();
    Code:
       0: aload_0
       1: invokespecial #12                 // Method ryey/easer/plugins/c."<init>":()V
       4: return

  public ryey.easer.commons.local_plugin.f a();
    Code:
       0: aload_0
       1: invokevirtual #17                 // Method b:()Lryey/easer/plugins/operation/p/b;
       4: areturn

  protected void a(ryey.easer.plugins.operation.p.b);
    Code:
       0: aload_1
       1: getfield      #23                 // Field ryey/easer/plugins/operation/p/b.a:Lryey/easer/plugins/operation/p/b$a;
       4: getstatic     #26                 // Field ryey/easer/plugins/operation/p/b$a.a:Lryey/easer/plugins/operation/p/b$a;
       7: if_acmpne     21
      10: aload_0
      11: getfield      #28                 // Field a:Landroid/widget/RadioButton;
      14: astore_1
      15: aload_1
      16: iconst_1
      17: invokevirtual #34                 // Method android/widget/RadioButton.setChecked:(Z)V
      20: return
      21: aload_0
      22: getfield      #36                 // Field b:Landroid/widget/RadioButton;
      25: astore_1
      26: goto          15

  public ryey.easer.plugins.operation.p.b b();
    Code:
       0: aload_0
       1: getfield      #28                 // Field a:Landroid/widget/RadioButton;
       4: invokevirtual #40                 // Method android/widget/RadioButton.isChecked:()Z
       7: ifeq          21
      10: new           #20                 // class ryey/easer/plugins/operation/p/b
      13: dup
      14: getstatic     #26                 // Field ryey/easer/plugins/operation/p/b$a.a:Lryey/easer/plugins/operation/p/b$a;
      17: invokespecial #43                 // Method ryey/easer/plugins/operation/p/b."<init>":(Lryey/easer/plugins/operation/p/b$a;)V
      20: areturn
      21: new           #20                 // class ryey/easer/plugins/operation/p/b
      24: dup
      25: getstatic     #45                 // Field ryey/easer/plugins/operation/p/b$a.b:Lryey/easer/plugins/operation/p/b$a;
      28: invokespecial #43                 // Method ryey/easer/plugins/operation/p/b."<init>":(Lryey/easer/plugins/operation/p/b$a;)V
      31: areturn

  protected void b(ryey.easer.commons.local_plugin.f);
    Code:
       0: aload_0
       1: aload_1
       2: checkcast     #20                 // class ryey/easer/plugins/operation/p/b
       5: invokevirtual #48                 // Method a:(Lryey/easer/plugins/operation/p/b;)V
       8: return

  public android.view.View onCreateView(android.view.LayoutInflater, android.view.ViewGroup, android.os.Bundle);
    Code:
       0: aload_1
       1: ldc           #51                 // int 2131427456
       3: aload_2
       4: iconst_0
       5: invokevirtual #57                 // Method android/view/LayoutInflater.inflate:(ILandroid/view/ViewGroup;Z)Landroid/view/View;
       8: astore_1
       9: aload_0
      10: aload_1
      11: ldc           #58                 // int 2131296569
      13: invokevirtual #64                 // Method android/view/View.findViewById:(I)Landroid/view/View;
      16: checkcast     #30                 // class android/widget/RadioButton
      19: putfield      #28                 // Field a:Landroid/widget/RadioButton;
      22: aload_0
      23: aload_1
      24: ldc           #65                 // int 2131296574
      26: invokevirtual #64                 // Method android/view/View.findViewById:(I)Landroid/view/View;
      29: checkcast     #30                 // class android/widget/RadioButton
      32: putfield      #36                 // Field b:Landroid/widget/RadioButton;
      35: aload_1
      36: areturn
}
