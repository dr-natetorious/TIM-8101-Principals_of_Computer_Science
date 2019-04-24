class ryey.easer.core.EHService$1 implements android.content.ServiceConnection {
  final ryey.easer.core.EHService a;

  ryey.easer.core.EHService$1(ryey.easer.core.EHService);
    Code:
       0: aload_0
       1: aload_1
       2: putfield      #14                 // Field a:Lryey/easer/core/EHService;
       5: aload_0
       6: invokespecial #17                 // Method java/lang/Object."<init>":()V
       9: return

  public void onServiceConnected(android.content.ComponentName, android.os.IBinder);
    Code:
       0: ldc           #22                 // String %s onServiceConnected: %s
       2: iconst_2
       3: anewarray     #4                  // class java/lang/Object
       6: dup
       7: iconst_0
       8: ldc           #24                 // String [EHService]
      10: aastore
      11: dup
      12: iconst_1
      13: aload_1
      14: aastore
      15: invokestatic  #30                 // Method com/b/a/i.d:(Ljava/lang/String;[Ljava/lang/Object;)V
      18: aload_1
      19: invokevirtual #36                 // Method android/content/ComponentName.getClassName:()Ljava/lang/String;
      22: ldc           #38                 // class ryey/easer/core/ConditionHolderService
      24: invokevirtual #43                 // Method java/lang/Class.getName:()Ljava/lang/String;
      27: invokevirtual #49                 // Method java/lang/String.equals:(Ljava/lang/Object;)Z
      30: ifeq          62
      33: aload_0
      34: getfield      #14                 // Field a:Lryey/easer/core/EHService;
      37: aload_2
      38: checkcast     #51                 // class ryey/easer/core/ConditionHolderService$a
      41: putfield      #55                 // Field ryey/easer/core/EHService.b:Lryey/easer/core/ConditionHolderService$a;
      44: aload_0
      45: getfield      #14                 // Field a:Lryey/easer/core/EHService;
      48: invokestatic  #58                 // Method ryey/easer/core/EHService.a:(Lryey/easer/core/EHService;)Landroid/os/ConditionVariable;
      51: invokevirtual #63                 // Method android/os/ConditionVariable.open:()V
      54: aload_0
      55: getfield      #14                 // Field a:Lryey/easer/core/EHService;
      58: invokestatic  #65                 // Method ryey/easer/core/EHService.b:(Lryey/easer/core/EHService;)V
      61: return
      62: aload_1
      63: invokevirtual #36                 // Method android/content/ComponentName.getClassName:()Ljava/lang/String;
      66: ldc           #67                 // class ryey/easer/core/ProfileLoaderService
      68: invokevirtual #43                 // Method java/lang/Class.getName:()Ljava/lang/String;
      71: invokevirtual #49                 // Method java/lang/String.equals:(Ljava/lang/Object;)Z
      74: ifeq          91
      77: aload_0
      78: getfield      #14                 // Field a:Lryey/easer/core/EHService;
      81: invokestatic  #71                 // Method ryey/easer/core/EHService.c:(Lryey/easer/core/EHService;)Lryey/easer/core/a$a;
      84: aload_2
      85: checkcast     #73                 // class ryey/easer/core/ProfileLoaderService$a
      88: invokevirtual #78                 // Method ryey/easer/core/a$a.a:(Lryey/easer/core/ProfileLoaderService$a;)V
      91: return

  public void onServiceDisconnected(android.content.ComponentName);
    Code:
       0: ldc           #82                 // String %s onServiceDisconnected: %s
       2: iconst_2
       3: anewarray     #4                  // class java/lang/Object
       6: dup
       7: iconst_0
       8: ldc           #24                 // String [EHService]
      10: aastore
      11: dup
      12: iconst_1
      13: aload_1
      14: aastore
      15: invokestatic  #30                 // Method com/b/a/i.d:(Ljava/lang/String;[Ljava/lang/Object;)V
      18: aload_1
      19: invokevirtual #36                 // Method android/content/ComponentName.getClassName:()Ljava/lang/String;
      22: ldc           #38                 // class ryey/easer/core/ConditionHolderService
      24: invokevirtual #43                 // Method java/lang/Class.getName:()Ljava/lang/String;
      27: invokevirtual #49                 // Method java/lang/String.equals:(Ljava/lang/Object;)Z
      30: ifeq          52
      33: aload_0
      34: getfield      #14                 // Field a:Lryey/easer/core/EHService;
      37: invokestatic  #58                 // Method ryey/easer/core/EHService.a:(Lryey/easer/core/EHService;)Landroid/os/ConditionVariable;
      40: invokevirtual #85                 // Method android/os/ConditionVariable.close:()V
      43: aload_0
      44: getfield      #14                 // Field a:Lryey/easer/core/EHService;
      47: aconst_null
      48: putfield      #55                 // Field ryey/easer/core/EHService.b:Lryey/easer/core/ConditionHolderService$a;
      51: return
      52: aload_1
      53: invokevirtual #36                 // Method android/content/ComponentName.getClassName:()Ljava/lang/String;
      56: ldc           #67                 // class ryey/easer/core/ProfileLoaderService
      58: invokevirtual #43                 // Method java/lang/Class.getName:()Ljava/lang/String;
      61: invokevirtual #49                 // Method java/lang/String.equals:(Ljava/lang/Object;)Z
      64: ifeq          77
      67: aload_0
      68: getfield      #14                 // Field a:Lryey/easer/core/EHService;
      71: invokestatic  #71                 // Method ryey/easer/core/EHService.c:(Lryey/easer/core/EHService;)Lryey/easer/core/a$a;
      74: invokevirtual #87                 // Method ryey/easer/core/a$a.a:()V
      77: return
}
