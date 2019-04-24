public class ryey.easer.plugins.event.c.e extends ryey.easer.plugins.c<ryey.easer.plugins.event.c.b> {
  public ryey.easer.plugins.event.c.e();
    Code:
       0: aload_0
       1: invokespecial #12                 // Method ryey/easer/plugins/c."<init>":()V
       4: return

  public ryey.easer.commons.local_plugin.f a();
    Code:
       0: aload_0
       1: invokevirtual #17                 // Method b:()Lryey/easer/plugins/event/c/b;
       4: areturn

  protected void a(ryey.easer.plugins.event.c.b);
    Code:
       0: aload_1
       1: getfield      #23                 // Field ryey/easer/plugins/event/c/b.a:Lryey/easer/plugins/event/c/f;
       4: astore_1
       5: aload_0
       6: getfield      #25                 // Field a:Landroid/widget/EditText;
       9: aload_1
      10: getfield      #30                 // Field ryey/easer/plugins/event/c/f.a:Ljava/util/List;
      13: iconst_0
      14: invokestatic  #35                 // Method ryey/easer/b.a:(Ljava/util/Collection;Z)Ljava/lang/String;
      17: invokevirtual #41                 // Method android/widget/EditText.setText:(Ljava/lang/CharSequence;)V
      20: aload_0
      21: getfield      #43                 // Field b:Landroid/widget/EditText;
      24: aload_1
      25: getfield      #45                 // Field ryey/easer/plugins/event/c/f.b:Ljava/util/List;
      28: iconst_0
      29: invokestatic  #35                 // Method ryey/easer/b.a:(Ljava/util/Collection;Z)Ljava/lang/String;
      32: invokevirtual #41                 // Method android/widget/EditText.setText:(Ljava/lang/CharSequence;)V
      35: return

  public ryey.easer.plugins.event.c.b b();
    Code:
       0: new           #27                 // class ryey/easer/plugins/event/c/f
       3: dup
       4: invokespecial #46                 // Method ryey/easer/plugins/event/c/f."<init>":()V
       7: astore_1
       8: aload_1
       9: aload_0
      10: getfield      #25                 // Field a:Landroid/widget/EditText;
      13: invokevirtual #50                 // Method android/widget/EditText.getText:()Landroid/text/Editable;
      16: invokevirtual #56                 // Method java/lang/Object.toString:()Ljava/lang/String;
      19: invokestatic  #59                 // Method ryey/easer/b.b:(Ljava/lang/String;)Ljava/util/List;
      22: putfield      #30                 // Field ryey/easer/plugins/event/c/f.a:Ljava/util/List;
      25: aload_1
      26: aload_0
      27: getfield      #43                 // Field b:Landroid/widget/EditText;
      30: invokevirtual #50                 // Method android/widget/EditText.getText:()Landroid/text/Editable;
      33: invokevirtual #56                 // Method java/lang/Object.toString:()Ljava/lang/String;
      36: invokestatic  #59                 // Method ryey/easer/b.b:(Ljava/lang/String;)Ljava/util/List;
      39: putfield      #45                 // Field ryey/easer/plugins/event/c/f.b:Ljava/util/List;
      42: new           #20                 // class ryey/easer/plugins/event/c/b
      45: dup
      46: aload_1
      47: invokespecial #62                 // Method ryey/easer/plugins/event/c/b."<init>":(Lryey/easer/plugins/event/c/f;)V
      50: areturn

  protected void b(ryey.easer.commons.local_plugin.f);
    Code:
       0: aload_0
       1: aload_1
       2: checkcast     #20                 // class ryey/easer/plugins/event/c/b
       5: invokevirtual #65                 // Method a:(Lryey/easer/plugins/event/c/b;)V
       8: return

  public android.view.View onCreateView(android.view.LayoutInflater, android.view.ViewGroup, android.os.Bundle);
    Code:
       0: aload_1
       1: ldc           #68                 // int 2131427431
       3: aload_2
       4: iconst_0
       5: invokevirtual #74                 // Method android/view/LayoutInflater.inflate:(ILandroid/view/ViewGroup;Z)Landroid/view/View;
       8: astore_1
       9: aload_0
      10: aload_1
      11: ldc           #75                 // int 2131296375
      13: invokevirtual #81                 // Method android/view/View.findViewById:(I)Landroid/view/View;
      16: checkcast     #37                 // class android/widget/EditText
      19: putfield      #25                 // Field a:Landroid/widget/EditText;
      22: aload_0
      23: aload_1
      24: ldc           #82                 // int 2131296380
      26: invokevirtual #81                 // Method android/view/View.findViewById:(I)Landroid/view/View;
      29: checkcast     #37                 // class android/widget/EditText
      32: putfield      #43                 // Field b:Landroid/widget/EditText;
      35: aload_1
      36: areturn
}
