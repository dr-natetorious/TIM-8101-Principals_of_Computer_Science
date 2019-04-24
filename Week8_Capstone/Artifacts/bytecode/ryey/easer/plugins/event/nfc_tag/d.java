public class ryey.easer.plugins.event.nfc_tag.d extends ryey.easer.plugins.c<ryey.easer.plugins.event.nfc_tag.a> {
  public ryey.easer.plugins.event.nfc_tag.d();
    Code:
       0: aload_0
       1: invokespecial #13                 // Method ryey/easer/plugins/c."<init>":()V
       4: return

  static void a(ryey.easer.plugins.event.nfc_tag.d);
    Code:
       0: aload_0
       1: invokespecial #18                 // Method c:()V
       4: return

  public ryey.easer.commons.local_plugin.f a();
    Code:
       0: aload_0
       1: invokevirtual #46                 // Method b:()Lryey/easer/plugins/event/nfc_tag/a;
       4: areturn

  protected void a(ryey.easer.plugins.event.nfc_tag.a);
    Code:
       0: aload_0
       1: getfield      #49                 // Field a:Landroid/widget/EditText;
       4: aload_1
       5: invokevirtual #55                 // Method ryey/easer/plugins/event/nfc_tag/a.toString:()Ljava/lang/String;
       8: invokevirtual #61                 // Method android/widget/EditText.setText:(Ljava/lang/CharSequence;)V
      11: return

  public ryey.easer.plugins.event.nfc_tag.a b();
    Code:
       0: new           #51                 // class ryey/easer/plugins/event/nfc_tag/a
       3: dup
       4: aload_0
       5: getfield      #49                 // Field a:Landroid/widget/EditText;
       8: invokevirtual #65                 // Method android/widget/EditText.getText:()Landroid/text/Editable;
      11: invokevirtual #68                 // Method java/lang/Object.toString:()Ljava/lang/String;
      14: invokespecial #71                 // Method ryey/easer/plugins/event/nfc_tag/a."<init>":(Ljava/lang/String;)V
      17: areturn

  protected void b(ryey.easer.commons.local_plugin.f);
    Code:
       0: aload_0
       1: aload_1
       2: checkcast     #51                 // class ryey/easer/plugins/event/nfc_tag/a
       5: invokevirtual #74                 // Method a:(Lryey/easer/plugins/event/nfc_tag/a;)V
       8: return

  public void onActivityResult(int, int, android.content.Intent);
    Code:
       0: iload_1
       1: bipush        120
       3: if_icmpne     34
       6: iload_2
       7: iconst_m1
       8: if_icmpne     34
      11: ldc           #78                 // String got expected result. setting data
      13: invokestatic  #83                 // Method com/b/a/i.a:(Ljava/lang/Object;)V
      16: aload_3
      17: ldc           #85                 // String extra_id
      19: invokevirtual #91                 // Method android/content/Intent.getByteArrayExtra:(Ljava/lang/String;)[B
      22: astore_3
      23: aload_0
      24: getfield      #49                 // Field a:Landroid/widget/EditText;
      27: aload_3
      28: invokestatic  #94                 // Method ryey/easer/plugins/event/nfc_tag/a.a:([B)Ljava/lang/String;
      31: invokevirtual #61                 // Method android/widget/EditText.setText:(Ljava/lang/CharSequence;)V
      34: return

  public android.view.View onCreateView(android.view.LayoutInflater, android.view.ViewGroup, android.os.Bundle);
    Code:
       0: aload_1
       1: ldc           #97                 // int 2131427437
       3: aload_2
       4: iconst_0
       5: invokevirtual #103                // Method android/view/LayoutInflater.inflate:(ILandroid/view/ViewGroup;Z)Landroid/view/View;
       8: astore_1
       9: aload_0
      10: aload_1
      11: ldc           #104                // int 2131296399
      13: invokevirtual #110                // Method android/view/View.findViewById:(I)Landroid/view/View;
      16: checkcast     #57                 // class android/widget/EditText
      19: putfield      #49                 // Field a:Landroid/widget/EditText;
      22: aload_1
      23: ldc           #111                // int 2131296316
      25: invokevirtual #110                // Method android/view/View.findViewById:(I)Landroid/view/View;
      28: new           #7                  // class ryey/easer/plugins/event/nfc_tag/d$1
      31: dup
      32: aload_0
      33: invokespecial #113                // Method ryey/easer/plugins/event/nfc_tag/d$1."<init>":(Lryey/easer/plugins/event/nfc_tag/d;)V
      36: invokevirtual #117                // Method android/view/View.setOnClickListener:(Landroid/view/View$OnClickListener;)V
      39: aload_1
      40: areturn
}
