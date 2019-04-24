public class ryey.easer.core.ProfileLoaderService$a extends android.os.Binder {
  final ryey.easer.core.ProfileLoaderService a;

  public ryey.easer.core.ProfileLoaderService$a(ryey.easer.core.ProfileLoaderService);
    Code:
       0: aload_0
       1: aload_1
       2: putfield      #12                 // Field a:Lryey/easer/core/ProfileLoaderService;
       5: aload_0
       6: invokespecial #15                 // Method android/os/Binder."<init>":()V
       9: return

  public void a(java.lang.String);
    Code:
       0: new           #19                 // class android/os/Bundle
       3: dup
       4: invokespecial #20                 // Method android/os/Bundle."<init>":()V
       7: astore_2
       8: aload_2
       9: ldc           #22                 // String ryey.easer.extra.PROFILE_NAME
      11: aload_1
      12: invokevirtual #26                 // Method android/os/Bundle.putString:(Ljava/lang/String;Ljava/lang/String;)V
      15: aload_0
      16: getfield      #12                 // Field a:Lryey/easer/core/ProfileLoaderService;
      19: aload_1
      20: aconst_null
      21: aload_2
      22: invokestatic  #29                 // Method ryey/easer/core/ProfileLoaderService.a:(Lryey/easer/core/ProfileLoaderService;Ljava/lang/String;Ljava/lang/String;Landroid/os/Bundle;)V
      25: return

  public void a(java.lang.String, java.lang.String, android.os.Bundle, ryey.easer.commons.local_plugin.b.b);
    Code:
       0: new           #19                 // class android/os/Bundle
       3: dup
       4: invokespecial #20                 // Method android/os/Bundle."<init>":()V
       7: astore        5
       9: aload         5
      11: ldc           #22                 // String ryey.easer.extra.PROFILE_NAME
      13: aload_1
      14: invokevirtual #26                 // Method android/os/Bundle.putString:(Ljava/lang/String;Ljava/lang/String;)V
      17: aload         5
      19: ldc           #32                 // String ryey.easer.extra.EVENT_NAME
      21: aload_2
      22: invokevirtual #26                 // Method android/os/Bundle.putString:(Ljava/lang/String;Ljava/lang/String;)V
      25: aload         5
      27: ldc           #34                 // String ryey.easer.core.lotus.extras.DYNAMICS_PROPERTIES
      29: aload_3
      30: invokevirtual #38                 // Method android/os/Bundle.putParcelable:(Ljava/lang/String;Landroid/os/Parcelable;)V
      33: aload         5
      35: ldc           #40                 // String ryey.easer.core.lotus.extras.DYNAMICS_LINK
      37: aload         4
      39: invokevirtual #38                 // Method android/os/Bundle.putParcelable:(Ljava/lang/String;Landroid/os/Parcelable;)V
      42: aload_0
      43: getfield      #12                 // Field a:Lryey/easer/core/ProfileLoaderService;
      46: aload_1
      47: aload_2
      48: aload         5
      50: invokestatic  #29                 // Method ryey/easer/core/ProfileLoaderService.a:(Lryey/easer/core/ProfileLoaderService;Ljava/lang/String;Ljava/lang/String;Landroid/os/Bundle;)V
      53: return
}
