class ryey.easer.core.ProfileLoaderService$1 extends android.content.BroadcastReceiver {
  final ryey.easer.core.ProfileLoaderService a;

  ryey.easer.core.ProfileLoaderService$1(ryey.easer.core.ProfileLoaderService);
    Code:
       0: aload_0
       1: aload_1
       2: putfield      #12                 // Field a:Lryey/easer/core/ProfileLoaderService;
       5: aload_0
       6: invokespecial #15                 // Method android/content/BroadcastReceiver."<init>":()V
       9: return

  public void onReceive(android.content.Context, android.content.Intent);
    Code:
       0: aload_2
       1: invokevirtual #24                 // Method android/content/Intent.getAction:()Ljava/lang/String;
       4: astore_1
       5: ldc           #26                 // String ryey.easer.action.LOAD_PROFILE
       7: aload_1
       8: invokevirtual #32                 // Method java/lang/String.equals:(Ljava/lang/Object;)Z
      11: ifeq          68
      14: aload_2
      15: ldc           #34                 // String ryey.easer.extra.PROFILE_NAME
      17: invokevirtual #38                 // Method android/content/Intent.getStringExtra:(Ljava/lang/String;)Ljava/lang/String;
      20: astore_1
      21: aload_2
      22: ldc           #40                 // String ryey.easer.extra.EVENT_NAME
      24: invokevirtual #38                 // Method android/content/Intent.getStringExtra:(Ljava/lang/String;)Ljava/lang/String;
      27: astore_3
      28: aload_2
      29: invokevirtual #44                 // Method android/content/Intent.getExtras:()Landroid/os/Bundle;
      32: ifnonnull     54
      35: ldc           #46                 // String ProfileLoaderIntent has null extras???
      37: iconst_0
      38: anewarray     #48                 // class java/lang/Object
      41: invokestatic  #54                 // Method com/b/a/i.f:(Ljava/lang/String;[Ljava/lang/Object;)V
      44: new           #56                 // class java/lang/IllegalStateException
      47: dup
      48: ldc           #46                 // String ProfileLoaderIntent has null extras???
      50: invokespecial #59                 // Method java/lang/IllegalStateException."<init>":(Ljava/lang/String;)V
      53: athrow
      54: aload_0
      55: getfield      #12                 // Field a:Lryey/easer/core/ProfileLoaderService;
      58: aload_1
      59: aload_3
      60: aload_2
      61: invokevirtual #44                 // Method android/content/Intent.getExtras:()Landroid/os/Bundle;
      64: invokestatic  #62                 // Method ryey/easer/core/ProfileLoaderService.a:(Lryey/easer/core/ProfileLoaderService;Ljava/lang/String;Ljava/lang/String;Landroid/os/Bundle;)V
      67: return
      68: ldc           #64                 // String ProfileLoaderService got unknown Intent action <%s>
      70: iconst_1
      71: anewarray     #48                 // class java/lang/Object
      74: dup
      75: iconst_0
      76: aload_1
      77: aastore
      78: invokestatic  #54                 // Method com/b/a/i.f:(Ljava/lang/String;[Ljava/lang/Object;)V
      81: return
}
