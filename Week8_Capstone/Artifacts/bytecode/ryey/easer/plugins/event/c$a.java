public class ryey.easer.plugins.event.c$a {
  public static android.content.Intent a(android.net.Uri);
    Code:
       0: new           #10                 // class android/content/Intent
       3: dup
       4: ldc           #12                 // String ryey.easer.triggerlotus.abstractslot.SATISFIED
       6: invokespecial #16                 // Method android/content/Intent."<init>":(Ljava/lang/String;)V
       9: astore_1
      10: aload_1
      11: ldc           #18                 // String ryey.easer.triggetlotus.category.NOTIFY_SLOT
      13: invokevirtual #22                 // Method android/content/Intent.addCategory:(Ljava/lang/String;)Landroid/content/Intent;
      16: pop
      17: aload_1
      18: aload_0
      19: invokevirtual #25                 // Method android/content/Intent.setData:(Landroid/net/Uri;)Landroid/content/Intent;
      22: pop
      23: aload_1
      24: areturn

  public static android.content.Intent b(android.net.Uri);
    Code:
       0: new           #10                 // class android/content/Intent
       3: dup
       4: ldc           #29                 // String ryey.easer.triggerlotus.abstractslot.UNSATISFIED
       6: invokespecial #16                 // Method android/content/Intent."<init>":(Ljava/lang/String;)V
       9: astore_1
      10: aload_1
      11: ldc           #18                 // String ryey.easer.triggetlotus.category.NOTIFY_SLOT
      13: invokevirtual #22                 // Method android/content/Intent.addCategory:(Ljava/lang/String;)Landroid/content/Intent;
      16: pop
      17: aload_1
      18: aload_0
      19: invokevirtual #25                 // Method android/content/Intent.setData:(Landroid/net/Uri;)Landroid/content/Intent;
      22: pop
      23: aload_1
      24: areturn
}
