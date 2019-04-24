public final class ryey.easer.core.ui.version_n_info.b$a {
  public ryey.easer.core.ui.version_n_info.b$a(a.b.b.a);
    Code:
       0: aload_0
       1: invokespecial #14                 // Method "<init>":()V
       4: return

  public final ryey.easer.core.ui.version_n_info.b a(int);
    Code:
       0: new           #6                  // class ryey/easer/core/ui/version_n_info/b
       3: dup
       4: invokespecial #16                 // Method ryey/easer/core/ui/version_n_info/b."<init>":()V
       7: astore_2
       8: new           #18                 // class android/os/Bundle
      11: dup
      12: invokespecial #19                 // Method android/os/Bundle."<init>":()V
      15: astore_3
      16: aload_3
      17: ldc           #21                 // String STRING_CONTENT_ID
      19: iload_1
      20: invokevirtual #25                 // Method android/os/Bundle.putInt:(Ljava/lang/String;I)V
      23: aload_2
      24: aload_3
      25: invokevirtual #29                 // Method ryey/easer/core/ui/version_n_info/b.setArguments:(Landroid/os/Bundle;)V
      28: aload_2
      29: areturn

  public final ryey.easer.core.ui.version_n_info.b a(int, int);
    Code:
       0: new           #6                  // class ryey/easer/core/ui/version_n_info/b
       3: dup
       4: invokespecial #16                 // Method ryey/easer/core/ui/version_n_info/b."<init>":()V
       7: astore_3
       8: new           #18                 // class android/os/Bundle
      11: dup
      12: invokespecial #19                 // Method android/os/Bundle."<init>":()V
      15: astore        4
      17: aload         4
      19: ldc           #32                 // String STRING_TITLE_ID
      21: iload_1
      22: invokevirtual #25                 // Method android/os/Bundle.putInt:(Ljava/lang/String;I)V
      25: aload         4
      27: ldc           #21                 // String STRING_CONTENT_ID
      29: iload_2
      30: invokevirtual #25                 // Method android/os/Bundle.putInt:(Ljava/lang/String;I)V
      33: aload_3
      34: aload         4
      36: invokevirtual #29                 // Method ryey/easer/core/ui/version_n_info/b.setArguments:(Landroid/os/Bundle;)V
      39: aload_3
      40: areturn
}
