class ryey.easer.core.b extends ryey.easer.core.d {
  ryey.easer.core.b(android.content.Context, ryey.easer.core.a.k, java.util.concurrent.ExecutorService, ryey.easer.core.ConditionHolderService$a, ryey.easer.core.a$a);
    Code:
       0: aload_0
       1: aload_1
       2: aload_2
       3: aload_3
       4: aload         4
       6: aload         5
       8: invokespecial #10                 // Method ryey/easer/core/d."<init>":(Landroid/content/Context;Lryey/easer/core/a/k;Ljava/util/concurrent/ExecutorService;Lryey/easer/core/ConditionHolderService$a;Lryey/easer/core/a$a;)V
      11: aload_0
      12: aload_2
      13: invokevirtual #16                 // Method ryey/easer/core/a/k.d:()Lryey/easer/core/a/b;
      16: putfield      #18                 // Field i:Lryey/easer/core/a/b;
      19: return

  protected void a();
    Code:
       0: aload_0
       1: getfield      #24                 // Field d:Lryey/easer/core/ConditionHolderService$a;
       4: aload_0
       5: getfield      #18                 // Field i:Lryey/easer/core/a/b;
       8: invokevirtual #29                 // Method ryey/easer/core/a/b.a:()Ljava/lang/String;
      11: aload_0
      12: getfield      #33                 // Field h:Landroid/net/Uri;
      15: invokevirtual #38                 // Method ryey/easer/core/ConditionHolderService$a.a:(Ljava/lang/String;Landroid/net/Uri;)V
      18: aload_0
      19: getfield      #24                 // Field d:Lryey/easer/core/ConditionHolderService$a;
      22: aload_0
      23: getfield      #18                 // Field i:Lryey/easer/core/a/b;
      26: invokevirtual #29                 // Method ryey/easer/core/a/b.a:()Ljava/lang/String;
      29: invokevirtual #41                 // Method ryey/easer/core/ConditionHolderService$a.a:(Ljava/lang/String;)Ljava/lang/Boolean;
      32: astore_1
      33: aload_1
      34: ifnonnull     38
      37: return
      38: aload_0
      39: aload_1
      40: invokevirtual #47                 // Method java/lang/Boolean.booleanValue:()Z
      43: invokevirtual #51                 // Method b:(Z)V
      46: return

  protected void b();
    Code:
       0: aload_0
       1: getfield      #24                 // Field d:Lryey/easer/core/ConditionHolderService$a;
       4: aload_0
       5: getfield      #18                 // Field i:Lryey/easer/core/a/b;
       8: invokevirtual #29                 // Method ryey/easer/core/a/b.a:()Ljava/lang/String;
      11: aload_0
      12: getfield      #33                 // Field h:Landroid/net/Uri;
      15: invokevirtual #53                 // Method ryey/easer/core/ConditionHolderService$a.b:(Ljava/lang/String;Landroid/net/Uri;)V
      18: return
}
