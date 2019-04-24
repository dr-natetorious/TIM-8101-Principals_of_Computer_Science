public final class ryey.easer.core.log.ActivityLogService$b {
  public ryey.easer.core.log.ActivityLogService$b(a.b.b.a);
    Code:
       0: aload_0
       1: invokespecial #14                 // Method "<init>":()V
       4: return

  public final ryey.easer.core.log.a a();
    Code:
       0: invokestatic  #41                 // Method ryey/easer/core/log/ActivityLogService.a:()Ljava/util/LinkedList;
       3: invokevirtual #47                 // Method java/util/LinkedList.size:()I
       6: ifne          11
       9: aconst_null
      10: areturn
      11: invokestatic  #41                 // Method ryey/easer/core/log/ActivityLogService.a:()Ljava/util/LinkedList;
      14: invokevirtual #51                 // Method java/util/LinkedList.getLast:()Ljava/lang/Object;
      17: checkcast     #53                 // class ryey/easer/core/log/a
      20: areturn

  public final void a(android.content.Context, java.lang.String, java.lang.String);
    Code:
       0: aload_1
       1: ldc           #56                 // String context
       3: invokestatic  #61                 // Method a/b/b/c.b:(Ljava/lang/Object;Ljava/lang/String;)V
       6: aload_2
       7: ldc           #63                 // String scriptName
       9: invokestatic  #61                 // Method a/b/b/c.b:(Ljava/lang/Object;Ljava/lang/String;)V
      12: new           #65                 // class ryey/easer/core/log/d
      15: dup
      16: aload_2
      17: iconst_0
      18: aconst_null
      19: aload_3
      20: invokespecial #68                 // Method ryey/easer/core/log/d."<init>":(Ljava/lang/String;ZLjava/lang/String;Ljava/lang/String;)V
      23: astore_2
      24: aload_0
      25: checkcast     #2                  // class ryey/easer/core/log/ActivityLogService$b
      28: aload_1
      29: aload_2
      30: checkcast     #53                 // class ryey/easer/core/log/a
      33: invokespecial #70                 // Method a:(Landroid/content/Context;Lryey/easer/core/log/a;)V
      36: return

  public final void a(android.content.Context, java.lang.String, java.lang.String, java.lang.String);
    Code:
       0: aload_1
       1: ldc           #56                 // String context
       3: invokestatic  #61                 // Method a/b/b/c.b:(Ljava/lang/Object;Ljava/lang/String;)V
       6: aload_2
       7: ldc           #63                 // String scriptName
       9: invokestatic  #61                 // Method a/b/b/c.b:(Ljava/lang/Object;Ljava/lang/String;)V
      12: new           #65                 // class ryey/easer/core/log/d
      15: dup
      16: aload_2
      17: iconst_1
      18: aload_3
      19: aload         4
      21: invokespecial #68                 // Method ryey/easer/core/log/d."<init>":(Ljava/lang/String;ZLjava/lang/String;Ljava/lang/String;)V
      24: astore_2
      25: aload_0
      26: checkcast     #2                  // class ryey/easer/core/log/ActivityLogService$b
      29: aload_1
      30: aload_2
      31: checkcast     #53                 // class ryey/easer/core/log/a
      34: invokespecial #70                 // Method a:(Landroid/content/Context;Lryey/easer/core/log/a;)V
      37: return

  public final void a(android.content.Context, java.lang.String, boolean, java.lang.String);
    Code:
       0: aload_1
       1: ldc           #56                 // String context
       3: invokestatic  #61                 // Method a/b/b/c.b:(Ljava/lang/Object;Ljava/lang/String;)V
       6: aload_2
       7: ldc           #74                 // String serviceName
       9: invokestatic  #61                 // Method a/b/b/c.b:(Ljava/lang/Object;Ljava/lang/String;)V
      12: new           #76                 // class ryey/easer/core/log/e
      15: dup
      16: aload_2
      17: iload_3
      18: aload         4
      20: invokespecial #79                 // Method ryey/easer/core/log/e."<init>":(Ljava/lang/String;ZLjava/lang/String;)V
      23: astore_2
      24: aload_0
      25: checkcast     #2                  // class ryey/easer/core/log/ActivityLogService$b
      28: aload_1
      29: aload_2
      30: checkcast     #53                 // class ryey/easer/core/log/a
      33: invokespecial #70                 // Method a:(Landroid/content/Context;Lryey/easer/core/log/a;)V
      36: return

  public final void a(android.os.Bundle);
    Code:
       0: aload_0
       1: monitorenter
       2: aload_1
       3: ldc           #82                 // String bundle
       5: invokestatic  #61                 // Method a/b/b/c.b:(Ljava/lang/Object;Ljava/lang/String;)V
       8: aload_1
       9: ldc           #25                 // String ryey.easer.core.log.EXTRA.ACTIVITY_LOG
      11: invokevirtual #88                 // Method android/os/Bundle.getParcelable:(Ljava/lang/String;)Landroid/os/Parcelable;
      14: astore_1
      15: aload_1
      16: ldc           #90                 // String bundle.getParcelable(EXTRA_ACTIVITY_LOG)
      18: invokestatic  #92                 // Method a/b/b/c.a:(Ljava/lang/Object;Ljava/lang/String;)V
      21: aload_1
      22: checkcast     #53                 // class ryey/easer/core/log/a
      25: astore_1
      26: invokestatic  #41                 // Method ryey/easer/core/log/ActivityLogService.a:()Ljava/util/LinkedList;
      29: aload_1
      30: invokevirtual #96                 // Method java/util/LinkedList.addLast:(Ljava/lang/Object;)V
      33: aload_0
      34: monitorexit
      35: return
      36: astore_1
      37: aload_0
      38: monitorexit
      39: aload_1
      40: athrow
    Exception table:
       from    to  target type
           2    33    36   any

  public final java.util.List<ryey.easer.core.log.a> b();
    Code:
       0: invokestatic  #41                 // Method ryey/easer/core/log/ActivityLogService.a:()Ljava/util/LinkedList;
       3: checkcast     #99                 // class java/util/List
       6: areturn

  public final void b(android.content.Context, java.lang.String, java.lang.String);
    Code:
       0: aload_1
       1: ldc           #56                 // String context
       3: invokestatic  #61                 // Method a/b/b/c.b:(Ljava/lang/Object;Ljava/lang/String;)V
       6: aload_2
       7: ldc           #103                // String profileName
       9: invokestatic  #61                 // Method a/b/b/c.b:(Ljava/lang/Object;Ljava/lang/String;)V
      12: new           #105                // class ryey/easer/core/log/c
      15: dup
      16: aload_2
      17: aload_3
      18: invokespecial #108                // Method ryey/easer/core/log/c."<init>":(Ljava/lang/String;Ljava/lang/String;)V
      21: astore_2
      22: new           #18                 // class android/content/Intent
      25: dup
      26: ldc           #20                 // String ryey.easer.action.PROFILE_LOADED
      28: invokespecial #23                 // Method android/content/Intent."<init>":(Ljava/lang/String;)V
      31: astore_3
      32: aload_3
      33: ldc           #25                 // String ryey.easer.core.log.EXTRA.ACTIVITY_LOG
      35: aload_2
      36: checkcast     #27                 // class android/os/Parcelable
      39: invokevirtual #31                 // Method android/content/Intent.putExtra:(Ljava/lang/String;Landroid/os/Parcelable;)Landroid/content/Intent;
      42: pop
      43: aload_1
      44: aload_3
      45: invokevirtual #37                 // Method android/content/Context.sendBroadcast:(Landroid/content/Intent;)V
      48: return
}
