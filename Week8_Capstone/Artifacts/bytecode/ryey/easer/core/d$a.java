public class ryey.easer.core.d$a {
  public static android.content.Intent a(android.net.Uri);
    Code:
       0: aload_0
       1: aconst_null
       2: invokestatic  #11                 // Method a:(Landroid/net/Uri;Landroid/os/Bundle;)Landroid/content/Intent;
       5: areturn

  public static android.content.Intent a(android.net.Uri, android.os.Bundle);
    Code:
       0: new           #14                 // class android/content/Intent
       3: dup
       4: ldc           #16                 // String ryey.easer.triggerlotus.action.SLOT_SATISFIED
       6: invokespecial #20                 // Method android/content/Intent."<init>":(Ljava/lang/String;)V
       9: astore_2
      10: aload_2
      11: ldc           #22                 // String ryey.easer.triggerlotus.category.NOTIFY_LOTUS
      13: invokevirtual #26                 // Method android/content/Intent.addCategory:(Ljava/lang/String;)Landroid/content/Intent;
      16: pop
      17: aload_2
      18: aload_0
      19: invokevirtual #29                 // Method android/content/Intent.setData:(Landroid/net/Uri;)Landroid/content/Intent;
      22: pop
      23: aload_2
      24: ldc           #31                 // String ryey.easer.core.lotus.extras.DYNAMICS_PROPERTIES
      26: aload_1
      27: invokevirtual #35                 // Method android/content/Intent.putExtra:(Ljava/lang/String;Landroid/os/Bundle;)Landroid/content/Intent;
      30: pop
      31: aload_2
      32: areturn

  public static android.content.Intent b(android.net.Uri);
    Code:
       0: aload_0
       1: aconst_null
       2: invokestatic  #38                 // Method b:(Landroid/net/Uri;Landroid/os/Bundle;)Landroid/content/Intent;
       5: areturn

  public static android.content.Intent b(android.net.Uri, android.os.Bundle);
    Code:
       0: new           #14                 // class android/content/Intent
       3: dup
       4: ldc           #40                 // String ryey.easer.triggerlotus.action.SLOT_UNSATISFIED
       6: invokespecial #20                 // Method android/content/Intent."<init>":(Ljava/lang/String;)V
       9: astore_2
      10: aload_2
      11: ldc           #22                 // String ryey.easer.triggerlotus.category.NOTIFY_LOTUS
      13: invokevirtual #26                 // Method android/content/Intent.addCategory:(Ljava/lang/String;)Landroid/content/Intent;
      16: pop
      17: aload_2
      18: aload_0
      19: invokevirtual #29                 // Method android/content/Intent.setData:(Landroid/net/Uri;)Landroid/content/Intent;
      22: pop
      23: aload_2
      24: ldc           #31                 // String ryey.easer.core.lotus.extras.DYNAMICS_PROPERTIES
      26: aload_1
      27: invokevirtual #35                 // Method android/content/Intent.putExtra:(Ljava/lang/String;Landroid/os/Bundle;)Landroid/content/Intent;
      30: pop
      31: aload_2
      32: areturn
}
