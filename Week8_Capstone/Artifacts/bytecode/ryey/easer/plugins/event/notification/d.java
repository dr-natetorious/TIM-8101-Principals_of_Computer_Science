public class ryey.easer.plugins.event.notification.d extends ryey.easer.plugins.c<ryey.easer.plugins.event.notification.a> {
  public ryey.easer.plugins.event.notification.d();
    Code:
       0: aload_0
       1: invokespecial #13                 // Method ryey/easer/plugins/c."<init>":()V
       4: return

  public ryey.easer.commons.local_plugin.f a();
    Code:
       0: aload_0
       1: invokevirtual #37                 // Method b:()Lryey/easer/plugins/event/notification/a;
       4: areturn

  protected void a(ryey.easer.plugins.event.notification.a);
    Code:
       0: aload_0
       1: getfield      #40                 // Field a:Landroid/widget/EditText;
       4: aload_1
       5: getfield      #45                 // Field ryey/easer/plugins/event/notification/a.a:Ljava/lang/String;
       8: invokevirtual #49                 // Method android/widget/EditText.setText:(Ljava/lang/CharSequence;)V
      11: aload_0
      12: getfield      #51                 // Field b:Landroid/widget/EditText;
      15: aload_1
      16: getfield      #53                 // Field ryey/easer/plugins/event/notification/a.b:Ljava/lang/String;
      19: invokevirtual #49                 // Method android/widget/EditText.setText:(Ljava/lang/CharSequence;)V
      22: aload_0
      23: getfield      #55                 // Field c:Landroid/widget/EditText;
      26: aload_1
      27: getfield      #57                 // Field ryey/easer/plugins/event/notification/a.c:Ljava/lang/String;
      30: invokevirtual #49                 // Method android/widget/EditText.setText:(Ljava/lang/CharSequence;)V
      33: return

  public ryey.easer.plugins.event.notification.a b();
    Code:
       0: new           #42                 // class ryey/easer/plugins/event/notification/a
       3: dup
       4: aload_0
       5: getfield      #40                 // Field a:Landroid/widget/EditText;
       8: invokestatic  #59                 // Method a:(Landroid/widget/EditText;)Ljava/lang/String;
      11: aload_0
      12: getfield      #51                 // Field b:Landroid/widget/EditText;
      15: invokestatic  #59                 // Method a:(Landroid/widget/EditText;)Ljava/lang/String;
      18: aload_0
      19: getfield      #55                 // Field c:Landroid/widget/EditText;
      22: invokestatic  #59                 // Method a:(Landroid/widget/EditText;)Ljava/lang/String;
      25: invokespecial #62                 // Method ryey/easer/plugins/event/notification/a."<init>":(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V
      28: areturn

  protected void b(ryey.easer.commons.local_plugin.f);
    Code:
       0: aload_0
       1: aload_1
       2: checkcast     #42                 // class ryey/easer/plugins/event/notification/a
       5: invokevirtual #65                 // Method a:(Lryey/easer/plugins/event/notification/a;)V
       8: return

  public android.view.View onCreateView(android.view.LayoutInflater, android.view.ViewGroup, android.os.Bundle);
    Code:
       0: aload_1
       1: ldc           #68                 // int 2131427438
       3: aload_2
       4: iconst_0
       5: invokevirtual #74                 // Method android/view/LayoutInflater.inflate:(ILandroid/view/ViewGroup;Z)Landroid/view/View;
       8: astore_1
       9: aload_0
      10: aload_1
      11: ldc           #75                 // int 2131296376
      13: invokevirtual #81                 // Method android/view/View.findViewById:(I)Landroid/view/View;
      16: checkcast     #17                 // class android/widget/EditText
      19: putfield      #40                 // Field a:Landroid/widget/EditText;
      22: aload_0
      23: aload_1
      24: ldc           #82                 // int 2131296401
      26: invokevirtual #81                 // Method android/view/View.findViewById:(I)Landroid/view/View;
      29: checkcast     #17                 // class android/widget/EditText
      32: putfield      #51                 // Field b:Landroid/widget/EditText;
      35: aload_0
      36: aload_1
      37: ldc           #83                 // int 2131296381
      39: invokevirtual #81                 // Method android/view/View.findViewById:(I)Landroid/view/View;
      42: checkcast     #17                 // class android/widget/EditText
      45: putfield      #55                 // Field c:Landroid/widget/EditText;
      48: aload_1
      49: areturn
}
